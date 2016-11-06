/**
 * Class of PostProcessApplication 
 * This object is central in the post-processing programme.
 * The main functionality  : Read a CSV convert it POJO (Plain old java objects)
 * 							 Processing those POJO to find the initial and the final values for a particular formID
 * 							 After processing the data converting POJO to a CSV (PIPE '|' delimited )				
 * 					
 * @author Sneha Kamath
 * @version 1
 * @since  27-AUG-2014
 * @Copyright © 2014 CRF Health All rights reserved.
 */

package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import util.Table;
import util.TableCreator;
import classes.Corrections;
import classes.EDSSInitial;

public class PostprocessorApplication {

	private static SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	static Table appendix1;

	public static void main(String[] args) {

		final Logger LOGGER = Logger.getLogger(PostprocessorApplication.class.getName());
		FileHandler  fh;

		//Input File Location
		String edssInputFormPath = ".\\input\\F_F10034.csv";
		//Output File Location
		String edssOutputPath = ".\\output\\F_F10034.csv";

		String[] outputHeader = null;

		ICsvBeanReader beanReader = null;
		ICsvBeanWriter beanWriter = null;

		List<EDSSInitial> edssList = new ArrayList<EDSSInitial>();
		List<Corrections> correctionsList= new ArrayList<Corrections>();


		//load Appendix1 (forms to be read)
		appendix1 = new Table();

		try{
			EDSSInitial edss;
			Corrections corrections;


			TableCreator tableCreator = new TableCreator();
			appendix1 = tableCreator.readFileToTable(".\\config\\Appendix1.csv", ";");
			String []form_names = new String[15];
			int number_forms = 0;
			String filename = null;
			
			 fh = new FileHandler (".\\Logging.txt");
			 LOGGER.addHandler(fh);
			 SimpleFormatter formatter = new SimpleFormatter();  
		     fh.setFormatter(formatter); 
		     
			/* Reads the CSV file and converts it to POJO with TAB as the delimiter.*/
			beanReader = new CsvBeanReader(new FileReader(edssInputFormPath), CsvPreference.TAB_PREFERENCE);

			/* In order to convert the CSVfile to a POJO the column name in the CSV file should match the elements in  EDSSInitial.java 
			 * but since java does not allow '&' and other special character (java naming convention) 
			 * the code below ignores special characters and maps the headers to the elements in the EDSSInitial.java 
			 */
			final String[] header = beanReader.getHeader(true);
			for(int i = 0; i <= header.length -1 ; i++ ) {
				header[i] = header[i].replaceAll("[^a-zA-Z0-9_]+","");
			}
			final CellProcessor[] processors = getReadProcessors();

			/* Reads the CSV file into POJO */
			LOGGER.info("Reading the F_F10034.csv and converting the CSV to Pain java objects");
			while( (edss = beanReader.read(EDSSInitial.class, header, processors)) != null ) {
				edssList.add(edss);
			}

			/* Defining the Pipe delimiter for the output file*/
			final CsvPreference PIPE_DELIMITED ;
			PIPE_DELIMITED = new CsvPreference.Builder('"', '|', "\n").build();

			/* After analysing the data from input CSV, write the data from POJO to output CSV file delimited by '|' pipe.*/
			beanWriter = new CsvBeanWriter(new FileWriter(edssOutputPath),PIPE_DELIMITED);

			/* Column names for the Output CSV file*/
			outputHeader = new String[] {
					"ID","PATIENT","SUBJECTCODE","SITECODE","CREATETIME","STUDYDATE","EDSS_Start","EDSS_End","Related_Date","Related_Time","Visit Number",
					"Site_Rater_Name","Visual_Acuity_Corrected","Visual_Acuity_Corrected_Initial","Visual_Acuity_OD","Visual_Acuity_OD_Initial","Visual_Acuity_OD_C","Visual_Acuity_OD_C_Initial","Visual_Acuity_OS","Visual_Acuity_OS_Initial","Visual_Acuity_OS_C","Visual_Acuity_OS_C_Initial","Visual_Fields_OD","Visual_Fields_OD_Initial","Visual_Fields_OD_C","Visual_Fields_OD_C_Initial","Visual_Fields_OS","Visual_Fields_OS_Initial","Visual_Fields_OS_C","Visual_Fields_OS_C_Initial","Visual_Scotoma_OD","Visual_Scotoma_OD_Initial",
					"Visual_Scotoma_OD_C","Visual_Scotoma_OD_C_Initial","Visual_Scotoma_OS","Visual_Scotoma_OS_Initial","Visual_Scotoma_OS_C","Visual_Scotoma_OS_C_Initial","Visual_DiscPallor_OD","Visual_DiscPallor_OD_Initial","Visual_DiscPallor_OD_C","Visual_DiscPallor_OD_C_Initial","Visual_DiscPallor_OS","Visual_DiscPallor_OS_Initial","Visual_DiscPallor_OS_C","Visual_DiscPallor_OS_C_Initial","Visual_Comments","Visual_Comments_Initial","Brainstem_EOM","Brainstem_EOM_Initial","Brainstem_EOM_C","Brainstem_EOM_C_Initial","Brainstem_Nystagmus","Brainstem_Nystagmus_Initial","Brainstem_Nystagmus_C","Brainstem_Nystagmus_C_Initial","Brainstem_Trigeminal","Brainstem_Trigeminal_Initial","Brainstem_Trigeminal_C","Brainstem_Trigeminal_C_Initial",
					"Brainstem_FacialWeakness","Brainstem_FacialWeakness_Initial","Brainstem_FacialWeakness_C","Brainstem_FacialWeakness_C_Initial","Brainstem_HearingLoss","Brainstem_HearingLoss_Initial","Brainstem_HearingLoss_C","Brainstem_HearingLoss_C_Initial","Brainstem_Dysarthria","Brainstem_Dysarthria_Initial","Brainstem_Dysarthria_C","Brainstem_Dysarthria_C_Initial","Brainstem_Dysphagia","Brainstem_Dysphagia_Initial","Brainstem_Dysphagia_C","Brainstem_Dysphagia_C_Initial","Brainstem_OtherCranialNerve","Brainstem_OtherCranialNerve_Initial","Brainstem_OtherCranialNerve_C","Brainstem_OtherCranialNerve_C_Initial","Brainstem_Comments","Brainstem_Comments_Initial","Pym_Reflex_Biceps_R","Pym_Reflex_Biceps_R_Initial","Pym_Reflex_Biceps_R_C","Pym_Reflex_Biceps_R_C_Initial",
					"Pym_Reflex_Biceps_><","Pym_Reflex_Biceps_><_Initial","Pym_Reflex_Biceps_L","Pym_Reflex_Biceps_L_Initial","Pym_Reflex_Biceps_L_C","Pym_Reflex_Biceps_L_C_Initial","Pym_Reflex_Triceps_R","Pym_Reflex_Triceps_R_Initial","Pym_Reflex_Triceps_R_C","Pym_Reflex_Triceps_R_C_Initial","Pym_Reflex_Triceps_><","Pym_Reflex_Triceps_><_Initial","Pym_Reflex_Triceps_L","Pym_Reflex_Triceps_L_Initial","Pym_Reflex_Triceps_L_C","Pym_Reflex_Triceps_L_C_Initial","Pym_Reflex_Brachioradial_R","Pym_Reflex_Brachioradial_R_Initial","Pym_Reflex_Brachioradial_R_C","Pym_Reflex_Brachioradial_R_C_Initial","Pym_Reflex_Brachioradialis_><","Pym_Reflex_Brachioradialis_><_Initial","Pym_Reflex_Brachioradialis_L","Pym_Reflex_Brachioradialis_L_Initial","Pym_Reflex_Brachioradialis_L_C","Pym_Reflex_Brachioradialis_L_C_Initial","Pym_Reflex_Knee_R","Pym_Reflex_Knee_R_Initial",
					"Pym_Reflex_Knee_R_C","Pym_Reflex_Knee_R_C_Initial","Pym_Reflex_Knee_><","Pym_Reflex_Knee_><_Initial","Pym_Reflex_Knee_L","Pym_Reflex_Knee_L_Initial","Pym_Reflex_Knee_L_C","Pym_Reflex_Knee_L_C_Initial","Pym_Reflex_Ankle_R","Pym_Reflex_Ankle_R_Initial","Pym_Reflex_Ankle_R_C","Pym_Reflex_Ankle_R_C_Initial","Pym_Reflex_Ankle_><","Pym_Reflex_Ankle_><_Initial","Pym_Reflex_Ankle_L","Pym_Reflex_Ankle_L_Initial","Pym_Reflex_Ankle_L_C","Pym_Reflex_Ankle_L_C_Initial","Pym_Reflex_Plantar_R","Pym_Reflex_Plantar_R_Initial","Pym_Reflex_Plantar_R_C","Pym_Reflex_Plantar_R_C_Initial","Pym_Reflex_Plantar_><","Pym_Reflex_Plantar_><_Initial","Pym_Reflex_Plantar_L","Pym_Reflex_Plantar_L_Initial",
					"Pym_Reflex_Plantar_L_C","Pym_Reflex_Plantar_L_C_Initial","Pym_Reflex_Cutaneous_R","Pym_Reflex_Cutaneous_R_Initial","Pym_Reflex_Cutaneous_R_C","Pym_Reflex_Cutaneous_R_C_Initial","Pym_Reflex_Cutaneous_><","Pym_Reflex_Cutaneous_><_Initial","Pym_Reflex_Cutaneous_L","Pym_Reflex_Cutaneous_L_Initial","Pym_Reflex_Cutaneous_L_C","Pym_Reflex_Cutaneous_L_C_Initial","Pym_Reflex_Palmomental_R","Pym_Reflex_Palmomental_R_Initial","Pym_Reflex_Palmomental_R_C","Pym_Reflex_Palmomental_R_C_Initial","Pym_Reflex_Palmomental_><","Pym_Reflex_Palmomental_><_Initial","Pym_Reflex_Palmomental_L","Pym_Reflex_Palmomental_L_Initial","Pym_Reflex_Palmomental_L_C","Pym_Reflex_Palmomental_L_C_Initial","Pym_Strength_Deltoids_R","Pym_Strength_Deltoids_R_Initial","Pym_Strength_Deltoids_R_C","Pym_Strength_Deltoids_R_C_Initial","Pym_Strength_Deltoids_L","Pym_Strength_Deltoids_L_Initial",
					"Pym_Strength_Deltoids_L_C","Pym_Strength_Deltoids_L_C_Initial","Pym_Strength_Biceps_R","Pym_Strength_Biceps_R_Initial","Pym_Strength_Biceps_R_C","Pym_Strength_Biceps_R_C_Initial","Pym_Strength_Biceps_L","Pym_Strength_Biceps_L_Initial","Pym_Strength_Biceps_L_C","Pym_Strength_Biceps_L_C_Initial","Pym_Strength_Triceps_R","Pym_Strength_Triceps_R_Initial","Pym_Strength_Triceps_R_C","Pym_Strength_Triceps_R_C_Initial","Pym_Strength_Triceps_L","Pym_Strength_Triceps_L_Initial","Pym_Strength_Triceps_L_C","Pym_Strength_Triceps_L_C_Initial","Pym_Strength_WristFlex_R","Pym_Strength_WristFlex_R_Initial","Pym_Strength_WristFlex_R_C","Pym_Strength_WristFlex_R_C_Initial","Pym_Strength_WristFlex_L","Pym_Strength_WristFlex_L_Initial","Pym_Strength_WristFlex_L_C","Pym_Strength_WristFlex_L_C_Initial",
					"Pym_Strength_WristExt_R","Pym_Strength_WristExt_R_Initial","Pym_Strength_WristExt_R_C","Pym_Strength_WristExt_R_C_Initial","Pym_Strength_WristExt_L","Pym_Strength_WristExt_L_Initial","Pym_Strength_WristExt_L_C","Pym_Strength_WristExt_L_C_Initial","Pym_Strength_HipFlex_R","Pym_Strength_HipFlex_R_Initial","Pym_Strength_HipFlex_R_C","Pym_Strength_HipFlex_R_C_Initial","Pym_Strength_HipFlex_L","Pym_Strength_HipFlex_L_Initial","Pym_Strength_HipFlex_L_C","Pym_Strength_HipFlex_L_C_Initial","Pym_Strength_KneeFlex_R","Pym_Strength_KneeFlex_R_Initial","Pym_Strength_KneeFlex_R_C","Pym_Strength_KneeFlex_R_C_Initial","Pym_Strength_KneeFlex_L","Pym_Strength_KneeFlex_L_Initial","Pym_Strength_KneeFlex_L_C","Pym_Strength_KneeFlex_L_C_Initial","Pym_Strength_KneeExt_R","Pym_Strength_KneeExt_R_Initial","Pym_Strength_KneeExt_R_C","Pym_Strength_KneeExt_R_C_Initial",
					"Pym_Strength_KneeExt_L","Pym_Strength_KneeExt_L_Initial","Pym_Strength_KneeExt_L_C","Pym_Strength_KneeExt_L_C_Initial","Pym_Strength_PlantarFlex_R","Pym_Strength_PlantarFlex_R_Initial","Pym_Strength_PlantarFlex_R_C","Pym_Strength_PlantarFlex_R_C_Initial","Pym_Strength_PlantarFlex_L","Pym_Strength_PlantarFlex_L_Initial","Pym_Strength_PlantarFlex_L_C","Pym_Strength_PlantarFlex_L_C_Initial","Pym_Strength_DorsiFlex_R","Pym_Strength_DorsiFlex_R_Initial","Pym_Strength_DorsiFlex_R_C","Pym_Strength_DorsiFlex_R_C_Initial","Pym_Strength_DorsiFlex_L","Pym_Strength_DorsiFlex_L_Initial","Pym_Strength_DorsiFlex_L_C","Pym_Strength_DorsiFlex_L_C_Initial","Pym_Strength_Pronation_R","Pym_Strength_Pronation_R_Initial","Pym_Strength_Pronation_R_C","Pym_Strength_Pronation_R_C_Initial","Pym_Strength_Pronation_L","Pym_Strength_Pronation_L_Initial",
					"Pym_Strength_Pronation_L_C","Pym_Strength_Pronation_L_C_Initial","Pym_Strength_DownwardDrift_R","Pym_Strength_DownwardDrift_R_Initial","Pym_Strength_DownwardDrift_R_C","Pym_Strength_DownwardDrift_R_C_Initial","Pym_Strength_DownwardDrift_L","Pym_Strength_DownwardDrift_L_Initial","Pym_Strength_DownwardDrift_L_C","Pym_Strength_DownwardDrift_L_C_Initial","Pym_Strength_Sinking_R","Pym_Strength_Sinking_R_Initial","Pym_Strength_Sinking_R_C","Pym_Strength_Sinking_R_C_Initial","Pym_Strength_Sinking_L","Pym_Strength_Sinking_L_Initial","Pym_Strength_Sinking_L_C","Pym_Strength_Sinking_L_C_Initial","Pym_Strength_OneLegAngle_R","Pym_Strength_OneLegAngle_R_Initial","Pym_Strength_OneLegAngle_R_C","Pym_Strength_OneLegAngle_R_C_Initial","Pym_Strength_OneLegAngle_L","Pym_Strength_OneLegAngle_L_Initial","Pym_Strength_OneLegAngle_L_C","Pym_Strength_OneLegAngle_L_C_Initial","Pym_Strength_WalkHeels_R","Pym_Strength_WalkHeels_R_Initial",
					"Pym_Strength_WalkHeels_R_C","Pym_Strength_WalkHeels_R_C_Initial","Pym_Strength_WalkHeels_L","Pym_Strength_WalkHeels_L_Initial","Pym_Strength_WalkHeels_L_C","Pym_Strength_WalkHeels_L_C_Initial","Pym_Strength_WalkToes_R","Pym_Strength_WalkToes_R_Initial","Pym_Strength_WalkToes_R_C","Pym_Strength_WalkToes_R_C_Initial","Pym_Strength_WalkToes_L","Pym_Strength_WalkToes_L_Initial","Pym_Strength_WalkToes_L_C","Pym_Strength_WalkToes_L_C_Initial","Pym_Strength_HopFoot_R","Pym_Strength_HopFoot_R_Initial","Pym_Strength_HopFoot_R_C","Pym_Strength_HopFoot_R_C_Initial","Pym_Strength_HopFoot_L","Pym_Strength_HopFoot_L_Initial","Pym_Strength_HopFoot_L_C","Pym_Strength_HopFoot_L_C_Initial","Pym_Spasticity_Arms_R","Pym_Spasticity_Arms_R_Initial","Pym_Spasticity_Arms_R_C","Pym_Spasticity_Arms_R_C_Initial",
					"Pym_Spasticity_Arms_L","Pym_Spasticity_Arms_L_Initial","Pym_Spasticity_Arms_L_C","Pym_Spasticity_Arms_L_C_Initial","Pym_Spasticity_Legs_R","Pym_Spasticity_Legs_R_Initial","Pym_Spasticity_Legs_R_C","Pym_Spasticity_Legs_R_C_Initial","Pym_Spasticity_Legs_L","Pym_Spasticity_Legs_L_Initial","Pym_Spasticity_Legs_L_C","Pym_Spasticity_Legs_L_C_Initial","Pym_Spasticity_Gait_R","Pym_Spasticity_Gait_R_Initial","Pym_Spasticity_Gait_R_C","Pym_Spasticity_Gait_R_C_Initial","Pym_Spasticity_Gait_L","Pym_Spasticity_Gait_L_Initial","Pym_Spasticity_Gait_L_C","Pym_Spasticity_Gait_L_C_Initial","Pym_Motor_Performance","Pym_Motor_Performance_Initial","Pym_Motor_Performance_C","Pym_Motor_Performance_C_Initial","Pyramidal_Comments","Pyramidal_Comments_Initial",
					"Cerebellar_HeadTremor","Cerebellar_HeadTremor_Initial","Cerebellar_HeadTremor_C","Cerebellar_HeadTremor_C_Initial","Cerebellar_TruncalAtaxia","Cerebellar_TruncalAtaxia_Initial","Cerebellar_TruncalAtaxia_C","Cerebellar_TruncalAtaxia_C_Initial","Cerebellar_TremorUE_R","Cerebellar_TremorUE_R_Initial","Cerebellar_TremorUE_R_C","Cerebellar_TremorUE_R_C_Initial","Cerebellar_TremorUE_L","Cerebellar_TremorUE_L_Initial","Cerebellar_TremorUE_L_C","Cerebellar_TremorUE_L_C_Initial","Cerebellar_TremorLE_R","Cerebellar_TremorLE_R_Initial","Cerebellar_TremorLE_R_C","Cerebellar_TremorLE_R_C_Initial","Cerebellar_TremorLE_L","Cerebellar_TremorLE_L_Initial","Cerebellar_TremorLE_L_C","Cerebellar_TremorLE_L_C_Initial","Cerebellar_RapidUE_R","Cerebellar_RapidUE_R_Initial","Cerebellar_RapidUE_R_C","Cerebellar_RapidUE_R_C_Initial",
					"Cerebellar_RapidUE_L","Cerebellar_RapidUE_L_Initial","Cerebellar_RapidUE_L_C","Cerebellar_RapidUE_L_C_Initial","Cerebellar_RapidLE_R","Cerebellar_RapidLE_R_Initial","Cerebellar_RapidLE_R_C","Cerebellar_RapidLE_R_C_Initial","Cerebellar_RapidLE_L","Cerebellar_RapidLE_L_Initial","Cerebellar_RapidLE_L_C","Cerebellar_RapidLE_L_C_Initial","Cerebellar_Tandem_Walking","Cerebellar_Tandem_Walking_Initial","Cerebellar_Tandem_Walking_C","Cerebellar_Tandem_Walking_C_Initial","Cerebellar_GaitAtaxia","Cerebellar_GaitAtaxia_Initial","Cerebellar_GaitAtaxia_C","Cerebellar_GaitAtaxia_C_Initial","Cerebellar_RombergTest","Cerebellar_RombergTest_Initial","Cerebellar_RombergTest_C","Cerebellar_RombergTest_C_Initial","Cerebellar_OtherCereTests","Cerebellar_OtherCereTests_Initial",
					"Cerebellar_OtherCereTests_C","Cerebellar_OtherCereTests_C_Initial","Cerebellar_Comments","Cerebellar_Comments_Initial","Sensory_SuperSensationUE_R","Sensory_SuperSensationUE_R_Initial","Sensory_SuperSensationUE_R_C","Sensory_SuperSensationUE_R_C_Initial","Sensory_SuperSensationUE_L","Sensory_SuperSensationUE_L_Initial","Sensory_SuperSensationUE_L_C","Sensory_SuperSensationUE_L_C_Initial","Sensory_SuperTrunk_R","Sensory_SuperTrunk_R_Initial","Sensory_SuperTrunk_R_C","Sensory_SuperTrunk_R_C_Initial","Sensory_SuperTrunk_L","Sensory_SuperTrunk_L_Initial","Sensory_SuperTrunk_L_C","Sensory_SuperTrunk_L_C_Initial","Sensory_SuperSensationLE_R","Sensory_SuperSensationLE_R_Initial","Sensory_SuperSensationLE_R_C","Sensory_SuperSensationLE_R_C_Initial","Sensory_SuperSensationLE_L","Sensory_SuperSensationLE_L_Initial","Sensory_SuperSensationLE_L_C","Sensory_SuperSensationLE_L_C_Initial",
					"Sensory_VibrationSenseUE_R","Sensory_VibrationSenseUE_R_Initial","Sensory_VibrationSenseUE_R_C","Sensory_VibrationSenseUE_R_C_Initial","Sensory_VibrationSenseUE_L","Sensory_VibrationSenseUE_L_Initial","Sensory_VibrationSenseUE_L_C","Sensory_VibrationSenseUE_L_C_Initial","Sensory_VibrationSenseLE_R","Sensory_VibrationSenseLE_R_Initial","Sensory_VibrationSenseLE_R_C","Sensory_VibrationSenseLE_R_C_Initial","Sensory_VibrationSenseLE_L","Sensory_VibrationSenseLE_L_Initial","Sensory_VibrationSenseLE_L_C","Sensory_VibrationSenseLE_L_C_Initial","Sensory_PositionSenseUE_R","Sensory_PositionSenseUE_R_Initial","Sensory_PositionSenseUE_R_C","Sensory_PositionSenseUE_R_C_Initial","Sensory_PositionSenseUE_L","Sensory_PositionSenseUE_L_Initial","Sensory_PositionSenseUE_L_C","Sensory_PositionSenseUE_L_C_Initial","Sensory_PositionSenseLE_R","Sensory_PositionSenseLE_R_Initial",
					"Sensory_PositionSenseLE_R_C","Sensory_PositionSenseLE_R_C_Initial","Sensory_PositionSenseLE_L","Sensory_PositionSenseLE_L_Initial","Sensory_PositionSenseLE_L_C","Sensory_PositionSenseLE_L_C_Initial","Sensory_LhermittesSign","Sensory_LhermittesSign_Initial","Sensory_LhermittesSign_C","Sensory_LhermittesSign_C_Initial","Sensory_ParaesthesiaeUE_R","Sensory_ParaesthesiaeUE_R_Initial","Sensory_ParaesthesiaeUE_R_C","Sensory_ParaesthesiaeUE_R_C_Initial","Sensory_ParaesthesiaeUE_L","Sensory_ParaesthesiaeUE_L_Initial","Sensory_ParaesthesiaeUE_L_C","Sensory_ParaesthesiaeUE_L_C_Initial","Sensory_ParaesthesiaeTrunk_R","Sensory_ParaesthesiaeTrunk_R_Initial","Sensory_ParaesthesiaeTrunk_R_C","Sensory_ParaesthesiaeTrunk_R_C_Initial","Sensory_ParaesthesiaeTrunk_L","Sensory_ParaesthesiaeTrunk_L_Initial","Sensory_ParaesthesiaeTrunk_L_C","Sensory_ParaesthesiaeTrunk_L_C_Initial","Sensory_ParaesthesiaeLE_R","Sensory_ParaesthesiaeLE_R_Initial",
					"Sensory_ParaesthesiaeLE_R_C","Sensory_ParaesthesiaeLE_R_C_Initial","Sensory_ParaesthesiaeLE_L","Sensory_ParaesthesiaeLE_L_Initial","Sensory_ParaesthesiaeLE_L_C","Sensory_ParaesthesiaeLE_L_C_Initial","Sensory_Comments","Sensory_Comments_Initial","BowelBladder_UrinaryH&R","BowelBladder_UrinaryH&R_Initial","BowelBladder_UrinaryH&R_C","BowelBladder_UrinaryH&R_C_Initial","BowelBladder_UrinaryU&I","BowelBladder_UrinaryU&I_Initial","BowelBladder_UrinaryU&I_C","BowelBladder_UrinaryU&I_C_Initial","BowelBladder_Catheterisation","BowelBladder_Catheterisation_Initial","BowelBladder_Catheterisation_C","BowelBladder_Catheterisation_C_Initial","BowelBladder_BowelDysfunction","BowelBladder_BowelDysfunction_Initial","BowelBladder_BowelDysfunc_C","BowelBladder_BowelDysfunc_C_Initial","BowelBladder_SexualDysfunction","BowelBladder_SexualDysfunction_Initial",
					"BowelBladder_SexualDysfunc_C","BowelBladder_SexualDysfunc_C_Initial","BowelBladder_Comments","BowelBladder_Comments_Initial","Cerebral_Depression","Cerebral_Depression_Initial","Cerebral_Depression_C","Cerebral_Depression_C_Initial","Cerebral_Euphoria","Cerebral_Euphoria_Initial","Cerebral_Euphoria_C","Cerebral_Euphoria_C_Initial","Cerebral_DecreaseMentation","Cerebral_DecreaseMentation_Initial","Cerebral_DecreaseMentation_C","Cerebral_DecreaseMentation_C_Initial","Cerebral_Fatigue","Cerebral_Fatigue_Initial","Cerebral_Fatigue_C","Cerebral_Fatigue_C_Initial","Cerebral_Comments","Cerebral_Comments_Initial","Ambulation_Distance_Patient","Ambulation_Distance_Patient_Initial","Ambulation_Distance_Patient_C","Ambulation_Distance_Patient_C_Initial",
					"Ambulation_Time_Patient","Ambulation_Time_Patient_Initial","Ambulation_Time_Patient_C","Ambulation_Time_Patient_C_Initial","Ambulation_Assistance","Ambulation_Assistance_Initial","Ambulation_Assistance_C","Ambulation_Assistance_C_Initial","Ambulation_Distance", "Ambulation_Distance_Initial","Ambulation_Distance_C","Ambulation_Distance_C_Initial","Ambulation_Comments","Ambulation_Comments_Initial","FSS_Visual","FSS_Visual_Initial","FSS_Visual_Converted","FSS_Visual_Converted_Initial","FSS_Brainstem","FSS_Brainstem_Initial","FSS_Pyramidal","FSS_Pyramidal_Initial","FSS_Cerebellar","FSS_Cerebellar_Initial","FSS_Sensory","FSS_Sensory_Initial","FSS_BowelBladder",
					"FSS_BowelBladder_Initial","FSS_BowelBladder_Converted","FSS_BowelBladder_Converted_Initial","FSS_Cerebral","FSS_Cerebral_Initial","FSS_Ambulation","FSS_Ambulation_Initial","EDSS_Step","EDSS_Step_Initial","EDSS_Step_Comments","EDSS_Step_Comments_Initial"};

			/* Since there can be multiple forms for the same Subject , The code of lines below creates a subset
			 * of entries having the same ID,SUBJECTCODE and CREATETIME  */
			LOGGER.info("Processing the POJO to get initial and final values");
			Map<String, List<EDSSInitial>> edssIniMap = new LinkedHashMap<String, List<EDSSInitial>>();
			for(EDSSInitial edssIni:edssList) {
				String key = edssIni.getID() + "_" + edssIni.getSUBJECTCODE() +"_" + edssIni.getCREATETIME(); //edssIni.getID() + "_" + edssIni.getSUBJECTCODE() +"_" + edssIni.getCREATETIME() + "_" + edssIni.getVisitNumber();
				List<EDSSInitial> edssIniList = edssIniMap.get(key);
				if (edssIniList == null) {
					edssIniList = new ArrayList<EDSSInitial>();
					edssIniMap.put(key, edssIniList);
				}
				edssIniList.add(edssIni);
			}

			/* Sorting the subset using MODIFYTIME as the comparator */
			/*for(List<EDSSInitial> EDSSList:edssIniMap.values()) {
				//Collections.sort(EDSSList,EDSS_MODIFIED_DATE_TIME_COMPARATOR);
				Collections.sort(EDSSList,VERSION_COMPARATOR);
			}*/

			/* Get the last record for each modified date (taken from date part of MODIFYTIME)
			 * i.e multiple records on the same modified date are narrowed down to the last entry for the modified date
			 */
			for(Iterator<Map.Entry<String,List<EDSSInitial>>> iter = edssIniMap.entrySet().iterator();iter.hasNext();) {
				Map<String, EDSSInitial> modifiedDate2EdssInitialMap = new LinkedHashMap<String, EDSSInitial>();
				Map.Entry<String, List<EDSSInitial>> entry = iter.next();
				for(EDSSInitial edssInitial:entry.getValue()) {
					String modifiedDate = edssInitial.getMODIFYTIME().split("T")[0];
					modifiedDate2EdssInitialMap.put(modifiedDate, edssInitial);					
				}
				entry.setValue(new ArrayList<EDSSInitial>(modifiedDate2EdssInitialMap.values()));
			}
			
			/* Changes for the new functionality -Adding the right Site rater names into output
			*  Reading the Investigator names files provided by the client from the Corrections.csv file and replacing only incorrect Site_rater_names in the Output
            */
			String siteRaterCorrectionsInputPath = ".\\config\\Corrections.csv";

			/* Reads the Corrections.csv file and converts it to POJO with pipeline as the delimiter.*/
			/* Defining the Pipe delimiter for the Corrections.csv file*/
			
		
			
			beanReader = new CsvBeanReader(new FileReader(siteRaterCorrectionsInputPath),PIPE_DELIMITED);
			LOGGER.info("Reading the corrections.csv file...");
			final String[] headerInCorrectionsFile = beanReader.getHeader(true);
			for(int i = 0; i <= headerInCorrectionsFile.length -1 ; i++ ) {
				headerInCorrectionsFile[i] = headerInCorrectionsFile[i].replaceAll("[^a-zA-Z0-9_]+","");
				}
			LOGGER.info("Reading the Corrections.csv and converting the CSV to Pain java objects");
			final CellProcessor[] PROCESSORS = getCorrectionProcessor();
			while( (corrections = beanReader.read(Corrections.class, headerInCorrectionsFile, PROCESSORS)) != null ) {
				correctionsList.add(corrections);
			}
           
			LOGGER.info("Parsing the Investigator name from the input.csv and repacing it with the correct Investigator name from coreetions.csv and writing the result into output");
			
			for(EDSSInitial edssIni:edssList){
				for(Corrections correctionsIni:correctionsList){
					String key1=edssIni.getInvestigator_Name();
					String key2=correctionsIni.getWrong_Inv_name();
					if(key1!=null && key2!=null && key1.equalsIgnoreCase(key2)){
					//	System.out.println("Two keys are equal");
						edssIni.setInvestigator_Name(correctionsIni.getCorrected_Inv_name());
					
						
					}
				}
			}
			

			/* Now from the sorted subset we are extracting the Initial and the Final entry/Row */
			LOGGER.info("Merging the Multiple Form ID to one row having both initial and final values");
			for(Map.Entry<String, List<EDSSInitial>> entry : edssIniMap.entrySet()) {
				List<EDSSInitial> eList = entry.getValue();
				EDSSInitial eFirst = eList.get(0);
				EDSSInitial eLast  = eList.get(eList.size()-1);
				eLast.setVERSIONID_Initial(eFirst.getVERSIONID());
				eLast.setSite_Rater_Name(eLast.getInvestigator_Name());
				eFirst.setSite_Rater_Name(eFirst.getInvestigator_Name());
				eLast.setSite_Rater_Name(eFirst.getSite_Rater_Name());
				eLast.setVisual_Acuity_Corrected_Initial(eFirst.getVisual_Acuity_Corrected());
				eLast.setVisual_Acuity_OD_Initial(eFirst.getVisual_Acuity_OD());
				eLast.setVisual_Acuity_OD_C_Initial(eFirst.getVisual_Acuity_OD_C());
				eLast.setVisual_Acuity_OS_Initial(eFirst.getVisual_Acuity_OS());
				eLast.setVisual_Acuity_OS_C_Initial(eFirst.getVisual_Acuity_OS_C());
				eLast.setVisual_Fields_OD_Initial(eFirst.getVisual_Fields_OD());
				eLast.setVisual_Fields_OD_C_Initial(eFirst.getVisual_Fields_OD_C());
				eLast.setVisual_Fields_OS_Initial(eFirst.getVisual_Fields_OS());
				eLast.setVisual_Fields_OS_C_Initial(eFirst.getVisual_Fields_OS_C());
				eLast.setVisual_Scotoma_OD_Initial(eFirst.getVisual_Scotoma_OD());

				eLast.setVisual_Scotoma_OD_C_Initial(eFirst.getVisual_Scotoma_OD_C());
				eLast.setVisual_Scotoma_OS_Initial(eFirst.getVisual_Scotoma_OS());
				eLast.setVisual_Scotoma_OS_C_Initial(eFirst.getVisual_Scotoma_OS_C());
				eLast.setVisual_DiscPallor_OD_Initial(eFirst.getVisual_DiscPallor_OD());
				eLast.setVisual_DiscPallor_OD_C_Initial(eFirst.getVisual_DiscPallor_OD_C());
				eLast.setVisual_DiscPallor_OS_Initial(eFirst.getVisual_DiscPallor_OS());
				eLast.setVisual_DiscPallor_OS_C_Initial(eFirst.getVisual_DiscPallor_OS_C());
				eLast.setVisual_Comments_Initial(eFirst.getVisual_Comments());
				eLast.setBrainstem_EOM_Initial(eFirst.getBrainstem_EOM());
				eLast.setBrainstem_EOM_C_Initial(eFirst.getBrainstem_EOM_C());
				eLast.setBrainstem_Nystagmus_Initial(eFirst.getBrainstem_Nystagmus());
				eLast.setBrainstem_Nystagmus_C_Initial(eFirst.getBrainstem_Nystagmus_C());
				eLast.setBrainstem_Trigeminal_Initial(eFirst.getBrainstem_Trigeminal());
				eLast.setBrainstem_Trigeminal_C_Initial(eFirst.getBrainstem_Trigeminal_C());

				eLast.setBrainstem_FacialWeakness_Initial(eFirst.getBrainstem_FacialWeakness());
				eLast.setBrainstem_FacialWeakness_C_Initial(eFirst.getBrainstem_FacialWeakness_C());
				eLast.setBrainstem_HearingLoss_Initial(eFirst.getBrainstem_HearingLoss());
				eLast.setBrainstem_HearingLoss_C_Initial(eFirst.getBrainstem_HearingLoss_C());
				eLast.setBrainstem_Dysarthria_Initial(eFirst.getBrainstem_Dysarthria());
				eLast.setBrainstem_Dysarthria_C_Initial(eFirst.getBrainstem_Dysarthria_C());
				eLast.setBrainstem_Dysphagia_Initial(eFirst.getBrainstem_Dysphagia());
				eLast.setBrainstem_Dysphagia_C_Initial(eFirst.getBrainstem_Dysphagia_C());
				eLast.setBrainstem_OtherCranialNerve_Initial(eFirst.getBrainstem_OtherCranialNerve());
				eLast.setBrainstem_OtherCranialNerve_C_Initial(eFirst.getBrainstem_OtherCranialNerve_C());
				eLast.setBrainstem_Comments_Initial(eFirst.getBrainstem_Comments());
				eLast.setPym_Reflex_Biceps_R_Initial(eFirst.getPym_Reflex_Biceps_R());
				eLast.setPym_Reflex_Biceps_R_C_Initial(eFirst.getPym_Reflex_Biceps_R_C());

				eLast.setPym_Reflex_Biceps__Initial(eFirst.getPym_Reflex_Biceps_());
				eLast.setPym_Reflex_Biceps_L_Initial(eFirst.getPym_Reflex_Biceps_L());
				eLast.setPym_Reflex_Biceps_L_C_Initial(eFirst.getPym_Reflex_Biceps_L_C());
				eLast.setPym_Reflex_Triceps_R_Initial(eFirst.getPym_Reflex_Triceps_R());
				eLast.setPym_Reflex_Triceps_R_C_Initial(eFirst.getPym_Reflex_Triceps_R_C());
				eLast.setPym_Reflex_Triceps__Initial(eFirst.getPym_Reflex_Triceps_());
				eLast.setPym_Reflex_Triceps_L_Initial(eFirst.getPym_Reflex_Triceps_L());
				eLast.setPym_Reflex_Triceps_L_C_Initial(eFirst.getPym_Reflex_Triceps_L_C());
				eLast.setPym_Reflex_Brachioradial_R_Initial(eFirst.getPym_Reflex_Brachioradial_R());
				eLast.setPym_Reflex_Brachioradial_R_C_Initial(eFirst.getPym_Reflex_Brachioradial_R_C());
				eLast.setPym_Reflex_Brachioradialis__Initial(eFirst.getPym_Reflex_Brachioradialis_());
				eLast.setPym_Reflex_Brachioradialis_L_Initial(eFirst.getPym_Reflex_Brachioradialis_L());
				eLast.setPym_Reflex_Brachioradialis_L_C_Initial(eFirst.getPym_Reflex_Brachioradialis_L_C());
				eLast.setPym_Reflex_Knee_R_Initial(eFirst.getPym_Reflex_Knee_R());

				eLast.setPym_Reflex_Knee_R_C_Initial(eFirst.getPym_Reflex_Knee_R_C());
				eLast.setPym_Reflex_Knee__Initial(eFirst.getPym_Reflex_Knee_());
				eLast.setPym_Reflex_Knee_L_Initial(eFirst.getPym_Reflex_Knee_L());
				eLast.setPym_Reflex_Knee_L_C_Initial(eFirst.getPym_Reflex_Knee_L_C());
				eLast.setPym_Reflex_Ankle_R_Initial(eFirst.getPym_Reflex_Ankle_R());
				eLast.setPym_Reflex_Ankle_R_C_Initial(eFirst.getPym_Reflex_Ankle_R_C());
				eLast.setPym_Reflex_Ankle__Initial(eFirst.getPym_Reflex_Ankle_());
				eLast.setPym_Reflex_Ankle_L_Initial(eFirst.getPym_Reflex_Ankle_L());
				eLast.setPym_Reflex_Ankle_L_C_Initial(eFirst.getPym_Reflex_Ankle_L_C());
				eLast.setPym_Reflex_Plantar_R_Initial(eFirst.getPym_Reflex_Plantar_R());
				eLast.setPym_Reflex_Plantar_R_C_Initial(eFirst.getPym_Reflex_Plantar_R_C());
				eLast.setPym_Reflex_Plantar__Initial(eFirst.getPym_Reflex_Plantar_());
				eLast.setPym_Reflex_Plantar_L_Initial(eFirst.getPym_Reflex_Plantar_L());

				eLast.setPym_Reflex_Plantar_L_C_Initial(eFirst.getPym_Reflex_Plantar_L_C());
				eLast.setPym_Reflex_Cutaneous_R_Initial(eFirst.getPym_Reflex_Cutaneous_R());
				eLast.setPym_Reflex_Cutaneous_R_C_Initial(eFirst.getPym_Reflex_Cutaneous_R_C());
				eLast.setPym_Reflex_Cutaneous__Initial(eFirst.getPym_Reflex_Cutaneous_());
				eLast.setPym_Reflex_Cutaneous_L_Initial(eFirst.getPym_Reflex_Cutaneous_L());
				eLast.setPym_Reflex_Cutaneous_L_C_Initial(eFirst.getPym_Reflex_Cutaneous_L_C());
				eLast.setPym_Reflex_Palmomental_R_Initial(eFirst.getPym_Reflex_Palmomental_R());
				eLast.setPym_Reflex_Palmomental_R_C_Initial(eFirst.getPym_Reflex_Palmomental_R_C());
				eLast.setPym_Reflex_Palmomental__Initial(eFirst.getPym_Reflex_Palmomental_());
				eLast.setPym_Reflex_Palmomental_L_Initial(eFirst.getPym_Reflex_Palmomental_L());
				eLast.setPym_Reflex_Palmomental_L_C_Initial(eFirst.getPym_Reflex_Palmomental_L_C());
				eLast.setPym_Strength_Deltoids_R_Initial(eFirst.getPym_Strength_Deltoids_R());
				eLast.setPym_Strength_Deltoids_R_C_Initial(eFirst.getPym_Strength_Deltoids_R_C());
				eLast.setPym_Strength_Deltoids_L_Initial(eFirst.getPym_Strength_Deltoids_L());

				eLast.setPym_Strength_Deltoids_L_C_Initial(eFirst.getPym_Strength_Deltoids_L_C());
				eLast.setPym_Strength_Biceps_R_Initial(eFirst.getPym_Strength_Biceps_R());
				eLast.setPym_Strength_Biceps_R_C_Initial(eFirst.getPym_Strength_Biceps_R_C());
				eLast.setPym_Strength_Biceps_L_Initial(eFirst.getPym_Strength_Biceps_L());
				eLast.setPym_Strength_Biceps_L_C_Initial(eFirst.getPym_Strength_Biceps_L_C());
				eLast.setPym_Strength_Triceps_R_Initial(eFirst.getPym_Strength_Triceps_R());
				eLast.setPym_Strength_Triceps_R_C_Initial(eFirst.getPym_Strength_Triceps_R_C());
				eLast.setPym_Strength_Triceps_L_Initial(eFirst.getPym_Strength_Triceps_L());
				eLast.setPym_Strength_Triceps_L_C_Initial(eFirst.getPym_Strength_Triceps_L_C());
				eLast.setPym_Strength_WristFlex_R_Initial(eFirst.getPym_Strength_WristFlex_R());
				eLast.setPym_Strength_WristFlex_R_C_Initial(eFirst.getPym_Strength_WristFlex_R_C());
				eLast.setPym_Strength_WristFlex_L_Initial(eFirst.getPym_Strength_WristFlex_L());
				eLast.setPym_Strength_WristFlex_L_C_Initial(eFirst.getPym_Strength_WristFlex_L_C());

				eLast.setPym_Strength_WristExt_R_Initial(eFirst.getPym_Strength_WristExt_R());
				eLast.setPym_Strength_WristExt_R_C_Initial(eFirst.getPym_Strength_WristExt_R_C());
				eLast.setPym_Strength_WristExt_L_Initial(eFirst.getPym_Strength_WristExt_L());
				eLast.setPym_Strength_WristExt_L_C_Initial(eFirst.getPym_Strength_WristExt_L_C());
				eLast.setPym_Strength_HipFlex_R_Initial(eFirst.getPym_Strength_HipFlex_R());
				eLast.setPym_Strength_HipFlex_R_C_Initial(eFirst.getPym_Strength_HipFlex_R_C());
				eLast.setPym_Strength_HipFlex_L_Initial(eFirst.getPym_Strength_HipFlex_L());;
				eLast.setPym_Strength_HipFlex_L_C_Initial(eFirst.getPym_Strength_HipFlex_L_C());
				eLast.setPym_Strength_KneeFlex_R_Initial(eFirst.getPym_Strength_KneeFlex_R());
				eLast.setPym_Strength_KneeFlex_R_C_Initial(eFirst.getPym_Strength_KneeFlex_R_C());
				eLast.setPym_Strength_KneeFlex_L_Initial(eFirst.getPym_Strength_KneeFlex_L());
				eLast.setPym_Strength_KneeFlex_L_C_Initial(eFirst.getPym_Strength_KneeFlex_L_C());
				eLast.setPym_Strength_KneeExt_R_Initial(eFirst.getPym_Strength_KneeExt_R());
				eLast.setPym_Strength_KneeExt_R_C_Initial(eFirst.getPym_Strength_KneeExt_R_C());

				eLast.setPym_Strength_KneeExt_L_Initial(eFirst.getPym_Strength_KneeExt_L());
				eLast.setPym_Strength_KneeExt_L_C_Initial(eFirst.getPym_Strength_KneeExt_L_C());
				eLast.setPym_Strength_PlantarFlex_R_Initial(eFirst.getPym_Strength_PlantarFlex_R());
				eLast.setPym_Strength_PlantarFlex_R_C_Initial(eFirst.getPym_Strength_PlantarFlex_R_C());
				eLast.setPym_Strength_PlantarFlex_L_Initial(eFirst.getPym_Strength_PlantarFlex_L());
				eLast.setPym_Strength_PlantarFlex_L_C_Initial(eFirst.getPym_Strength_PlantarFlex_L_C());
				eLast.setPym_Strength_DorsiFlex_R_Initial(eFirst.getPym_Strength_DorsiFlex_R());
				eLast.setPym_Strength_DorsiFlex_R_C_Initial(eFirst.getPym_Strength_DorsiFlex_R_C());
				eLast.setPym_Strength_DorsiFlex_L_Initial(eFirst.getPym_Strength_DorsiFlex_L());
				eLast.setPym_Strength_DorsiFlex_L_C_Initial(eFirst.getPym_Strength_DorsiFlex_L_C());
				eLast.setPym_Strength_Pronation_R_Initial(eFirst.getPym_Strength_Pronation_R());
				eLast.setPym_Strength_Pronation_R_C_Initial(eFirst.getPym_Strength_Pronation_R_C());
				eLast.setPym_Strength_Pronation_L_Initial(eFirst.getPym_Strength_Pronation_L());

				eLast.setPym_Strength_Pronation_L_C_Initial(eFirst.getPym_Strength_Pronation_L_C());
				eLast.setPym_Strength_DownwardDrift_R_Initial(eFirst.getPym_Strength_DownwardDrift_R());
				eLast.setPym_Strength_DownwardDrift_R_C_Initial(eFirst.getPym_Strength_DownwardDrift_R_C());
				eLast.setPym_Strength_DownwardDrift_L_Initial(eFirst.getPym_Strength_DownwardDrift_L());
				eLast.setPym_Strength_DownwardDrift_L_C_Initial(eFirst.getPym_Strength_DownwardDrift_L_C());
				eLast.setPym_Strength_Sinking_R_Initial(eFirst.getPym_Strength_Sinking_R());
				eLast.setPym_Strength_Sinking_R_C_Initial(eFirst.getPym_Strength_Sinking_R_C());
				eLast.setPym_Strength_Sinking_L_Initial(eFirst.getPym_Strength_Sinking_L());
				eLast.setPym_Strength_Sinking_L_C_Initial(eFirst.getPym_Strength_Sinking_L_C());
				eLast.setPym_Strength_OneLegAngle_R_Initial(eFirst.getPym_Strength_OneLegAngle_R());
				eLast.setPym_Strength_OneLegAngle_R_C_Initial(eFirst.getPym_Strength_OneLegAngle_R_C());
				eLast.setPym_Strength_OneLegAngle_L_Initial(eFirst.getPym_Strength_OneLegAngle_L());
				eLast.setPym_Strength_OneLegAngle_L_C_Initial(eFirst.getPym_Strength_OneLegAngle_L_C());
				eLast.setPym_Strength_WalkHeels_R_Initial(eFirst.getPym_Strength_WalkHeels_R());

				eLast.setPym_Strength_WalkHeels_R_C_Initial(eFirst.getPym_Strength_WalkHeels_R_C());
				eLast.setPym_Strength_WalkHeels_L_Initial(eFirst.getPym_Strength_WalkHeels_L());
				eLast.setPym_Strength_WalkHeels_L_C_Initial(eFirst.getPym_Strength_WalkHeels_L_C());
				eLast.setPym_Strength_WalkToes_R_Initial(eFirst.getPym_Strength_WalkToes_R());
				eLast.setPym_Strength_WalkToes_R_C_Initial(eFirst.getPym_Strength_WalkToes_R_C());
				eLast.setPym_Strength_WalkToes_L_Initial(eFirst.getPym_Strength_WalkToes_L());
				eLast.setPym_Strength_WalkToes_L_C_Initial(eFirst.getPym_Strength_WalkToes_L_C());
				eLast.setPym_Strength_HopFoot_R_Initial(eFirst.getPym_Strength_HopFoot_R());
				eLast.setPym_Strength_HopFoot_R_C_Initial(eFirst.getPym_Strength_HopFoot_R_C());
				eLast.setPym_Strength_HopFoot_L_Initial(eFirst.getPym_Strength_HopFoot_L());
				eLast.setPym_Strength_HopFoot_L_C_Initial(eFirst.getPym_Strength_HopFoot_L_C());
				eLast.setPym_Spasticity_Arms_R_Initial(eFirst.getPym_Spasticity_Arms_R());
				eLast.setPym_Spasticity_Arms_R_C_Initial(eFirst.getPym_Spasticity_Arms_R_C());

				eLast.setPym_Spasticity_Arms_L_Initial(eFirst.getPym_Spasticity_Arms_L());
				eLast.setPym_Spasticity_Arms_L_C_Initial(eFirst.getPym_Spasticity_Arms_L_C());
				eLast.setPym_Spasticity_Legs_R_Initial(eFirst.getPym_Spasticity_Legs_R());
				eLast.setPym_Spasticity_Legs_R_C_Initial(eFirst.getPym_Spasticity_Legs_R_C());
				eLast.setPym_Spasticity_Legs_L_Initial(eFirst.getPym_Spasticity_Legs_L());
				eLast.setPym_Spasticity_Legs_L_C_Initial(eFirst.getPym_Spasticity_Legs_L_C());
				eLast.setPym_Spasticity_Gait_R_Initial(eFirst.getPym_Spasticity_Gait_R());
				eLast.setPym_Spasticity_Gait_R_C_Initial(eFirst.getPym_Spasticity_Gait_R_C());
				eLast.setPym_Spasticity_Gait_L_Initial(eFirst.getPym_Spasticity_Gait_L());
				eLast.setPym_Spasticity_Gait_L_C_Initial(eFirst.getPym_Spasticity_Gait_L_C());
				eLast.setPym_Motor_Performance_Initial(eFirst.getPym_Motor_Performance());
				eLast.setPym_Motor_Performance_C_Initial(eFirst.getPym_Motor_Performance_C());
				eLast.setPyramidal_Comments_Initial(eFirst.getPyramidal_Comments());

				eLast.setCerebellar_HeadTremor_Initial(eFirst.getCerebellar_HeadTremor());
				eLast.setCerebellar_HeadTremor_C_Initial(eFirst.getCerebellar_HeadTremor_C());
				eLast.setCerebellar_TruncalAtaxia_Initial(eFirst.getCerebellar_TruncalAtaxia());
				eLast.setCerebellar_TruncalAtaxia_C_Initial(eFirst.getCerebellar_TruncalAtaxia_C());
				eLast.setCerebellar_TremorUE_R_Initial(eFirst.getCerebellar_TremorUE_R());
				eLast.setCerebellar_TremorUE_R_C_Initial(eFirst.getCerebellar_TremorUE_R_C());
				eLast.setCerebellar_TremorUE_L_Initial(eFirst.getCerebellar_TremorUE_L());
				eLast.setCerebellar_TremorUE_L_C_Initial(eFirst.getCerebellar_TremorUE_L_C());
				eLast.setCerebellar_TremorLE_R_Initial(eFirst.getCerebellar_TremorLE_R());
				eLast.setCerebellar_TremorLE_R_C_Initial(eFirst.getCerebellar_TremorLE_R_C());
				eLast.setCerebellar_TremorLE_L_Initial(eFirst.getCerebellar_TremorLE_L());
				eLast.setCerebellar_TremorLE_L_C_Initial(eFirst.getCerebellar_TremorLE_L_C());
				eLast.setCerebellar_RapidUE_R_Initial(eFirst.getCerebellar_RapidUE_R());
				eLast.setCerebellar_RapidUE_R_C_Initial(eFirst.getCerebellar_RapidUE_R_C());

				eLast.setCerebellar_RapidUE_L_Initial(eFirst.getCerebellar_RapidUE_L());
				eLast.setCerebellar_RapidUE_L_C_Initial(eFirst.getCerebellar_RapidUE_L_C());
				eLast.setCerebellar_RapidLE_R_Initial(eFirst.getCerebellar_RapidLE_R());
				eLast.setCerebellar_RapidLE_R_C_Initial(eFirst.getCerebellar_RapidLE_R_C());
				eLast.setCerebellar_RapidLE_L_Initial(eFirst.getCerebellar_RapidLE_L());
				eLast.setCerebellar_RapidLE_L_C_Initial(eFirst.getCerebellar_RapidLE_L_C());
				eLast.setCerebellar_Tandem_Walking_Initial(eFirst.getCerebellar_Tandem_Walking());
				eLast.setCerebellar_Tandem_Walking_C_Initial(eFirst.getCerebellar_Tandem_Walking_C());
				eLast.setCerebellar_GaitAtaxia_Initial(eFirst.getCerebellar_GaitAtaxia());
				eLast.setCerebellar_GaitAtaxia_C_Initial(eFirst.getCerebellar_GaitAtaxia_C());
				eLast.setCerebellar_RombergTest_Initial(eFirst.getCerebellar_RombergTest());
				eLast.setCerebellar_RombergTest_C_Initial(eFirst.getCerebellar_RombergTest_C());
				eLast.setCerebellar_OtherCereTests_Initial(eFirst.getCerebellar_OtherCereTests());

				eLast.setCerebellar_OtherCereTests_C_Initial(eFirst.getCerebellar_OtherCereTests_C());
				eLast.setCerebellar_Comments_Initial(eFirst.getCerebellar_Comments());
				eLast.setSensory_SuperSensationUE_R_Initial(eFirst.getSensory_SuperSensationUE_R());
				eLast.setSensory_SuperSensationUE_R_C_Initial(eFirst.getSensory_SuperSensationUE_R_C());
				eLast.setSensory_SuperSensationUE_L_Initial(eFirst.getSensory_SuperSensationUE_L());
				eLast.setSensory_SuperSensationUE_L_C_Initial(eFirst.getSensory_SuperSensationUE_L_C());
				eLast.setSensory_SuperTrunk_R_Initial(eFirst.getSensory_SuperTrunk_R());
				eLast.setSensory_SuperTrunk_R_C_Initial(eFirst.getSensory_SuperTrunk_R_C());
				eLast.setSensory_SuperTrunk_L_Initial(eFirst.getSensory_SuperTrunk_L());
				eLast.setSensory_SuperTrunk_L_C_Initial(eFirst.getSensory_SuperTrunk_L_C());
				eLast.setSensory_SuperSensationLE_R_Initial(eFirst.getSensory_SuperSensationLE_R());
				eLast.setSensory_SuperSensationLE_R_C_Initial(eFirst.getSensory_SuperSensationLE_R_C());
				eLast.setSensory_SuperSensationLE_L_Initial(eFirst.getSensory_SuperSensationLE_L());
				eLast.setSensory_SuperSensationLE_L_C_Initial(eFirst.getSensory_SuperSensationLE_L_C());

				eLast.setSensory_VibrationSenseUE_R_Initial(eFirst.getSensory_VibrationSenseUE_R());
				eLast.setSensory_VibrationSenseUE_R_C_Initial(eFirst.getSensory_VibrationSenseUE_R_C());
				eLast.setSensory_VibrationSenseUE_L_Initial(eFirst.getSensory_VibrationSenseUE_L());
				eLast.setSensory_VibrationSenseUE_L_C_Initial(eFirst.getSensory_VibrationSenseUE_L_C());
				eLast.setSensory_VibrationSenseLE_R_Initial(eFirst.getSensory_VibrationSenseLE_R());
				eLast.setSensory_VibrationSenseLE_R_C_Initial(eFirst.getSensory_VibrationSenseLE_R_C());
				eLast.setSensory_VibrationSenseLE_L_Initial(eFirst.getSensory_VibrationSenseLE_L());
				eLast.setSensory_VibrationSenseLE_L_C_Initial(eFirst.getSensory_VibrationSenseLE_L_C());
				eLast.setSensory_PositionSenseUE_R_Initial(eFirst.getSensory_PositionSenseUE_R());
				eLast.setSensory_PositionSenseUE_R_C_Initial(eFirst.getSensory_PositionSenseUE_R_C());
				eLast.setSensory_PositionSenseUE_L_Initial(eFirst.getSensory_PositionSenseUE_L());
				eLast.setSensory_PositionSenseUE_L_C_Initial(eFirst.getSensory_PositionSenseUE_L_C());
				eLast.setSensory_PositionSenseLE_R_Initial(eFirst.getSensory_PositionSenseLE_R());

				eLast.setSensory_PositionSenseLE_R_C_Initial(eFirst.getSensory_PositionSenseLE_R_C());
				eLast.setSensory_PositionSenseLE_L_Initial(eFirst.getSensory_PositionSenseLE_L());
				eLast.setSensory_PositionSenseLE_L_C_Initial(eFirst.getSensory_PositionSenseLE_L_C());
				eLast.setSensory_LhermittesSign_Initial(eFirst.getSensory_LhermittesSign());
				eLast.setSensory_LhermittesSign_C_Initial(eFirst.getSensory_LhermittesSign_C());
				eLast.setSensory_ParaesthesiaeUE_R_Initial(eFirst.getSensory_ParaesthesiaeUE_R());
				eLast.setSensory_ParaesthesiaeUE_R_C_Initial(eFirst.getSensory_ParaesthesiaeUE_R_C());
				eLast.setSensory_ParaesthesiaeUE_L_Initial(eFirst.getSensory_ParaesthesiaeUE_L());
				eLast.setSensory_ParaesthesiaeUE_L_C_Initial(eFirst.getSensory_ParaesthesiaeUE_L_C());
				eLast.setSensory_ParaesthesiaeTrunk_R_Initial(eFirst.getSensory_ParaesthesiaeTrunk_R());
				eLast.setSensory_ParaesthesiaeTrunk_R_C_Initial(eFirst.getSensory_ParaesthesiaeTrunk_R_C());
				eLast.setSensory_ParaesthesiaeTrunk_L_Initial(eFirst.getSensory_ParaesthesiaeTrunk_L());
				eLast.setSensory_ParaesthesiaeTrunk_L_C_Initial(eFirst.getSensory_ParaesthesiaeTrunk_L_C());
				eLast.setSensory_ParaesthesiaeLE_R_Initial(eFirst.getSensory_ParaesthesiaeLE_R());

				eLast.setSensory_ParaesthesiaeLE_R_C_Initial(eFirst.getSensory_ParaesthesiaeLE_R_C());
				eLast.setSensory_ParaesthesiaeLE_L_Initial(eFirst.getSensory_ParaesthesiaeLE_L());
				eLast.setSensory_ParaesthesiaeLE_L_C_Initial(eFirst.getSensory_ParaesthesiaeLE_L_C());
				eLast.setSensory_Comments_Initial(eFirst.getSensory_Comments());
				eLast.setBowelBladder_UrinaryHR_Initial(eFirst.getBowelBladder_UrinaryHR());
				eLast.setBowelBladder_UrinaryHR_C_Initial(eFirst.getBowelBladder_UrinaryHR_C());
				eLast.setBowelBladder_UrinaryUI_Initial(eFirst.getBowelBladder_UrinaryUI());
				eLast.setBowelBladder_UrinaryUI_C_Initial(eFirst.getBowelBladder_UrinaryUI_C());
				eLast.setBowelBladder_Catheterisation_Initial(eFirst.getBowelBladder_Catheterisation());
				eLast.setBowelBladder_Catheterisation_C_Initial(eFirst.getBowelBladder_Catheterisation_C());
				eLast.setBowelBladder_BowelDysfunction_Initial(eFirst.getBowelBladder_BowelDysfunction());
				eLast.setBowelBladder_BowelDysfunc_C_Initial(eFirst.getBowelBladder_BowelDysfunc_C());
				eLast.setBowelBladder_SexualDysfunction_Initial(eFirst.getBowelBladder_SexualDysfunction());

				eLast.setBowelBladder_SexualDysfunc_C_Initial(eFirst.getBowelBladder_SexualDysfunc_C());
				eLast.setBowelBladder_Comments_Initial(eFirst.getBowelBladder_Comments());
				eLast.setCerebral_Depression_Initial(eFirst.getCerebral_Depression());
				eLast.setCerebral_Depression_C_Initial(eFirst.getCerebral_Depression_C());
				eLast.setCerebral_Euphoria_Initial(eFirst.getCerebral_Euphoria());
				eLast.setCerebral_Euphoria_C_Initial(eFirst.getCerebral_Euphoria_C());
				eLast.setCerebral_DecreaseMentation_Initial(eFirst.getCerebral_DecreaseMentation());
				eLast.setCerebral_DecreaseMentation_C_Initial(eFirst.getCerebral_DecreaseMentation_C());
				eLast.setCerebral_Fatigue_Initial(eFirst.getCerebral_Fatigue());
				eLast.setCerebral_Fatigue_C_Initial(eFirst.getCerebral_Fatigue_C());
				eLast.setCerebral_Comments_Initial(eFirst.getCerebral_Comments());
				eLast.setAmbulation_Distance_Patient_Initial(eFirst.getAmbulation_Distance_Patient());
				eLast.setAmbulation_Distance_Patient_C_Initial(eFirst.getAmbulation_Distance_Patient_C());

				eLast.setAmbulation_Time_Patient_Initial(eFirst.getAmbulation_Time_Patient());
				eLast.setAmbulation_Time_Patient_C_Initial(eFirst.getAmbulation_Time_Patient_C());
				eLast.setAmbulation_Assistance_Initial(eFirst.getAmbulation_Assistance());
				eLast.setAmbulation_Assistance_C_Initial(eFirst.getAmbulation_Assistance_C());
				eLast.setAmbulation_Distance_Initial(eFirst.getAmbulation_Distance());
				eLast.setAmbulation_Distance_C_Initial(eFirst.getAmbulation_Distance_C());
				eLast.setAmbulation_Comments_Initial(eFirst.getAmbulation_Comments());
				eLast.setFSS_Visual_Initial(eFirst.getFSS_Visual());
				eLast.setFSS_Visual_Converted_Initial(eFirst.getFSS_Visual_Converted());
				eLast.setFSS_Brainstem_Initial(eFirst.getFSS_Brainstem());
				eLast.setFSS_Pyramidal_Initial(eFirst.getFSS_Pyramidal());
				eLast.setFSS_Cerebellar_Initial(eFirst.getFSS_Cerebellar());
				eLast.setFSS_Sensory_Initial(eFirst.getFSS_Sensory());
				eLast.setFSS_BowelBladder_Initial(eFirst.getFSS_BowelBladder());

				eLast.setFSS_BowelBladder_Converted_Initial(eFirst.getFSS_BowelBladder_Converted());
				eLast.setFSS_Cerebral_Initial(eFirst.getFSS_Cerebral());
				eLast.setFSS_Ambulation_Initial(eFirst.getFSS_Ambulation());
				eLast.setEDSS_Step_Initial(eFirst.getEDSS_Step());
				eLast.setEDSS_Step_Comments_Initial(eFirst.getEDSS_Step_Comments());	

				eList.clear();
				eList.add(eLast);
			}

			/* Writing the header */
			LOGGER.info("Writing the output header to the output CSV ");
			beanWriter.writeHeader(outputHeader);

			/* POJO to CSV file as output*/
			final CellProcessor[] processorWrite = getWriteProcessors();
			for(int i = 0; i <= outputHeader.length -1 ; i++ ) {
				outputHeader[i] = outputHeader[i].replaceAll("[^a-zA-Z0-9_]+","");
			}
			for(Map.Entry<String, List<EDSSInitial>> entry : edssIniMap.entrySet()) {
				beanWriter.write(entry.getValue().get(0), outputHeader, processorWrite);
			}
			LOGGER.info("Processed the data and now Writing into CSV file from POJO");
			
			byte[] buf = new byte[1024];
			int forms = 0;
			for(int i = 0; i < appendix1.numberOfElements(); i++ ) {		    	
				forms ++;
				form_names[i] = appendix1.getValue(i,"FORM_ID");
				number_forms++;
			}
			/* Zip the other input files present in the input folder and mentioned in Appendix 1  */
			/*for (int j = 0;j<number_forms;j++) {
				filename = form_names[j];
				ZipOutputStream out = new ZipOutputStream(new FileOutputStream(".\\output\\"+filename+".zip"));
				FileInputStream in = new FileInputStream(".\\input\\"+filename+".csv");
				
				out.putNextEntry(new ZipEntry(filename+".csv"));
				int len;
				while ((len = in.read(buf)) > 0) {
					out.write(buf, 0, len);
				}
				out.closeEntry();
				in.close();
				out.close();
			}*/
			
			/* Mainly reads other input files from the input folder to the output folder*/
			/*LOGGER.info("Reading and writing the other input files to the output folder");
			for (int j = 0;j<number_forms;j++) {
				filename = form_names[j];
				FileInputStream in = new FileInputStream(".\\input\\"+filename+".csv");
				FileOutputStream out = new FileOutputStream(".\\output\\"+filename+".csv");
				int len;
				while ((len = in.read(buf)) > 0) {
					out.write(buf, 0, len);
				}
				in.close();
				out.close();
			}*/
			
			LOGGER.info("Processing of EDSS file completed.");
		}catch(Exception e){
			LOGGER.severe("Problems when creating the log files: "+e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				beanReader.close();	
				beanWriter.close();
			} catch(IOException ioe) {
				// ignore
			}
		}
		/* This particular function is for zipping of EDSS file */
		ZipOutputStream out = null;
		FileInputStream in = null;
		try {
			Date today = Calendar.getInstance().getTime();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
			SimpleDateFormat sdf2 = new SimpleDateFormat("HHmmss");
			String reportTime  =  sdf2.format(today);
			String reportDate = sdf1.format(today);
			String Zipfile = "F_F10034 "+reportDate+reportTime;
			byte[] buffer = new byte[1024];
			out = new ZipOutputStream(new FileOutputStream(".\\output\\"+ Zipfile+".zip"));
			in = new FileInputStream(".\\output\\F_F10034.csv");			
			out.putNextEntry(new ZipEntry("F_F10034.csv"));
			int len;
			while ((len = in.read(buffer)) > 0) {
				out.write(buffer, 0, len);
			}
		} catch(Exception e) {
			LOGGER.severe("Failed to write to zip output" + e.getMessage());
		}
		finally {
			
			try { in.close(); } catch(Exception e) {}
			try { out.closeEntry();; } catch(Exception e) {}
			try { out.close(); } catch(Exception e) {}	
			
		}			
	}

	/**
	 * This is a cell processor for writing back in to the output file.
	 * Number of elements in the CellProcessor array must be equal to number of columns in the output file.
	 */
	private static CellProcessor[] getWriteProcessors() {
		final CellProcessor[] processors = new CellProcessor[] { 
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional()
		};
		return processors;
	}

	/** This CellProcessor is used to read the CSV file and convert it into a java class
	 * In this case it is EDSSInitial.java
	 * the number of elements in the CellProcessor array must be equal to the number of columns present in the Input CSV file.
	 */
	private static CellProcessor[] getReadProcessors() {
		final CellProcessor[] processors = new CellProcessor[] { 
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),	
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),		
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),			
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),		
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),			
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),	
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),		
				new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional(),new Optional()
		};
		return processors;
	}
	
	private static CellProcessor[] getCorrectionProcessor(){
		final CellProcessor[] processors = new CellProcessor[] { 
				new Optional(),new Optional(),new Optional()
		
	};
		return processors;
	}

	/**
	 * Comparator to sort based on Initial time and Final time
	 */
	private static final Comparator<EDSSInitial> EDSS_MODIFIED_DATE_TIME_COMPARATOR = new Comparator<EDSSInitial>() {
		@Override
		public int compare(EDSSInitial o1, EDSSInitial o2) {
			EDSSInitial e1 = (EDSSInitial) o1;
			EDSSInitial e2 = (EDSSInitial) o2;
			Date date1 = null;
			Date date2 = null;
			try {
				date1 = outputDateFormat.parse(e1.getMODIFYTIME().substring(0, 19));
				date2 = outputDateFormat.parse(e2.getMODIFYTIME().substring(0, 19));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return date1.compareTo(date2);
		}
	};
	
	/**
	 * Comparator to sort based on Initial time and Final time
	 */
	private static final Comparator<EDSSInitial> VERSION_COMPARATOR = new Comparator<EDSSInitial>() {
		@Override
		public int compare(EDSSInitial o1, EDSSInitial o2) {
			EDSSInitial e1 = (EDSSInitial) o1;
			EDSSInitial e2 = (EDSSInitial) o2;
			String version1 = null;
			String version2 = null;
			version1 = e1.getVERSIONID();
			version2 = e2.getVERSIONID();
			return version1.compareTo(version2);
		}
	};
}
