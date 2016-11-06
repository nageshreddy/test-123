/**
 * Class of EDSS 
 * This Class acts as a POJO for reading to and from a CSV file
 * 							
 * @author Sneha Kamath
 * @version 1
 * @since  27-AUG-2014
 * @Copyright © 2014 CRF Health All rights reserved.
 */


package classes;

public class EDSS {


	private String ID;
	private String VERSIONID;
	private String PATIENT;
	private String ORIGPATIENT;
	private String SUBJECTCODE;
	private String SITECODE;
	private String SPCONFIG;
	private String PERIOD;
	private String TITLE;
	private String CREATETIME;
	private String MODIFYTIME;
	private String STUDYDAY;
	private String STUDYDATE;
	private String LANGUAGE;
	private String DELETED;
	private String EDSS_Start;
	private String EDSS_End;
	private String Related_Date;
	private String Related_Time;
	private String VisitNumber;
	
	private String Investigator_Name;
	private String Visual_Acuity_Corrected;
	private String Visual_Acuity_Corrected_Initial;
	private String Visual_Acuity_OD;
	private String Visual_Acuity_OD_Initial;
	private String Visual_Acuity_OD_C;
	private String Visual_Acuity_OD_C_Initial;
	private String Visual_Acuity_OS;
	private String Visual_Acuity_OS_Initial;
	private String Visual_Acuity_OS_C;
	private String Visual_Acuity_OS_C_Initial;
	private String Visual_Fields_OD;
	private String Visual_Fields_OD_Initial;
	private String Visual_Fields_OD_C;
	private String Visual_Fields_OD_C_Initial;
	private String Visual_Fields_OS;
	private String Visual_Fields_OS_Initial;
	private String Visual_Fields_OS_C;
	private String Visual_Fields_OS_C_Initial;
	private String Visual_Scotoma_OD;
	private String Visual_Scotoma_OD_Initial;
	
	private String Visual_Scotoma_OD_C;
	private String Visual_Scotoma_OD_C_Initial;
	private String Visual_Scotoma_OS;
	private String Visual_Scotoma_OS_Initial;
	private String Visual_Scotoma_OS_C;
	private String Visual_Scotoma_OS_C_Initial;
	private String Visual_DiscPallor_OD;
	private String Visual_DiscPallor_OD_Initial;
	private String Visual_DiscPallor_OD_C;
	private String Visual_DiscPallor_OD_C_Initial;
	private String Visual_DiscPallor_OS;
	private String Visual_DiscPallor_OS_Initial;
	private String Visual_DiscPallor_OS_C;
	private String Visual_DiscPallor_OS_C_Initial;
	private String Visual_Comments;
	private String Visual_Comments_Initial;
	private String Brainstem_EOM;
	private String Brainstem_EOM_Initial;
	private String Brainstem_EOM_C;
	private String Brainstem_EOM_C_Initial;
	private String Brainstem_Nystagmus;
	private String Brainstem_Nystagmus_Initial;
	private String Brainstem_Nystagmus_C;
	private String Brainstem_Nystagmus_C_Initial;
	private String Brainstem_Trigeminal;
	private String Brainstem_Trigeminal_Initial;
	private String Brainstem_Trigeminal_C;
	private String Brainstem_Trigeminal_C_Initial;
	
	private String Brainstem_FacialWeakness;
	private String Brainstem_FacialWeakness_Initial;
	private String Brainstem_FacialWeakness_C;
	private String Brainstem_FacialWeakness_C_Initial;
	private String Brainstem_HearingLoss;
	private String Brainstem_HearingLoss_Initial;
	private String Brainstem_HearingLoss_C;
	private String Brainstem_HearingLoss_C_Initial;
	private String Brainstem_Dysarthria;
	private String Brainstem_Dysarthria_Initial;
	private String Brainstem_Dysarthria_C;
	private String Brainstem_Dysarthria_C_Initial;
	private String Brainstem_Dysphagia;
	private String Brainstem_Dysphagia_Initial;
	private String Brainstem_Dysphagia_C;
	private String Brainstem_Dysphagia_C_Initial;
	private String Brainstem_OtherCranialNerve;
	private String Brainstem_OtherCranialNerve_Initial;
	private String Brainstem_OtherCranialNerve_C;
	private String Brainstem_OtherCranialNerve_C_Initial;
	private String Brainstem_Comments;
	private String Brainstem_Comments_Initial;
	private String Pym_Reflex_Biceps_R;
	private String Pym_Reflex_Biceps_R_Initial;
	private String Pym_Reflex_Biceps_R_C;
	private String Pym_Reflex_Biceps_R_C_Initial;
	
	private String Pym_Reflex_Biceps_;
	private String Pym_Reflex_Biceps__Initial;
	private String Pym_Reflex_Biceps_L;
	private String Pym_Reflex_Biceps_L_Initial;
	private String Pym_Reflex_Biceps_L_C;
	private String Pym_Reflex_Biceps_L_C_Initial;
	private String Pym_Reflex_Triceps_R;
	private String Pym_Reflex_Triceps_R_Initial;
	private String Pym_Reflex_Triceps_R_C;
	private String Pym_Reflex_Triceps_R_C_Initial;
	private String Pym_Reflex_Triceps_;
	private String Pym_Reflex_Triceps__Initial;
	private String Pym_Reflex_Triceps_L;
	private String Pym_Reflex_Triceps_L_Initial;
	private String Pym_Reflex_Triceps_L_C;
	private String Pym_Reflex_Triceps_L_C_Initial;
	private String Pym_Reflex_Brachioradial_R;
	private String Pym_Reflex_Brachioradial_R_Initial;
	private String Pym_Reflex_Brachioradial_R_C;
	private String Pym_Reflex_Brachioradial_R_C_Initial;
	private String Pym_Reflex_Brachioradialis_;
	private String Pym_Reflex_Brachioradialis__Initial;
	private String Pym_Reflex_Brachioradialis_L;
	private String Pym_Reflex_Brachioradialis_L_Initial;
	private String Pym_Reflex_Brachioradialis_L_C;
	private String Pym_Reflex_Brachioradialis_L_C_Initial;
	private String Pym_Reflex_Knee_R;
	private String Pym_Reflex_Knee_R_Initial;
	
	private String Pym_Reflex_Knee_R_C;
	private String Pym_Reflex_Knee_R_C_Initial;
	private String Pym_Reflex_Knee_;
	private String Pym_Reflex_Knee__Initial;
	private String Pym_Reflex_Knee_L;
	private String Pym_Reflex_Knee_L_Initial;
	private String Pym_Reflex_Knee_L_C;
	private String Pym_Reflex_Knee_L_C_Initial;
	private String Pym_Reflex_Ankle_R;
	private String Pym_Reflex_Ankle_R_Initial;
	private String Pym_Reflex_Ankle_R_C;
	private String Pym_Reflex_Ankle_R_C_Initial;
	private String Pym_Reflex_Ankle_;
	private String Pym_Reflex_Ankle__Initial;
	private String Pym_Reflex_Ankle_L;
	private String Pym_Reflex_Ankle_L_Initial;
	private String Pym_Reflex_Ankle_L_C;
	private String Pym_Reflex_Ankle_L_C_Initial;
	private String Pym_Reflex_Plantar_R;
	private String Pym_Reflex_Plantar_R_Initial;
	private String Pym_Reflex_Plantar_R_C;
	private String Pym_Reflex_Plantar_R_C_Initial;
	private String Pym_Reflex_Plantar_;
	private String Pym_Reflex_Plantar__Initial;
	private String Pym_Reflex_Plantar_L;
	private String Pym_Reflex_Plantar_L_Initial;
	
	private String Pym_Reflex_Plantar_L_C;
	private String Pym_Reflex_Plantar_L_C_Initial;
	private String Pym_Reflex_Cutaneous_R;
	private String Pym_Reflex_Cutaneous_R_Initial;
	private String Pym_Reflex_Cutaneous_R_C;
	private String Pym_Reflex_Cutaneous_R_C_Initial;
	private String Pym_Reflex_Cutaneous_;
	private String Pym_Reflex_Cutaneous__Initial;
	private String Pym_Reflex_Cutaneous_L;
	private String Pym_Reflex_Cutaneous_L_Initial;
	private String Pym_Reflex_Cutaneous_L_C;
	private String Pym_Reflex_Cutaneous_L_C_Initial;
	private String Pym_Reflex_Palmomental_R;
	private String Pym_Reflex_Palmomental_R_Initial;
	private String Pym_Reflex_Palmomental_R_C;
	private String Pym_Reflex_Palmomental_R_C_Initial;
	private String Pym_Reflex_Palmomental_;
	private String Pym_Reflex_Palmomental__Initial;
	private String Pym_Reflex_Palmomental_L;
	private String Pym_Reflex_Palmomental_L_Initial;
	private String Pym_Reflex_Palmomental_L_C;
	private String Pym_Reflex_Palmomental_L_C_Initial;
	private String Pym_Strength_Deltoids_R;
	private String Pym_Strength_Deltoids_R_Initial;
	private String Pym_Strength_Deltoids_R_C;
	private String Pym_Strength_Deltoids_R_C_Initial;
	private String Pym_Strength_Deltoids_L;
	private String Pym_Strength_Deltoids_L_Initial;
	
	private String Pym_Strength_Deltoids_L_C;
	private String Pym_Strength_Deltoids_L_C_Initial;
	private String Pym_Strength_Biceps_R;
	private String Pym_Strength_Biceps_R_Initial;
	private String Pym_Strength_Biceps_R_C;
	private String Pym_Strength_Biceps_R_C_Initial;
	private String Pym_Strength_Biceps_L;
	private String Pym_Strength_Biceps_L_Initial;
	private String Pym_Strength_Biceps_L_C;
	private String Pym_Strength_Biceps_L_C_Initial;
	private String Pym_Strength_Triceps_R;
	private String Pym_Strength_Triceps_R_Initial;
	private String Pym_Strength_Triceps_R_C;
	private String Pym_Strength_Triceps_R_C_Initial;
	private String Pym_Strength_Triceps_L;
	private String Pym_Strength_Triceps_L_Initial;
	private String Pym_Strength_Triceps_L_C;
	private String Pym_Strength_Triceps_L_C_Initial;
	private String Pym_Strength_WristFlex_R;
	private String Pym_Strength_WristFlex_R_Initial;
	private String Pym_Strength_WristFlex_R_C;
	private String Pym_Strength_WristFlex_R_C_Initial;
	private String Pym_Strength_WristFlex_L;
	private String Pym_Strength_WristFlex_L_Initial;
	private String Pym_Strength_WristFlex_L_C;
	private String Pym_Strength_WristFlex_L_C_Initial;
	
	private String Pym_Strength_WristExt_R;
	private String Pym_Strength_WristExt_R_Initial;
	private String Pym_Strength_WristExt_R_C;
	private String Pym_Strength_WristExt_R_C_Initial;
	private String Pym_Strength_WristExt_L;
	private String Pym_Strength_WristExt_L_Initial;
	private String Pym_Strength_WristExt_L_C;
	private String Pym_Strength_WristExt_L_C_Initial;
	private String Pym_Strength_HipFlex_R;
	private String Pym_Strength_HipFlex_R_Initial;
	private String Pym_Strength_HipFlex_R_C;
	private String Pym_Strength_HipFlex_R_C_Initial;
	private String Pym_Strength_HipFlex_L;
	private String Pym_Strength_HipFlex_L_Initial;
	private String Pym_Strength_HipFlex_L_C;
	private String Pym_Strength_HipFlex_L_C_Initial;
	private String Pym_Strength_KneeFlex_R;
	private String Pym_Strength_KneeFlex_R_Initial;
	private String Pym_Strength_KneeFlex_R_C;
	private String Pym_Strength_KneeFlex_R_C_Initial;
	private String Pym_Strength_KneeFlex_L;
	private String Pym_Strength_KneeFlex_L_Initial;
	private String Pym_Strength_KneeFlex_L_C;
	private String Pym_Strength_KneeFlex_L_C_Initial;
	private String Pym_Strength_KneeExt_R;
	private String Pym_Strength_KneeExt_R_Initial;
	private String Pym_Strength_KneeExt_R_C;
	private String Pym_Strength_KneeExt_R_C_Initial;
	
	private String Pym_Strength_KneeExt_L;
	private String Pym_Strength_KneeExt_L_Initial;
	private String Pym_Strength_KneeExt_L_C;
	private String Pym_Strength_KneeExt_L_C_Initial;
	private String Pym_Strength_PlantarFlex_R;
	private String Pym_Strength_PlantarFlex_R_Initial;
	private String Pym_Strength_PlantarFlex_R_C;
	private String Pym_Strength_PlantarFlex_R_C_Initial;
	private String Pym_Strength_PlantarFlex_L;
	private String Pym_Strength_PlantarFlex_L_Initial;
	private String Pym_Strength_PlantarFlex_L_C;
	private String Pym_Strength_PlantarFlex_L_C_Initial;
	private String Pym_Strength_DorsiFlex_R;
	private String Pym_Strength_DorsiFlex_R_Initial;
	private String Pym_Strength_DorsiFlex_R_C;
	private String Pym_Strength_DorsiFlex_R_C_Initial;
	private String Pym_Strength_DorsiFlex_L;
	private String Pym_Strength_DorsiFlex_L_Initial;
	private String Pym_Strength_DorsiFlex_L_C;
	private String Pym_Strength_DorsiFlex_L_C_Initial;
	private String Pym_Strength_Pronation_R;
	private String Pym_Strength_Pronation_R_Initial;
	private String Pym_Strength_Pronation_R_C;
	private String Pym_Strength_Pronation_R_C_Initial;
	private String Pym_Strength_Pronation_L;
	private String Pym_Strength_Pronation_L_Initial;
	
	private String Pym_Strength_Pronation_L_C;
	private String Pym_Strength_Pronation_L_C_Initial;
	private String Pym_Strength_DownwardDrift_R;
	private String Pym_Strength_DownwardDrift_R_Initial;
	private String Pym_Strength_DownwardDrift_R_C;
	private String Pym_Strength_DownwardDrift_R_C_Initial;
	private String Pym_Strength_DownwardDrift_L;
	private String Pym_Strength_DownwardDrift_L_Initial;
	private String Pym_Strength_DownwardDrift_L_C;
	private String Pym_Strength_DownwardDrift_L_C_Initial;
	private String Pym_Strength_Sinking_R;
	private String Pym_Strength_Sinking_R_Initial;
	private String Pym_Strength_Sinking_R_C;
	private String Pym_Strength_Sinking_R_C_Initial;
	private String Pym_Strength_Sinking_L;
	private String Pym_Strength_Sinking_L_Initial;
	private String Pym_Strength_Sinking_L_C;
	private String Pym_Strength_Sinking_L_C_Initial;
	private String Pym_Strength_OneLegAngle_R;
	private String Pym_Strength_OneLegAngle_R_Initial;
	private String Pym_Strength_OneLegAngle_R_C;
	private String Pym_Strength_OneLegAngle_R_C_Initial;
	private String Pym_Strength_OneLegAngle_L;
	private String Pym_Strength_OneLegAngle_L_Initial;
	private String Pym_Strength_OneLegAngle_L_C;
	private String Pym_Strength_OneLegAngle_L_C_Initial;
	private String Pym_Strength_WalkHeels_R;
	
	private String Pym_Strength_WalkHeels_R_Initial;
	private String Pym_Strength_WalkHeels_R_C;
	private String Pym_Strength_WalkHeels_R_C_Initial;
	private String Pym_Strength_WalkHeels_L;
	private String Pym_Strength_WalkHeels_L_Initial;
	private String Pym_Strength_WalkHeels_L_C;
	private String Pym_Strength_WalkHeels_L_C_Initial;
	private String Pym_Strength_WalkToes_R;
	private String Pym_Strength_WalkToes_R_Initial;
	private String Pym_Strength_WalkToes_R_C;
	private String Pym_Strength_WalkToes_R_C_Initial;
	private String Pym_Strength_WalkToes_L;
	private String Pym_Strength_WalkToes_L_Initial;
	private String Pym_Strength_WalkToes_L_C;
	private String Pym_Strength_WalkToes_L_C_Initial;
	private String Pym_Strength_HopFoot_R;
	private String Pym_Strength_HopFoot_R_Initial;
	private String Pym_Strength_HopFoot_R_C;
	private String Pym_Strength_HopFoot_R_C_Initial;
	private String Pym_Strength_HopFoot_L;
	private String Pym_Strength_HopFoot_L_Initial;
	private String Pym_Strength_HopFoot_L_C;
	private String Pym_Strength_HopFoot_L_C_Initial;
	private String Pym_Spasticity_Arms_R;
	private String Pym_Spasticity_Arms_R_Initial;
	private String Pym_Spasticity_Arms_R_C;
	private String Pym_Spasticity_Arms_R_C_Initial;
	
	private String Pym_Spasticity_Arms_L;
	private String Pym_Spasticity_Arms_L_Initial;
	private String Pym_Spasticity_Arms_L_C;
	private String Pym_Spasticity_Arms_L_C_Initial;
	private String Pym_Spasticity_Legs_R;
	private String Pym_Spasticity_Legs_R_Initial;
	private String Pym_Spasticity_Legs_R_C;
	private String Pym_Spasticity_Legs_R_C_Initial;
	private String Pym_Spasticity_Legs_L;
	private String Pym_Spasticity_Legs_L_Initial;
	private String Pym_Spasticity_Legs_L_C;
	private String Pym_Spasticity_Legs_L_C_Initial;
	private String Pym_Spasticity_Gait_R;
	private String Pym_Spasticity_Gait_R_Initial;
	private String Pym_Spasticity_Gait_R_C;
	private String Pym_Spasticity_Gait_R_C_Initial;
	private String Pym_Spasticity_Gait_L;
	private String Pym_Spasticity_Gait_L_Initial;
	private String Pym_Spasticity_Gait_L_C;
	private String Pym_Spasticity_Gait_L_C_Initial;
	private String Pym_Motor_Performance;
	private String Pym_Motor_Performance_Initial;
	private String Pym_Motor_Performance_C;
	private String Pym_Motor_Performance_C_Initial;
	private String Pyramidal_Comments;
	private String Pyramidal_Comments_Initial;
	
	private String Cerebellar_HeadTremor;
	private String Cerebellar_HeadTremor_Initial;
	private String Cerebellar_HeadTremor_C;
	private String Cerebellar_HeadTremor_C_Initial;
	private String Cerebellar_TruncalAtaxia;
	private String Cerebellar_TruncalAtaxia_Initial;
	private String Cerebellar_TruncalAtaxia_C;
	private String Cerebellar_TruncalAtaxia_C_Initial;
	private String Cerebellar_TremorUE_R;
	private String Cerebellar_TremorUE_R_Initial;
	private String Cerebellar_TremorUE_R_C;
	private String Cerebellar_TremorUE_R_C_Initial;
	private String Cerebellar_TremorUE_L;
	private String Cerebellar_TremorUE_L_Initial;
	private String Cerebellar_TremorUE_L_C;
	private String Cerebellar_TremorUE_L_C_Initial;
	private String Cerebellar_TremorLE_R;
	private String Cerebellar_TremorLE_R_Initial;
	private String Cerebellar_TremorLE_R_C;
	private String Cerebellar_TremorLE_R_C_Initial;
	private String Cerebellar_TremorLE_L;
	private String Cerebellar_TremorLE_L_Initial;
	private String Cerebellar_TremorLE_L_C;
	private String Cerebellar_TremorLE_L_C_Initial;
	private String Cerebellar_RapidUE_R;
	private String Cerebellar_RapidUE_R_Initial;
	private String Cerebellar_RapidUE_R_C;
	private String Cerebellar_RapidUE_R_C_Initial;
	
	private String Cerebellar_RapidUE_L;
	private String Cerebellar_RapidUE_L_Initial;
	private String Cerebellar_RapidUE_L_C;
	private String Cerebellar_RapidUE_L_C_Initial;
	private String Cerebellar_RapidLE_R;
	private String Cerebellar_RapidLE_R_Initial;
	private String Cerebellar_RapidLE_R_C;
	private String Cerebellar_RapidLE_R_C_Initial;
	private String Cerebellar_RapidLE_L;
	private String Cerebellar_RapidLE_L_Initial;
	private String Cerebellar_RapidLE_L_C;
	private String Cerebellar_RapidLE_L_C_Initial;
	private String Cerebellar_Tandem_Walking;
	private String Cerebellar_Tandem_Walking_Initial;
	private String Cerebellar_Tandem_Walking_C;
	private String Cerebellar_Tandem_Walking_C_Initial;
	private String Cerebellar_GaitAtaxia;
	private String Cerebellar_GaitAtaxia_Initial;
	private String Cerebellar_GaitAtaxia_C;
	private String Cerebellar_GaitAtaxia_C_Initial;
	private String Cerebellar_RombergTest;
	private String Cerebellar_RombergTest_Initial;
	private String Cerebellar_RombergTest_C;
	private String Cerebellar_RombergTest_C_Initial;
	private String Cerebellar_OtherCereTests;
	private String Cerebellar_OtherCereTests_Initial;
	
	private String Cerebellar_OtherCereTests_C;
	private String Cerebellar_OtherCereTests_C_Initial;
	private String Cerebellar_Comments;
	private String Cerebellar_Comments_Initial;
	private String Sensory_SuperSensationUE_R;
	private String Sensory_SuperSensationUE_R_Initial;
	private String Sensory_SuperSensationUE_R_C;
	private String Sensory_SuperSensationUE_R_C_Initial;
	private String Sensory_SuperSensationUE_L;
	private String Sensory_SuperSensationUE_L_Initial;
	private String Sensory_SuperSensationUE_L_C;
	private String Sensory_SuperSensationUE_L_C_Initial;
	private String Sensory_SuperTrunk_R;
	private String Sensory_SuperTrunk_R_Initial;
	private String Sensory_SuperTrunk_R_C;
	private String Sensory_SuperTrunk_R_C_Initial;
	private String Sensory_SuperTrunk_L;
	private String Sensory_SuperTrunk_L_Initial;
	private String Sensory_SuperTrunk_L_C;
	private String Sensory_SuperTrunk_L_C_Initial;
	private String Sensory_SuperSensationLE_R;
	private String Sensory_SuperSensationLE_R_Initial;
	private String Sensory_SuperSensationLE_R_C;
	private String Sensory_SuperSensationLE_R_C_Initial;
	private String Sensory_SuperSensationLE_L;
	private String Sensory_SuperSensationLE_L_Initial;
	private String Sensory_SuperSensationLE_L_C;
	private String Sensory_SuperSensationLE_L_C_Initial;
	
	private String Sensory_VibrationSenseUE_R;
	private String Sensory_VibrationSenseUE_R_Initial;
	private String Sensory_VibrationSenseUE_R_C;
	private String Sensory_VibrationSenseUE_R_C_Initial;
	private String Sensory_VibrationSenseUE_L;
	private String Sensory_VibrationSenseUE_L_Initial;
	private String Sensory_VibrationSenseUE_L_C;
	private String Sensory_VibrationSenseUE_L_C_Initial;
	private String Sensory_VibrationSenseLE_R;
	private String Sensory_VibrationSenseLE_R_Initial;
	private String Sensory_VibrationSenseLE_R_C;
	private String Sensory_VibrationSenseLE_R_C_Initial;
	private String Sensory_VibrationSenseLE_L;
	private String Sensory_VibrationSenseLE_L_Initial;
	private String Sensory_VibrationSenseLE_L_C;
	private String Sensory_VibrationSenseLE_L_C_Initial;
	private String Sensory_PositionSenseUE_R;
	private String Sensory_PositionSenseUE_R_Initial;
	private String Sensory_PositionSenseUE_R_C;
	private String Sensory_PositionSenseUE_R_C_Initial;
	private String Sensory_PositionSenseUE_L;
	private String Sensory_PositionSenseUE_L_Initial;
	private String Sensory_PositionSenseUE_L_C;
	private String Sensory_PositionSenseUE_L_C_Initial;
	private String Sensory_PositionSenseLE_R;
	private String Sensory_PositionSenseLE_R_Initial;
	
	private String Sensory_PositionSenseLE_R_C;
	private String Sensory_PositionSenseLE_R_C_Initial;
	private String Sensory_PositionSenseLE_L;
	private String Sensory_PositionSenseLE_L_Initial;
	private String Sensory_PositionSenseLE_L_C;
	private String Sensory_PositionSenseLE_L_C_Initial;
	private String Sensory_LhermittesSign;
	private String Sensory_LhermittesSign_Initial;
	private String Sensory_LhermittesSign_C;
	private String Sensory_LhermittesSign_C_Initial;
	private String Sensory_ParaesthesiaeUE_R;
	private String Sensory_ParaesthesiaeUE_R_Initial;
	private String Sensory_ParaesthesiaeUE_R_C;
	private String Sensory_ParaesthesiaeUE_R_C_Initial;
	private String Sensory_ParaesthesiaeUE_L;
	private String Sensory_ParaesthesiaeUE_L_Initial;
	private String Sensory_ParaesthesiaeUE_L_C;
	private String Sensory_ParaesthesiaeUE_L_C_Initial;
	private String Sensory_ParaesthesiaeTrunk_R;
	private String Sensory_ParaesthesiaeTrunk_R_Initial;
	private String Sensory_ParaesthesiaeTrunk_R_C;
	private String Sensory_ParaesthesiaeTrunk_R_C_Initial;
	private String Sensory_ParaesthesiaeTrunk_L;
	private String Sensory_ParaesthesiaeTrunk_L_Initial;
	private String Sensory_ParaesthesiaeTrunk_L_C;
	private String Sensory_ParaesthesiaeTrunk_L_C_Initial;
	private String Sensory_ParaesthesiaeLE_R;
	private String Sensory_ParaesthesiaeLE_R_Initial;
	
	private String Sensory_ParaesthesiaeLE_R_C;
	private String Sensory_ParaesthesiaeLE_R_C_Initial;
	private String Sensory_ParaesthesiaeLE_L;
	private String Sensory_ParaesthesiaeLE_L_Initial;
	private String Sensory_ParaesthesiaeLE_L_C;
	private String Sensory_ParaesthesiaeLE_L_C_Initial;
	private String Sensory_Comments;
	private String Sensory_Comments_Initial;
	private String BowelBladder_UrinaryHR;
	private String BowelBladder_UrinaryHR_Initial;
	private String BowelBladder_UrinaryHR_C;
	private String BowelBladder_UrinaryHR_C_Initial;
	private String BowelBladder_UrinaryUI;
	private String BowelBladder_UrinaryUI_Initial;
	private String BowelBladder_UrinaryUI_C;
	private String BowelBladder_UrinaryUI_C_Initial;
	private String BowelBladder_Catheterisation;
	private String BowelBladder_Catheterisation_Initial;
	private String BowelBladder_Catheterisation_C;
	private String BowelBladder_Catheterisation_C_Initial;
	private String BowelBladder_BowelDysfunction;
	private String BowelBladder_BowelDysfunction_Initial;
	private String BowelBladder_BowelDysfunc_C;
	private String BowelBladder_BowelDysfunc_C_Initial;
	private String BowelBladder_SexualDysfunction;
	private String BowelBladder_SexualDysfunction_Initial;
	
	private String BowelBladder_SexualDysfunc_C;
	private String BowelBladder_SexualDysfunc_C_Initial;
	private String BowelBladder_Comments;
	private String BowelBladder_Comments_Initial;
	private String Cerebral_Depression;
	private String Cerebral_Depression_Initial;
	private String Cerebral_Depression_C;
	private String Cerebral_Depression_C_Initial;
	private String Cerebral_Euphoria;
	private String Cerebral_Euphoria_Initial;
	private String Cerebral_Euphoria_C;
	private String Cerebral_Euphoria_C_Initial;
	private String Cerebral_DecreaseMentation;
	private String Cerebral_DecreaseMentation_Initial;
	private String Cerebral_DecreaseMentation_C;
	private String Cerebral_DecreaseMentation_C_Initial;
	private String Cerebral_Fatigue;
	private String Cerebral_Fatigue_Initial;
	private String Cerebral_Fatigue_C;
	private String Cerebral_Fatigue_C_Initial;
	private String Cerebral_Comments;
	private String Cerebral_Comments_Initial;
	private String Ambulation_Distance_Patient;
	private String Ambulation_Distance_Patient_Initial;
	private String Ambulation_Distance_Patient_C;
	private String Ambulation_Distance_Patient_C_Initial;
	
	private String Ambulation_Time_Patient;
	private String Ambulation_Time_Patient_Initial;
	private String Ambulation_Time_Patient_C;
	private String Ambulation_Time_Patient_C_Initial;
	private String Ambulation_Assistance;
	private String Ambulation_Assistance_Initial;
	private String Ambulation_Assistance_C;
	private String Ambulation_Assistance_C_Initial;
	private String Ambulation_Distance; 
	private String Ambulation_Distance_Initial;
	private String Ambulation_Distance_C;
	private String Ambulation_Distance_C_Initial;
	private String Ambulation_Comments;
	private String Ambulation_Comments_Initial;
	private String FSS_Visual;
	private String FSS_Visual_Initial;
	private String FSS_Visual_Converted;
	private String FSS_Visual_Converted_Initial;
	private String FSS_Brainstem;
	private String FSS_Brainstem_Initial;
	private String FSS_Pyramidal;
	private String FSS_Pyramidal_Initial;
	private String FSS_Cerebellar;
	private String FSS_Cerebellar_Initial;
	private String FSS_Sensory;
	private String FSS_Sensory_Initial;
	private String FSS_BowelBladder;
	
	private String FSS_BowelBladder_Initial;
	private String FSS_BowelBladder_Converted;
	private String FSS_BowelBladder_Converted_Initial;
	private String FSS_Cerebral;
	private String FSS_Cerebral_Initial;
	private String FSS_Ambulation;
	private String FSS_Ambulation_Initial;
	private String EDSS_Step;
	private String EDSS_Step_Initial;
	private String EDSS_Step_Comments;
	private String EDSS_Step_Comments_Initial;

	/**
	 * Default Constructor.
	 */
	public EDSS() {

	}


	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getVERSIONID() {
		return VERSIONID;
	}

	public void setVERSIONID(String vERSIONID) {
		VERSIONID = vERSIONID;
	}

	public String getPATIENT() {
		return PATIENT;
	}

	public void setPATIENT(String pATIENT) {
		PATIENT = pATIENT;
	}

	public String getORIGPATIENT() {
		return ORIGPATIENT;
	}

	public void setORIGPATIENT(String oRIGPATIENT) {
		ORIGPATIENT = oRIGPATIENT;
	}

	public String getSUBJECTCODE() {
		return SUBJECTCODE;
	}

	public void setSUBJECTCODE(String sUBJECTCODE) {
		SUBJECTCODE = sUBJECTCODE;
	}

	public String getSITECODE() {
		return SITECODE;
	}

	public void setSITECODE(String sITECODE) {
		SITECODE = sITECODE;
	}

	public String getSPCONFIG() {
		return SPCONFIG;
	}

	public void setSPCONFIG(String sPCONFIG) {
		SPCONFIG = sPCONFIG;
	}

	public String getPERIOD() {
		return PERIOD;
	}

	public void setPERIOD(String pERIOD) {
		PERIOD = pERIOD;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public String getCREATETIME() {
		return CREATETIME;
	}

	public void setCREATETIME(String cREATETIME) {
		CREATETIME = cREATETIME;
	}

	public String getMODIFYTIME() {
		return MODIFYTIME;
	}

	public void setMODIFYTIME(String mODIFYTIME) {
		MODIFYTIME = mODIFYTIME;
	}

	public String getSTUDYDAY() {
		return STUDYDAY;
	}

	public void setSTUDYDAY(String sTUDYDAY) {
		STUDYDAY = sTUDYDAY;
	}

	public String getSTUDYDATE() {
		return STUDYDATE;
	}

	public void setSTUDYDATE(String sTUDYDATE) {
		STUDYDATE = sTUDYDATE;
	}

	public String getLANGUAGE() {
		return LANGUAGE;
	}

	public void setLANGUAGE(String lANGUAGE) {
		LANGUAGE = lANGUAGE;
	}

	public String getDELETED() {
		return DELETED;
	}

	public void setDELETED(String dELETED) {
		DELETED = dELETED;
	}

	public String getEDSS_Start() {
		return EDSS_Start;
	}

	public void setEDSS_Start(String eDSS_Start) {
		EDSS_Start = eDSS_Start;
	}

	public String getEDSS_End() {
		return EDSS_End;
	}

	public void setEDSS_End(String eDSS_End) {
		EDSS_End = eDSS_End;
	}

	public String getRelated_Date() {
		return Related_Date;
	}

	public void setRelated_Date(String related_Date) {
		Related_Date = related_Date;
	}

	public String getRelated_Time() {
		return Related_Time;
	}

	public void setRelated_Time(String related_Time) {
		Related_Time = related_Time;
	}

	public String getVisitNumber() {
		return VisitNumber;
	}

	public void setVisitNumber(String visitNumber) {
		VisitNumber = visitNumber;
	}

	public String getInvestigator_Name() {
		return Investigator_Name;
	}

	public void setInvestigator_Name(String investigator_Name) {
		Investigator_Name = investigator_Name;
	}

	public String getVisual_Acuity_Corrected() {
		return Visual_Acuity_Corrected;
	}

	public void setVisual_Acuity_Corrected(String visual_Acuity_Corrected) {
		if("0".equalsIgnoreCase(visual_Acuity_Corrected)) {
			Visual_Acuity_Corrected = "without correction ";
		} else if("1".equalsIgnoreCase(visual_Acuity_Corrected)) {
			Visual_Acuity_Corrected = "corrected";
		} else 
		Visual_Acuity_Corrected = visual_Acuity_Corrected;
	}

	public String getVisual_Acuity_Corrected_Initial() {
		return Visual_Acuity_Corrected_Initial;
	}

	public void setVisual_Acuity_Corrected_Initial(String visual_Acuity_Corrected_Initial) {
		Visual_Acuity_Corrected_Initial = visual_Acuity_Corrected_Initial;
	}

	public String getVisual_Acuity_OD() {
		return Visual_Acuity_OD;
	}

	public void setVisual_Acuity_OD(String visual_Acuity_OD) {
		Visual_Acuity_OD = visual_Acuity_OD;
	}

	public String getVisual_Acuity_OD_Initial() {
		return Visual_Acuity_OD_Initial;
	}

	public void setVisual_Acuity_OD_Initial(String visual_Acuity_OD_Initial) {
		Visual_Acuity_OD_Initial = visual_Acuity_OD_Initial;
	}

	public String getVisual_Acuity_OD_C() {
		return Visual_Acuity_OD_C;
	}

	public void setVisual_Acuity_OD_C(String visual_Acuity_OD_C) {
		Visual_Acuity_OD_C = visual_Acuity_OD_C;
	}

	public String getVisual_Acuity_OD_C_Initial() {
		return Visual_Acuity_OD_C_Initial;
	}

	public void setVisual_Acuity_OD_C_Initial(String visual_Acuity_OD_C_Initial) {
		Visual_Acuity_OD_C_Initial = visual_Acuity_OD_C_Initial;
	}

	public String getVisual_Acuity_OS() {
		return Visual_Acuity_OS;
	}

	public void setVisual_Acuity_OS(String visual_Acuity_OS) {
		Visual_Acuity_OS = visual_Acuity_OS;
	}

	public String getVisual_Acuity_OS_Initial() {
		return Visual_Acuity_OS_Initial;
	}

	public void setVisual_Acuity_OS_Initial(String visual_Acuity_OS_Initial) {
		Visual_Acuity_OS_Initial = visual_Acuity_OS_Initial;
	}

	public String getVisual_Acuity_OS_C() {
		return Visual_Acuity_OS_C;
	}

	public void setVisual_Acuity_OS_C(String visual_Acuity_OS_C) {
		Visual_Acuity_OS_C = visual_Acuity_OS_C;
	}

	public String getVisual_Acuity_OS_C_Initial() {
		return Visual_Acuity_OS_C_Initial;
	}

	public void setVisual_Acuity_OS_C_Initial(String visual_Acuity_OS_C_Initial) {
		Visual_Acuity_OS_C_Initial = visual_Acuity_OS_C_Initial;
	}

	public String getVisual_Fields_OD() {
		return Visual_Fields_OD;
	}

	public void setVisual_Fields_OD(String visual_Fields_OD) {
		if("0".equalsIgnoreCase(visual_Fields_OD)) {
			Visual_Fields_OD = "normal";
		} else if("1".equalsIgnoreCase(visual_Fields_OD)) {
			Visual_Fields_OD = "signs only";
		}else if("2".equalsIgnoreCase(visual_Fields_OD)) {
			Visual_Fields_OD = "moderate";
		}else if("3".equalsIgnoreCase(visual_Fields_OD)) {
			Visual_Fields_OD = "marked";
		}else 
			Visual_Fields_OD = visual_Fields_OD;
	}

	public String getVisual_Fields_OD_Initial() {
		return Visual_Fields_OD_Initial;
	}

	public void setVisual_Fields_OD_Initial(String visual_Fields_OD_Initial) {
		Visual_Fields_OD_Initial = visual_Fields_OD_Initial;
	}

	public String getVisual_Fields_OD_C() {
		return Visual_Fields_OD_C;
	}

	public void setVisual_Fields_OD_C(String visual_Fields_OD_C) {
		Visual_Fields_OD_C = visual_Fields_OD_C;
	}

	public String getVisual_Fields_OD_C_Initial() {
		return Visual_Fields_OD_C_Initial;
	}

	public void setVisual_Fields_OD_C_Initial(String visual_Fields_OD_C_Initial) {
		Visual_Fields_OD_C_Initial = visual_Fields_OD_C_Initial;
	}

	public String getVisual_Fields_OS() {
		return Visual_Fields_OS;
	}

	public void setVisual_Fields_OS(String visual_Fields_OS) {
		if("0".equalsIgnoreCase(visual_Fields_OS)) {
			Visual_Fields_OS = "normal";
		} else if("1".equalsIgnoreCase(visual_Fields_OS)) {
			Visual_Fields_OS = "signs only";
		}else if("2".equalsIgnoreCase(visual_Fields_OS)) {
			Visual_Fields_OS = "moderate";
		}else if("3".equalsIgnoreCase(visual_Fields_OS)) {
			Visual_Fields_OS = "marked";
		}else 
			Visual_Fields_OS = visual_Fields_OS;  
	}

	public String getVisual_Fields_OS_Initial() {
		return Visual_Fields_OS_Initial;
	}

	public void setVisual_Fields_OS_Initial(String visual_Fields_OS_Initial) {
		Visual_Fields_OS_Initial = visual_Fields_OS_Initial;
	}

	public String getVisual_Fields_OS_C() {
		return Visual_Fields_OS_C;
	}

	public void setVisual_Fields_OS_C(String visual_Fields_OS_C) {
		Visual_Fields_OS_C = visual_Fields_OS_C;
	}

	public String getVisual_Fields_OS_C_Initial() {
		return Visual_Fields_OS_C_Initial;
	}

	public void setVisual_Fields_OS_C_Initial(String visual_Fields_OS_C_Initial) {
		Visual_Fields_OS_C_Initial = visual_Fields_OS_C_Initial;
	}

	public String getVisual_Scotoma_OD() {
		return Visual_Scotoma_OD;
	}

	public void setVisual_Scotoma_OD(String visual_Scotoma_OD) {
		if("0".equalsIgnoreCase(visual_Scotoma_OD)) {
			Visual_Scotoma_OD = "none";
		} else if("1".equalsIgnoreCase(visual_Scotoma_OD)) {
			Visual_Scotoma_OD = "small";
		}else if("2".equalsIgnoreCase(visual_Scotoma_OD)) {
			Visual_Scotoma_OD = "large";
		}else 
			Visual_Scotoma_OD = visual_Scotoma_OD;
	}

	public String getVisual_Scotoma_OD_Initial() {
		return Visual_Scotoma_OD_Initial;
	}

	public void setVisual_Scotoma_OD_Initial(String visual_Scotoma_OD_Initial) {
		Visual_Scotoma_OD_Initial = visual_Scotoma_OD_Initial;
	}

	public String getVisual_Scotoma_OD_C() {
		return Visual_Scotoma_OD_C;
	}

	public void setVisual_Scotoma_OD_C(String visual_Scotoma_OD_C) {
		Visual_Scotoma_OD_C = visual_Scotoma_OD_C;
	}

	public String getVisual_Scotoma_OD_C_Initial() {
		return Visual_Scotoma_OD_C_Initial;
	}

	public void setVisual_Scotoma_OD_C_Initial(String visual_Scotoma_OD_C_Initial) {
		Visual_Scotoma_OD_C_Initial = visual_Scotoma_OD_C_Initial;
	}

	public String getVisual_Scotoma_OS() {
		return Visual_Scotoma_OS;
	}

	public void setVisual_Scotoma_OS(String visual_Scotoma_OS) {
		if("0".equalsIgnoreCase(visual_Scotoma_OS)) {
			Visual_Scotoma_OS = "none";
		} else if("1".equalsIgnoreCase(visual_Scotoma_OS)) {
			Visual_Scotoma_OS = "small";
		}else if("2".equalsIgnoreCase(visual_Scotoma_OS)) {
			Visual_Scotoma_OS = "large";
		}else 
			Visual_Scotoma_OS = visual_Scotoma_OS;
	}

	public String getVisual_Scotoma_OS_Initial() {
		return Visual_Scotoma_OS_Initial;
	}

	public void setVisual_Scotoma_OS_Initial(String visual_Scotoma_OS_Initial) {
		Visual_Scotoma_OS_Initial = visual_Scotoma_OS_Initial;
	}

	public String getVisual_Scotoma_OS_C() {
		return Visual_Scotoma_OS_C;
	}

	public void setVisual_Scotoma_OS_C(String visual_Scotoma_OS_C) {
		Visual_Scotoma_OS_C = visual_Scotoma_OS_C;
	}

	public String getVisual_Scotoma_OS_C_Initial() {
		return Visual_Scotoma_OS_C_Initial;
	}

	public void setVisual_Scotoma_OS_C_Initial(String visual_Scotoma_OS_C_Initial) {
		Visual_Scotoma_OS_C_Initial = visual_Scotoma_OS_C_Initial;
	}

	public String getVisual_DiscPallor_OD() {
		return Visual_DiscPallor_OD;
	}

	public void setVisual_DiscPallor_OD(String visual_DiscPallor_OD) {
		if("0".equalsIgnoreCase(visual_DiscPallor_OD)) {
			Visual_DiscPallor_OD = "not present";
		} else if("1".equalsIgnoreCase(visual_DiscPallor_OD)) {
			Visual_DiscPallor_OD = "present";
		}else 
			Visual_DiscPallor_OD = visual_DiscPallor_OD;
	}

	public String getVisual_DiscPallor_OD_Initial() {
		return Visual_DiscPallor_OD_Initial;
	}

	public void setVisual_DiscPallor_OD_Initial(String visual_DiscPallor_OD_Initial) {
		Visual_DiscPallor_OD_Initial = visual_DiscPallor_OD_Initial;
	}

	public String getVisual_DiscPallor_OD_C() {
		return Visual_DiscPallor_OD_C;
	}

	public void setVisual_DiscPallor_OD_C(String visual_DiscPallor_OD_C) {
		Visual_DiscPallor_OD_C = visual_DiscPallor_OD_C;
	}

	public String getVisual_DiscPallor_OD_C_Initial() {
		return Visual_DiscPallor_OD_C_Initial;
	}

	public void setVisual_DiscPallor_OD_C_Initial(
			String visual_DiscPallor_OD_C_Initial) {
		Visual_DiscPallor_OD_C_Initial = visual_DiscPallor_OD_C_Initial;
	}

	public String getVisual_DiscPallor_OS() {
		return Visual_DiscPallor_OS;
	}

	public void setVisual_DiscPallor_OS(String visual_DiscPallor_OS) {
		if("0".equalsIgnoreCase(visual_DiscPallor_OS)) {
			Visual_DiscPallor_OS = "not present";
		} else if("1".equalsIgnoreCase(visual_DiscPallor_OS)) {
			Visual_DiscPallor_OS = "present";
		}else 
			Visual_DiscPallor_OS = visual_DiscPallor_OS;
	}

	public String getVisual_DiscPallor_OS_Initial() {
		return Visual_DiscPallor_OS_Initial;
	}

	public void setVisual_DiscPallor_OS_Initial(String visual_DiscPallor_OS_Initial) {
		Visual_DiscPallor_OS_Initial = visual_DiscPallor_OS_Initial;
	}

	public String getVisual_DiscPallor_OS_C() {
		return Visual_DiscPallor_OS_C;
	}

	public void setVisual_DiscPallor_OS_C(String visual_DiscPallor_OS_C) {
		Visual_DiscPallor_OS_C = visual_DiscPallor_OS_C;
	}

	public String getVisual_DiscPallor_OS_C_Initial() {
		return Visual_DiscPallor_OS_C_Initial;
	}

	public void setVisual_DiscPallor_OS_C_Initial(
			String visual_DiscPallor_OS_C_Initial) {
		Visual_DiscPallor_OS_C_Initial = visual_DiscPallor_OS_C_Initial;
	}

	public String getVisual_Comments() {
		return Visual_Comments;
	}

	public void setVisual_Comments(String visual_Comments) {
		Visual_Comments = visual_Comments;
	}

	public String getVisual_Comments_Initial() {
		return Visual_Comments_Initial;
	}

	public void setVisual_Comments_Initial(String visual_Comments_Initial) {
		Visual_Comments_Initial = visual_Comments_Initial;
	}

	public String getBrainstem_EOM() {
		return Brainstem_EOM;
	}

	public void setBrainstem_EOM(String brainstem_EOM) {
		if("0".equalsIgnoreCase(brainstem_EOM)) {
			Brainstem_EOM = "none";
		} else if("1".equalsIgnoreCase(brainstem_EOM)) {
			Brainstem_EOM = "signs only";
		}else if("2".equalsIgnoreCase(brainstem_EOM)) {
			Brainstem_EOM = "mild";
		}else if("3".equalsIgnoreCase(brainstem_EOM)) {
			Brainstem_EOM = "moderate";
		}else if("4".equalsIgnoreCase(brainstem_EOM)) {
			Brainstem_EOM = "marked";
		}else 
			Brainstem_EOM = brainstem_EOM;
	}

	public String getBrainstem_EOM_Initial() {
		return Brainstem_EOM_Initial;
	}

	public void setBrainstem_EOM_Initial(String brainstem_EOM_Initial) {
		Brainstem_EOM_Initial = brainstem_EOM_Initial;
	}

	public String getBrainstem_EOM_C() {
		return Brainstem_EOM_C;
	}

	public void setBrainstem_EOM_C(String brainstem_EOM_C) {
		Brainstem_EOM_C = brainstem_EOM_C;
	}

	public String getBrainstem_EOM_C_Initial() {
		return Brainstem_EOM_C_Initial;
	}

	public void setBrainstem_EOM_C_Initial(String brainstem_EOM_C_Initial) {
		Brainstem_EOM_C_Initial = brainstem_EOM_C_Initial;
	}

	public String getBrainstem_Nystagmus() {
		return Brainstem_Nystagmus;
	}

	public void setBrainstem_Nystagmus(String brainstem_Nystagmus) {
		if("0".equalsIgnoreCase(brainstem_Nystagmus)) {
			Brainstem_Nystagmus = "none";
		} else if("1".equalsIgnoreCase(brainstem_Nystagmus)) {
			Brainstem_Nystagmus = "signs only or mild";
		}else if("2".equalsIgnoreCase(brainstem_Nystagmus)) {
			Brainstem_Nystagmus = "moderate";
		}else if("3".equalsIgnoreCase(brainstem_Nystagmus)) {
			Brainstem_Nystagmus = "severe";
		}else 
			Brainstem_Nystagmus = brainstem_Nystagmus;
	}

	public String getBrainstem_Nystagmus_Initial() {
		return Brainstem_Nystagmus_Initial;
	}

	public void setBrainstem_Nystagmus_Initial(String brainstem_Nystagmus_Initial) {
		Brainstem_Nystagmus_Initial = brainstem_Nystagmus_Initial;
	}

	public String getBrainstem_Nystagmus_C() {
		return Brainstem_Nystagmus_C;
	}

	public void setBrainstem_Nystagmus_C(String brainstem_Nystagmus_C) {
		Brainstem_Nystagmus_C = brainstem_Nystagmus_C;
	}

	public String getBrainstem_Nystagmus_C_Initial() {
		return Brainstem_Nystagmus_C_Initial;
	}

	public void setBrainstem_Nystagmus_C_Initial(
			String brainstem_Nystagmus_C_Initial) {
		Brainstem_Nystagmus_C_Initial = brainstem_Nystagmus_C_Initial;
	}

	public String getBrainstem_Trigeminal() {
		return Brainstem_Trigeminal;
	}

	public void setBrainstem_Trigeminal(String brainstem_Trigeminal) {
		if("0".equalsIgnoreCase(brainstem_Trigeminal)) {
			Brainstem_Trigeminal = "none";
		} else if("1".equalsIgnoreCase(brainstem_Trigeminal)) {
			Brainstem_Trigeminal = "signs only";
		}else if("2".equalsIgnoreCase(brainstem_Trigeminal)) {
			Brainstem_Trigeminal = "mild";
		}else if("3".equalsIgnoreCase(brainstem_Trigeminal)) {
			Brainstem_Trigeminal = "moderate";
		}else if("4".equalsIgnoreCase(brainstem_Trigeminal)) {
			Brainstem_Trigeminal = "marked";
		}else 
			Brainstem_Trigeminal = brainstem_Trigeminal;	
	}

	public String getBrainstem_Trigeminal_Initial() {
		return Brainstem_Trigeminal_Initial;
	}

	public void setBrainstem_Trigeminal_Initial(String brainstem_Trigeminal_Initial) {
		Brainstem_Trigeminal_Initial = brainstem_Trigeminal_Initial;
	}

	public String getBrainstem_Trigeminal_C() {
		return Brainstem_Trigeminal_C;
	}

	public void setBrainstem_Trigeminal_C(String brainstem_Trigeminal_C) {
		Brainstem_Trigeminal_C = brainstem_Trigeminal_C;
	}

	public String getBrainstem_Trigeminal_C_Initial() {
		return Brainstem_Trigeminal_C_Initial;
	}

	public void setBrainstem_Trigeminal_C_Initial(
			String brainstem_Trigeminal_C_Initial) {
		Brainstem_Trigeminal_C_Initial = brainstem_Trigeminal_C_Initial;
	}

	public String getBrainstem_FacialWeakness() {
		return Brainstem_FacialWeakness;
	}

	public void setBrainstem_FacialWeakness(String brainstem_FacialWeakness) {
		if("0".equalsIgnoreCase(brainstem_FacialWeakness)) {
			Brainstem_FacialWeakness = "none";
		} else if("1".equalsIgnoreCase(brainstem_FacialWeakness)) {
			Brainstem_FacialWeakness = "signs only";
		}else if("2".equalsIgnoreCase(brainstem_FacialWeakness)) {
			Brainstem_FacialWeakness = "mild";
		}else if("3".equalsIgnoreCase(brainstem_FacialWeakness)) {
			Brainstem_FacialWeakness = "moderate";
		}else if("4".equalsIgnoreCase(brainstem_FacialWeakness)) {
			Brainstem_FacialWeakness = "marked";
		}else 
			Brainstem_FacialWeakness = brainstem_FacialWeakness;	
	}

	public String getBrainstem_FacialWeakness_Initial() {
		return Brainstem_FacialWeakness_Initial;
	}

	public void setBrainstem_FacialWeakness_Initial(
			String brainstem_FacialWeakness_Initial) {
		Brainstem_FacialWeakness_Initial = brainstem_FacialWeakness_Initial;
	}

	public String getBrainstem_FacialWeakness_C() {
		return Brainstem_FacialWeakness_C;
	}

	public void setBrainstem_FacialWeakness_C(String brainstem_FacialWeakness_C) {
		Brainstem_FacialWeakness_C = brainstem_FacialWeakness_C;
	}

	public String getBrainstem_FacialWeakness_C_Initial() {
		return Brainstem_FacialWeakness_C_Initial;
	}

	public void setBrainstem_FacialWeakness_C_Initial(
			String brainstem_FacialWeakness_C_Initial) {
		Brainstem_FacialWeakness_C_Initial = brainstem_FacialWeakness_C_Initial;
	}

	public String getBrainstem_HearingLoss() {
		return Brainstem_HearingLoss;
	}

	public void setBrainstem_HearingLoss(String brainstem_HearingLoss) {
		if("0".equalsIgnoreCase(brainstem_HearingLoss)) {
			Brainstem_HearingLoss = "none";
		} else if("1".equalsIgnoreCase(brainstem_HearingLoss)) {
			Brainstem_HearingLoss = "signs only";
		}else if("2".equalsIgnoreCase(brainstem_HearingLoss)) {
			Brainstem_HearingLoss = "mild";
		}else if("3".equalsIgnoreCase(brainstem_HearingLoss)) {
			Brainstem_HearingLoss = "moderate";
		}else if("4".equalsIgnoreCase(brainstem_HearingLoss)) {
			Brainstem_HearingLoss = "marked";
		}else
			Brainstem_HearingLoss = brainstem_HearingLoss;
	}

	public String getBrainstem_HearingLoss_Initial() {
		return Brainstem_HearingLoss_Initial;
	}

	public void setBrainstem_HearingLoss_Initial(
			String brainstem_HearingLoss_Initial) {
		Brainstem_HearingLoss_Initial = brainstem_HearingLoss_Initial;
	}

	public String getBrainstem_HearingLoss_C() {
		return Brainstem_HearingLoss_C;
	}

	public void setBrainstem_HearingLoss_C(String brainstem_HearingLoss_C) {
		Brainstem_HearingLoss_C = brainstem_HearingLoss_C;
	}

	public String getBrainstem_HearingLoss_C_Initial() {
		return Brainstem_HearingLoss_C_Initial;
	}

	public void setBrainstem_HearingLoss_C_Initial(
			String brainstem_HearingLoss_C_Initial) {
		Brainstem_HearingLoss_C_Initial = brainstem_HearingLoss_C_Initial;
	}

	public String getBrainstem_Dysarthria() {
		return Brainstem_Dysarthria;
	}

	public void setBrainstem_Dysarthria(String brainstem_Dysarthria) {
		if("0".equalsIgnoreCase(brainstem_Dysarthria)) {
			Brainstem_Dysarthria = "none";
		} else if("1".equalsIgnoreCase(brainstem_Dysarthria)) {
			Brainstem_Dysarthria = "signs only";
		}else if("2".equalsIgnoreCase(brainstem_Dysarthria)) {
			Brainstem_Dysarthria = "mild";
		}else if("3".equalsIgnoreCase(brainstem_Dysarthria)) {
			Brainstem_Dysarthria = "moderate";
		}else if("4".equalsIgnoreCase(brainstem_Dysarthria)) {
			Brainstem_Dysarthria = "marked";
		}else if("5".equalsIgnoreCase(brainstem_Dysarthria)) {
			Brainstem_Dysarthria = "Inability to speak";
		}else
			Brainstem_Dysarthria = brainstem_Dysarthria;
	}

	public String getBrainstem_Dysarthria_Initial() {
		return Brainstem_Dysarthria_Initial;
	}

	public void setBrainstem_Dysarthria_Initial(String brainstem_Dysarthria_Initial) {
		Brainstem_Dysarthria_Initial = brainstem_Dysarthria_Initial;
	}

	public String getBrainstem_Dysarthria_C() {
		return Brainstem_Dysarthria_C;
	}

	public void setBrainstem_Dysarthria_C(String brainstem_Dysarthria_C) {
		Brainstem_Dysarthria_C = brainstem_Dysarthria_C;
	}

	public String getBrainstem_Dysarthria_C_Initial() {
		return Brainstem_Dysarthria_C_Initial;
	}

	public void setBrainstem_Dysarthria_C_Initial(
			String brainstem_Dysarthria_C_Initial) {
		Brainstem_Dysarthria_C_Initial = brainstem_Dysarthria_C_Initial;
	}

	public String getBrainstem_Dysphagia() {
		return Brainstem_Dysphagia;
	}

	public void setBrainstem_Dysphagia(String brainstem_Dysphagia) {
		if("0".equalsIgnoreCase(brainstem_Dysphagia)) {
			Brainstem_Dysphagia = "none";
		} else if("1".equalsIgnoreCase(brainstem_Dysphagia)) {
			Brainstem_Dysphagia = "signs only";
		}else if("2".equalsIgnoreCase(brainstem_Dysphagia)) {
			Brainstem_Dysphagia = "mild";
		}else if("3".equalsIgnoreCase(brainstem_Dysphagia)) {
			Brainstem_Dysphagia = "moderate";
		}else if("4".equalsIgnoreCase(brainstem_Dysphagia)) {
			Brainstem_Dysphagia = "marked";
		}else if("5".equalsIgnoreCase(brainstem_Dysphagia)) {
			Brainstem_Dysphagia = "Inability to swallow";
		}else 
			Brainstem_Dysphagia = brainstem_Dysphagia;
	}

	public String getBrainstem_Dysphagia_Initial() {
		return Brainstem_Dysphagia_Initial;
	}

	public void setBrainstem_Dysphagia_Initial(String brainstem_Dysphagia_Initial) {
		Brainstem_Dysphagia_Initial = brainstem_Dysphagia_Initial;
	}

	public String getBrainstem_Dysphagia_C() {
		return Brainstem_Dysphagia_C;
	}

	public void setBrainstem_Dysphagia_C(String brainstem_Dysphagia_C) {
		Brainstem_Dysphagia_C = brainstem_Dysphagia_C;
	}

	public String getBrainstem_Dysphagia_C_Initial() {
		return Brainstem_Dysphagia_C_Initial;
	}

	public void setBrainstem_Dysphagia_C_Initial(
			String brainstem_Dysphagia_C_Initial) {
		Brainstem_Dysphagia_C_Initial = brainstem_Dysphagia_C_Initial;
	}

	public String getBrainstem_OtherCranialNerve() {
		return Brainstem_OtherCranialNerve;
	}

	public void setBrainstem_OtherCranialNerve(String brainstem_OtherCranialNerve) {
		if("0".equalsIgnoreCase(brainstem_OtherCranialNerve)) {
			Brainstem_OtherCranialNerve = "normal";
		} else if("1".equalsIgnoreCase(brainstem_OtherCranialNerve)) {
			Brainstem_OtherCranialNerve = "signs only";
		}else if("2".equalsIgnoreCase(brainstem_OtherCranialNerve)) {
			Brainstem_OtherCranialNerve = "mild disability";
		}else if("3".equalsIgnoreCase(brainstem_OtherCranialNerve)) {
			Brainstem_OtherCranialNerve = "moderate disability";
		}else if("4".equalsIgnoreCase(brainstem_OtherCranialNerve)) {
			Brainstem_OtherCranialNerve = "marked disability";
		}else
			Brainstem_OtherCranialNerve = brainstem_OtherCranialNerve;
	}

	public String getBrainstem_OtherCranialNerve_Initial() {
		return Brainstem_OtherCranialNerve_Initial;
	}

	public void setBrainstem_OtherCranialNerve_Initial(
			String brainstem_OtherCranialNerve_Initial) {
		Brainstem_OtherCranialNerve_Initial = brainstem_OtherCranialNerve_Initial;
	}

	public String getBrainstem_OtherCranialNerve_C() {
		return Brainstem_OtherCranialNerve_C;
	}

	public void setBrainstem_OtherCranialNerve_C(
			String brainstem_OtherCranialNerve_C) {
		Brainstem_OtherCranialNerve_C = brainstem_OtherCranialNerve_C;
	}

	public String getBrainstem_OtherCranialNerve_C_Initial() {
		return Brainstem_OtherCranialNerve_C_Initial;
	}

	public void setBrainstem_OtherCranialNerve_C_Initial(
			String brainstem_OtherCranialNerve_C_Initial) {
		Brainstem_OtherCranialNerve_C_Initial = brainstem_OtherCranialNerve_C_Initial;
	}

	public String getBrainstem_Comments() {
		return Brainstem_Comments;
	}

	public void setBrainstem_Comments(String brainstem_Comments) {
		Brainstem_Comments = brainstem_Comments;
	}

	public String getBrainstem_Comments_Initial() {
		return Brainstem_Comments_Initial;
	}

	public void setBrainstem_Comments_Initial(String brainstem_Comments_Initial) {
		Brainstem_Comments_Initial = brainstem_Comments_Initial;
	}

	public String getPym_Reflex_Biceps_R() {
		return Pym_Reflex_Biceps_R;
	}

	public void setPym_Reflex_Biceps_R(String pym_Reflex_Biceps_R) {
		if("0".equalsIgnoreCase(pym_Reflex_Biceps_R)) {
			Pym_Reflex_Biceps_R = "absent";
		} else if("1".equalsIgnoreCase(pym_Reflex_Biceps_R)) {
			Pym_Reflex_Biceps_R = "diminished";
		}else if("2".equalsIgnoreCase(pym_Reflex_Biceps_R)) {
			Pym_Reflex_Biceps_R = "normal";
		}else if("3".equalsIgnoreCase(pym_Reflex_Biceps_R)) {
			Pym_Reflex_Biceps_R = "exaggerated";
		}else if("4".equalsIgnoreCase(pym_Reflex_Biceps_R)) {
			Pym_Reflex_Biceps_R = "nonsustained clonus";
		}else if("5".equalsIgnoreCase(pym_Reflex_Biceps_R)) {
			Pym_Reflex_Biceps_R = "sustained clonus";
		}else
			Pym_Reflex_Biceps_R = pym_Reflex_Biceps_R;	
	}

	public String getPym_Reflex_Biceps_R_Initial() {
		return Pym_Reflex_Biceps_R_Initial;
	}

	public void setPym_Reflex_Biceps_R_Initial(String pym_Reflex_Biceps_R_Initial) {
		Pym_Reflex_Biceps_R_Initial = pym_Reflex_Biceps_R_Initial;
	}

	public String getPym_Reflex_Biceps_R_C() {
		return Pym_Reflex_Biceps_R_C;
	}

	public void setPym_Reflex_Biceps_R_C(String pym_Reflex_Biceps_R_C) {
		Pym_Reflex_Biceps_R_C = pym_Reflex_Biceps_R_C;
	}

	public String getPym_Reflex_Biceps_R_C_Initial() {
		return Pym_Reflex_Biceps_R_C_Initial;
	}

	public void setPym_Reflex_Biceps_R_C_Initial(
			String pym_Reflex_Biceps_R_C_Initial) {
		Pym_Reflex_Biceps_R_C_Initial = pym_Reflex_Biceps_R_C_Initial;
	}

	public String getPym_Reflex_Biceps_() {
		return Pym_Reflex_Biceps_;
	}

	public void setPym_Reflex_Biceps_(String pym_Reflex_Biceps_) {
		Pym_Reflex_Biceps_ = pym_Reflex_Biceps_;
	}

	public String getPym_Reflex_Biceps__Initial() {
		return Pym_Reflex_Biceps__Initial;
	}

	public void setPym_Reflex_Biceps__Initial(String pym_Reflex_Biceps__Initial) {
		Pym_Reflex_Biceps__Initial = pym_Reflex_Biceps__Initial;
	}

	public String getPym_Reflex_Biceps_L() {
		return Pym_Reflex_Biceps_L;
	}

	public void setPym_Reflex_Biceps_L(String pym_Reflex_Biceps_L) {
		if("0".equalsIgnoreCase(pym_Reflex_Biceps_L)) {
			Pym_Reflex_Biceps_L = "absent";
		} else if("1".equalsIgnoreCase(pym_Reflex_Biceps_L)) {
			Pym_Reflex_Biceps_L = "diminished";
		}else if("2".equalsIgnoreCase(pym_Reflex_Biceps_L)) {
			Pym_Reflex_Biceps_L = "normal";
		}else if("3".equalsIgnoreCase(pym_Reflex_Biceps_L)) {
			Pym_Reflex_Biceps_L = "exaggerated";
		}else if("4".equalsIgnoreCase(pym_Reflex_Biceps_L)) {
			Pym_Reflex_Biceps_L = "nonsustained clonus";
		}else if("5".equalsIgnoreCase(pym_Reflex_Biceps_L)) {
			Pym_Reflex_Biceps_L = "sustained clonus";
		}else
			Pym_Reflex_Biceps_L = pym_Reflex_Biceps_L;
	}

	public String getPym_Reflex_Biceps_L_Initial() {
		return Pym_Reflex_Biceps_L_Initial;
	}

	public void setPym_Reflex_Biceps_L_Initial(String pym_Reflex_Biceps_L_Initial) {
		Pym_Reflex_Biceps_L_Initial = pym_Reflex_Biceps_L_Initial;
	}

	public String getPym_Reflex_Biceps_L_C() {
		return Pym_Reflex_Biceps_L_C;
	}

	public void setPym_Reflex_Biceps_L_C(String pym_Reflex_Biceps_L_C) {
		Pym_Reflex_Biceps_L_C = pym_Reflex_Biceps_L_C;
	}

	public String getPym_Reflex_Biceps_L_C_Initial() {
		return Pym_Reflex_Biceps_L_C_Initial;
	}

	public void setPym_Reflex_Biceps_L_C_Initial(
			String pym_Reflex_Biceps_L_C_Initial) {
		Pym_Reflex_Biceps_L_C_Initial = pym_Reflex_Biceps_L_C_Initial;
	}

	public String getPym_Reflex_Triceps_R() {
		return Pym_Reflex_Triceps_R;
	}

	public void setPym_Reflex_Triceps_R(String pym_Reflex_Triceps_R) {
		if("0".equalsIgnoreCase(pym_Reflex_Triceps_R)) {
			Pym_Reflex_Triceps_R = "absent";
		} else if("1".equalsIgnoreCase(pym_Reflex_Triceps_R)) {
			Pym_Reflex_Triceps_R = "diminished";
		}else if("2".equalsIgnoreCase(pym_Reflex_Triceps_R)) {
			Pym_Reflex_Triceps_R = "normal";
		}else if("3".equalsIgnoreCase(pym_Reflex_Triceps_R)) {
			Pym_Reflex_Triceps_R = "exaggerated";
		}else if("4".equalsIgnoreCase(pym_Reflex_Triceps_R)) {
			Pym_Reflex_Triceps_R = "nonsustained clonus";
		}else if("5".equalsIgnoreCase(pym_Reflex_Triceps_R)) {
			Pym_Reflex_Triceps_R = "sustained clonus";
		}else
			Pym_Reflex_Triceps_R = pym_Reflex_Triceps_R;
	}

	public String getPym_Reflex_Triceps_R_Initial() {
		return Pym_Reflex_Triceps_R_Initial;
	}

	public void setPym_Reflex_Triceps_R_Initial(String pym_Reflex_Triceps_R_Initial) {
		Pym_Reflex_Triceps_R_Initial = pym_Reflex_Triceps_R_Initial;
	}

	public String getPym_Reflex_Triceps_R_C() {
		return Pym_Reflex_Triceps_R_C;
	}

	public void setPym_Reflex_Triceps_R_C(String pym_Reflex_Triceps_R_C) {
		Pym_Reflex_Triceps_R_C = pym_Reflex_Triceps_R_C;
	}

	public String getPym_Reflex_Triceps_R_C_Initial() {
		return Pym_Reflex_Triceps_R_C_Initial;
	}

	public void setPym_Reflex_Triceps_R_C_Initial(
			String pym_Reflex_Triceps_R_C_Initial) {
		Pym_Reflex_Triceps_R_C_Initial = pym_Reflex_Triceps_R_C_Initial;
	}

	public String getPym_Reflex_Triceps_() {
		return Pym_Reflex_Triceps_;
	}

	public void setPym_Reflex_Triceps_(String pym_Reflex_Triceps_) {
		Pym_Reflex_Triceps_ = pym_Reflex_Triceps_;
	}

	public String getPym_Reflex_Triceps__Initial() {
		return Pym_Reflex_Triceps__Initial;
	}

	public void setPym_Reflex_Triceps__Initial(String pym_Reflex_Triceps__Initial) {
		Pym_Reflex_Triceps__Initial = pym_Reflex_Triceps__Initial;
	}

	public String getPym_Reflex_Triceps_L() {
		return Pym_Reflex_Triceps_L;
	}

	public void setPym_Reflex_Triceps_L(String pym_Reflex_Triceps_L) {
		if("0".equalsIgnoreCase(pym_Reflex_Triceps_L)) {
			Pym_Reflex_Triceps_L = "absent";
		} else if("1".equalsIgnoreCase(pym_Reflex_Triceps_L)) {
			Pym_Reflex_Triceps_L = "diminished";
		}else if("2".equalsIgnoreCase(pym_Reflex_Triceps_L)) {
			Pym_Reflex_Triceps_L = "normal";
		}else if("3".equalsIgnoreCase(pym_Reflex_Triceps_L)) {
			Pym_Reflex_Triceps_L = "exaggerated";
		}else if("4".equalsIgnoreCase(pym_Reflex_Triceps_L)) {
			Pym_Reflex_Triceps_L = "nonsustained clonus";
		}else if("5".equalsIgnoreCase(pym_Reflex_Triceps_L)) {
			Pym_Reflex_Triceps_L = "sustained clonus";
		}else
			Pym_Reflex_Triceps_L = pym_Reflex_Triceps_L;
	}

	public String getPym_Reflex_Triceps_L_Initial() {
		return Pym_Reflex_Triceps_L_Initial;
	}

	public void setPym_Reflex_Triceps_L_Initial(String pym_Reflex_Triceps_L_Initial) {
		Pym_Reflex_Triceps_L_Initial = pym_Reflex_Triceps_L_Initial;
	}

	public String getPym_Reflex_Triceps_L_C() {
		return Pym_Reflex_Triceps_L_C;
	}

	public void setPym_Reflex_Triceps_L_C(String pym_Reflex_Triceps_L_C) {
		Pym_Reflex_Triceps_L_C = pym_Reflex_Triceps_L_C;
	}

	public String getPym_Reflex_Triceps_L_C_Initial() {
		return Pym_Reflex_Triceps_L_C_Initial;
	}

	public void setPym_Reflex_Triceps_L_C_Initial(
			String pym_Reflex_Triceps_L_C_Initial) {
		Pym_Reflex_Triceps_L_C_Initial = pym_Reflex_Triceps_L_C_Initial;
	}

	public String getPym_Reflex_Brachioradial_R() {
		return Pym_Reflex_Brachioradial_R;
	}

	public void setPym_Reflex_Brachioradial_R(String pym_Reflex_Brachioradial_R) {
		if("0".equalsIgnoreCase(pym_Reflex_Brachioradial_R)) {
			Pym_Reflex_Brachioradial_R = "absent";
		} else if("1".equalsIgnoreCase(pym_Reflex_Brachioradial_R)) {
			Pym_Reflex_Brachioradial_R = "diminished";
		}else if("2".equalsIgnoreCase(pym_Reflex_Brachioradial_R)) {
			Pym_Reflex_Brachioradial_R = "normal";
		}else if("3".equalsIgnoreCase(pym_Reflex_Brachioradial_R)) {
			Pym_Reflex_Brachioradial_R = "exaggerated";
		}else if("4".equalsIgnoreCase(pym_Reflex_Brachioradial_R)) {
			Pym_Reflex_Brachioradial_R = "nonsustained clonus";
		}else if("5".equalsIgnoreCase(pym_Reflex_Brachioradial_R)) {
			Pym_Reflex_Brachioradial_R = "sustained clonus";
		}else
			Pym_Reflex_Brachioradial_R = pym_Reflex_Brachioradial_R;	
	}

	public String getPym_Reflex_Brachioradial_R_Initial() {
		return Pym_Reflex_Brachioradial_R_Initial;
	}

	public void setPym_Reflex_Brachioradial_R_Initial(
			String pym_Reflex_Brachioradial_R_Initial) {
		Pym_Reflex_Brachioradial_R_Initial = pym_Reflex_Brachioradial_R_Initial;
	}

	public String getPym_Reflex_Brachioradial_R_C() {
		return Pym_Reflex_Brachioradial_R_C;
	}

	public void setPym_Reflex_Brachioradial_R_C(String pym_Reflex_Brachioradial_R_C) {
		Pym_Reflex_Brachioradial_R_C = pym_Reflex_Brachioradial_R_C;
	}

	public String getPym_Reflex_Brachioradial_R_C_Initial() {
		return Pym_Reflex_Brachioradial_R_C_Initial;
	}

	public void setPym_Reflex_Brachioradial_R_C_Initial(
			String pym_Reflex_Brachioradial_R_C_Initial) {
		Pym_Reflex_Brachioradial_R_C_Initial = pym_Reflex_Brachioradial_R_C_Initial;
	}

	public String getPym_Reflex_Brachioradialis_() {
		return Pym_Reflex_Brachioradialis_;
	}

	public void setPym_Reflex_Brachioradialis_(String pym_Reflex_Brachioradialis_) {
		Pym_Reflex_Brachioradialis_ = pym_Reflex_Brachioradialis_;
	}

	public String getPym_Reflex_Brachioradialis__Initial() {
		return Pym_Reflex_Brachioradialis__Initial;
	}

	public void setPym_Reflex_Brachioradialis__Initial(String pym_Reflex_Brachioradialis__Initial) {
		Pym_Reflex_Brachioradialis__Initial = pym_Reflex_Brachioradialis__Initial;
	}

	public String getPym_Reflex_Brachioradialis_L() {
		return Pym_Reflex_Brachioradialis_L;
	}

	public void setPym_Reflex_Brachioradialis_L(String pym_Reflex_Brachioradialis_L) {
		if("0".equalsIgnoreCase(pym_Reflex_Brachioradialis_L)) {
			Pym_Reflex_Brachioradialis_L = "absent";
		} else if("1".equalsIgnoreCase(pym_Reflex_Brachioradialis_L)) {
			Pym_Reflex_Brachioradialis_L = "diminished";
		}else if("2".equalsIgnoreCase(pym_Reflex_Brachioradialis_L)) {
			Pym_Reflex_Brachioradialis_L = "normal";
		}else if("3".equalsIgnoreCase(pym_Reflex_Brachioradialis_L)) {
			Pym_Reflex_Brachioradialis_L = "exaggerated";
		}else if("4".equalsIgnoreCase(pym_Reflex_Brachioradialis_L)) {
			Pym_Reflex_Brachioradialis_L = "nonsustained clonus";
		}else if("5".equalsIgnoreCase(pym_Reflex_Brachioradialis_L)) {
			Pym_Reflex_Brachioradialis_L = "sustained clonus";
		}else
			Pym_Reflex_Brachioradialis_L = pym_Reflex_Brachioradialis_L;
	}

	public String getPym_Reflex_Brachioradialis_L_Initial() {
		return Pym_Reflex_Brachioradialis_L_Initial;
	}

	public void setPym_Reflex_Brachioradialis_L_Initial(
			String pym_Reflex_Brachioradialis_L_Initial) {
		Pym_Reflex_Brachioradialis_L_Initial = pym_Reflex_Brachioradialis_L_Initial;
	}

	public String getPym_Reflex_Brachioradialis_L_C() {
		return Pym_Reflex_Brachioradialis_L_C;
	}

	public void setPym_Reflex_Brachioradialis_L_C(
			String pym_Reflex_Brachioradialis_L_C) {
		Pym_Reflex_Brachioradialis_L_C = pym_Reflex_Brachioradialis_L_C;
	}

	public String getPym_Reflex_Brachioradialis_L_C_Initial() {
		return Pym_Reflex_Brachioradialis_L_C_Initial;
	}

	public void setPym_Reflex_Brachioradialis_L_C_Initial(
			String pym_Reflex_Brachioradialis_L_C_Initial) {
		Pym_Reflex_Brachioradialis_L_C_Initial = pym_Reflex_Brachioradialis_L_C_Initial;
	}

	public String getPym_Reflex_Knee_R() {
		return Pym_Reflex_Knee_R;
	}

	public void setPym_Reflex_Knee_R(String pym_Reflex_Knee_R) {
		if("0".equalsIgnoreCase(pym_Reflex_Knee_R)) {
			Pym_Reflex_Knee_R = "absent";
		} else if("1".equalsIgnoreCase(pym_Reflex_Knee_R)) {
			Pym_Reflex_Knee_R = "diminished";
		}else if("2".equalsIgnoreCase(pym_Reflex_Knee_R)) {
			Pym_Reflex_Knee_R = "normal";
		}else if("3".equalsIgnoreCase(pym_Reflex_Knee_R)) {
			Pym_Reflex_Knee_R = "exaggerated";
		}else if("4".equalsIgnoreCase(pym_Reflex_Knee_R)) {
			Pym_Reflex_Knee_R = "nonsustained clonus";
		}else if("5".equalsIgnoreCase(pym_Reflex_Knee_R)) {
			Pym_Reflex_Knee_R = "sustained clonus";
		}else
			Pym_Reflex_Knee_R = pym_Reflex_Knee_R;	
	}

	public String getPym_Reflex_Knee_R_Initial() {
		return Pym_Reflex_Knee_R_Initial;
	}

	public void setPym_Reflex_Knee_R_Initial(String pym_Reflex_Knee_R_Initial) {
		Pym_Reflex_Knee_R_Initial = pym_Reflex_Knee_R_Initial;
	}

	public String getPym_Reflex_Knee_R_C() {
		return Pym_Reflex_Knee_R_C;
	}

	public void setPym_Reflex_Knee_R_C(String pym_Reflex_Knee_R_C) {
		Pym_Reflex_Knee_R_C = pym_Reflex_Knee_R_C;
	}

	public String getPym_Reflex_Knee_R_C_Initial() {
		return Pym_Reflex_Knee_R_C_Initial;
	}

	public void setPym_Reflex_Knee_R_C_Initial(String pym_Reflex_Knee_R_C_Initial) {
		Pym_Reflex_Knee_R_C_Initial = pym_Reflex_Knee_R_C_Initial;
	}

	public String getPym_Reflex_Knee_() {
		return Pym_Reflex_Knee_;
	}

	public void setPym_Reflex_Knee_(String pym_Reflex_Knee_) {
		Pym_Reflex_Knee_ = pym_Reflex_Knee_;
	}

	public String getPym_Reflex_Knee__Initial() {
		return Pym_Reflex_Knee__Initial;
	}

	public void setPym_Reflex_Knee__Initial(String pym_Reflex_Knee__Initial) {
		Pym_Reflex_Knee__Initial = pym_Reflex_Knee__Initial;
	}

	public String getPym_Reflex_Knee_L() {
		return Pym_Reflex_Knee_L;
	}

	public void setPym_Reflex_Knee_L(String pym_Reflex_Knee_L) {
		if("0".equalsIgnoreCase(pym_Reflex_Knee_L)) {
			Pym_Reflex_Knee_L = "absent";
		} else if("1".equalsIgnoreCase(pym_Reflex_Knee_L)) {
			Pym_Reflex_Knee_L = "diminished";
		}else if("2".equalsIgnoreCase(pym_Reflex_Knee_L)) {
			Pym_Reflex_Knee_L = "normal";
		}else if("3".equalsIgnoreCase(pym_Reflex_Knee_L)) {
			Pym_Reflex_Knee_L = "exaggerated";
		}else if("4".equalsIgnoreCase(pym_Reflex_Knee_L)) {
			Pym_Reflex_Knee_L = "nonsustained clonus";
		}else if("5".equalsIgnoreCase(pym_Reflex_Knee_L)) {
			Pym_Reflex_Knee_L = "sustained clonus";
		}else 
			Pym_Reflex_Knee_L = pym_Reflex_Knee_L;
	}

	public String getPym_Reflex_Knee_L_Initial() {
		return Pym_Reflex_Knee_L_Initial;
	}

	public void setPym_Reflex_Knee_L_Initial(String pym_Reflex_Knee_L_Initial) {
		Pym_Reflex_Knee_L_Initial = pym_Reflex_Knee_L_Initial;
	}

	public String getPym_Reflex_Knee_L_C() {
		return Pym_Reflex_Knee_L_C;
	}

	public void setPym_Reflex_Knee_L_C(String pym_Reflex_Knee_L_C) {
		Pym_Reflex_Knee_L_C = pym_Reflex_Knee_L_C;
	}

	public String getPym_Reflex_Knee_L_C_Initial() {
		return Pym_Reflex_Knee_L_C_Initial;
	}

	public void setPym_Reflex_Knee_L_C_Initial(String pym_Reflex_Knee_L_C_Initial) {
		Pym_Reflex_Knee_L_C_Initial = pym_Reflex_Knee_L_C_Initial;
	}

	public String getPym_Reflex_Ankle_R() {
		return Pym_Reflex_Ankle_R;
	}

	public void setPym_Reflex_Ankle_R(String pym_Reflex_Ankle_R) {
		if("0".equalsIgnoreCase(pym_Reflex_Ankle_R)) {
			Pym_Reflex_Ankle_R = "absent";
		} else if("1".equalsIgnoreCase(pym_Reflex_Ankle_R)) {
			Pym_Reflex_Ankle_R = "diminished";
		}else if("2".equalsIgnoreCase(pym_Reflex_Ankle_R)) {
			Pym_Reflex_Ankle_R = "normal";
		}else if("3".equalsIgnoreCase(pym_Reflex_Ankle_R)) {
			Pym_Reflex_Ankle_R = "exaggerated";
		}else if("4".equalsIgnoreCase(pym_Reflex_Ankle_R)) {
			Pym_Reflex_Ankle_R = "nonsustained clonus";
		}else if("5".equalsIgnoreCase(pym_Reflex_Ankle_R)) {
			Pym_Reflex_Ankle_R = "sustained clonus";
		}else
			Pym_Reflex_Ankle_R = pym_Reflex_Ankle_R;
	}

	public String getPym_Reflex_Ankle_R_Initial() {
		return Pym_Reflex_Ankle_R_Initial;
	}

	public void setPym_Reflex_Ankle_R_Initial(String pym_Reflex_Ankle_R_Initial) {
		Pym_Reflex_Ankle_R_Initial = pym_Reflex_Ankle_R_Initial;
	}

	public String getPym_Reflex_Ankle_R_C() {
		return Pym_Reflex_Ankle_R_C;
	}

	public void setPym_Reflex_Ankle_R_C(String pym_Reflex_Ankle_R_C) {
		Pym_Reflex_Ankle_R_C = pym_Reflex_Ankle_R_C;
	}

	public String getPym_Reflex_Ankle_R_C_Initial() {
		return Pym_Reflex_Ankle_R_C_Initial;
	}

	public void setPym_Reflex_Ankle_R_C_Initial(String pym_Reflex_Ankle_R_C_Initial) {
		Pym_Reflex_Ankle_R_C_Initial = pym_Reflex_Ankle_R_C_Initial;
	}

	public String getPym_Reflex_Ankle_() {
		return Pym_Reflex_Ankle_;
	}

	public void setPym_Reflex_Ankle_(String pym_Reflex_Ankle_) {
		Pym_Reflex_Ankle_ = pym_Reflex_Ankle_;
	}

	public String getPym_Reflex_Ankle__Initial() {
		return Pym_Reflex_Ankle__Initial;
	}

	public void setPym_Reflex_Ankle__Initial(String pym_Reflex_Ankle__Initial) {
		Pym_Reflex_Ankle__Initial = pym_Reflex_Ankle__Initial;
	}

	public String getPym_Reflex_Ankle_L() {
		return Pym_Reflex_Ankle_L;
	}

	public void setPym_Reflex_Ankle_L(String pym_Reflex_Ankle_L) {
		if("0".equalsIgnoreCase(pym_Reflex_Ankle_L)) {
			Pym_Reflex_Ankle_L = "absent";
		} else if("1".equalsIgnoreCase(pym_Reflex_Ankle_L)) {
			Pym_Reflex_Ankle_L = "diminished";
		}else if("2".equalsIgnoreCase(pym_Reflex_Ankle_L)) {
			Pym_Reflex_Ankle_L = "normal";
		}else if("3".equalsIgnoreCase(pym_Reflex_Ankle_L)) {
			Pym_Reflex_Ankle_L = "exaggerated";
		}else if("4".equalsIgnoreCase(pym_Reflex_Ankle_L)) {
			Pym_Reflex_Ankle_L = "nonsustained clonus";
		}else if("5".equalsIgnoreCase(pym_Reflex_Ankle_L)) {
			Pym_Reflex_Ankle_L = "sustained clonus";
		}else
			Pym_Reflex_Ankle_L = pym_Reflex_Ankle_L;
	}

	public String getPym_Reflex_Ankle_L_Initial() {
		return Pym_Reflex_Ankle_L_Initial;
	}

	public void setPym_Reflex_Ankle_L_Initial(String pym_Reflex_Ankle_L_Initial) {
		Pym_Reflex_Ankle_L_Initial = pym_Reflex_Ankle_L_Initial;
	}

	public String getPym_Reflex_Ankle_L_C() {
		return Pym_Reflex_Ankle_L_C;
	}

	public void setPym_Reflex_Ankle_L_C(String pym_Reflex_Ankle_L_C) {
		Pym_Reflex_Ankle_L_C = pym_Reflex_Ankle_L_C;
	}

	public String getPym_Reflex_Ankle_L_C_Initial() {
		return Pym_Reflex_Ankle_L_C_Initial;
	}

	public void setPym_Reflex_Ankle_L_C_Initial(String pym_Reflex_Ankle_L_C_Initial) {
		Pym_Reflex_Ankle_L_C_Initial = pym_Reflex_Ankle_L_C_Initial;
	}

	public String getPym_Reflex_Plantar_R() {
		return Pym_Reflex_Plantar_R;
	}

	public void setPym_Reflex_Plantar_R(String pym_Reflex_Plantar_R) {
		if("0".equalsIgnoreCase(pym_Reflex_Plantar_R)) {
			Pym_Reflex_Plantar_R = "flexor";
		} else if("1".equalsIgnoreCase(pym_Reflex_Plantar_R)) {
			Pym_Reflex_Plantar_R = "neutral or equivocal";
		}else if("2".equalsIgnoreCase(pym_Reflex_Plantar_R)) {
			Pym_Reflex_Plantar_R = "extensor";
		}else
			Pym_Reflex_Plantar_R = pym_Reflex_Plantar_R;
	}

	public String getPym_Reflex_Plantar_R_Initial() {
		return Pym_Reflex_Plantar_R_Initial;
	}

	public void setPym_Reflex_Plantar_R_Initial(String pym_Reflex_Plantar_R_Initial) {
		Pym_Reflex_Plantar_R_Initial = pym_Reflex_Plantar_R_Initial;
	}

	public String getPym_Reflex_Plantar_R_C() {
		return Pym_Reflex_Plantar_R_C;
	}

	public void setPym_Reflex_Plantar_R_C(String pym_Reflex_Plantar_R_C) {
		Pym_Reflex_Plantar_R_C = pym_Reflex_Plantar_R_C;
	}

	public String getPym_Reflex_Plantar_R_C_Initial() {
		return Pym_Reflex_Plantar_R_C_Initial;
	}

	public void setPym_Reflex_Plantar_R_C_Initial(
			String pym_Reflex_Plantar_R_C_Initial) {
		Pym_Reflex_Plantar_R_C_Initial = pym_Reflex_Plantar_R_C_Initial;
	}

	public String getPym_Reflex_Plantar_() {
		return Pym_Reflex_Plantar_;
	}

	public void setPym_Reflex_Plantar_(String pym_Reflex_Plantar_) {
		Pym_Reflex_Plantar_ = pym_Reflex_Plantar_;
	}

	public String getPym_Reflex_Plantar__Initial() {
		return Pym_Reflex_Plantar__Initial;
	}

	public void setPym_Reflex_Plantar__Initial(String pym_Reflex_Plantar__Initial) {
		Pym_Reflex_Plantar__Initial = pym_Reflex_Plantar__Initial;
	}

	public String getPym_Reflex_Plantar_L() {
		return Pym_Reflex_Plantar_L;
	}

	public void setPym_Reflex_Plantar_L(String pym_Reflex_Plantar_L) {
		if("0".equalsIgnoreCase(pym_Reflex_Plantar_L)) {
			Pym_Reflex_Plantar_L = "flexor";
		} else if("1".equalsIgnoreCase(pym_Reflex_Plantar_L)) {
			Pym_Reflex_Plantar_L = "neutral or equivocal";
		}else if("2".equalsIgnoreCase(pym_Reflex_Plantar_L)) {
			Pym_Reflex_Plantar_L = "extensor";
		}else 
			Pym_Reflex_Plantar_L = pym_Reflex_Plantar_L;
	}

	public String getPym_Reflex_Plantar_L_Initial() {
		return Pym_Reflex_Plantar_L_Initial;
	}

	public void setPym_Reflex_Plantar_L_Initial(String pym_Reflex_Plantar_L_Initial) {
		Pym_Reflex_Plantar_L_Initial = pym_Reflex_Plantar_L_Initial;
	}

	public String getPym_Reflex_Plantar_L_C() {
		return Pym_Reflex_Plantar_L_C;
	}

	public void setPym_Reflex_Plantar_L_C(String pym_Reflex_Plantar_L_C) {
		Pym_Reflex_Plantar_L_C = pym_Reflex_Plantar_L_C;
	}

	public String getPym_Reflex_Plantar_L_C_Initial() {
		return Pym_Reflex_Plantar_L_C_Initial;
	}

	public void setPym_Reflex_Plantar_L_C_Initial(
			String pym_Reflex_Plantar_L_C_Initial) {
		Pym_Reflex_Plantar_L_C_Initial = pym_Reflex_Plantar_L_C_Initial;
	}

	public String getPym_Reflex_Cutaneous_R() {
		return Pym_Reflex_Cutaneous_R;
	}

	public void setPym_Reflex_Cutaneous_R(String pym_Reflex_Cutaneous_R) {
		if("0".equalsIgnoreCase(pym_Reflex_Cutaneous_R)) {
			Pym_Reflex_Cutaneous_R = "normal";
		} else if("1".equalsIgnoreCase(pym_Reflex_Cutaneous_R)) {
			Pym_Reflex_Cutaneous_R = "weak";
		}else if("2".equalsIgnoreCase(pym_Reflex_Cutaneous_R)) {
			Pym_Reflex_Cutaneous_R = "absent";
		}else 
			Pym_Reflex_Cutaneous_R = pym_Reflex_Cutaneous_R;
	}

	public String getPym_Reflex_Cutaneous_R_Initial() {
		return Pym_Reflex_Cutaneous_R_Initial;
	}

	public void setPym_Reflex_Cutaneous_R_Initial(
			String pym_Reflex_Cutaneous_R_Initial) {
		Pym_Reflex_Cutaneous_R_Initial = pym_Reflex_Cutaneous_R_Initial;
	}

	public String getPym_Reflex_Cutaneous_R_C() {
		return Pym_Reflex_Cutaneous_R_C;
	}

	public void setPym_Reflex_Cutaneous_R_C(String pym_Reflex_Cutaneous_R_C) {
		Pym_Reflex_Cutaneous_R_C = pym_Reflex_Cutaneous_R_C;
	}

	public String getPym_Reflex_Cutaneous_R_C_Initial() {
		return Pym_Reflex_Cutaneous_R_C_Initial;
	}

	public void setPym_Reflex_Cutaneous_R_C_Initial(
			String pym_Reflex_Cutaneous_R_C_Initial) {
		Pym_Reflex_Cutaneous_R_C_Initial = pym_Reflex_Cutaneous_R_C_Initial;
	}

	public String getPym_Reflex_Cutaneous_() {
		return Pym_Reflex_Cutaneous_;
	}

	public void setPym_Reflex_Cutaneous_(String pym_Reflex_Cutaneous_) {
		Pym_Reflex_Cutaneous_ = pym_Reflex_Cutaneous_;
	}

	public String getPym_Reflex_Cutaneous__Initial() {
		return Pym_Reflex_Cutaneous__Initial;
	}

	public void setPym_Reflex_Cutaneous__Initial(String pym_Reflex_Cutaneous__Initial) {
		Pym_Reflex_Cutaneous__Initial = pym_Reflex_Cutaneous__Initial;
	}

	public String getPym_Reflex_Cutaneous_L() {
		return Pym_Reflex_Cutaneous_L;
	}

	public void setPym_Reflex_Cutaneous_L(String pym_Reflex_Cutaneous_L) {
		if("0".equalsIgnoreCase(pym_Reflex_Cutaneous_L)) {
			Pym_Reflex_Cutaneous_L = "normal";
		} else if("1".equalsIgnoreCase(pym_Reflex_Cutaneous_L)) {
			Pym_Reflex_Cutaneous_L = "weak";
		}else if("2".equalsIgnoreCase(pym_Reflex_Cutaneous_L)) {
			Pym_Reflex_Cutaneous_L = "absent";
		}else 
			Pym_Reflex_Cutaneous_L = pym_Reflex_Cutaneous_L;
	}

	public String getPym_Reflex_Cutaneous_L_Initial() {
		return Pym_Reflex_Cutaneous_L_Initial;
	}

	public void setPym_Reflex_Cutaneous_L_Initial(
			String pym_Reflex_Cutaneous_L_Initial) {
		Pym_Reflex_Cutaneous_L_Initial = pym_Reflex_Cutaneous_L_Initial;
	}

	public String getPym_Reflex_Cutaneous_L_C() {
		return Pym_Reflex_Cutaneous_L_C;
	}

	public void setPym_Reflex_Cutaneous_L_C(String pym_Reflex_Cutaneous_L_C) {
		Pym_Reflex_Cutaneous_L_C = pym_Reflex_Cutaneous_L_C;
	}

	public String getPym_Reflex_Cutaneous_L_C_Initial() {
		return Pym_Reflex_Cutaneous_L_C_Initial;
	}

	public void setPym_Reflex_Cutaneous_L_C_Initial(
			String pym_Reflex_Cutaneous_L_C_Initial) {
		Pym_Reflex_Cutaneous_L_C_Initial = pym_Reflex_Cutaneous_L_C_Initial;
	}

	public String getPym_Reflex_Palmomental_R() {
		return Pym_Reflex_Palmomental_R;
	}

	public void setPym_Reflex_Palmomental_R(String pym_Reflex_Palmomental_R) {
		if("0".equalsIgnoreCase(pym_Reflex_Palmomental_R)) {
			Pym_Reflex_Palmomental_R = "absent";
		} else if("1".equalsIgnoreCase(pym_Reflex_Palmomental_R)) {
			Pym_Reflex_Palmomental_R = "present";
		}else
			Pym_Reflex_Palmomental_R = pym_Reflex_Palmomental_R;
	}

	public String getPym_Reflex_Palmomental_R_Initial() {
		return Pym_Reflex_Palmomental_R_Initial;
	}

	public void setPym_Reflex_Palmomental_R_Initial(
			String pym_Reflex_Palmomental_R_Initial) {
		Pym_Reflex_Palmomental_R_Initial = pym_Reflex_Palmomental_R_Initial;
	}

	public String getPym_Reflex_Palmomental_R_C() {
		return Pym_Reflex_Palmomental_R_C;
	}

	public void setPym_Reflex_Palmomental_R_C(String pym_Reflex_Palmomental_R_C) {
		Pym_Reflex_Palmomental_R_C = pym_Reflex_Palmomental_R_C;
	}

	public String getPym_Reflex_Palmomental_R_C_Initial() {
		return Pym_Reflex_Palmomental_R_C_Initial;
	}

	public void setPym_Reflex_Palmomental_R_C_Initial(
			String pym_Reflex_Palmomental_R_C_Initial) {
		Pym_Reflex_Palmomental_R_C_Initial = pym_Reflex_Palmomental_R_C_Initial;
	}

	public String getPym_Reflex_Palmomental_() {
		return Pym_Reflex_Palmomental_;
	}

	public void setPym_Reflex_Palmomental_(String pym_Reflex_Palmomental_) {
		Pym_Reflex_Palmomental_ = pym_Reflex_Palmomental_;
	}

	public String getPym_Reflex_Palmomental__Initial() {
		return Pym_Reflex_Palmomental__Initial;
	}

	public void setPym_Reflex_Palmomental__Initial(String pym_Reflex_Palmomental__Initial) {
		Pym_Reflex_Palmomental__Initial = pym_Reflex_Palmomental__Initial;
	}

	public String getPym_Reflex_Palmomental_L() {
		return Pym_Reflex_Palmomental_L;
	}

	public void setPym_Reflex_Palmomental_L(String pym_Reflex_Palmomental_L) {
		if("0".equalsIgnoreCase(pym_Reflex_Palmomental_L)) {
			Pym_Reflex_Palmomental_L = "absent";
		} else if("1".equalsIgnoreCase(pym_Reflex_Palmomental_L)) {
			Pym_Reflex_Palmomental_L = "present";
		}else 
			Pym_Reflex_Palmomental_L = pym_Reflex_Palmomental_L;
	}

	public String getPym_Reflex_Palmomental_L_Initial() {
		return Pym_Reflex_Palmomental_L_Initial;
	}

	public void setPym_Reflex_Palmomental_L_Initial(
			String pym_Reflex_Palmomental_L_Initial) {
		Pym_Reflex_Palmomental_L_Initial = pym_Reflex_Palmomental_L_Initial;
	}

	public String getPym_Reflex_Palmomental_L_C() {
		return Pym_Reflex_Palmomental_L_C;
	}

	public void setPym_Reflex_Palmomental_L_C(String pym_Reflex_Palmomental_L_C) {
		Pym_Reflex_Palmomental_L_C = pym_Reflex_Palmomental_L_C;
	}

	public String getPym_Reflex_Palmomental_L_C_Initial() {
		return Pym_Reflex_Palmomental_L_C_Initial;
	}

	public void setPym_Reflex_Palmomental_L_C_Initial(
			String pym_Reflex_Palmomental_L_C_Initial) {
		Pym_Reflex_Palmomental_L_C_Initial = pym_Reflex_Palmomental_L_C_Initial;
	}

	public String getPym_Strength_Deltoids_R() {
		return Pym_Strength_Deltoids_R;
	}

	public void setPym_Strength_Deltoids_R(String pym_Strength_Deltoids_R) {
		if("0".equalsIgnoreCase(pym_Strength_Deltoids_R)) {
			Pym_Strength_Deltoids_R = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_Deltoids_R)) {
			Pym_Strength_Deltoids_R = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_Deltoids_R)) {
			Pym_Strength_Deltoids_R = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_Deltoids_R)) {
			Pym_Strength_Deltoids_R = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_Deltoids_R)) {
			Pym_Strength_Deltoids_R = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_Deltoids_R)) {
			Pym_Strength_Deltoids_R = "normal strength";
		}else 
			Pym_Strength_Deltoids_R = pym_Strength_Deltoids_R;
	}

	public String getPym_Strength_Deltoids_R_Initial() {
		return Pym_Strength_Deltoids_R_Initial;
	}

	public void setPym_Strength_Deltoids_R_Initial(
			String pym_Strength_Deltoids_R_Initial) {
		Pym_Strength_Deltoids_R_Initial = pym_Strength_Deltoids_R_Initial;
	}

	public String getPym_Strength_Deltoids_R_C() {
		return Pym_Strength_Deltoids_R_C;
	}

	public void setPym_Strength_Deltoids_R_C(String pym_Strength_Deltoids_R_C) {
		Pym_Strength_Deltoids_R_C = pym_Strength_Deltoids_R_C;
	}

	public String getPym_Strength_Deltoids_R_C_Initial() {
		return Pym_Strength_Deltoids_R_C_Initial;
	}

	public void setPym_Strength_Deltoids_R_C_Initial(
			String pym_Strength_Deltoids_R_C_Initial) {
		Pym_Strength_Deltoids_R_C_Initial = pym_Strength_Deltoids_R_C_Initial;
	}

	public String getPym_Strength_Deltoids_L() {
		return Pym_Strength_Deltoids_L;
	}

	public void setPym_Strength_Deltoids_L(String pym_Strength_Deltoids_L) {
		if("0".equalsIgnoreCase(pym_Strength_Deltoids_L)) {
			Pym_Strength_Deltoids_L = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_Deltoids_L)) {
			Pym_Strength_Deltoids_L = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_Deltoids_L)) {
			Pym_Strength_Deltoids_L = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_Deltoids_L)) {
			Pym_Strength_Deltoids_L = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_Deltoids_L)) {
			Pym_Strength_Deltoids_L = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_Deltoids_L)) {
			Pym_Strength_Deltoids_L = "normal strength";
		}else 
			Pym_Strength_Deltoids_L = pym_Strength_Deltoids_L;
	}

	public String getPym_Strength_Deltoids_L_Initial() {
		return Pym_Strength_Deltoids_L_Initial;
	}

	public void setPym_Strength_Deltoids_L_Initial(
			String pym_Strength_Deltoids_L_Initial) {
		Pym_Strength_Deltoids_L_Initial = pym_Strength_Deltoids_L_Initial;
	}

	public String getPym_Strength_Deltoids_L_C() {
		return Pym_Strength_Deltoids_L_C;
	}

	public void setPym_Strength_Deltoids_L_C(String pym_Strength_Deltoids_L_C) {
		Pym_Strength_Deltoids_L_C = pym_Strength_Deltoids_L_C;
	}

	public String getPym_Strength_Deltoids_L_C_Initial() {
		return Pym_Strength_Deltoids_L_C_Initial;
	}

	public void setPym_Strength_Deltoids_L_C_Initial(
			String pym_Strength_Deltoids_L_C_Initial) {
		Pym_Strength_Deltoids_L_C_Initial = pym_Strength_Deltoids_L_C_Initial;
	}

	public String getPym_Strength_Biceps_R() {
		return Pym_Strength_Biceps_R;
	}

	public void setPym_Strength_Biceps_R(String pym_Strength_Biceps_R) {
		if("0".equalsIgnoreCase(pym_Strength_Biceps_R)) {
			Pym_Strength_Biceps_R = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_Biceps_R)) {
			Pym_Strength_Biceps_R = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_Biceps_R)) {
			Pym_Strength_Biceps_R = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_Biceps_R)) {
			Pym_Strength_Biceps_R = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_Biceps_R)) {
			Pym_Strength_Biceps_R = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_Biceps_R)) {
			Pym_Strength_Biceps_R = "normal strength";
		}else 
			Pym_Strength_Biceps_R = pym_Strength_Biceps_R;
	}

	public String getPym_Strength_Biceps_R_Initial() {
		return Pym_Strength_Biceps_R_Initial;
	}

	public void setPym_Strength_Biceps_R_Initial(
			String pym_Strength_Biceps_R_Initial) {
		Pym_Strength_Biceps_R_Initial = pym_Strength_Biceps_R_Initial;
	}

	public String getPym_Strength_Biceps_R_C() {
		return Pym_Strength_Biceps_R_C;
	}

	public void setPym_Strength_Biceps_R_C(String pym_Strength_Biceps_R_C) {
		Pym_Strength_Biceps_R_C = pym_Strength_Biceps_R_C;
	}

	public String getPym_Strength_Biceps_R_C_Initial() {
		return Pym_Strength_Biceps_R_C_Initial;
	}

	public void setPym_Strength_Biceps_R_C_Initial(
			String pym_Strength_Biceps_R_C_Initial) {
		Pym_Strength_Biceps_R_C_Initial = pym_Strength_Biceps_R_C_Initial;
	}

	public String getPym_Strength_Biceps_L() {
		return Pym_Strength_Biceps_L;
	}

	public void setPym_Strength_Biceps_L(String pym_Strength_Biceps_L) {
		if("0".equalsIgnoreCase(pym_Strength_Biceps_L)) {
			Pym_Strength_Biceps_L = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_Biceps_L)) {
			Pym_Strength_Biceps_L = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_Biceps_L)) {
			Pym_Strength_Biceps_L = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_Biceps_L)) {
			Pym_Strength_Biceps_L = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_Biceps_L)) {
			Pym_Strength_Biceps_L = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_Biceps_L)) {
			Pym_Strength_Biceps_L = "normal strength";
		}else
		Pym_Strength_Biceps_L = pym_Strength_Biceps_L;
	}

	public String getPym_Strength_Biceps_L_Initial() {
		return Pym_Strength_Biceps_L_Initial;
	}

	public void setPym_Strength_Biceps_L_Initial(
			String pym_Strength_Biceps_L_Initial) {
		Pym_Strength_Biceps_L_Initial = pym_Strength_Biceps_L_Initial;
	}

	public String getPym_Strength_Biceps_L_C() {
		return Pym_Strength_Biceps_L_C;
	}

	public void setPym_Strength_Biceps_L_C(String pym_Strength_Biceps_L_C) {
		Pym_Strength_Biceps_L_C = pym_Strength_Biceps_L_C;
	}

	public String getPym_Strength_Biceps_L_C_Initial() {
		return Pym_Strength_Biceps_L_C_Initial;
	}

	public void setPym_Strength_Biceps_L_C_Initial(
			String pym_Strength_Biceps_L_C_Initial) {
		Pym_Strength_Biceps_L_C_Initial = pym_Strength_Biceps_L_C_Initial;
	}

	public String getPym_Strength_Triceps_R() {
		return Pym_Strength_Triceps_R;
	}

	public void setPym_Strength_Triceps_R(String pym_Strength_Triceps_R) {
		if("0".equalsIgnoreCase(pym_Strength_Triceps_R)) {
			Pym_Strength_Triceps_R = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_Triceps_R)) {
			Pym_Strength_Triceps_R = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_Triceps_R)) {
			Pym_Strength_Triceps_R = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_Triceps_R)) {
			Pym_Strength_Triceps_R = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_Triceps_R)) {
			Pym_Strength_Triceps_R = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_Triceps_R)) {
			Pym_Strength_Triceps_R = "normal strength";
		}else 
			Pym_Strength_Triceps_R = pym_Strength_Triceps_R;
	}

	public String getPym_Strength_Triceps_R_Initial() {
		return Pym_Strength_Triceps_R_Initial;
	}

	public void setPym_Strength_Triceps_R_Initial(
			String pym_Strength_Triceps_R_Initial) {
		Pym_Strength_Triceps_R_Initial = pym_Strength_Triceps_R_Initial;
	}

	public String getPym_Strength_Triceps_R_C() {
		return Pym_Strength_Triceps_R_C;
	}

	public void setPym_Strength_Triceps_R_C(String pym_Strength_Triceps_R_C) {
		Pym_Strength_Triceps_R_C = pym_Strength_Triceps_R_C;
	}

	public String getPym_Strength_Triceps_R_C_Initial() {
		return Pym_Strength_Triceps_R_C_Initial;
	}

	public void setPym_Strength_Triceps_R_C_Initial(
			String pym_Strength_Triceps_R_C_Initial) {
		Pym_Strength_Triceps_R_C_Initial = pym_Strength_Triceps_R_C_Initial;
	}

	public String getPym_Strength_Triceps_L() {
		return Pym_Strength_Triceps_L;
	}

	public void setPym_Strength_Triceps_L(String pym_Strength_Triceps_L) {
		if("0".equalsIgnoreCase(pym_Strength_Triceps_L)) {
			Pym_Strength_Triceps_L = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_Triceps_L)) {
			Pym_Strength_Triceps_L = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_Triceps_L)) {
			Pym_Strength_Triceps_L = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_Triceps_L)) {
			Pym_Strength_Triceps_L = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_Triceps_L)) {
			Pym_Strength_Triceps_L = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_Triceps_L)) {
			Pym_Strength_Triceps_L = "normal strength";
		}else 
			Pym_Strength_Triceps_L = pym_Strength_Triceps_L;
	}

	public String getPym_Strength_Triceps_L_Initial() {
		return Pym_Strength_Triceps_L_Initial;
	}

	public void setPym_Strength_Triceps_L_Initial(
			String pym_Strength_Triceps_L_Initial) {
		Pym_Strength_Triceps_L_Initial = pym_Strength_Triceps_L_Initial;
	}

	public String getPym_Strength_Triceps_L_C() {
		return Pym_Strength_Triceps_L_C;
	}

	public void setPym_Strength_Triceps_L_C(String pym_Strength_Triceps_L_C) {
		Pym_Strength_Triceps_L_C = pym_Strength_Triceps_L_C;
	}

	public String getPym_Strength_Triceps_L_C_Initial() {
		return Pym_Strength_Triceps_L_C_Initial;
	}

	public void setPym_Strength_Triceps_L_C_Initial(
			String pym_Strength_Triceps_L_C_Initial) {
		Pym_Strength_Triceps_L_C_Initial = pym_Strength_Triceps_L_C_Initial;
	}

	public String getPym_Strength_WristFlex_R() {
		return Pym_Strength_WristFlex_R;
	}

	public void setPym_Strength_WristFlex_R(String pym_Strength_WristFlex_R) {
		if("0".equalsIgnoreCase(pym_Strength_WristFlex_R)) {
			Pym_Strength_WristFlex_R = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_WristFlex_R)) {
			Pym_Strength_WristFlex_R = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_WristFlex_R)) {
			Pym_Strength_WristFlex_R = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_WristFlex_R)) {
			Pym_Strength_WristFlex_R = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_WristFlex_R)) {
			Pym_Strength_WristFlex_R = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_WristFlex_R)) {
			Pym_Strength_WristFlex_R = "normal strength";
		}else 
			Pym_Strength_WristFlex_R = pym_Strength_WristFlex_R;
	}

	public String getPym_Strength_WristFlex_R_Initial() {
		return Pym_Strength_WristFlex_R_Initial;
	}

	public void setPym_Strength_WristFlex_R_Initial(
			String pym_Strength_WristFlex_R_Initial) {
		Pym_Strength_WristFlex_R_Initial = pym_Strength_WristFlex_R_Initial;
	}

	public String getPym_Strength_WristFlex_R_C() {
		return Pym_Strength_WristFlex_R_C;
	}

	public void setPym_Strength_WristFlex_R_C(String pym_Strength_WristFlex_R_C) {
		Pym_Strength_WristFlex_R_C = pym_Strength_WristFlex_R_C;
	}

	public String getPym_Strength_WristFlex_R_C_Initial() {
		return Pym_Strength_WristFlex_R_C_Initial;
	}

	public void setPym_Strength_WristFlex_R_C_Initial(
			String pym_Strength_WristFlex_R_C_Initial) {
		Pym_Strength_WristFlex_R_C_Initial = pym_Strength_WristFlex_R_C_Initial;
	}

	public String getPym_Strength_WristFlex_L() {
		return Pym_Strength_WristFlex_L;
	}

	public void setPym_Strength_WristFlex_L(String pym_Strength_WristFlex_L) {
		if("0".equalsIgnoreCase(pym_Strength_WristFlex_L)) {
			Pym_Strength_WristFlex_L = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_WristFlex_L)) {
			Pym_Strength_WristFlex_L = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_WristFlex_L)) {
			Pym_Strength_WristFlex_L = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_WristFlex_L)) {
			Pym_Strength_WristFlex_L = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_WristFlex_L)) {
			Pym_Strength_WristFlex_L = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_WristFlex_L)) {
			Pym_Strength_WristFlex_L = "normal strength";
		}else 
			Pym_Strength_WristFlex_L = pym_Strength_WristFlex_L;
	}

	public String getPym_Strength_WristFlex_L_Initial() {
		return Pym_Strength_WristFlex_L_Initial;
	}

	public void setPym_Strength_WristFlex_L_Initial(
			String pym_Strength_WristFlex_L_Initial) {
		Pym_Strength_WristFlex_L_Initial = pym_Strength_WristFlex_L_Initial;
	}

	public String getPym_Strength_WristFlex_L_C() {
		return Pym_Strength_WristFlex_L_C;
	}

	public void setPym_Strength_WristFlex_L_C(String pym_Strength_WristFlex_L_C) {
		Pym_Strength_WristFlex_L_C = pym_Strength_WristFlex_L_C;
	}

	public String getPym_Strength_WristFlex_L_C_Initial() {
		return Pym_Strength_WristFlex_L_C_Initial;
	}

	public void setPym_Strength_WristFlex_L_C_Initial(
			String pym_Strength_WristFlex_L_C_Initial) {
		Pym_Strength_WristFlex_L_C_Initial = pym_Strength_WristFlex_L_C_Initial;
	}

	public String getPym_Strength_WristExt_R() {
		return Pym_Strength_WristExt_R;
	}

	public void setPym_Strength_WristExt_R(String pym_Strength_WristExt_R) {
		if("0".equalsIgnoreCase(pym_Strength_WristExt_R)) {
			Pym_Strength_WristExt_R = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_WristExt_R)) {
			Pym_Strength_WristExt_R = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_WristExt_R)) {
			Pym_Strength_WristExt_R = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_WristExt_R)) {
			Pym_Strength_WristExt_R = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_WristExt_R)) {
			Pym_Strength_WristExt_R = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_WristExt_R)) {
			Pym_Strength_WristExt_R = "normal strength";
		}else 
			Pym_Strength_WristExt_R = pym_Strength_WristExt_R;
	}

	public String getPym_Strength_WristExt_R_Initial() {
		return Pym_Strength_WristExt_R_Initial;
	}

	public void setPym_Strength_WristExt_R_Initial(
			String pym_Strength_WristExt_R_Initial) {
		Pym_Strength_WristExt_R_Initial = pym_Strength_WristExt_R_Initial;
	}

	public String getPym_Strength_WristExt_R_C() {
		return Pym_Strength_WristExt_R_C;
	}

	public void setPym_Strength_WristExt_R_C(String pym_Strength_WristExt_R_C) {
		Pym_Strength_WristExt_R_C = pym_Strength_WristExt_R_C;
	}

	public String getPym_Strength_WristExt_R_C_Initial() {
		return Pym_Strength_WristExt_R_C_Initial;
	}

	public void setPym_Strength_WristExt_R_C_Initial(
			String pym_Strength_WristExt_R_C_Initial) {
		Pym_Strength_WristExt_R_C_Initial = pym_Strength_WristExt_R_C_Initial;
	}

	public String getPym_Strength_WristExt_L() {
		return Pym_Strength_WristExt_L;
	}

	public void setPym_Strength_WristExt_L(String pym_Strength_WristExt_L) {
		if("0".equalsIgnoreCase(pym_Strength_WristExt_L)) {
			Pym_Strength_WristExt_L = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_WristExt_L)) {
			Pym_Strength_WristExt_L = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_WristExt_L)) {
			Pym_Strength_WristExt_L = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_WristExt_L)) {
			Pym_Strength_WristExt_L = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_WristExt_L)) {
			Pym_Strength_WristExt_L = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_WristExt_L)) {
			Pym_Strength_WristExt_L = "normal strength";
		}else 
			Pym_Strength_WristExt_L = pym_Strength_WristExt_L;
	}

	public String getPym_Strength_WristExt_L_Initial() {
		return Pym_Strength_WristExt_L_Initial;
	}

	public void setPym_Strength_WristExt_L_Initial(
			String pym_Strength_WristExt_L_Initial) {
		Pym_Strength_WristExt_L_Initial = pym_Strength_WristExt_L_Initial;
	}

	public String getPym_Strength_WristExt_L_C() {
		return Pym_Strength_WristExt_L_C;
	}

	public void setPym_Strength_WristExt_L_C(String pym_Strength_WristExt_L_C) {
		Pym_Strength_WristExt_L_C = pym_Strength_WristExt_L_C;
	}

	public String getPym_Strength_WristExt_L_C_Initial() {
		return Pym_Strength_WristExt_L_C_Initial;
	}

	public void setPym_Strength_WristExt_L_C_Initial(
			String pym_Strength_WristExt_L_C_Initial) {
		Pym_Strength_WristExt_L_C_Initial = pym_Strength_WristExt_L_C_Initial;
	}

	public String getPym_Strength_HipFlex_R() {
		return Pym_Strength_HipFlex_R;
	}

	public void setPym_Strength_HipFlex_R(String pym_Strength_HipFlex_R) {
		if("0".equalsIgnoreCase(pym_Strength_HipFlex_R)) {
			Pym_Strength_HipFlex_R = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_HipFlex_R)) {
			Pym_Strength_HipFlex_R = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_HipFlex_R)) {
			Pym_Strength_HipFlex_R = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_HipFlex_R)) {
			Pym_Strength_HipFlex_R = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_HipFlex_R)) {
			Pym_Strength_HipFlex_R = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_HipFlex_R)) {
			Pym_Strength_HipFlex_R = "normal strength";
		}else 
			Pym_Strength_HipFlex_R = pym_Strength_HipFlex_R;
	}

	public String getPym_Strength_HipFlex_R_Initial() {
		return Pym_Strength_HipFlex_R_Initial;
	}

	public void setPym_Strength_HipFlex_R_Initial(
			String pym_Strength_HipFlex_R_Initial) {
		Pym_Strength_HipFlex_R_Initial = pym_Strength_HipFlex_R_Initial;
	}

	public String getPym_Strength_HipFlex_R_C() {
		return Pym_Strength_HipFlex_R_C;
	}

	public void setPym_Strength_HipFlex_R_C(String pym_Strength_HipFlex_R_C) {
		Pym_Strength_HipFlex_R_C = pym_Strength_HipFlex_R_C;
	}

	public String getPym_Strength_HipFlex_R_C_Initial() {
		return Pym_Strength_HipFlex_R_C_Initial;
	}

	public void setPym_Strength_HipFlex_R_C_Initial(
			String pym_Strength_HipFlex_R_C_Initial) {
		Pym_Strength_HipFlex_R_C_Initial = pym_Strength_HipFlex_R_C_Initial;
	}

	public String getPym_Strength_HipFlex_L() {
		return Pym_Strength_HipFlex_L;
	}

	public void setPym_Strength_HipFlex_L(String pym_Strength_HipFlex_L) {
		if("0".equalsIgnoreCase(pym_Strength_HipFlex_L)) {
			Pym_Strength_HipFlex_L = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_HipFlex_L)) {
			Pym_Strength_HipFlex_L = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_HipFlex_L)) {
			Pym_Strength_HipFlex_L = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_HipFlex_L)) {
			Pym_Strength_HipFlex_L = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_HipFlex_L)) {
			Pym_Strength_HipFlex_L = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_HipFlex_L)) {
			Pym_Strength_HipFlex_L = "normal strength";
		}else
			Pym_Strength_HipFlex_L = pym_Strength_HipFlex_L;
	}

	public String getPym_Strength_HipFlex_L_Initial() {
		return Pym_Strength_HipFlex_L_Initial;
	}

	public void setPym_Strength_HipFlex_L_Initial(
			String pym_Strength_HipFlex_L_Initial) {
		Pym_Strength_HipFlex_L_Initial = pym_Strength_HipFlex_L_Initial;
	}

	public String getPym_Strength_HipFlex_L_C() {
		return Pym_Strength_HipFlex_L_C;
	}

	public void setPym_Strength_HipFlex_L_C(String pym_Strength_HipFlex_L_C) {
		Pym_Strength_HipFlex_L_C = pym_Strength_HipFlex_L_C;
	}

	public String getPym_Strength_HipFlex_L_C_Initial() {
		return Pym_Strength_HipFlex_L_C_Initial;
	}

	public void setPym_Strength_HipFlex_L_C_Initial(
			String pym_Strength_HipFlex_L_C_Initial) {
		Pym_Strength_HipFlex_L_C_Initial = pym_Strength_HipFlex_L_C_Initial;
	}

	public String getPym_Strength_KneeFlex_R() {
		return Pym_Strength_KneeFlex_R;
	}

	public void setPym_Strength_KneeFlex_R(String pym_Strength_KneeFlex_R) {
		if("0".equalsIgnoreCase(pym_Strength_KneeFlex_R)) {
			Pym_Strength_KneeFlex_R = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_KneeFlex_R)) {
			Pym_Strength_KneeFlex_R = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_KneeFlex_R)) {
			Pym_Strength_KneeFlex_R = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_KneeFlex_R)) {
			Pym_Strength_KneeFlex_R = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_KneeFlex_R)) {
			Pym_Strength_KneeFlex_R = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_KneeFlex_R)) {
			Pym_Strength_KneeFlex_R = "normal strength";
		}else 
			Pym_Strength_KneeFlex_R = pym_Strength_KneeFlex_R;
	}

	public String getPym_Strength_KneeFlex_R_Initial() {
		return Pym_Strength_KneeFlex_R_Initial;
	}

	public void setPym_Strength_KneeFlex_R_Initial(
			String pym_Strength_KneeFlex_R_Initial) {
		Pym_Strength_KneeFlex_R_Initial = pym_Strength_KneeFlex_R_Initial;
	}

	public String getPym_Strength_KneeFlex_R_C() {
		return Pym_Strength_KneeFlex_R_C;
	}

	public void setPym_Strength_KneeFlex_R_C(String pym_Strength_KneeFlex_R_C) {
		Pym_Strength_KneeFlex_R_C = pym_Strength_KneeFlex_R_C;
	}

	public String getPym_Strength_KneeFlex_R_C_Initial() {
		return Pym_Strength_KneeFlex_R_C_Initial;
	}

	public void setPym_Strength_KneeFlex_R_C_Initial(
			String pym_Strength_KneeFlex_R_C_Initial) {
		Pym_Strength_KneeFlex_R_C_Initial = pym_Strength_KneeFlex_R_C_Initial;
	}

	public String getPym_Strength_KneeFlex_L() {
		return Pym_Strength_KneeFlex_L;
	}

	public void setPym_Strength_KneeFlex_L(String pym_Strength_KneeFlex_L) {
		if("0".equalsIgnoreCase(pym_Strength_KneeFlex_L)) {
			Pym_Strength_KneeFlex_L = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_KneeFlex_L)) {
			Pym_Strength_KneeFlex_L = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_KneeFlex_L)) {
			Pym_Strength_KneeFlex_L = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_KneeFlex_L)) {
			Pym_Strength_KneeFlex_L = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_KneeFlex_L)) {
			Pym_Strength_KneeFlex_L = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_KneeFlex_L)) {
			Pym_Strength_KneeFlex_L = "normal strength";
		}else
			Pym_Strength_KneeFlex_L = pym_Strength_KneeFlex_L;
	}

	public String getPym_Strength_KneeFlex_L_Initial() {
		return Pym_Strength_KneeFlex_L_Initial;
	}

	public void setPym_Strength_KneeFlex_L_Initial(String pym_Strength_KneeFlex_L_Initial) {
		Pym_Strength_KneeFlex_L_Initial = pym_Strength_KneeFlex_L_Initial;
	}

	public String getPym_Strength_KneeFlex_L_C() {
		return Pym_Strength_KneeFlex_L_C;
	}

	public void setPym_Strength_KneeFlex_L_C(String pym_Strength_KneeFlex_L_C) {
		Pym_Strength_KneeFlex_L_C = pym_Strength_KneeFlex_L_C;
	}

	public String getPym_Strength_KneeFlex_L_C_Initial() {
		return Pym_Strength_KneeFlex_L_C_Initial;
	}

	public void setPym_Strength_KneeFlex_L_C_Initial(String pym_Strength_KneeFlex_L_C_Initial) {
		Pym_Strength_KneeFlex_L_C_Initial = pym_Strength_KneeFlex_L_C_Initial;
	}

	public String getPym_Strength_KneeExt_R() {
		return Pym_Strength_KneeExt_R;
	}

	public void setPym_Strength_KneeExt_R(String pym_Strength_KneeExt_R) {
		if("0".equalsIgnoreCase(pym_Strength_KneeExt_R)) {
			Pym_Strength_KneeExt_R = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_KneeExt_R)) {
			Pym_Strength_KneeExt_R = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_KneeExt_R)) {
			Pym_Strength_KneeExt_R = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_KneeExt_R)) {
			Pym_Strength_KneeExt_R = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_KneeExt_R)) {
			Pym_Strength_KneeExt_R = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_KneeExt_R)) {
			Pym_Strength_KneeExt_R = "normal strength";
		}else 
			Pym_Strength_KneeExt_R = pym_Strength_KneeExt_R;
	}

	public String getPym_Strength_KneeExt_R_Initial() {
		return Pym_Strength_KneeExt_R_Initial;
	}

	public void setPym_Strength_KneeExt_R_Initial(
			String pym_Strength_KneeExt_R_Initial) {
		Pym_Strength_KneeExt_R_Initial = pym_Strength_KneeExt_R_Initial;
	}

	public String getPym_Strength_KneeExt_R_C() {
		return Pym_Strength_KneeExt_R_C;
	}

	public void setPym_Strength_KneeExt_R_C(String pym_Strength_KneeExt_R_C) {
		Pym_Strength_KneeExt_R_C = pym_Strength_KneeExt_R_C;
	}

	public String getPym_Strength_KneeExt_R_C_Initial() {
		return Pym_Strength_KneeExt_R_C_Initial;
	}

	public void setPym_Strength_KneeExt_R_C_Initial(
			String pym_Strength_KneeExt_R_C_Initial) {
		Pym_Strength_KneeExt_R_C_Initial = pym_Strength_KneeExt_R_C_Initial;
	}

	public String getPym_Strength_KneeExt_L() {
		return Pym_Strength_KneeExt_L;
	}

	public void setPym_Strength_KneeExt_L(String pym_Strength_KneeExt_L) {
		if("0".equalsIgnoreCase(pym_Strength_KneeExt_L)) {
			Pym_Strength_KneeExt_L = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_KneeExt_L)) {
			Pym_Strength_KneeExt_L = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_KneeExt_L)) {
			Pym_Strength_KneeExt_L = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_KneeExt_L)) {
			Pym_Strength_KneeExt_L = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_KneeExt_L)) {
			Pym_Strength_KneeExt_L = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_KneeExt_L)) {
			Pym_Strength_KneeExt_L = "normal strength";
		}else
			Pym_Strength_KneeExt_L = pym_Strength_KneeExt_L;
	}

	public String getPym_Strength_KneeExt_L_Initial() {
		return Pym_Strength_KneeExt_L_Initial;
	}

	public void setPym_Strength_KneeExt_L_Initial(
			String pym_Strength_KneeExt_L_Initial) {
		Pym_Strength_KneeExt_L_Initial = pym_Strength_KneeExt_L_Initial;
	}

	public String getPym_Strength_KneeExt_L_C() {
		return Pym_Strength_KneeExt_L_C;
	}

	public void setPym_Strength_KneeExt_L_C(String pym_Strength_KneeExt_L_C) {
		Pym_Strength_KneeExt_L_C = pym_Strength_KneeExt_L_C;
	}

	public String getPym_Strength_KneeExt_L_C_Initial() {
		return Pym_Strength_KneeExt_L_C_Initial;
	}

	public void setPym_Strength_KneeExt_L_C_Initial(
			String pym_Strength_KneeExt_L_C_Initial) {
		Pym_Strength_KneeExt_L_C_Initial = pym_Strength_KneeExt_L_C_Initial;
	}

	public String getPym_Strength_PlantarFlex_R() {
		return Pym_Strength_PlantarFlex_R;
	}

	public void setPym_Strength_PlantarFlex_R(String pym_Strength_PlantarFlex_R) {
		if("0".equalsIgnoreCase(pym_Strength_PlantarFlex_R)) {
			Pym_Strength_PlantarFlex_R = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_PlantarFlex_R)) {
			Pym_Strength_PlantarFlex_R = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_PlantarFlex_R)) {
			Pym_Strength_PlantarFlex_R = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_PlantarFlex_R)) {
			Pym_Strength_PlantarFlex_R = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_PlantarFlex_R)) {
			Pym_Strength_PlantarFlex_R = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_PlantarFlex_R)) {
			Pym_Strength_PlantarFlex_R = "normal strength";
		}else
			Pym_Strength_PlantarFlex_R = pym_Strength_PlantarFlex_R;
	}

	public String getPym_Strength_PlantarFlex_R_Initial() {
		return Pym_Strength_PlantarFlex_R_Initial;
	}

	public void setPym_Strength_PlantarFlex_R_Initial(
			String pym_Strength_PlantarFlex_R_Initial) {
		Pym_Strength_PlantarFlex_R_Initial = pym_Strength_PlantarFlex_R_Initial;
	}

	public String getPym_Strength_PlantarFlex_R_C() {
		return Pym_Strength_PlantarFlex_R_C;
	}

	public void setPym_Strength_PlantarFlex_R_C(String pym_Strength_PlantarFlex_R_C) {
		Pym_Strength_PlantarFlex_R_C = pym_Strength_PlantarFlex_R_C;
	}

	public String getPym_Strength_PlantarFlex_R_C_Initial() {
		return Pym_Strength_PlantarFlex_R_C_Initial;
	}

	public void setPym_Strength_PlantarFlex_R_C_Initial(
			String pym_Strength_PlantarFlex_R_C_Initial) {
		Pym_Strength_PlantarFlex_R_C_Initial = pym_Strength_PlantarFlex_R_C_Initial;
	}

	public String getPym_Strength_PlantarFlex_L() {
		return Pym_Strength_PlantarFlex_L;
	}

	public void setPym_Strength_PlantarFlex_L(String pym_Strength_PlantarFlex_L) {
		if("0".equalsIgnoreCase(pym_Strength_PlantarFlex_L)) {
			Pym_Strength_PlantarFlex_L = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_PlantarFlex_L)) {
			Pym_Strength_PlantarFlex_L = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_PlantarFlex_L)) {
			Pym_Strength_PlantarFlex_L = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_PlantarFlex_L)) {
			Pym_Strength_PlantarFlex_L = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_PlantarFlex_L)) {
			Pym_Strength_PlantarFlex_L = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_PlantarFlex_L)) {
			Pym_Strength_PlantarFlex_L = "normal strength";
		}else
			Pym_Strength_PlantarFlex_L = pym_Strength_PlantarFlex_L;
	}

	public String getPym_Strength_PlantarFlex_L_Initial() {
		return Pym_Strength_PlantarFlex_L_Initial;
	}

	public void setPym_Strength_PlantarFlex_L_Initial(String pym_Strength_PlantarFlex_L_Initial) {
		Pym_Strength_PlantarFlex_L_Initial = pym_Strength_PlantarFlex_L_Initial;
	}

	public String getPym_Strength_PlantarFlex_L_C() {
		return Pym_Strength_PlantarFlex_L_C;
	}

	public void setPym_Strength_PlantarFlex_L_C(String pym_Strength_PlantarFlex_L_C) {
		Pym_Strength_PlantarFlex_L_C = pym_Strength_PlantarFlex_L_C;
	}

	public String getPym_Strength_PlantarFlex_L_C_Initial() {
		return Pym_Strength_PlantarFlex_L_C_Initial;
	}

	public void setPym_Strength_PlantarFlex_L_C_Initial(String pym_Strength_PlantarFlex_L_C_Initial) {
		Pym_Strength_PlantarFlex_L_C_Initial = pym_Strength_PlantarFlex_L_C_Initial;
	}

	public String getPym_Strength_DorsiFlex_R() {
		return Pym_Strength_DorsiFlex_R;
	}

	public void setPym_Strength_DorsiFlex_R(String pym_Strength_DorsiFlex_R) {
		if("0".equalsIgnoreCase(pym_Strength_DorsiFlex_R)) {
			Pym_Strength_DorsiFlex_R = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_DorsiFlex_R)) {
			Pym_Strength_DorsiFlex_R = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_DorsiFlex_R)) {
			Pym_Strength_DorsiFlex_R = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_DorsiFlex_R)) {
			Pym_Strength_DorsiFlex_R = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_DorsiFlex_R)) {
			Pym_Strength_DorsiFlex_R = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_DorsiFlex_R)) {
			Pym_Strength_DorsiFlex_R = "normal strength";
		}else
			Pym_Strength_DorsiFlex_R = pym_Strength_DorsiFlex_R;	
	}

	public String getPym_Strength_DorsiFlex_R_Initial() {
		return Pym_Strength_DorsiFlex_R_Initial;
	}

	public void setPym_Strength_DorsiFlex_R_Initial(String pym_Strength_DorsiFlex_R_Initial) {
		Pym_Strength_DorsiFlex_R_Initial = pym_Strength_DorsiFlex_R_Initial;
	}

	public String getPym_Strength_DorsiFlex_R_C() {
		return Pym_Strength_DorsiFlex_R_C;
	}

	public void setPym_Strength_DorsiFlex_R_C(String pym_Strength_DorsiFlex_R_C) {
		Pym_Strength_DorsiFlex_R_C = pym_Strength_DorsiFlex_R_C;
	}

	public String getPym_Strength_DorsiFlex_R_C_Initial() {
		return Pym_Strength_DorsiFlex_R_C_Initial;
	}

	public void setPym_Strength_DorsiFlex_R_C_Initial(
			String pym_Strength_DorsiFlex_R_C_Initial) {
		Pym_Strength_DorsiFlex_R_C_Initial = pym_Strength_DorsiFlex_R_C_Initial;
	}

	public String getPym_Strength_DorsiFlex_L() {
		return Pym_Strength_DorsiFlex_L;
	}

	public void setPym_Strength_DorsiFlex_L(String pym_Strength_DorsiFlex_L) {
		if("0".equalsIgnoreCase(pym_Strength_DorsiFlex_L)) {
			Pym_Strength_DorsiFlex_L = "no muscle contraction detected";
		} else if("1".equalsIgnoreCase(pym_Strength_DorsiFlex_L)) {
			Pym_Strength_DorsiFlex_L = "visible contraction";
		}else if("2".equalsIgnoreCase(pym_Strength_DorsiFlex_L)) {
			Pym_Strength_DorsiFlex_L = "visible movement";
		}else if("3".equalsIgnoreCase(pym_Strength_DorsiFlex_L)) {
			Pym_Strength_DorsiFlex_L = "active movement against gravity";
		}else if("4".equalsIgnoreCase(pym_Strength_DorsiFlex_L)) {
			Pym_Strength_DorsiFlex_L = "active movement against resistance";
		}else if("5".equalsIgnoreCase(pym_Strength_DorsiFlex_L)) {
			Pym_Strength_DorsiFlex_L = "normal strength";
		}else 
			Pym_Strength_DorsiFlex_L = pym_Strength_DorsiFlex_L;
	}

	public String getPym_Strength_DorsiFlex_L_Initial() {
		return Pym_Strength_DorsiFlex_L_Initial;
	}

	public void setPym_Strength_DorsiFlex_L_Initial(
			String pym_Strength_DorsiFlex_L_Initial) {
		Pym_Strength_DorsiFlex_L_Initial = pym_Strength_DorsiFlex_L_Initial;
	}

	public String getPym_Strength_DorsiFlex_L_C() {
		return Pym_Strength_DorsiFlex_L_C;
	}

	public void setPym_Strength_DorsiFlex_L_C(String pym_Strength_DorsiFlex_L_C) {
		Pym_Strength_DorsiFlex_L_C = pym_Strength_DorsiFlex_L_C;
	}

	public String getPym_Strength_DorsiFlex_L_C_Initial() {
		return Pym_Strength_DorsiFlex_L_C_Initial;
	}

	public void setPym_Strength_DorsiFlex_L_C_Initial(
			String pym_Strength_DorsiFlex_L_C_Initial) {
		Pym_Strength_DorsiFlex_L_C_Initial = pym_Strength_DorsiFlex_L_C_Initial;
	}

	public String getPym_Strength_Pronation_R() {
		return Pym_Strength_Pronation_R;
	}

	public void setPym_Strength_Pronation_R(String pym_Strength_Pronation_R) {
		if("0".equalsIgnoreCase(pym_Strength_Pronation_R)) {
			Pym_Strength_Pronation_R = "none";
		} else if("1".equalsIgnoreCase(pym_Strength_Pronation_R)) {
			Pym_Strength_Pronation_R = "mild";
		}else if("2".equalsIgnoreCase(pym_Strength_Pronation_R)) {
			Pym_Strength_Pronation_R = "evident";
		}else 
			Pym_Strength_Pronation_R = pym_Strength_Pronation_R;
	}

	public String getPym_Strength_Pronation_R_Initial() {
		return Pym_Strength_Pronation_R_Initial;
	}

	public void setPym_Strength_Pronation_R_Initial(
			String pym_Strength_Pronation_R_Initial) {
		Pym_Strength_Pronation_R_Initial = pym_Strength_Pronation_R_Initial;
	}

	public String getPym_Strength_Pronation_R_C() {
		return Pym_Strength_Pronation_R_C;
	}

	public void setPym_Strength_Pronation_R_C(String pym_Strength_Pronation_R_C) {
		Pym_Strength_Pronation_R_C = pym_Strength_Pronation_R_C;
	}

	public String getPym_Strength_Pronation_R_C_Initial() {
		return Pym_Strength_Pronation_R_C_Initial;
	}

	public void setPym_Strength_Pronation_R_C_Initial(
			String pym_Strength_Pronation_R_C_Initial) {
		Pym_Strength_Pronation_R_C_Initial = pym_Strength_Pronation_R_C_Initial;
	}

	public String getPym_Strength_Pronation_L() {
		return Pym_Strength_Pronation_L;
	}

	public void setPym_Strength_Pronation_L(String pym_Strength_Pronation_L) {
		if("0".equalsIgnoreCase(pym_Strength_Pronation_L)) {
			Pym_Strength_Pronation_L = "none";
		} else if("1".equalsIgnoreCase(pym_Strength_Pronation_L)) {
			Pym_Strength_Pronation_L = "mild";
		}else if("2".equalsIgnoreCase(pym_Strength_Pronation_L)) {
			Pym_Strength_Pronation_L = "evident";
		}else
			Pym_Strength_Pronation_L = pym_Strength_Pronation_L;
	}

	public String getPym_Strength_Pronation_L_Initial() {
		return Pym_Strength_Pronation_L_Initial;
	}

	public void setPym_Strength_Pronation_L_Initial(
			String pym_Strength_Pronation_L_Initial) {
		Pym_Strength_Pronation_L_Initial = pym_Strength_Pronation_L_Initial;
	}

	public String getPym_Strength_Pronation_L_C() {
		return Pym_Strength_Pronation_L_C;
	}

	public void setPym_Strength_Pronation_L_C(String pym_Strength_Pronation_L_C) {
		Pym_Strength_Pronation_L_C = pym_Strength_Pronation_L_C;
	}

	public String getPym_Strength_Pronation_L_C_Initial() {
		return Pym_Strength_Pronation_L_C_Initial;
	}

	public void setPym_Strength_Pronation_L_C_Initial(String pym_Strength_Pronation_L_C_Initial) {
		Pym_Strength_Pronation_L_C_Initial = pym_Strength_Pronation_L_C_Initial;
	}

	public String getPym_Strength_DownwardDrift_R() {
		return Pym_Strength_DownwardDrift_R;
	}

	public void setPym_Strength_DownwardDrift_R(String pym_Strength_DownwardDrift_R) {
		if("0".equalsIgnoreCase(pym_Strength_DownwardDrift_R)) {
			Pym_Strength_DownwardDrift_R = "none";
		} else if("1".equalsIgnoreCase(pym_Strength_DownwardDrift_R)) {
			Pym_Strength_DownwardDrift_R = "mild";
		}else if("2".equalsIgnoreCase(pym_Strength_DownwardDrift_R)) {
			Pym_Strength_DownwardDrift_R = "evident";
		}else
			Pym_Strength_DownwardDrift_R = pym_Strength_DownwardDrift_R;
	}

	public String getPym_Strength_DownwardDrift_R_Initial() {
		return Pym_Strength_DownwardDrift_R_Initial;
	}

	public void setPym_Strength_DownwardDrift_R_Initial(
			String pym_Strength_DownwardDrift_R_Initial) {
		Pym_Strength_DownwardDrift_R_Initial = pym_Strength_DownwardDrift_R_Initial;
	}

	public String getPym_Strength_DownwardDrift_R_C() {
		return Pym_Strength_DownwardDrift_R_C;
	}

	public void setPym_Strength_DownwardDrift_R_C(
			String pym_Strength_DownwardDrift_R_C) {
		Pym_Strength_DownwardDrift_R_C = pym_Strength_DownwardDrift_R_C;
	}

	public String getPym_Strength_DownwardDrift_R_C_Initial() {
		return Pym_Strength_DownwardDrift_R_C_Initial;
	}

	public void setPym_Strength_DownwardDrift_R_C_Initial(
			String pym_Strength_DownwardDrift_R_C_Initial) {
		Pym_Strength_DownwardDrift_R_C_Initial = pym_Strength_DownwardDrift_R_C_Initial;
	}

	public String getPym_Strength_DownwardDrift_L() {
		return Pym_Strength_DownwardDrift_L;
	}

	public void setPym_Strength_DownwardDrift_L(String pym_Strength_DownwardDrift_L) {
		if("0".equalsIgnoreCase(pym_Strength_DownwardDrift_L)) {
			Pym_Strength_DownwardDrift_L = "none";
		} else if("1".equalsIgnoreCase(pym_Strength_DownwardDrift_L)) {
			Pym_Strength_DownwardDrift_L = "mild";
		}else if("2".equalsIgnoreCase(pym_Strength_DownwardDrift_L)) {
			Pym_Strength_DownwardDrift_L = "evident";
		}else
			Pym_Strength_DownwardDrift_L = pym_Strength_DownwardDrift_L;
	}

	public String getPym_Strength_DownwardDrift_L_Initial() {
		return Pym_Strength_DownwardDrift_L_Initial;
	}

	public void setPym_Strength_DownwardDrift_L_Initial(
			String pym_Strength_DownwardDrift_L_Initial) {
		Pym_Strength_DownwardDrift_L_Initial = pym_Strength_DownwardDrift_L_Initial;
	}

	public String getPym_Strength_DownwardDrift_L_C() {
		return Pym_Strength_DownwardDrift_L_C;
	}

	public void setPym_Strength_DownwardDrift_L_C(
			String pym_Strength_DownwardDrift_L_C) {
		Pym_Strength_DownwardDrift_L_C = pym_Strength_DownwardDrift_L_C;
	}

	public String getPym_Strength_DownwardDrift_L_C_Initial() {
		return Pym_Strength_DownwardDrift_L_C_Initial;
	}

	public void setPym_Strength_DownwardDrift_L_C_Initial(
			String pym_Strength_DownwardDrift_L_C_Initial) {
		Pym_Strength_DownwardDrift_L_C_Initial = pym_Strength_DownwardDrift_L_C_Initial;
	}

	public String getPym_Strength_Sinking_R() {
		return Pym_Strength_Sinking_R;
	}

	public void setPym_Strength_Sinking_R(String pym_Strength_Sinking_R) {
		if("0".equalsIgnoreCase(pym_Strength_Sinking_R)) {
			Pym_Strength_Sinking_R = "none";
		} else if("1".equalsIgnoreCase(pym_Strength_Sinking_R)) {
			Pym_Strength_Sinking_R = "mild";
		}else if("2".equalsIgnoreCase(pym_Strength_Sinking_R)) {
			Pym_Strength_Sinking_R = "evident";
		}else if("3".equalsIgnoreCase(pym_Strength_Sinking_R)) {
			Pym_Strength_Sinking_R = "able to lift one leg at a time";
		}else if("4".equalsIgnoreCase(pym_Strength_Sinking_R)) {
			Pym_Strength_Sinking_R = "unable to lift one leg at a time";
		}else 
			Pym_Strength_Sinking_R = pym_Strength_Sinking_R;
	}

	public String getPym_Strength_Sinking_R_Initial() {
		return Pym_Strength_Sinking_R_Initial;
	}

	public void setPym_Strength_Sinking_R_Initial(
			String pym_Strength_Sinking_R_Initial) {
		Pym_Strength_Sinking_R_Initial = pym_Strength_Sinking_R_Initial;
	}

	public String getPym_Strength_Sinking_R_C() {
		return Pym_Strength_Sinking_R_C;
	}

	public void setPym_Strength_Sinking_R_C(String pym_Strength_Sinking_R_C) {
		Pym_Strength_Sinking_R_C = pym_Strength_Sinking_R_C;
	}

	public String getPym_Strength_Sinking_R_C_Initial() {
		return Pym_Strength_Sinking_R_C_Initial;
	}

	public void setPym_Strength_Sinking_R_C_Initial(
			String pym_Strength_Sinking_R_C_Initial) {
		Pym_Strength_Sinking_R_C_Initial = pym_Strength_Sinking_R_C_Initial;
	}

	public String getPym_Strength_Sinking_L() {
		return Pym_Strength_Sinking_L;
	}

	public void setPym_Strength_Sinking_L(String pym_Strength_Sinking_L) {
		if("0".equalsIgnoreCase(pym_Strength_Sinking_L)) {
			Pym_Strength_Sinking_L = "none";
		} else if("1".equalsIgnoreCase(pym_Strength_Sinking_L)) {
			Pym_Strength_Sinking_L = "mild";
		}else if("2".equalsIgnoreCase(pym_Strength_Sinking_L)) {
			Pym_Strength_Sinking_L = "evident";
		}else if("3".equalsIgnoreCase(pym_Strength_Sinking_L)) {
			Pym_Strength_Sinking_L = "able to lift one leg at a time";
		}else if("4".equalsIgnoreCase(pym_Strength_Sinking_L)) {
			Pym_Strength_Sinking_L = "unable to lift one leg at a time";
		}else 
			Pym_Strength_Sinking_L = pym_Strength_Sinking_L;
	}

	public String getPym_Strength_Sinking_L_Initial() {
		return Pym_Strength_Sinking_L_Initial;
	}

	public void setPym_Strength_Sinking_L_Initial(
			String pym_Strength_Sinking_L_Initial) {
		Pym_Strength_Sinking_L_Initial = pym_Strength_Sinking_L_Initial;
	}

	public String getPym_Strength_Sinking_L_C() {
		return Pym_Strength_Sinking_L_C;
	}

	public void setPym_Strength_Sinking_L_C(String pym_Strength_Sinking_L_C) {
		Pym_Strength_Sinking_L_C = pym_Strength_Sinking_L_C;
	}

	public String getPym_Strength_Sinking_L_C_Initial() {
		return Pym_Strength_Sinking_L_C_Initial;
	}

	public void setPym_Strength_Sinking_L_C_Initial(
			String pym_Strength_Sinking_L_C_Initial) {
		Pym_Strength_Sinking_L_C_Initial = pym_Strength_Sinking_L_C_Initial;
	}

	public String getPym_Strength_OneLegAngle_R() {
		return Pym_Strength_OneLegAngle_R;
	}

	public void setPym_Strength_OneLegAngle_R(String pym_Strength_OneLegAngle_R) {
		Pym_Strength_OneLegAngle_R = pym_Strength_OneLegAngle_R;
	}

	public String getPym_Strength_OneLegAngle_R_Initial() {
		return Pym_Strength_OneLegAngle_R_Initial;
	}

	public void setPym_Strength_OneLegAngle_R_Initial(
			String pym_Strength_OneLegAngle_R_Initial) {
		Pym_Strength_OneLegAngle_R_Initial = pym_Strength_OneLegAngle_R_Initial;
	}

	public String getPym_Strength_OneLegAngle_R_C() {
		return Pym_Strength_OneLegAngle_R_C;
	}

	public void setPym_Strength_OneLegAngle_R_C(String pym_Strength_OneLegAngle_R_C) {
		Pym_Strength_OneLegAngle_R_C = pym_Strength_OneLegAngle_R_C;
	}

	public String getPym_Strength_OneLegAngle_R_C_Initial() {
		return Pym_Strength_OneLegAngle_R_C_Initial;
	}

	public void setPym_Strength_OneLegAngle_R_C_Initial(
			String pym_Strength_OneLegAngle_R_C_Initial) {
		Pym_Strength_OneLegAngle_R_C_Initial = pym_Strength_OneLegAngle_R_C_Initial;
	}

	public String getPym_Strength_OneLegAngle_L() {
		return Pym_Strength_OneLegAngle_L;
	}

	public void setPym_Strength_OneLegAngle_L(String pym_Strength_OneLegAngle_L) {
		Pym_Strength_OneLegAngle_L = pym_Strength_OneLegAngle_L;
	}

	public String getPym_Strength_OneLegAngle_L_Initial() {
		return Pym_Strength_OneLegAngle_L_Initial;
	}

	public void setPym_Strength_OneLegAngle_L_Initial(
			String pym_Strength_OneLegAngle_L_Initial) {
		Pym_Strength_OneLegAngle_L_Initial = pym_Strength_OneLegAngle_L_Initial;
	}

	public String getPym_Strength_OneLegAngle_L_C() {
		return Pym_Strength_OneLegAngle_L_C;
	}

	public void setPym_Strength_OneLegAngle_L_C(String pym_Strength_OneLegAngle_L_C) {
		Pym_Strength_OneLegAngle_L_C = pym_Strength_OneLegAngle_L_C;
	}

	public String getPym_Strength_OneLegAngle_L_C_Initial() {
		return Pym_Strength_OneLegAngle_L_C_Initial;
	}

	public void setPym_Strength_OneLegAngle_L_C_Initial(
			String pym_Strength_OneLegAngle_L_C_Initial) {
		Pym_Strength_OneLegAngle_L_C_Initial = pym_Strength_OneLegAngle_L_C_Initial;
	}

	public String getPym_Strength_WalkHeels_R() {
		return Pym_Strength_WalkHeels_R;
	}

	public void setPym_Strength_WalkHeels_R(String pym_Strength_WalkHeels_R) {
		if("0".equalsIgnoreCase(pym_Strength_WalkHeels_R)) {
			Pym_Strength_WalkHeels_R = "normal";
		} else if("1".equalsIgnoreCase(pym_Strength_WalkHeels_R)) {
			Pym_Strength_WalkHeels_R = "impaired";
		}else if("2".equalsIgnoreCase(pym_Strength_WalkHeels_R)) {
			Pym_Strength_WalkHeels_R = "not possible";
		}
	}

	public String getPym_Strength_WalkHeels_R_Initial() {
		return Pym_Strength_WalkHeels_R_Initial;
	}

	public void setPym_Strength_WalkHeels_R_Initial(
			String pym_Strength_WalkHeels_R_Initial) {
		Pym_Strength_WalkHeels_R_Initial = pym_Strength_WalkHeels_R_Initial;
	}

	public String getPym_Strength_WalkHeels_R_C() {
		return Pym_Strength_WalkHeels_R_C;
	}

	public void setPym_Strength_WalkHeels_R_C(String pym_Strength_WalkHeels_R_C) {
		Pym_Strength_WalkHeels_R_C = pym_Strength_WalkHeels_R_C;
	}

	public String getPym_Strength_WalkHeels_R_C_Initial() {
		return Pym_Strength_WalkHeels_R_C_Initial;
	}

	public void setPym_Strength_WalkHeels_R_C_Initial(
			String pym_Strength_WalkHeels_R_C_Initial) {
		Pym_Strength_WalkHeels_R_C_Initial = pym_Strength_WalkHeels_R_C_Initial;
	}

	public String getPym_Strength_WalkHeels_L() {
		return Pym_Strength_WalkHeels_L;
	}

	public void setPym_Strength_WalkHeels_L(String pym_Strength_WalkHeels_L) {
		if("0".equalsIgnoreCase(pym_Strength_WalkHeels_L)) {
			Pym_Strength_WalkHeels_L = "normal";
		} else if("1".equalsIgnoreCase(pym_Strength_WalkHeels_L)) {
			Pym_Strength_WalkHeels_L = "impaired";
		}else if("2".equalsIgnoreCase(pym_Strength_WalkHeels_L)) {
			Pym_Strength_WalkHeels_L = "not possible";
		}
	}

	public String getPym_Strength_WalkHeels_L_Initial() {
		return Pym_Strength_WalkHeels_L_Initial;
	}

	public void setPym_Strength_WalkHeels_L_Initial(
			String pym_Strength_WalkHeels_L_Initial) {
		Pym_Strength_WalkHeels_L_Initial = pym_Strength_WalkHeels_L_Initial;
	}

	public String getPym_Strength_WalkHeels_L_C() {
		return Pym_Strength_WalkHeels_L_C;
	}

	public void setPym_Strength_WalkHeels_L_C(String pym_Strength_WalkHeels_L_C) {
		Pym_Strength_WalkHeels_L_C = pym_Strength_WalkHeels_L_C;
	}

	public String getPym_Strength_WalkHeels_L_C_Initial() {
		return Pym_Strength_WalkHeels_L_C_Initial;
	}

	public void setPym_Strength_WalkHeels_L_C_Initial(
			String pym_Strength_WalkHeels_L_C_Initial) {
		Pym_Strength_WalkHeels_L_C_Initial = pym_Strength_WalkHeels_L_C_Initial;
	}

	public String getPym_Strength_WalkToes_R() {
		return Pym_Strength_WalkToes_R;
	}

	public void setPym_Strength_WalkToes_R(String pym_Strength_WalkToes_R) {
		if("0".equalsIgnoreCase(pym_Strength_WalkToes_R)) {
			Pym_Strength_WalkToes_R = "normal";
		} else if("1".equalsIgnoreCase(pym_Strength_WalkToes_R)) {
			Pym_Strength_WalkToes_R = "impaired";
		}else if("2".equalsIgnoreCase(pym_Strength_WalkToes_R)) {
			Pym_Strength_WalkToes_R = "not possible";
		}
	}

	public String getPym_Strength_WalkToes_R_Initial() {
		return Pym_Strength_WalkToes_R_Initial;
	}

	public void setPym_Strength_WalkToes_R_Initial(
			String pym_Strength_WalkToes_R_Initial) {
		Pym_Strength_WalkToes_R_Initial = pym_Strength_WalkToes_R_Initial;
	}

	public String getPym_Strength_WalkToes_R_C() {
		return Pym_Strength_WalkToes_R_C;
	}

	public void setPym_Strength_WalkToes_R_C(String pym_Strength_WalkToes_R_C) {
		Pym_Strength_WalkToes_R_C = pym_Strength_WalkToes_R_C;
	}

	public String getPym_Strength_WalkToes_R_C_Initial() {
		return Pym_Strength_WalkToes_R_C_Initial;
	}

	public void setPym_Strength_WalkToes_R_C_Initial(
			String pym_Strength_WalkToes_R_C_Initial) {
		Pym_Strength_WalkToes_R_C_Initial = pym_Strength_WalkToes_R_C_Initial;
	}

	public String getPym_Strength_WalkToes_L() {
		return Pym_Strength_WalkToes_L;
	}

	public void setPym_Strength_WalkToes_L(String pym_Strength_WalkToes_L) {
		if("0".equalsIgnoreCase(pym_Strength_WalkToes_L)) {
			Pym_Strength_WalkToes_L = "normal";
		} else if("1".equalsIgnoreCase(pym_Strength_WalkToes_L)) {
			Pym_Strength_WalkToes_L = "impaired";
		}else if("2".equalsIgnoreCase(pym_Strength_WalkToes_L)) {
			Pym_Strength_WalkToes_L = "not possible";
		}
	}

	public String getPym_Strength_WalkToes_L_Initial() {
		return Pym_Strength_WalkToes_L_Initial;
	}

	public void setPym_Strength_WalkToes_L_Initial(
			String pym_Strength_WalkToes_L_Initial) {
		Pym_Strength_WalkToes_L_Initial = pym_Strength_WalkToes_L_Initial;
	}

	public String getPym_Strength_WalkToes_L_C() {
		return Pym_Strength_WalkToes_L_C;
	}

	public void setPym_Strength_WalkToes_L_C(String pym_Strength_WalkToes_L_C) {
		Pym_Strength_WalkToes_L_C = pym_Strength_WalkToes_L_C;
	}

	public String getPym_Strength_WalkToes_L_C_Initial() {
		return Pym_Strength_WalkToes_L_C_Initial;
	}

	public void setPym_Strength_WalkToes_L_C_Initial(
			String pym_Strength_WalkToes_L_C_Initial) {
		Pym_Strength_WalkToes_L_C_Initial = pym_Strength_WalkToes_L_C_Initial;
	}

	public String getPym_Strength_HopFoot_R() {
		return Pym_Strength_HopFoot_R;
	}

	public void setPym_Strength_HopFoot_R(String pym_Strength_HopFoot_R) {
		if("0".equalsIgnoreCase(pym_Strength_HopFoot_R)) {
			Pym_Strength_HopFoot_R = "normal";
		} else if("1".equalsIgnoreCase(pym_Strength_HopFoot_R)) {
			Pym_Strength_HopFoot_R = "6-10 times";
		}else if("2".equalsIgnoreCase(pym_Strength_HopFoot_R)) {
			Pym_Strength_HopFoot_R = "1-5 times";
		}else if("3".equalsIgnoreCase(pym_Strength_HopFoot_R)) {
			Pym_Strength_HopFoot_R = "Not possible";
		}
	}

	public String getPym_Strength_HopFoot_R_Initial() {
		return Pym_Strength_HopFoot_R_Initial;
	}

	public void setPym_Strength_HopFoot_R_Initial(
			String pym_Strength_HopFoot_R_Initial) {
		Pym_Strength_HopFoot_R_Initial = pym_Strength_HopFoot_R_Initial;
	}

	public String getPym_Strength_HopFoot_R_C() {
		return Pym_Strength_HopFoot_R_C;
	}

	public void setPym_Strength_HopFoot_R_C(String pym_Strength_HopFoot_R_C) {
		Pym_Strength_HopFoot_R_C = pym_Strength_HopFoot_R_C;
	}

	public String getPym_Strength_HopFoot_R_C_Initial() {
		return Pym_Strength_HopFoot_R_C_Initial;
	}

	public void setPym_Strength_HopFoot_R_C_Initial(
			String pym_Strength_HopFoot_R_C_Initial) {
		Pym_Strength_HopFoot_R_C_Initial = pym_Strength_HopFoot_R_C_Initial;
	}

	public String getPym_Strength_HopFoot_L() {
		return Pym_Strength_HopFoot_L;
	}

	public void setPym_Strength_HopFoot_L(String pym_Strength_HopFoot_L) {
		if("0".equalsIgnoreCase(pym_Strength_HopFoot_L)) {
			Pym_Strength_HopFoot_L = "normal";
		} else if("1".equalsIgnoreCase(pym_Strength_HopFoot_L)) {
			Pym_Strength_HopFoot_L = "6-10 times";
		}else if("2".equalsIgnoreCase(pym_Strength_HopFoot_L)) {
			Pym_Strength_HopFoot_L = "1-5 times";
		}else if("3".equalsIgnoreCase(pym_Strength_HopFoot_L)) {
			Pym_Strength_HopFoot_L = "Not possible";
		}
	}

	public String getPym_Strength_HopFoot_L_Initial() {
		return Pym_Strength_HopFoot_L_Initial;
	}

	public void setPym_Strength_HopFoot_L_Initial(
			String pym_Strength_HopFoot_L_Initial) {
		Pym_Strength_HopFoot_L_Initial = pym_Strength_HopFoot_L_Initial;
	}

	public String getPym_Strength_HopFoot_L_C() {
		return Pym_Strength_HopFoot_L_C;
	}

	public void setPym_Strength_HopFoot_L_C(String pym_Strength_HopFoot_L_C) {
		Pym_Strength_HopFoot_L_C = pym_Strength_HopFoot_L_C;
	}

	public String getPym_Strength_HopFoot_L_C_Initial() {
		return Pym_Strength_HopFoot_L_C_Initial;
	}

	public void setPym_Strength_HopFoot_L_C_Initial(
			String pym_Strength_HopFoot_L_C_Initial) {
		Pym_Strength_HopFoot_L_C_Initial = pym_Strength_HopFoot_L_C_Initial;
	}

	public String getPym_Spasticity_Arms_R() {
		return Pym_Spasticity_Arms_R;
	}

	public void setPym_Spasticity_Arms_R(String pym_Spasticity_Arms_R) {
		if("0".equalsIgnoreCase(pym_Spasticity_Arms_R)) {
			Pym_Spasticity_Arms_R = "none";
		} else if("1".equalsIgnoreCase(pym_Spasticity_Arms_R)) {
			Pym_Spasticity_Arms_R = "mild";
		}else if("2".equalsIgnoreCase(pym_Spasticity_Arms_R)) {
			Pym_Spasticity_Arms_R = "moderate";
		}else if("3".equalsIgnoreCase(pym_Spasticity_Arms_R)) {
			Pym_Spasticity_Arms_R = "severe";
		}else if("4".equalsIgnoreCase(pym_Spasticity_Arms_R)) {
			Pym_Spasticity_Arms_R = "contracted";
		}
	}

	public String getPym_Spasticity_Arms_R_Initial() {
		return Pym_Spasticity_Arms_R_Initial;
	}

	public void setPym_Spasticity_Arms_R_Initial(
			String pym_Spasticity_Arms_R_Initial) {
		Pym_Spasticity_Arms_R_Initial = pym_Spasticity_Arms_R_Initial;
	}

	public String getPym_Spasticity_Arms_R_C() {
		return Pym_Spasticity_Arms_R_C;
	}

	public void setPym_Spasticity_Arms_R_C(String pym_Spasticity_Arms_R_C) {
		Pym_Spasticity_Arms_R_C = pym_Spasticity_Arms_R_C;
	}

	public String getPym_Spasticity_Arms_R_C_Initial() {
		return Pym_Spasticity_Arms_R_C_Initial;
	}

	public void setPym_Spasticity_Arms_R_C_Initial(
			String pym_Spasticity_Arms_R_C_Initial) {
		Pym_Spasticity_Arms_R_C_Initial = pym_Spasticity_Arms_R_C_Initial;
	}

	public String getPym_Spasticity_Arms_L() {
		return Pym_Spasticity_Arms_L;
	}

	public void setPym_Spasticity_Arms_L(String pym_Spasticity_Arms_L) {
		if("0".equalsIgnoreCase(pym_Spasticity_Arms_L)) {
			Pym_Spasticity_Arms_L = "none";
		} else if("1".equalsIgnoreCase(pym_Spasticity_Arms_L)) {
			Pym_Spasticity_Arms_L = "mild";
		}else if("2".equalsIgnoreCase(pym_Spasticity_Arms_L)) {
			Pym_Spasticity_Arms_L = "moderate";
		}else if("3".equalsIgnoreCase(pym_Spasticity_Arms_L)) {
			Pym_Spasticity_Arms_L = "severe";
		}else if("4".equalsIgnoreCase(pym_Spasticity_Arms_L)) {
			Pym_Spasticity_Arms_L = "contracted";
		}
	}

	public String getPym_Spasticity_Arms_L_Initial() {
		return Pym_Spasticity_Arms_L_Initial;
	}

	public void setPym_Spasticity_Arms_L_Initial(
			String pym_Spasticity_Arms_L_Initial) {
		Pym_Spasticity_Arms_L_Initial = pym_Spasticity_Arms_L_Initial;
	}

	public String getPym_Spasticity_Arms_L_C() {
		return Pym_Spasticity_Arms_L_C;
	}

	public void setPym_Spasticity_Arms_L_C(String pym_Spasticity_Arms_L_C) {
		Pym_Spasticity_Arms_L_C = pym_Spasticity_Arms_L_C;
	}

	public String getPym_Spasticity_Arms_L_C_Initial() {
		return Pym_Spasticity_Arms_L_C_Initial;
	}

	public void setPym_Spasticity_Arms_L_C_Initial(
			String pym_Spasticity_Arms_L_C_Initial) {
		Pym_Spasticity_Arms_L_C_Initial = pym_Spasticity_Arms_L_C_Initial;
	}

	public String getPym_Spasticity_Legs_R() {
		return Pym_Spasticity_Legs_R;
	}

	public void setPym_Spasticity_Legs_R(String pym_Spasticity_Legs_R) {
		if("0".equalsIgnoreCase(pym_Spasticity_Legs_R)) {
			Pym_Spasticity_Legs_R = "none";
		} else if("1".equalsIgnoreCase(pym_Spasticity_Legs_R)) {
			Pym_Spasticity_Legs_R = "mild";
		}else if("2".equalsIgnoreCase(pym_Spasticity_Legs_R)) {
			Pym_Spasticity_Legs_R = "moderate";
		}else if("3".equalsIgnoreCase(pym_Spasticity_Legs_R)) {
			Pym_Spasticity_Legs_R = "severe";
		}else if("4".equalsIgnoreCase(pym_Spasticity_Legs_R)) {
			Pym_Spasticity_Legs_R = "contracted";
		}
	}

	public String getPym_Spasticity_Legs_R_Initial() {
		return Pym_Spasticity_Legs_R_Initial;
	}

	public void setPym_Spasticity_Legs_R_Initial(
			String pym_Spasticity_Legs_R_Initial) {
		Pym_Spasticity_Legs_R_Initial = pym_Spasticity_Legs_R_Initial;
	}

	public String getPym_Spasticity_Legs_R_C() {
		return Pym_Spasticity_Legs_R_C;
	}

	public void setPym_Spasticity_Legs_R_C(String pym_Spasticity_Legs_R_C) {
		Pym_Spasticity_Legs_R_C = pym_Spasticity_Legs_R_C;
	}

	public String getPym_Spasticity_Legs_R_C_Initial() {
		return Pym_Spasticity_Legs_R_C_Initial;
	}

	public void setPym_Spasticity_Legs_R_C_Initial(
			String pym_Spasticity_Legs_R_C_Initial) {
		Pym_Spasticity_Legs_R_C_Initial = pym_Spasticity_Legs_R_C_Initial;
	}

	public String getPym_Spasticity_Legs_L() {
		return Pym_Spasticity_Legs_L;
	}

	public void setPym_Spasticity_Legs_L(String pym_Spasticity_Legs_L) {
		if("0".equalsIgnoreCase(pym_Spasticity_Legs_L)) {
			Pym_Spasticity_Legs_L = "none";
		} else if("1".equalsIgnoreCase(pym_Spasticity_Legs_L)) {
			Pym_Spasticity_Legs_L = "mild";
		}else if("2".equalsIgnoreCase(pym_Spasticity_Legs_L)) {
			Pym_Spasticity_Legs_L = "moderate";
		}else if("3".equalsIgnoreCase(pym_Spasticity_Legs_L)) {
			Pym_Spasticity_Legs_L = "severe";
		}else if("4".equalsIgnoreCase(pym_Spasticity_Legs_L)) {
			Pym_Spasticity_Legs_L = "contracted";
		}
	}

	public String getPym_Spasticity_Legs_L_Initial() {
		return Pym_Spasticity_Legs_L_Initial;
	}

	public void setPym_Spasticity_Legs_L_Initial(
			String pym_Spasticity_Legs_L_Initial) {
		Pym_Spasticity_Legs_L_Initial = pym_Spasticity_Legs_L_Initial;
	}

	public String getPym_Spasticity_Legs_L_C() {
		return Pym_Spasticity_Legs_L_C;
	}

	public void setPym_Spasticity_Legs_L_C(String pym_Spasticity_Legs_L_C) {
		Pym_Spasticity_Legs_L_C = pym_Spasticity_Legs_L_C;
	}

	public String getPym_Spasticity_Legs_L_C_Initial() {
		return Pym_Spasticity_Legs_L_C_Initial;
	}

	public void setPym_Spasticity_Legs_L_C_Initial(
			String pym_Spasticity_Legs_L_C_Initial) {
		Pym_Spasticity_Legs_L_C_Initial = pym_Spasticity_Legs_L_C_Initial;
	}

	public String getPym_Spasticity_Gait_R() {
		return Pym_Spasticity_Gait_R;
	}

	public void setPym_Spasticity_Gait_R(String pym_Spasticity_Gait_R) {
		if("0".equalsIgnoreCase(pym_Spasticity_Gait_R)) {
			Pym_Spasticity_Gait_R = "none";
		} else if("1".equalsIgnoreCase(pym_Spasticity_Gait_R)) {
			Pym_Spasticity_Gait_R = "mild";
		}else if("2".equalsIgnoreCase(pym_Spasticity_Gait_R)) {
			Pym_Spasticity_Gait_R = "moderate";
		}else if("3".equalsIgnoreCase(pym_Spasticity_Gait_R)) {
			Pym_Spasticity_Gait_R = "severe";
		}
	}

	public String getPym_Spasticity_Gait_R_Initial() {
		return Pym_Spasticity_Gait_R_Initial;
	}

	public void setPym_Spasticity_Gait_R_Initial(
			String pym_Spasticity_Gait_R_Initial) {
		Pym_Spasticity_Gait_R_Initial = pym_Spasticity_Gait_R_Initial;
	}

	public String getPym_Spasticity_Gait_R_C() {
		return Pym_Spasticity_Gait_R_C;
	}

	public void setPym_Spasticity_Gait_R_C(String pym_Spasticity_Gait_R_C) {
		Pym_Spasticity_Gait_R_C = pym_Spasticity_Gait_R_C;
	}

	public String getPym_Spasticity_Gait_R_C_Initial() {
		return Pym_Spasticity_Gait_R_C_Initial;
	}

	public void setPym_Spasticity_Gait_R_C_Initial(
			String pym_Spasticity_Gait_R_C_Initial) {
		Pym_Spasticity_Gait_R_C_Initial = pym_Spasticity_Gait_R_C_Initial;
	}

	public String getPym_Spasticity_Gait_L() {
		return Pym_Spasticity_Gait_L;
	}

	public void setPym_Spasticity_Gait_L(String pym_Spasticity_Gait_L) {
		if("0".equalsIgnoreCase(pym_Spasticity_Gait_L)) {
			Pym_Spasticity_Gait_L = "none";
		} else if("1".equalsIgnoreCase(pym_Spasticity_Gait_L)) {
			Pym_Spasticity_Gait_L = "mild";
		}else if("2".equalsIgnoreCase(pym_Spasticity_Gait_L)) {
			Pym_Spasticity_Gait_L = "moderate";
		}else if("3".equalsIgnoreCase(pym_Spasticity_Gait_L)) {
			Pym_Spasticity_Gait_L = "severe";
		}
	}

	public String getPym_Spasticity_Gait_L_Initial() {
		return Pym_Spasticity_Gait_L_Initial;
	}

	public void setPym_Spasticity_Gait_L_Initial(
			String pym_Spasticity_Gait_L_Initial) {
		Pym_Spasticity_Gait_L_Initial = pym_Spasticity_Gait_L_Initial;
	}

	public String getPym_Spasticity_Gait_L_C() {
		return Pym_Spasticity_Gait_L_C;
	}

	public void setPym_Spasticity_Gait_L_C(String pym_Spasticity_Gait_L_C) {
		Pym_Spasticity_Gait_L_C = pym_Spasticity_Gait_L_C;
	}

	public String getPym_Spasticity_Gait_L_C_Initial() {
		return Pym_Spasticity_Gait_L_C_Initial;
	}

	public void setPym_Spasticity_Gait_L_C_Initial(
			String pym_Spasticity_Gait_L_C_Initial) {
		Pym_Spasticity_Gait_L_C_Initial = pym_Spasticity_Gait_L_C_Initial;
	}

	public String getPym_Motor_Performance() {
		return Pym_Motor_Performance;
	}

	public void setPym_Motor_Performance(String pym_Motor_Performance) {
		if("0".equalsIgnoreCase(pym_Motor_Performance)) {
			Pym_Motor_Performance = "Normal";
		} else if("1".equalsIgnoreCase(pym_Motor_Performance)) {
			Pym_Motor_Performance = "abnormal weakness";
		}else if("2".equalsIgnoreCase(pym_Motor_Performance)) {
			Pym_Motor_Performance = "Reduction in strength";
		}
	}

	public String getPym_Motor_Performance_Initial() {
		return Pym_Motor_Performance_Initial;
	}

	public void setPym_Motor_Performance_Initial(
			String pym_Motor_Performance_Initial) {
		Pym_Motor_Performance_Initial = pym_Motor_Performance_Initial;
	}

	public String getPym_Motor_Performance_C() {
		return Pym_Motor_Performance_C;
	}

	public void setPym_Motor_Performance_C(String pym_Motor_Performance_C) {
		Pym_Motor_Performance_C = pym_Motor_Performance_C;
	}

	public String getPym_Motor_Performance_C_Initial() {
		return Pym_Motor_Performance_C_Initial;
	}

	public void setPym_Motor_Performance_C_Initial(
			String pym_Motor_Performance_C_Initial) {
		Pym_Motor_Performance_C_Initial = pym_Motor_Performance_C_Initial;
	}

	public String getPyramidal_Comments() {
		return Pyramidal_Comments;
	}

	public void setPyramidal_Comments(String pyramidal_Comments) {
		Pyramidal_Comments = pyramidal_Comments;
	}

	public String getPyramidal_Comments_Initial() {
		return Pyramidal_Comments_Initial;
	}

	public void setPyramidal_Comments_Initial(String pyramidal_Comments_Initial) {
		Pyramidal_Comments_Initial = pyramidal_Comments_Initial;
	}

	public String getCerebellar_HeadTremor() {
		return Cerebellar_HeadTremor;
	}

	public void setCerebellar_HeadTremor(String cerebellar_HeadTremor) {
		if("0".equalsIgnoreCase(cerebellar_HeadTremor)) {
			Cerebellar_HeadTremor = "none";
		}else if("1".equalsIgnoreCase(cerebellar_HeadTremor)) {
			Cerebellar_HeadTremor = "mild";
		}else if("1x".equalsIgnoreCase(cerebellar_HeadTremor)) {
			Cerebellar_HeadTremor = "mildx";
		}else if("2".equalsIgnoreCase(cerebellar_HeadTremor)) {
			Cerebellar_HeadTremor = "moderate";
		}else if("2x".equalsIgnoreCase(cerebellar_HeadTremor)) {
			Cerebellar_HeadTremor = "moderatex";
		}else if("3".equalsIgnoreCase(cerebellar_HeadTremor)) {
			Cerebellar_HeadTremor = "severe";
		}else if("3x".equalsIgnoreCase(cerebellar_HeadTremor)) {
			Cerebellar_HeadTremor = "severex";
		}
	}

	public String getCerebellar_HeadTremor_Initial() {
		return Cerebellar_HeadTremor_Initial;
	}

	public void setCerebellar_HeadTremor_Initial(
			String cerebellar_HeadTremor_Initial) {
		Cerebellar_HeadTremor_Initial = cerebellar_HeadTremor_Initial;
	}

	public String getCerebellar_HeadTremor_C() {
		return Cerebellar_HeadTremor_C;
	}

	public void setCerebellar_HeadTremor_C(String cerebellar_HeadTremor_C) {
		Cerebellar_HeadTremor_C = cerebellar_HeadTremor_C;
	}

	public String getCerebellar_HeadTremor_C_Initial() {
		return Cerebellar_HeadTremor_C_Initial;
	}

	public void setCerebellar_HeadTremor_C_Initial(
			String cerebellar_HeadTremor_C_Initial) {
		Cerebellar_HeadTremor_C_Initial = cerebellar_HeadTremor_C_Initial;
	}

	public String getCerebellar_TruncalAtaxia() {
		return Cerebellar_TruncalAtaxia;
	}

	public void setCerebellar_TruncalAtaxia(String cerebellar_TruncalAtaxia) {
		if("0".equalsIgnoreCase(cerebellar_TruncalAtaxia)) {
			Cerebellar_TruncalAtaxia = "none";
		}else if("1".equalsIgnoreCase(cerebellar_TruncalAtaxia)) {
			Cerebellar_TruncalAtaxia = "signs only";
		}else if("1x".equalsIgnoreCase(cerebellar_TruncalAtaxia)) {
			Cerebellar_TruncalAtaxia = "signs onlyx";
		}else if("2".equalsIgnoreCase(cerebellar_TruncalAtaxia)) {
			Cerebellar_TruncalAtaxia = "mild";
		}else if("2x".equalsIgnoreCase(cerebellar_TruncalAtaxia)) {
			Cerebellar_TruncalAtaxia = "mildx";
		}else if("3".equalsIgnoreCase(cerebellar_TruncalAtaxia)) {
			Cerebellar_TruncalAtaxia = "moderate";
		}else if("3x".equalsIgnoreCase(cerebellar_TruncalAtaxia)) {
			Cerebellar_TruncalAtaxia = "moderatex";
		}else if("4".equalsIgnoreCase(cerebellar_TruncalAtaxia)) {
			Cerebellar_TruncalAtaxia = "severe";
		}else if("4x".equalsIgnoreCase(cerebellar_TruncalAtaxia)) {
			Cerebellar_TruncalAtaxia = "severex";
		}
	}

	public String getCerebellar_TruncalAtaxia_Initial() {
		return Cerebellar_TruncalAtaxia_Initial;
	}

	public void setCerebellar_TruncalAtaxia_Initial(
			String cerebellar_TruncalAtaxia_Initial) {
		Cerebellar_TruncalAtaxia_Initial = cerebellar_TruncalAtaxia_Initial;
	}

	public String getCerebellar_TruncalAtaxia_C() {
		return Cerebellar_TruncalAtaxia_C;
	}

	public void setCerebellar_TruncalAtaxia_C(String cerebellar_TruncalAtaxia_C) {
		Cerebellar_TruncalAtaxia_C = cerebellar_TruncalAtaxia_C;
	}

	public String getCerebellar_TruncalAtaxia_C_Initial() {
		return Cerebellar_TruncalAtaxia_C_Initial;
	}

	public void setCerebellar_TruncalAtaxia_C_Initial(
			String cerebellar_TruncalAtaxia_C_Initial) {
		Cerebellar_TruncalAtaxia_C_Initial = cerebellar_TruncalAtaxia_C_Initial;
	}

	public String getCerebellar_TremorUE_R() {
		return Cerebellar_TremorUE_R;
	}

	public void setCerebellar_TremorUE_R(String cerebellar_TremorUE_R) {
		if("0".equalsIgnoreCase(cerebellar_TremorUE_R)) {
			Cerebellar_TremorUE_R = "none";
		}else if("1".equalsIgnoreCase(cerebellar_TremorUE_R)) {
			Cerebellar_TremorUE_R = "signs only";
		}else if("1x".equalsIgnoreCase(cerebellar_TremorUE_R)) {
			Cerebellar_TremorUE_R = "signs onlyx";
		}else if("2".equalsIgnoreCase(cerebellar_TremorUE_R)) {
			Cerebellar_TremorUE_R = "mild";
		}else if("2x".equalsIgnoreCase(cerebellar_TremorUE_R)) {
			Cerebellar_TremorUE_R = "mildx";
		}else if("3".equalsIgnoreCase(cerebellar_TremorUE_R)) {
			Cerebellar_TremorUE_R = "moderate";
		}else if("3x".equalsIgnoreCase(cerebellar_TremorUE_R)) {
			Cerebellar_TremorUE_R = "moderatex";
		}else if("4".equalsIgnoreCase(cerebellar_TremorUE_R)) {
			Cerebellar_TremorUE_R = "severe";
		}else if("4x".equalsIgnoreCase(cerebellar_TremorUE_R)) {
			Cerebellar_TremorUE_R = "severex";
		}
	}

	public String getCerebellar_TremorUE_R_Initial() {
		return Cerebellar_TremorUE_R_Initial;
	}

	public void setCerebellar_TremorUE_R_Initial(
			String cerebellar_TremorUE_R_Initial) {
		Cerebellar_TremorUE_R_Initial = cerebellar_TremorUE_R_Initial;
	}

	public String getCerebellar_TremorUE_R_C() {
		return Cerebellar_TremorUE_R_C;
	}

	public void setCerebellar_TremorUE_R_C(String cerebellar_TremorUE_R_C) {
		Cerebellar_TremorUE_R_C = cerebellar_TremorUE_R_C;
	}

	public String getCerebellar_TremorUE_R_C_Initial() {
		return Cerebellar_TremorUE_R_C_Initial;
	}

	public void setCerebellar_TremorUE_R_C_Initial(
			String cerebellar_TremorUE_R_C_Initial) {
		Cerebellar_TremorUE_R_C_Initial = cerebellar_TremorUE_R_C_Initial;
	}

	public String getCerebellar_TremorUE_L() {
		return Cerebellar_TremorUE_L;
	}

	public void setCerebellar_TremorUE_L(String cerebellar_TremorUE_L) {
		if("0".equalsIgnoreCase(cerebellar_TremorUE_L)) {
			Cerebellar_TremorUE_L = "none";
		}else if("1".equalsIgnoreCase(cerebellar_TremorUE_L)) {
			Cerebellar_TremorUE_L = "signs only";
		}else if("1x".equalsIgnoreCase(cerebellar_TremorUE_L)) {
			Cerebellar_TremorUE_L = "signs onlyx";
		}else if("2".equalsIgnoreCase(cerebellar_TremorUE_L)) {
			Cerebellar_TremorUE_L = "mild";
		}else if("2x".equalsIgnoreCase(cerebellar_TremorUE_L)) {
			Cerebellar_TremorUE_L = "mildx";
		}else if("3".equalsIgnoreCase(cerebellar_TremorUE_L)) {
			Cerebellar_TremorUE_L = "moderate";
		}else if("3x".equalsIgnoreCase(cerebellar_TremorUE_L)) {
			Cerebellar_TremorUE_L = "moderatex";
		}else if("4".equalsIgnoreCase(cerebellar_TremorUE_L)) {
			Cerebellar_TremorUE_L = "severe";
		}else if("4x".equalsIgnoreCase(cerebellar_TremorUE_L)) {
			Cerebellar_TremorUE_L = "severex";
		}
	}

	public String getCerebellar_TremorUE_L_Initial() {
		return Cerebellar_TremorUE_L_Initial;
	}

	public void setCerebellar_TremorUE_L_Initial(
			String cerebellar_TremorUE_L_Initial) {
		Cerebellar_TremorUE_L_Initial = cerebellar_TremorUE_L_Initial;
	}

	public String getCerebellar_TremorUE_L_C() {
		return Cerebellar_TremorUE_L_C;
	}

	public void setCerebellar_TremorUE_L_C(String cerebellar_TremorUE_L_C) {
		Cerebellar_TremorUE_L_C = cerebellar_TremorUE_L_C;
	}

	public String getCerebellar_TremorUE_L_C_Initial() {
		return Cerebellar_TremorUE_L_C_Initial;
	}

	public void setCerebellar_TremorUE_L_C_Initial(
			String cerebellar_TremorUE_L_C_Initial) {
		Cerebellar_TremorUE_L_C_Initial = cerebellar_TremorUE_L_C_Initial;
	}

	public String getCerebellar_TremorLE_R() {
		return Cerebellar_TremorLE_R;
	}

	public void setCerebellar_TremorLE_R(String cerebellar_TremorLE_R) {
		if("0".equalsIgnoreCase(cerebellar_TremorLE_R)) {
			Cerebellar_TremorLE_R = "none";
		}else if("1".equalsIgnoreCase(cerebellar_TremorLE_R)) {
			Cerebellar_TremorLE_R = "signs only";
		}else if("1x".equalsIgnoreCase(cerebellar_TremorLE_R)) {
			Cerebellar_TremorLE_R = "signs onlyx";
		}else if("2".equalsIgnoreCase(cerebellar_TremorLE_R)) {
			Cerebellar_TremorLE_R = "mild";
		}else if("2x".equalsIgnoreCase(cerebellar_TremorLE_R)) {
			Cerebellar_TremorLE_R = "mildx";
		}else if("3".equalsIgnoreCase(cerebellar_TremorLE_R)) {
			Cerebellar_TremorLE_R = "moderate";
		}else if("3x".equalsIgnoreCase(cerebellar_TremorLE_R)) {
			Cerebellar_TremorLE_R = "moderatex";
		}else if("4".equalsIgnoreCase(cerebellar_TremorLE_R)) {
			Cerebellar_TremorLE_R = "severe";
		}else if("4x".equalsIgnoreCase(cerebellar_TremorLE_R)) {
			Cerebellar_TremorLE_R = "severex";
		}
	}

	public String getCerebellar_TremorLE_R_Initial() {
		return Cerebellar_TremorLE_R_Initial;
	}

	public void setCerebellar_TremorLE_R_Initial(
			String cerebellar_TremorLE_R_Initial) {
		Cerebellar_TremorLE_R_Initial = cerebellar_TremorLE_R_Initial;
	}

	public String getCerebellar_TremorLE_R_C() {
		return Cerebellar_TremorLE_R_C;
	}

	public void setCerebellar_TremorLE_R_C(String cerebellar_TremorLE_R_C) {
		Cerebellar_TremorLE_R_C = cerebellar_TremorLE_R_C;
	}

	public String getCerebellar_TremorLE_R_C_Initial() {
		return Cerebellar_TremorLE_R_C_Initial;
	}

	public void setCerebellar_TremorLE_R_C_Initial(
			String cerebellar_TremorLE_R_C_Initial) {
		Cerebellar_TremorLE_R_C_Initial = cerebellar_TremorLE_R_C_Initial;
	}

	public String getCerebellar_TremorLE_L() {
		return Cerebellar_TremorLE_L;
	}

	public void setCerebellar_TremorLE_L(String cerebellar_TremorLE_L) {
		if("0".equalsIgnoreCase(cerebellar_TremorLE_L)) {
			Cerebellar_TremorLE_L = "none";
		}else if("1".equalsIgnoreCase(cerebellar_TremorLE_L)) {
			Cerebellar_TremorLE_L = "signs only";
		}else if("1x".equalsIgnoreCase(cerebellar_TremorLE_L)) {
			Cerebellar_TremorLE_L = "signs onlyx";
		}else if("2".equalsIgnoreCase(cerebellar_TremorLE_L)) {
			Cerebellar_TremorLE_L = "mild";
		}else if("2x".equalsIgnoreCase(cerebellar_TremorLE_L)) {
			Cerebellar_TremorLE_L = "mildx";
		}else if("3".equalsIgnoreCase(cerebellar_TremorLE_L)) {
			Cerebellar_TremorLE_L = "moderate";
		}else if("3x".equalsIgnoreCase(cerebellar_TremorLE_L)) {
			Cerebellar_TremorLE_L = "moderatex";
		}else if("4".equalsIgnoreCase(cerebellar_TremorLE_L)) {
			Cerebellar_TremorLE_L = "severe";
		}else if("4x".equalsIgnoreCase(cerebellar_TremorLE_L)) {
			Cerebellar_TremorLE_L = "severex";
		}
	}

	public String getCerebellar_TremorLE_L_Initial() {
		return Cerebellar_TremorLE_L_Initial;
	}

	public void setCerebellar_TremorLE_L_Initial(
			String cerebellar_TremorLE_L_Initial) {
		Cerebellar_TremorLE_L_Initial = cerebellar_TremorLE_L_Initial;
	}

	public String getCerebellar_TremorLE_L_C() {
		return Cerebellar_TremorLE_L_C;
	}

	public void setCerebellar_TremorLE_L_C(String cerebellar_TremorLE_L_C) {
		Cerebellar_TremorLE_L_C = cerebellar_TremorLE_L_C;
	}

	public String getCerebellar_TremorLE_L_C_Initial() {
		return Cerebellar_TremorLE_L_C_Initial;
	}

	public void setCerebellar_TremorLE_L_C_Initial(
			String cerebellar_TremorLE_L_C_Initial) {
		Cerebellar_TremorLE_L_C_Initial = cerebellar_TremorLE_L_C_Initial;
	}

	public String getCerebellar_RapidUE_R() {
		return Cerebellar_RapidUE_R;
	}

	public void setCerebellar_RapidUE_R(String cerebellar_RapidUE_R) {
		if("0".equalsIgnoreCase(Cerebellar_RapidUE_R)) {
			Cerebellar_RapidUE_R = "none";
		}else if("1".equalsIgnoreCase(Cerebellar_RapidUE_R)) {
			Cerebellar_RapidUE_R = "signs only";
		}else if("1x".equalsIgnoreCase(Cerebellar_RapidUE_R)) {
			Cerebellar_RapidUE_R = "signs onlyx";
		}else if("2".equalsIgnoreCase(Cerebellar_RapidUE_R)) {
			Cerebellar_RapidUE_R = "mild";
		}else if("2x".equalsIgnoreCase(Cerebellar_RapidUE_R)) {
			Cerebellar_RapidUE_R = "mildx";
		}else if("3".equalsIgnoreCase(Cerebellar_RapidUE_R)) {
			Cerebellar_RapidUE_R = "moderate";
		}else if("3x".equalsIgnoreCase(Cerebellar_RapidUE_R)) {
			Cerebellar_RapidUE_R = "moderatex";
		}else if("4".equalsIgnoreCase(Cerebellar_RapidUE_R)) {
			Cerebellar_RapidUE_R = "severe";
		}else if("4x".equalsIgnoreCase(Cerebellar_RapidUE_R)) {
			Cerebellar_RapidUE_R = "severex";
		}
	}

	public String getCerebellar_RapidUE_R_Initial() {
		return Cerebellar_RapidUE_R_Initial;
	}

	public void setCerebellar_RapidUE_R_Initial(String cerebellar_RapidUE_R_Initial) {
		Cerebellar_RapidUE_R_Initial = cerebellar_RapidUE_R_Initial;
	}

	public String getCerebellar_RapidUE_R_C() {
		return Cerebellar_RapidUE_R_C;
	}

	public void setCerebellar_RapidUE_R_C(String cerebellar_RapidUE_R_C) {
		Cerebellar_RapidUE_R_C = cerebellar_RapidUE_R_C;
	}

	public String getCerebellar_RapidUE_R_C_Initial() {
		return Cerebellar_RapidUE_R_C_Initial;
	}

	public void setCerebellar_RapidUE_R_C_Initial(
			String cerebellar_RapidUE_R_C_Initial) {
		Cerebellar_RapidUE_R_C_Initial = cerebellar_RapidUE_R_C_Initial;
	}

	public String getCerebellar_RapidUE_L() {
		return Cerebellar_RapidUE_L;
	}

	public void setCerebellar_RapidUE_L(String cerebellar_RapidUE_L) {
		if("0".equalsIgnoreCase(cerebellar_RapidUE_L)) {
			Cerebellar_RapidUE_L = "none";
		}else if("1".equalsIgnoreCase(cerebellar_RapidUE_L)) {
			Cerebellar_RapidUE_L = "signs only";
		}else if("1x".equalsIgnoreCase(cerebellar_RapidUE_L)) {
			Cerebellar_RapidUE_L = "signs onlyx";
		}else if("2".equalsIgnoreCase(cerebellar_RapidUE_L)) {
			Cerebellar_RapidUE_L = "mild";
		}else if("2x".equalsIgnoreCase(cerebellar_RapidUE_L)) {
			Cerebellar_RapidUE_L = "mildx";
		}else if("3".equalsIgnoreCase(cerebellar_RapidUE_L)) {
			Cerebellar_RapidUE_L = "moderate";
		}else if("3x".equalsIgnoreCase(cerebellar_RapidUE_L)) {
			Cerebellar_RapidUE_L = "moderatex";
		}else if("4".equalsIgnoreCase(cerebellar_RapidUE_L)) {
			Cerebellar_RapidUE_L = "severe";
		}else if("4x".equalsIgnoreCase(cerebellar_RapidUE_L)) {
			Cerebellar_RapidUE_L = "severex";
		}
	}

	public String getCerebellar_RapidUE_L_Initial() {
		return Cerebellar_RapidUE_L_Initial;
	}

	public void setCerebellar_RapidUE_L_Initial(String cerebellar_RapidUE_L_Initial) {
		Cerebellar_RapidUE_L_Initial = cerebellar_RapidUE_L_Initial;
	}

	public String getCerebellar_RapidUE_L_C() {
		return Cerebellar_RapidUE_L_C;
	}

	public void setCerebellar_RapidUE_L_C(String cerebellar_RapidUE_L_C) {
		Cerebellar_RapidUE_L_C = cerebellar_RapidUE_L_C;
	}

	public String getCerebellar_RapidUE_L_C_Initial() {
		return Cerebellar_RapidUE_L_C_Initial;
	}

	public void setCerebellar_RapidUE_L_C_Initial(
			String cerebellar_RapidUE_L_C_Initial) {
		Cerebellar_RapidUE_L_C_Initial = cerebellar_RapidUE_L_C_Initial;
	}

	public String getCerebellar_RapidLE_R() {
		return Cerebellar_RapidLE_R;
	}

	public void setCerebellar_RapidLE_R(String cerebellar_RapidLE_R) {
		if("0".equalsIgnoreCase(cerebellar_RapidLE_R)) {
			Cerebellar_RapidLE_R = "none";
		}else if("1".equalsIgnoreCase(cerebellar_RapidLE_R)) {
			Cerebellar_RapidLE_R = "signs only";
		}else if("1x".equalsIgnoreCase(cerebellar_RapidLE_R)) {
			Cerebellar_RapidLE_R = "signs onlyx";
		}else if("2".equalsIgnoreCase(cerebellar_RapidLE_R)) {
			Cerebellar_RapidLE_R = "mild";
		}else if("2x".equalsIgnoreCase(cerebellar_RapidLE_R)) {
			Cerebellar_RapidLE_R = "mildx";
		}else if("3".equalsIgnoreCase(cerebellar_RapidLE_R)) {
			Cerebellar_RapidLE_R = "moderate";
		}else if("3x".equalsIgnoreCase(cerebellar_RapidLE_R)) {
			Cerebellar_RapidLE_R = "moderatex";
		}else if("4".equalsIgnoreCase(cerebellar_RapidLE_R)) {
			Cerebellar_RapidLE_R = "severe";
		}else if("4x".equalsIgnoreCase(cerebellar_RapidLE_R)) {
			Cerebellar_RapidLE_R = "severex";
		}
	}

	public String getCerebellar_RapidLE_R_Initial() {
		return Cerebellar_RapidLE_R_Initial;
	}

	public void setCerebellar_RapidLE_R_Initial(String cerebellar_RapidLE_R_Initial) {
		Cerebellar_RapidLE_R_Initial = cerebellar_RapidLE_R_Initial;
	}

	public String getCerebellar_RapidLE_R_C() {
		return Cerebellar_RapidLE_R_C;
	}

	public void setCerebellar_RapidLE_R_C(String cerebellar_RapidLE_R_C) {
		Cerebellar_RapidLE_R_C = cerebellar_RapidLE_R_C;
	}

	public String getCerebellar_RapidLE_R_C_Initial() {
		return Cerebellar_RapidLE_R_C_Initial;
	}

	public void setCerebellar_RapidLE_R_C_Initial(
			String cerebellar_RapidLE_R_C_Initial) {
		Cerebellar_RapidLE_R_C_Initial = cerebellar_RapidLE_R_C_Initial;
	}

	public String getCerebellar_RapidLE_L() {
		return Cerebellar_RapidLE_L;
	}

	public void setCerebellar_RapidLE_L(String cerebellar_RapidLE_L) {
		if("0".equalsIgnoreCase(cerebellar_RapidLE_L)) {
			Cerebellar_RapidLE_L = "none";
		}else if("1".equalsIgnoreCase(cerebellar_RapidLE_L)) {
			Cerebellar_RapidLE_L = "signs only";
		}else if("1x".equalsIgnoreCase(cerebellar_RapidLE_L)) {
			Cerebellar_RapidLE_L = "signs onlyx";
		}else if("2".equalsIgnoreCase(cerebellar_RapidLE_L)) {
			Cerebellar_RapidLE_L = "mild";
		}else if("2x".equalsIgnoreCase(cerebellar_RapidLE_L)) {
			Cerebellar_RapidLE_L = "mildx";
		}else if("3".equalsIgnoreCase(cerebellar_RapidLE_L)) {
			Cerebellar_RapidLE_L = "moderate";
		}else if("3x".equalsIgnoreCase(cerebellar_RapidLE_L)) {
			Cerebellar_RapidLE_L = "moderatex";
		}else if("4".equalsIgnoreCase(cerebellar_RapidLE_L)) {
			Cerebellar_RapidLE_L = "severe";
		}else if("4x".equalsIgnoreCase(cerebellar_RapidLE_L)) {
			Cerebellar_RapidLE_L = "severex";
		}
	}

	public String getCerebellar_RapidLE_L_Initial() {
		return Cerebellar_RapidLE_L_Initial;
	}

	public void setCerebellar_RapidLE_L_Initial(String cerebellar_RapidLE_L_Initial) {
		Cerebellar_RapidLE_L_Initial = cerebellar_RapidLE_L_Initial;
	}

	public String getCerebellar_RapidLE_L_C() {
		return Cerebellar_RapidLE_L_C;
	}

	public void setCerebellar_RapidLE_L_C(String cerebellar_RapidLE_L_C) {
		Cerebellar_RapidLE_L_C = cerebellar_RapidLE_L_C;
	}

	public String getCerebellar_RapidLE_L_C_Initial() {
		return Cerebellar_RapidLE_L_C_Initial;
	}

	public void setCerebellar_RapidLE_L_C_Initial(
			String cerebellar_RapidLE_L_C_Initial) {
		Cerebellar_RapidLE_L_C_Initial = cerebellar_RapidLE_L_C_Initial;
	}

	public String getCerebellar_Tandem_Walking() {
		return Cerebellar_Tandem_Walking;
	}

	public void setCerebellar_Tandem_Walking(String cerebellar_Tandem_Walking) {
		if("0".equalsIgnoreCase(cerebellar_Tandem_Walking)) {
			Cerebellar_Tandem_Walking = "normal";
		}else if("1".equalsIgnoreCase(cerebellar_Tandem_Walking)) {
			Cerebellar_Tandem_Walking = "impaired";
		}else if("1x".equalsIgnoreCase(cerebellar_Tandem_Walking)) {
			Cerebellar_Tandem_Walking = "impairedx";
		}else if("2".equalsIgnoreCase(cerebellar_Tandem_Walking)) {
			Cerebellar_Tandem_Walking = "not possible";
		}else if("2x".equalsIgnoreCase(cerebellar_Tandem_Walking)) {
			Cerebellar_Tandem_Walking = "not possiblex";
		}
	}

	public String getCerebellar_Tandem_Walking_Initial() {
		return Cerebellar_Tandem_Walking_Initial;
	}

	public void setCerebellar_Tandem_Walking_Initial(
			String cerebellar_Tandem_Walking_Initial) {
		Cerebellar_Tandem_Walking_Initial = cerebellar_Tandem_Walking_Initial;
	}

	public String getCerebellar_Tandem_Walking_C() {
		return Cerebellar_Tandem_Walking_C;
	}

	public void setCerebellar_Tandem_Walking_C(String cerebellar_Tandem_Walking_C) {
		Cerebellar_Tandem_Walking_C = cerebellar_Tandem_Walking_C;
	}

	public String getCerebellar_Tandem_Walking_C_Initial() {
		return Cerebellar_Tandem_Walking_C_Initial;
	}

	public void setCerebellar_Tandem_Walking_C_Initial(
			String cerebellar_Tandem_Walking_C_Initial) {
		Cerebellar_Tandem_Walking_C_Initial = cerebellar_Tandem_Walking_C_Initial;
	}

	public String getCerebellar_GaitAtaxia() {
		return Cerebellar_GaitAtaxia;
	}

	public void setCerebellar_GaitAtaxia(String cerebellar_GaitAtaxia) {
		if("0".equalsIgnoreCase(cerebellar_GaitAtaxia)) {
			Cerebellar_GaitAtaxia = "none";
		}else if("1".equalsIgnoreCase(cerebellar_GaitAtaxia)) {
			Cerebellar_GaitAtaxia = "signs only";
		}else if("1x".equalsIgnoreCase(cerebellar_GaitAtaxia)) {
			Cerebellar_GaitAtaxia = "signs onlyx";
		}else if("2".equalsIgnoreCase(cerebellar_GaitAtaxia)) {
			Cerebellar_GaitAtaxia = "mild";
		}else if("2x".equalsIgnoreCase(cerebellar_GaitAtaxia)) {
			Cerebellar_GaitAtaxia = "mildx";
		}else if("3".equalsIgnoreCase(cerebellar_GaitAtaxia)) {
			Cerebellar_GaitAtaxia = "moderate";
		}else if("3x".equalsIgnoreCase(cerebellar_GaitAtaxia)) {
			Cerebellar_GaitAtaxia = "moderatex";
		}else if("4".equalsIgnoreCase(cerebellar_GaitAtaxia)) {
			Cerebellar_GaitAtaxia = "severe";
		}else if("4x".equalsIgnoreCase(cerebellar_GaitAtaxia)) {
			Cerebellar_GaitAtaxia = "severex";
		}
		Cerebellar_GaitAtaxia = cerebellar_GaitAtaxia;
	}

	public String getCerebellar_GaitAtaxia_Initial() {
		return Cerebellar_GaitAtaxia_Initial;
	}

	public void setCerebellar_GaitAtaxia_Initial(
			String cerebellar_GaitAtaxia_Initial) {
		Cerebellar_GaitAtaxia_Initial = cerebellar_GaitAtaxia_Initial;
	}

	public String getCerebellar_GaitAtaxia_C() {
		return Cerebellar_GaitAtaxia_C;
	}

	public void setCerebellar_GaitAtaxia_C(String cerebellar_GaitAtaxia_C) {
		Cerebellar_GaitAtaxia_C = cerebellar_GaitAtaxia_C;
	}

	public String getCerebellar_GaitAtaxia_C_Initial() {
		return Cerebellar_GaitAtaxia_C_Initial;
	}

	public void setCerebellar_GaitAtaxia_C_Initial(
			String cerebellar_GaitAtaxia_C_Initial) {
		Cerebellar_GaitAtaxia_C_Initial = cerebellar_GaitAtaxia_C_Initial;
	}

	public String getCerebellar_RombergTest() {
		return Cerebellar_RombergTest;
	}

	public void setCerebellar_RombergTest(String cerebellar_RombergTest) {
		if("0".equalsIgnoreCase(cerebellar_RombergTest)) {
			Cerebellar_RombergTest = "normal";
		}else if("1".equalsIgnoreCase(cerebellar_RombergTest)) {
			Cerebellar_RombergTest = "mild";
		}else if("1x".equalsIgnoreCase(cerebellar_RombergTest)) {
			Cerebellar_RombergTest = "mildx";
		}else if("2".equalsIgnoreCase(cerebellar_RombergTest)) {
			Cerebellar_RombergTest = "moderate";
		}else if("2x".equalsIgnoreCase(cerebellar_RombergTest)) {
			Cerebellar_RombergTest = "moderatex";
		}else if("3".equalsIgnoreCase(cerebellar_RombergTest)) {
			Cerebellar_RombergTest = "severe";
		}else if("3x".equalsIgnoreCase(cerebellar_RombergTest)) {
			Cerebellar_RombergTest = "severex";
		}
	}

	public String getCerebellar_RombergTest_Initial() {
		return Cerebellar_RombergTest_Initial;
	}

	public void setCerebellar_RombergTest_Initial(
			String cerebellar_RombergTest_Initial) {
		Cerebellar_RombergTest_Initial = cerebellar_RombergTest_Initial;
	}

	public String getCerebellar_RombergTest_C() {
		return Cerebellar_RombergTest_C;
	}

	public void setCerebellar_RombergTest_C(String cerebellar_RombergTest_C) {
		Cerebellar_RombergTest_C = cerebellar_RombergTest_C;
	}

	public String getCerebellar_RombergTest_C_Initial() {
		return Cerebellar_RombergTest_C_Initial;
	}

	public void setCerebellar_RombergTest_C_Initial(
			String cerebellar_RombergTest_C_Initial) {
		Cerebellar_RombergTest_C_Initial = cerebellar_RombergTest_C_Initial;
	}

	public String getCerebellar_OtherCereTests() {
		return Cerebellar_OtherCereTests;
	}

	public void setCerebellar_OtherCereTests(String cerebellar_OtherCereTests) {
		if("0".equalsIgnoreCase(cerebellar_OtherCereTests)) {
			Cerebellar_OtherCereTests = "normal";
		}else if("1".equalsIgnoreCase(cerebellar_OtherCereTests)) {
			Cerebellar_OtherCereTests = "mild abnormality";
		}else if("1x".equalsIgnoreCase(cerebellar_OtherCereTests)) {
			Cerebellar_OtherCereTests = "mild abnormalityx";
		}else if("2".equalsIgnoreCase(cerebellar_OtherCereTests)) {
			Cerebellar_OtherCereTests = "moderate abnormality";
		}else if("2x".equalsIgnoreCase(cerebellar_OtherCereTests)) {
			Cerebellar_OtherCereTests = "moderate abnormalityx";
		}else if("3".equalsIgnoreCase(cerebellar_OtherCereTests)) {
			Cerebellar_OtherCereTests = "severe abnormality";
		}else if("3x".equalsIgnoreCase(cerebellar_OtherCereTests)) {
			Cerebellar_OtherCereTests = "severe abnormalityx";
		}
	}

	public String getCerebellar_OtherCereTests_Initial() {
		return Cerebellar_OtherCereTests_Initial;
	}

	public void setCerebellar_OtherCereTests_Initial(
			String cerebellar_OtherCereTests_Initial) {
		Cerebellar_OtherCereTests_Initial = cerebellar_OtherCereTests_Initial;
	}

	public String getCerebellar_OtherCereTests_C() {
		return Cerebellar_OtherCereTests_C;
	}

	public void setCerebellar_OtherCereTests_C(String cerebellar_OtherCereTests_C) {
		Cerebellar_OtherCereTests_C = cerebellar_OtherCereTests_C;
	}

	public String getCerebellar_OtherCereTests_C_Initial() {
		return Cerebellar_OtherCereTests_C_Initial;
	}

	public void setCerebellar_OtherCereTests_C_Initial(
			String cerebellar_OtherCereTests_C_Initial) {
		Cerebellar_OtherCereTests_C_Initial = cerebellar_OtherCereTests_C_Initial;
	}

	public String getCerebellar_Comments() {
		return Cerebellar_Comments;
	}

	public void setCerebellar_Comments(String cerebellar_Comments) {
		Cerebellar_Comments = cerebellar_Comments;
	}

	public String getCerebellar_Comments_Initial() {
		return Cerebellar_Comments_Initial;
	}

	public void setCerebellar_Comments_Initial(String cerebellar_Comments_Initial) {
		Cerebellar_Comments_Initial = cerebellar_Comments_Initial;
	}

	public String getSensory_SuperSensationUE_R() {
		return Sensory_SuperSensationUE_R;
	}

	public void setSensory_SuperSensationUE_R(String sensory_SuperSensationUE_R) {
		if("0".equalsIgnoreCase(sensory_SuperSensationUE_R)) {
			Sensory_SuperSensationUE_R = "normal";
		}else if("1".equalsIgnoreCase(sensory_SuperSensationUE_R)) {
			Sensory_SuperSensationUE_R = "signs only";
		}else if("2".equalsIgnoreCase(sensory_SuperSensationUE_R)) {
			Sensory_SuperSensationUE_R = "mild";
		}else if("3".equalsIgnoreCase(sensory_SuperSensationUE_R)) {
			Sensory_SuperSensationUE_R = "moderate";
		}else if("4".equalsIgnoreCase(sensory_SuperSensationUE_R)) {
			Sensory_SuperSensationUE_R = "marked";
		}else if("5".equalsIgnoreCase(sensory_SuperSensationUE_R)) {
			Sensory_SuperSensationUE_R = "complete loss";
		}
	}

	public String getSensory_SuperSensationUE_R_Initial() {
		return Sensory_SuperSensationUE_R_Initial;
	}

	public void setSensory_SuperSensationUE_R_Initial(
			String sensory_SuperSensationUE_R_Initial) {
		Sensory_SuperSensationUE_R_Initial = sensory_SuperSensationUE_R_Initial;
	}

	public String getSensory_SuperSensationUE_R_C() {
		return Sensory_SuperSensationUE_R_C;
	}

	public void setSensory_SuperSensationUE_R_C(String sensory_SuperSensationUE_R_C) {
		Sensory_SuperSensationUE_R_C = sensory_SuperSensationUE_R_C;
	}

	public String getSensory_SuperSensationUE_R_C_Initial() {
		return Sensory_SuperSensationUE_R_C_Initial;
	}

	public void setSensory_SuperSensationUE_R_C_Initial(
			String sensory_SuperSensationUE_R_C_Initial) {
		Sensory_SuperSensationUE_R_C_Initial = sensory_SuperSensationUE_R_C_Initial;
	}

	public String getSensory_SuperSensationUE_L() {
		return Sensory_SuperSensationUE_L;
	}

	public void setSensory_SuperSensationUE_L(String sensory_SuperSensationUE_L) {
		if("0".equalsIgnoreCase(sensory_SuperSensationUE_L)) {
			Sensory_SuperSensationUE_L = "normal";
		}else if("1".equalsIgnoreCase(sensory_SuperSensationUE_L)) {
			Sensory_SuperSensationUE_L = "signs only";
		}else if("2".equalsIgnoreCase(sensory_SuperSensationUE_L)) {
			Sensory_SuperSensationUE_L = "mild";
		}else if("3".equalsIgnoreCase(sensory_SuperSensationUE_L)) {
			Sensory_SuperSensationUE_L = "moderate";
		}else if("4".equalsIgnoreCase(sensory_SuperSensationUE_L)) {
			Sensory_SuperSensationUE_L = "marked";
		}else if("5".equalsIgnoreCase(sensory_SuperSensationUE_L)) {
			Sensory_SuperSensationUE_L = "complete loss";
		}
	}

	public String getSensory_SuperSensationUE_L_Initial() {
		return Sensory_SuperSensationUE_L_Initial;
	}

	public void setSensory_SuperSensationUE_L_Initial(
			String sensory_SuperSensationUE_L_Initial) {
		Sensory_SuperSensationUE_L_Initial = sensory_SuperSensationUE_L_Initial;
	}

	public String getSensory_SuperSensationUE_L_C() {
		return Sensory_SuperSensationUE_L_C;
	}

	public void setSensory_SuperSensationUE_L_C(String sensory_SuperSensationUE_L_C) {
		Sensory_SuperSensationUE_L_C = sensory_SuperSensationUE_L_C;
	}

	public String getSensory_SuperSensationUE_L_C_Initial() {
		return Sensory_SuperSensationUE_L_C_Initial;
	}

	public void setSensory_SuperSensationUE_L_C_Initial(
			String sensory_SuperSensationUE_L_C_Initial) {
		Sensory_SuperSensationUE_L_C_Initial = sensory_SuperSensationUE_L_C_Initial;
	}

	public String getSensory_SuperTrunk_R() {
		return Sensory_SuperTrunk_R;
	}

	public void setSensory_SuperTrunk_R(String sensory_SuperTrunk_R) {
		if("0".equalsIgnoreCase(sensory_SuperTrunk_R)) {
			Sensory_SuperTrunk_R = "normal";
		}else if("1".equalsIgnoreCase(sensory_SuperTrunk_R)) {
			Sensory_SuperTrunk_R = "signs only";
		}else if("2".equalsIgnoreCase(sensory_SuperTrunk_R)) {
			Sensory_SuperTrunk_R = "mild";
		}else if("3".equalsIgnoreCase(sensory_SuperTrunk_R)) {
			Sensory_SuperTrunk_R = "moderate";
		}else if("4".equalsIgnoreCase(sensory_SuperTrunk_R)) {
			Sensory_SuperTrunk_R = "marked";
		}else if("5".equalsIgnoreCase(sensory_SuperTrunk_R)) {
			Sensory_SuperTrunk_R = "complete loss";
		}
	}

	public String getSensory_SuperTrunk_R_Initial() {
		return Sensory_SuperTrunk_R_Initial;
	}

	public void setSensory_SuperTrunk_R_Initial(String sensory_SuperTrunk_R_Initial) {
		Sensory_SuperTrunk_R_Initial = sensory_SuperTrunk_R_Initial;
	}

	public String getSensory_SuperTrunk_R_C() {
		return Sensory_SuperTrunk_R_C;
	}

	public void setSensory_SuperTrunk_R_C(String sensory_SuperTrunk_R_C) {
		Sensory_SuperTrunk_R_C = sensory_SuperTrunk_R_C;
	}

	public String getSensory_SuperTrunk_R_C_Initial() {
		return Sensory_SuperTrunk_R_C_Initial;
	}

	public void setSensory_SuperTrunk_R_C_Initial(
			String sensory_SuperTrunk_R_C_Initial) {
		Sensory_SuperTrunk_R_C_Initial = sensory_SuperTrunk_R_C_Initial;
	}

	public String getSensory_SuperTrunk_L() {
		return Sensory_SuperTrunk_L;
	}

	public void setSensory_SuperTrunk_L(String sensory_SuperTrunk_L) {
		if("0".equalsIgnoreCase(sensory_SuperTrunk_L)) {
			Sensory_SuperTrunk_L = "normal";
		}else if("1".equalsIgnoreCase(sensory_SuperTrunk_L)) {
			Sensory_SuperTrunk_L = "signs only";
		}else if("2".equalsIgnoreCase(sensory_SuperTrunk_L)) {
			Sensory_SuperTrunk_L = "mild";
		}else if("3".equalsIgnoreCase(sensory_SuperTrunk_L)) {
			Sensory_SuperTrunk_L = "moderate";
		}else if("4".equalsIgnoreCase(sensory_SuperTrunk_L)) {
			Sensory_SuperTrunk_L = "marked";
		}else if("5".equalsIgnoreCase(sensory_SuperTrunk_L)) {
			Sensory_SuperTrunk_L = "complete loss";
		}
		Sensory_SuperTrunk_L = sensory_SuperTrunk_L;
	}

	public String getSensory_SuperTrunk_L_Initial() {
		return Sensory_SuperTrunk_L_Initial;
	}

	public void setSensory_SuperTrunk_L_Initial(String sensory_SuperTrunk_L_Initial) {
		Sensory_SuperTrunk_L_Initial = sensory_SuperTrunk_L_Initial;
	}

	public String getSensory_SuperTrunk_L_C() {
		return Sensory_SuperTrunk_L_C;
	}

	public void setSensory_SuperTrunk_L_C(String sensory_SuperTrunk_L_C) {
		Sensory_SuperTrunk_L_C = sensory_SuperTrunk_L_C;
	}

	public String getSensory_SuperTrunk_L_C_Initial() {
		return Sensory_SuperTrunk_L_C_Initial;
	}

	public void setSensory_SuperTrunk_L_C_Initial(
			String sensory_SuperTrunk_L_C_Initial) {
		Sensory_SuperTrunk_L_C_Initial = sensory_SuperTrunk_L_C_Initial;
	}

	public String getSensory_SuperSensationLE_R() {
		return Sensory_SuperSensationLE_R;
	}

	public void setSensory_SuperSensationLE_R(String sensory_SuperSensationLE_R) {
		if("0".equalsIgnoreCase(sensory_SuperSensationLE_R)) {
			Sensory_SuperSensationLE_R = "normal";
		}else if("1".equalsIgnoreCase(sensory_SuperSensationLE_R)) {
			Sensory_SuperSensationLE_R = "signs only";
		}else if("2".equalsIgnoreCase(sensory_SuperSensationLE_R)) {
			Sensory_SuperSensationLE_R = "mild";
		}else if("3".equalsIgnoreCase(sensory_SuperSensationLE_R)) {
			Sensory_SuperSensationLE_R = "moderate";
		}else if("4".equalsIgnoreCase(sensory_SuperSensationLE_R)) {
			Sensory_SuperSensationLE_R = "marked";
		}else if("5".equalsIgnoreCase(sensory_SuperSensationLE_R)) {
			Sensory_SuperSensationLE_R = "complete loss";
		}
	}

	public String getSensory_SuperSensationLE_R_Initial() {
		return Sensory_SuperSensationLE_R_Initial;
	}

	public void setSensory_SuperSensationLE_R_Initial(
			String sensory_SuperSensationLE_R_Initial) {
		Sensory_SuperSensationLE_R_Initial = sensory_SuperSensationLE_R_Initial;
	}

	public String getSensory_SuperSensationLE_R_C() {
		return Sensory_SuperSensationLE_R_C;
	}

	public void setSensory_SuperSensationLE_R_C(String sensory_SuperSensationLE_R_C) {
		Sensory_SuperSensationLE_R_C = sensory_SuperSensationLE_R_C;
	}

	public String getSensory_SuperSensationLE_R_C_Initial() {
		return Sensory_SuperSensationLE_R_C_Initial;
	}

	public void setSensory_SuperSensationLE_R_C_Initial(
			String sensory_SuperSensationLE_R_C_Initial) {
		Sensory_SuperSensationLE_R_C_Initial = sensory_SuperSensationLE_R_C_Initial;
	}

	public String getSensory_SuperSensationLE_L() {
		return Sensory_SuperSensationLE_L;
	}

	public void setSensory_SuperSensationLE_L(String sensory_SuperSensationLE_L) {
		if("0".equalsIgnoreCase(sensory_SuperSensationLE_L)) {
			Sensory_SuperSensationLE_L = "normal";
		}else if("1".equalsIgnoreCase(sensory_SuperSensationLE_L)) {
			Sensory_SuperSensationLE_L = "signs only";
		}else if("2".equalsIgnoreCase(sensory_SuperSensationLE_L)) {
			Sensory_SuperSensationLE_L = "mild";
		}else if("3".equalsIgnoreCase(sensory_SuperSensationLE_L)) {
			Sensory_SuperSensationLE_L = "moderate";
		}else if("4".equalsIgnoreCase(sensory_SuperSensationLE_L)) {
			Sensory_SuperSensationLE_L = "marked";
		}else if("5".equalsIgnoreCase(sensory_SuperSensationLE_L)) {
			Sensory_SuperSensationLE_L = "complete loss";
		}
	}

	public String getSensory_SuperSensationLE_L_Initial() {
		return Sensory_SuperSensationLE_L_Initial;
	}

	public void setSensory_SuperSensationLE_L_Initial(String sensory_SuperSensationLE_L_Initial) {
		Sensory_SuperSensationLE_L_Initial = sensory_SuperSensationLE_L_Initial;
	}

	public String getSensory_SuperSensationLE_L_C() {
		return Sensory_SuperSensationLE_L_C;
	}

	public void setSensory_SuperSensationLE_L_C(String sensory_SuperSensationLE_L_C) {
		Sensory_SuperSensationLE_L_C = sensory_SuperSensationLE_L_C;
	}

	public String getSensory_SuperSensationLE_L_C_Initial() {
		return Sensory_SuperSensationLE_L_C_Initial;
	}

	public void setSensory_SuperSensationLE_L_C_Initial(String sensory_SuperSensationLE_L_C_Initial) {
		Sensory_SuperSensationLE_L_C_Initial = sensory_SuperSensationLE_L_C_Initial;
	}

	public String getSensory_VibrationSenseUE_R() {
		return Sensory_VibrationSenseUE_R;
	}

	public void setSensory_VibrationSenseUE_R(String sensory_VibrationSenseUE_R) {
		if("0".equalsIgnoreCase(sensory_VibrationSenseUE_R)) {
			Sensory_VibrationSenseUE_R = "normal";
		}else if("1".equalsIgnoreCase(sensory_VibrationSenseUE_R)) {
			Sensory_VibrationSenseUE_R = "mild";
		}else if("2".equalsIgnoreCase(sensory_VibrationSenseUE_R)) {
			Sensory_VibrationSenseUE_R = "moderate";
		}else if("3".equalsIgnoreCase(sensory_VibrationSenseUE_R)) {
			Sensory_VibrationSenseUE_R = "marked";
		}
	}

	public String getSensory_VibrationSenseUE_R_Initial() {
		return Sensory_VibrationSenseUE_R_Initial;
	}

	public void setSensory_VibrationSenseUE_R_Initial(String sensory_VibrationSenseUE_R_Initial) {
		Sensory_VibrationSenseUE_R_Initial = sensory_VibrationSenseUE_R_Initial;
	}

	public String getSensory_VibrationSenseUE_R_C() {
		return Sensory_VibrationSenseUE_R_C;
	}

	public void setSensory_VibrationSenseUE_R_C(String sensory_VibrationSenseUE_R_C) {
		Sensory_VibrationSenseUE_R_C = sensory_VibrationSenseUE_R_C;
	}

	public String getSensory_VibrationSenseUE_R_C_Initial() {
		return Sensory_VibrationSenseUE_R_C_Initial;
	}

	public void setSensory_VibrationSenseUE_R_C_Initial(String sensory_VibrationSenseUE_R_C_Initial) {
		Sensory_VibrationSenseUE_R_C_Initial = sensory_VibrationSenseUE_R_C_Initial;
	}

	public String getSensory_VibrationSenseUE_L() {
		return Sensory_VibrationSenseUE_L;
	}

	public void setSensory_VibrationSenseUE_L(String sensory_VibrationSenseUE_L) {
		if("0".equalsIgnoreCase(sensory_VibrationSenseUE_L)) {
			Sensory_VibrationSenseUE_L = "normal";
		}else if("1".equalsIgnoreCase(sensory_VibrationSenseUE_L)) {
			Sensory_VibrationSenseUE_L = "mild";
		}else if("2".equalsIgnoreCase(sensory_VibrationSenseUE_L)) {
			Sensory_VibrationSenseUE_L = "moderate";
		}else if("3".equalsIgnoreCase(sensory_VibrationSenseUE_L)) {
			Sensory_VibrationSenseUE_L = "marked";
		}
	}

	public String getSensory_VibrationSenseUE_L_Initial() {
		return Sensory_VibrationSenseUE_L_Initial;
	}

	public void setSensory_VibrationSenseUE_L_Initial(String sensory_VibrationSenseUE_L_Initial) {
		Sensory_VibrationSenseUE_L_Initial = sensory_VibrationSenseUE_L_Initial;
	}

	public String getSensory_VibrationSenseUE_L_C() {
		return Sensory_VibrationSenseUE_L_C;
	}

	public void setSensory_VibrationSenseUE_L_C(String sensory_VibrationSenseUE_L_C) {
		Sensory_VibrationSenseUE_L_C = sensory_VibrationSenseUE_L_C;
	}

	public String getSensory_VibrationSenseUE_L_C_Initial() {
		return Sensory_VibrationSenseUE_L_C_Initial;
	}

	public void setSensory_VibrationSenseUE_L_C_Initial(String sensory_VibrationSenseUE_L_C_Initial) {
		Sensory_VibrationSenseUE_L_C_Initial = sensory_VibrationSenseUE_L_C_Initial;
	}

	public String getSensory_VibrationSenseLE_R() {
		return Sensory_VibrationSenseLE_R;
	}

	public void setSensory_VibrationSenseLE_R(String sensory_VibrationSenseLE_R) {
		if("0".equalsIgnoreCase(sensory_VibrationSenseLE_R)) {
			Sensory_VibrationSenseLE_R = "normal";
		}else if("1".equalsIgnoreCase(sensory_VibrationSenseLE_R)) {
			Sensory_VibrationSenseLE_R = "mild";
		}else if("2".equalsIgnoreCase(sensory_VibrationSenseLE_R)) {
			Sensory_VibrationSenseLE_R = "moderate";
		}else if("3".equalsIgnoreCase(sensory_VibrationSenseLE_R)) {
			Sensory_VibrationSenseLE_R = "marked";
		}
	}

	public String getSensory_VibrationSenseLE_R_Initial() {
		return Sensory_VibrationSenseLE_R_Initial;
	}

	public void setSensory_VibrationSenseLE_R_Initial(String sensory_VibrationSenseLE_R_Initial) {
		Sensory_VibrationSenseLE_R_Initial = sensory_VibrationSenseLE_R_Initial;
	}

	public String getSensory_VibrationSenseLE_R_C() {
		return Sensory_VibrationSenseLE_R_C;
	}

	public void setSensory_VibrationSenseLE_R_C(String sensory_VibrationSenseLE_R_C) {
		Sensory_VibrationSenseLE_R_C = sensory_VibrationSenseLE_R_C;
	}

	public String getSensory_VibrationSenseLE_R_C_Initial() {
		return Sensory_VibrationSenseLE_R_C_Initial;
	}

	public void setSensory_VibrationSenseLE_R_C_Initial(String sensory_VibrationSenseLE_R_C_Initial) {
		Sensory_VibrationSenseLE_R_C_Initial = sensory_VibrationSenseLE_R_C_Initial;
	}

	public String getSensory_VibrationSenseLE_L() {
		return Sensory_VibrationSenseLE_L;
	}

	public void setSensory_VibrationSenseLE_L(String sensory_VibrationSenseLE_L) {
		if("0".equalsIgnoreCase(sensory_VibrationSenseLE_L)) {
			Sensory_SuperSensationLE_L = "normal";
		}else if("1".equalsIgnoreCase(sensory_VibrationSenseLE_L)) {
			Sensory_SuperSensationLE_L = "mild";
		}else if("2".equalsIgnoreCase(sensory_VibrationSenseLE_L)) {
			Sensory_SuperSensationLE_L = "moderate";
		}else if("3".equalsIgnoreCase(sensory_VibrationSenseLE_L)) {
			Sensory_SuperSensationLE_L = "marked";
		}
	}

	public String getSensory_VibrationSenseLE_L_Initial() {
		return Sensory_VibrationSenseLE_L_Initial;
	}

	public void setSensory_VibrationSenseLE_L_Initial(String sensory_VibrationSenseLE_L_Initial) {
		Sensory_VibrationSenseLE_L_Initial = sensory_VibrationSenseLE_L_Initial;
	}

	public String getSensory_VibrationSenseLE_L_C() {
		return Sensory_VibrationSenseLE_L_C;
	}

	public void setSensory_VibrationSenseLE_L_C(String sensory_VibrationSenseLE_L_C) {
		Sensory_VibrationSenseLE_L_C = sensory_VibrationSenseLE_L_C;
	}

	public String getSensory_VibrationSenseLE_L_C_Initial() {
		return Sensory_VibrationSenseLE_L_C_Initial;
	}

	public void setSensory_VibrationSenseLE_L_C_Initial(String sensory_VibrationSenseLE_L_C_Initial) {
		Sensory_VibrationSenseLE_L_C_Initial = sensory_VibrationSenseLE_L_C_Initial;
	}

	public String getSensory_PositionSenseUE_R() {
		return Sensory_PositionSenseUE_R;
	}

	public void setSensory_PositionSenseUE_R(String sensory_PositionSenseUE_R) {
		if("0".equalsIgnoreCase(sensory_PositionSenseUE_R)) {
			Sensory_PositionSenseUE_R = "normal";
		}else if("1".equalsIgnoreCase(sensory_PositionSenseUE_R)) {
			Sensory_PositionSenseUE_R = "mild";
		}else if("2".equalsIgnoreCase(sensory_PositionSenseUE_R)) {
			Sensory_PositionSenseUE_R = "moderate";
		}else if("3".equalsIgnoreCase(sensory_PositionSenseUE_R)) {
			Sensory_PositionSenseUE_R = "marked";
		}
	}

	public String getSensory_PositionSenseUE_R_Initial() {
		return Sensory_PositionSenseUE_R_Initial;
	}

	public void setSensory_PositionSenseUE_R_Initial(String sensory_PositionSenseUE_R_Initial) {
		Sensory_PositionSenseUE_R_Initial = sensory_PositionSenseUE_R_Initial;
	}

	public String getSensory_PositionSenseUE_R_C() {
		return Sensory_PositionSenseUE_R_C;
	}

	public void setSensory_PositionSenseUE_R_C(String sensory_PositionSenseUE_R_C) {
		Sensory_PositionSenseUE_R_C = sensory_PositionSenseUE_R_C;
	}

	public String getSensory_PositionSenseUE_R_C_Initial() {
		return Sensory_PositionSenseUE_R_C_Initial;
	}

	public void setSensory_PositionSenseUE_R_C_Initial(String sensory_PositionSenseUE_R_C_Initial) {
		Sensory_PositionSenseUE_R_C_Initial = sensory_PositionSenseUE_R_C_Initial;
	}

	public String getSensory_PositionSenseUE_L() {
		return Sensory_PositionSenseUE_L;
	}

	public void setSensory_PositionSenseUE_L(String sensory_PositionSenseUE_L) {
		if("0".equalsIgnoreCase(sensory_PositionSenseUE_L)) {
			Sensory_PositionSenseUE_L = "normal";
		}else if("1".equalsIgnoreCase(sensory_PositionSenseUE_L)) {
			Sensory_PositionSenseUE_L = "mild";
		}else if("2".equalsIgnoreCase(sensory_PositionSenseUE_L)) {
			Sensory_PositionSenseUE_L = "moderate";
		}else if("3".equalsIgnoreCase(sensory_PositionSenseUE_L)) {
			Sensory_PositionSenseUE_L = "marked";
		}
	}

	public String getSensory_PositionSenseUE_L_Initial() {
		return Sensory_PositionSenseUE_L_Initial;
	}

	public void setSensory_PositionSenseUE_L_Initial(String sensory_PositionSenseUE_L_Initial) {
		Sensory_PositionSenseUE_L_Initial = sensory_PositionSenseUE_L_Initial;
	}

	public String getSensory_PositionSenseUE_L_C() {
		return Sensory_PositionSenseUE_L_C;
	}

	public void setSensory_PositionSenseUE_L_C(String sensory_PositionSenseUE_L_C) {
		Sensory_PositionSenseUE_L_C = sensory_PositionSenseUE_L_C;
	}

	public String getSensory_PositionSenseUE_L_C_Initial() {
		return Sensory_PositionSenseUE_L_C_Initial;
	}

	public void setSensory_PositionSenseUE_L_C_Initial(String sensory_PositionSenseUE_L_C_Initial) {
		Sensory_PositionSenseUE_L_C_Initial = sensory_PositionSenseUE_L_C_Initial;
	}

	public String getSensory_PositionSenseLE_R() {
		return Sensory_PositionSenseLE_R;
	}

	public void setSensory_PositionSenseLE_R(String sensory_PositionSenseLE_R) {
		if("0".equalsIgnoreCase(sensory_PositionSenseLE_R)) {
			Sensory_PositionSenseLE_R = "normal";
		}else if("1".equalsIgnoreCase(sensory_PositionSenseLE_R)) {
			Sensory_PositionSenseLE_R = "mild";
		}else if("2".equalsIgnoreCase(sensory_PositionSenseLE_R)) {
			Sensory_PositionSenseLE_R = "moderate";
		}else if("3".equalsIgnoreCase(sensory_PositionSenseLE_R)) {
			Sensory_PositionSenseLE_R = "marked";
		}	
	}

	public String getSensory_PositionSenseLE_R_Initial() {
		return Sensory_PositionSenseLE_R_Initial;
	}

	public void setSensory_PositionSenseLE_R_Initial(String sensory_PositionSenseLE_R_Initial) {
		Sensory_PositionSenseLE_R_Initial = sensory_PositionSenseLE_R_Initial;
	}

	public String getSensory_PositionSenseLE_R_C() {
		return Sensory_PositionSenseLE_R_C;
	}

	public void setSensory_PositionSenseLE_R_C(String sensory_PositionSenseLE_R_C) {
		Sensory_PositionSenseLE_R_C = sensory_PositionSenseLE_R_C;
	}

	public String getSensory_PositionSenseLE_R_C_Initial() {
		return Sensory_PositionSenseLE_R_C_Initial;
	}

	public void setSensory_PositionSenseLE_R_C_Initial(String sensory_PositionSenseLE_R_C_Initial) {
		Sensory_PositionSenseLE_R_C_Initial = sensory_PositionSenseLE_R_C_Initial;
	}

	public String getSensory_PositionSenseLE_L() {
		return Sensory_PositionSenseLE_L;
	}

	public void setSensory_PositionSenseLE_L(String sensory_PositionSenseLE_L) {
		if("0".equalsIgnoreCase(sensory_PositionSenseLE_L)) {
			Sensory_PositionSenseLE_L = "normal";
		}else if("1".equalsIgnoreCase(sensory_PositionSenseLE_L)) {
			Sensory_PositionSenseLE_L = "mild";
		}else if("2".equalsIgnoreCase(sensory_PositionSenseLE_L)) {
			Sensory_PositionSenseLE_L = "moderate";
		}else if("3".equalsIgnoreCase(sensory_PositionSenseLE_L)) {
			Sensory_PositionSenseLE_L = "marked";
		}	
	}

	public String getSensory_PositionSenseLE_L_Initial() {
		return Sensory_PositionSenseLE_L_Initial;
	}

	public void setSensory_PositionSenseLE_L_Initial(String sensory_PositionSenseLE_L_Initial) {
		Sensory_PositionSenseLE_L_Initial = sensory_PositionSenseLE_L_Initial;
	}

	public String getSensory_PositionSenseLE_L_C() {
		return Sensory_PositionSenseLE_L_C;
	}

	public void setSensory_PositionSenseLE_L_C(String sensory_PositionSenseLE_L_C) {
		Sensory_PositionSenseLE_L_C = sensory_PositionSenseLE_L_C;
	}

	public String getSensory_PositionSenseLE_L_C_Initial() {
		return Sensory_PositionSenseLE_L_C_Initial;
	}

	public void setSensory_PositionSenseLE_L_C_Initial(String sensory_PositionSenseLE_L_C_Initial) {
		Sensory_PositionSenseLE_L_C_Initial = sensory_PositionSenseLE_L_C_Initial;
	}

	public String getSensory_LhermittesSign() {
		return Sensory_LhermittesSign;
	}

	public void setSensory_LhermittesSign(String sensory_LhermittesSign) {
		if("0".equalsIgnoreCase(sensory_LhermittesSign)) {
			Sensory_LhermittesSign = "negative";
		}else if("1".equalsIgnoreCase(sensory_LhermittesSign)) {
			Sensory_LhermittesSign = "positive";
		}
	}

	public String getSensory_LhermittesSign_Initial() {
		return Sensory_LhermittesSign_Initial;
	}

	public void setSensory_LhermittesSign_Initial(String sensory_LhermittesSign_Initial) {
		Sensory_LhermittesSign_Initial = sensory_LhermittesSign_Initial;
	}

	public String getSensory_LhermittesSign_C() {
		return Sensory_LhermittesSign_C;
	}

	public void setSensory_LhermittesSign_C(String sensory_LhermittesSign_C) {
		Sensory_LhermittesSign_C = sensory_LhermittesSign_C;
	}

	public String getSensory_LhermittesSign_C_Initial() {
		return Sensory_LhermittesSign_C_Initial;
	}

	public void setSensory_LhermittesSign_C_Initial(String sensory_LhermittesSign_C_Initial) {
		Sensory_LhermittesSign_C_Initial = sensory_LhermittesSign_C_Initial;
	}

	public String getSensory_ParaesthesiaeUE_R() {
		return Sensory_ParaesthesiaeUE_R;
	}

	public void setSensory_ParaesthesiaeUE_R(String sensory_ParaesthesiaeUE_R) {
		if("0".equalsIgnoreCase(sensory_ParaesthesiaeUE_R)) {
			Sensory_ParaesthesiaeUE_R = "none";
		}else if("1".equalsIgnoreCase(sensory_ParaesthesiaeUE_R)) {
			Sensory_ParaesthesiaeUE_R = "present";
		}
	}

	public String getSensory_ParaesthesiaeUE_R_Initial() {
		return Sensory_ParaesthesiaeUE_R_Initial;
	}

	public void setSensory_ParaesthesiaeUE_R_Initial(
			String sensory_ParaesthesiaeUE_R_Initial) {
		Sensory_ParaesthesiaeUE_R_Initial = sensory_ParaesthesiaeUE_R_Initial;
	}

	public String getSensory_ParaesthesiaeUE_R_C() {
		return Sensory_ParaesthesiaeUE_R_C;
	}

	public void setSensory_ParaesthesiaeUE_R_C(String sensory_ParaesthesiaeUE_R_C) {
		Sensory_ParaesthesiaeUE_R_C = sensory_ParaesthesiaeUE_R_C;
	}

	public String getSensory_ParaesthesiaeUE_R_C_Initial() {
		return Sensory_ParaesthesiaeUE_R_C_Initial;
	}

	public void setSensory_ParaesthesiaeUE_R_C_Initial(String sensory_ParaesthesiaeUE_R_C_Initial) {
		Sensory_ParaesthesiaeUE_R_C_Initial = sensory_ParaesthesiaeUE_R_C_Initial;
	}

	public String getSensory_ParaesthesiaeUE_L() {
		return Sensory_ParaesthesiaeUE_L;
	}

	public void setSensory_ParaesthesiaeUE_L(String sensory_ParaesthesiaeUE_L) {
		if("0".equalsIgnoreCase(sensory_ParaesthesiaeUE_L)) {
			Sensory_ParaesthesiaeUE_L = "none";
		}else if("1".equalsIgnoreCase(sensory_ParaesthesiaeUE_L)) {
			Sensory_ParaesthesiaeUE_L = "present";
		}
	}

	public String getSensory_ParaesthesiaeUE_L_Initial() {
		return Sensory_ParaesthesiaeUE_L_Initial;
	}

	public void setSensory_ParaesthesiaeUE_L_Initial(String sensory_ParaesthesiaeUE_L_Initial) {
		Sensory_ParaesthesiaeUE_L_Initial = sensory_ParaesthesiaeUE_L_Initial;
	}

	public String getSensory_ParaesthesiaeUE_L_C() {
		return Sensory_ParaesthesiaeUE_L_C;
	}

	public void setSensory_ParaesthesiaeUE_L_C(String sensory_ParaesthesiaeUE_L_C) {
		Sensory_ParaesthesiaeUE_L_C = sensory_ParaesthesiaeUE_L_C;
	}

	public String getSensory_ParaesthesiaeUE_L_C_Initial() {
		return Sensory_ParaesthesiaeUE_L_C_Initial;
	}

	public void setSensory_ParaesthesiaeUE_L_C_Initial(String sensory_ParaesthesiaeUE_L_C_Initial) {
		Sensory_ParaesthesiaeUE_L_C_Initial = sensory_ParaesthesiaeUE_L_C_Initial;
	}

	public String getSensory_ParaesthesiaeTrunk_R() {
		return Sensory_ParaesthesiaeTrunk_R;
	}

	public void setSensory_ParaesthesiaeTrunk_R(String sensory_ParaesthesiaeTrunk_R) {
		if("0".equalsIgnoreCase(sensory_ParaesthesiaeTrunk_R)) {
			Sensory_ParaesthesiaeTrunk_R = "none";
		}else if("1".equalsIgnoreCase(sensory_ParaesthesiaeTrunk_R)) {
			Sensory_ParaesthesiaeTrunk_R = "present";
		}
	}

	public String getSensory_ParaesthesiaeTrunk_R_Initial() {
		return Sensory_ParaesthesiaeTrunk_R_Initial;
	}

	public void setSensory_ParaesthesiaeTrunk_R_Initial(
			String sensory_ParaesthesiaeTrunk_R_Initial) {
		Sensory_ParaesthesiaeTrunk_R_Initial = sensory_ParaesthesiaeTrunk_R_Initial;
	}

	public String getSensory_ParaesthesiaeTrunk_R_C() {
		return Sensory_ParaesthesiaeTrunk_R_C;
	}

	public void setSensory_ParaesthesiaeTrunk_R_C(
			String sensory_ParaesthesiaeTrunk_R_C) {
		Sensory_ParaesthesiaeTrunk_R_C = sensory_ParaesthesiaeTrunk_R_C;
	}

	public String getSensory_ParaesthesiaeTrunk_R_C_Initial() {
		return Sensory_ParaesthesiaeTrunk_R_C_Initial;
	}

	public void setSensory_ParaesthesiaeTrunk_R_C_Initial(String sensory_ParaesthesiaeTrunk_R_C_Initial) {
		Sensory_ParaesthesiaeTrunk_R_C_Initial = sensory_ParaesthesiaeTrunk_R_C_Initial;
	}

	public String getSensory_ParaesthesiaeTrunk_L() {
		return Sensory_ParaesthesiaeTrunk_L;
	}

	public void setSensory_ParaesthesiaeTrunk_L(String sensory_ParaesthesiaeTrunk_L) {
		if("0".equalsIgnoreCase(sensory_ParaesthesiaeTrunk_L)) {
			Sensory_ParaesthesiaeTrunk_L = "none";
		}else if("1".equalsIgnoreCase(sensory_ParaesthesiaeTrunk_L)) {
			Sensory_ParaesthesiaeTrunk_L = "present";
		}
	}

	public String getSensory_ParaesthesiaeTrunk_L_Initial() {
		return Sensory_ParaesthesiaeTrunk_L_Initial;
	}

	public void setSensory_ParaesthesiaeTrunk_L_Initial(String sensory_ParaesthesiaeTrunk_L_Initial) {
		Sensory_ParaesthesiaeTrunk_L_Initial = sensory_ParaesthesiaeTrunk_L_Initial;
	}

	public String getSensory_ParaesthesiaeTrunk_L_C() {
		return Sensory_ParaesthesiaeTrunk_L_C;
	}

	public void setSensory_ParaesthesiaeTrunk_L_C(String sensory_ParaesthesiaeTrunk_L_C) {
		Sensory_ParaesthesiaeTrunk_L_C = sensory_ParaesthesiaeTrunk_L_C;
	}

	public String getSensory_ParaesthesiaeTrunk_L_C_Initial() {
		return Sensory_ParaesthesiaeTrunk_L_C_Initial;
	}

	public void setSensory_ParaesthesiaeTrunk_L_C_Initial(String sensory_ParaesthesiaeTrunk_L_C_Initial) {
		Sensory_ParaesthesiaeTrunk_L_C_Initial = sensory_ParaesthesiaeTrunk_L_C_Initial;
	}

	public String getSensory_ParaesthesiaeLE_R() {
		return Sensory_ParaesthesiaeLE_R;
	}

	public void setSensory_ParaesthesiaeLE_R(String sensory_ParaesthesiaeLE_R) {
		if("0".equalsIgnoreCase(sensory_ParaesthesiaeLE_R)) {
			Sensory_ParaesthesiaeLE_R = "none";
		}else if("1".equalsIgnoreCase(sensory_ParaesthesiaeLE_R)) {
			Sensory_ParaesthesiaeLE_R = "present";
		}
	}

	public String getSensory_ParaesthesiaeLE_R_Initial() {
		return Sensory_ParaesthesiaeLE_R_Initial;
	}

	public void setSensory_ParaesthesiaeLE_R_Initial(String sensory_ParaesthesiaeLE_R_Initial) {
		Sensory_ParaesthesiaeLE_R_Initial = sensory_ParaesthesiaeLE_R_Initial;
	}

	public String getSensory_ParaesthesiaeLE_R_C() {
		return Sensory_ParaesthesiaeLE_R_C;
	}

	public void setSensory_ParaesthesiaeLE_R_C(String sensory_ParaesthesiaeLE_R_C) {
		Sensory_ParaesthesiaeLE_R_C = sensory_ParaesthesiaeLE_R_C;
	}

	public String getSensory_ParaesthesiaeLE_R_C_Initial() {
		return Sensory_ParaesthesiaeLE_R_C_Initial;
	}

	public void setSensory_ParaesthesiaeLE_R_C_Initial(String sensory_ParaesthesiaeLE_R_C_Initial) {
		Sensory_ParaesthesiaeLE_R_C_Initial = sensory_ParaesthesiaeLE_R_C_Initial;
	}

	public String getSensory_ParaesthesiaeLE_L() {
		return Sensory_ParaesthesiaeLE_L;
	}

	public void setSensory_ParaesthesiaeLE_L(String sensory_ParaesthesiaeLE_L) {
		if("0".equalsIgnoreCase(sensory_ParaesthesiaeLE_L)) {
			Sensory_ParaesthesiaeLE_L = "none";
		}else if("1".equalsIgnoreCase(sensory_ParaesthesiaeLE_L)) {
			Sensory_ParaesthesiaeLE_L = "present";
		}
	}

	public String getSensory_ParaesthesiaeLE_L_Initial() {
		return Sensory_ParaesthesiaeLE_L_Initial;
	}

	public void setSensory_ParaesthesiaeLE_L_Initial(String sensory_ParaesthesiaeLE_L_Initial) {
		Sensory_ParaesthesiaeLE_L_Initial = sensory_ParaesthesiaeLE_L_Initial;
	}

	public String getSensory_ParaesthesiaeLE_L_C() {
		return Sensory_ParaesthesiaeLE_L_C;
	}

	public void setSensory_ParaesthesiaeLE_L_C(String sensory_ParaesthesiaeLE_L_C) {
		Sensory_ParaesthesiaeLE_L_C = sensory_ParaesthesiaeLE_L_C;
	}

	public String getSensory_ParaesthesiaeLE_L_C_Initial() {
		return Sensory_ParaesthesiaeLE_L_C_Initial;
	}

	public void setSensory_ParaesthesiaeLE_L_C_Initial(String sensory_ParaesthesiaeLE_L_C_Initial) {
		Sensory_ParaesthesiaeLE_L_C_Initial = sensory_ParaesthesiaeLE_L_C_Initial;
	}

	public String getSensory_Comments() {
		return Sensory_Comments;
	}

	public void setSensory_Comments(String sensory_Comments) {
		Sensory_Comments = sensory_Comments;
	}

	public String getSensory_Comments_Initial() {
		return Sensory_Comments_Initial;
	}

	public void setSensory_Comments_Initial(String sensory_Comments_Initial) {
		Sensory_Comments_Initial = sensory_Comments_Initial;
	}

	public String getBowelBladder_UrinaryHR() {
		return BowelBladder_UrinaryHR;
	}

	public void setBowelBladder_UrinaryHR(String bowelBladder_UrinaryHR) {
		if("0".equalsIgnoreCase(bowelBladder_UrinaryHR)) {
			BowelBladder_UrinaryHR = "none";
		}else if("1".equalsIgnoreCase(bowelBladder_UrinaryHR)) {
			BowelBladder_UrinaryHR = "mild";
		}else if("2".equalsIgnoreCase(bowelBladder_UrinaryHR)) {
			BowelBladder_UrinaryHR = "moderate";
		}else if("3".equalsIgnoreCase(bowelBladder_UrinaryHR)) {
			BowelBladder_UrinaryHR = "severe";
		}else if("4".equalsIgnoreCase(bowelBladder_UrinaryHR)) {
			BowelBladder_UrinaryHR = "loss of function";
		}
	}

	public String getBowelBladder_UrinaryHR_Initial() {
		return BowelBladder_UrinaryHR_Initial;
	}

	public void setBowelBladder_UrinaryHR_Initial(
			String bowelBladder_UrinaryHR_Initial) {
		BowelBladder_UrinaryHR_Initial = bowelBladder_UrinaryHR_Initial;
	}

	public String getBowelBladder_UrinaryHR_C() {
		return BowelBladder_UrinaryHR_C;
	}

	public void setBowelBladder_UrinaryHR_C(String bowelBladder_UrinaryHR_C) {
		BowelBladder_UrinaryHR_C = bowelBladder_UrinaryHR_C;
	}

	public String getBowelBladder_UrinaryHR_C_Initial() {
		return BowelBladder_UrinaryHR_C_Initial;
	}

	public void setBowelBladder_UrinaryHR_C_Initial(
			String bowelBladder_UrinaryHR_C_Initial) {
		BowelBladder_UrinaryHR_C_Initial = bowelBladder_UrinaryHR_C_Initial;
	}

	public String getBowelBladder_UrinaryUI() {
		return BowelBladder_UrinaryUI;
	}

	public void setBowelBladder_UrinaryUI(String bowelBladder_UrinaryUI) {
		if("0".equalsIgnoreCase(bowelBladder_UrinaryUI)) {
			BowelBladder_UrinaryUI = "none";
		}else if("1".equalsIgnoreCase(bowelBladder_UrinaryUI)) {
			BowelBladder_UrinaryUI = "mild";
		}else if("2".equalsIgnoreCase(bowelBladder_UrinaryUI)) {
			BowelBladder_UrinaryUI = "moderate";
		}else if("3".equalsIgnoreCase(bowelBladder_UrinaryUI)) {
			BowelBladder_UrinaryUI = "severe";
		}else if("4".equalsIgnoreCase(bowelBladder_UrinaryUI)) {
			BowelBladder_UrinaryUI = "loss of function";
		}
	}

	public String getBowelBladder_UrinaryUI_Initial() {
		return BowelBladder_UrinaryUI_Initial;
	}

	public void setBowelBladder_UrinaryUI_Initial(
			String bowelBladder_UrinaryUI_Initial) {
		BowelBladder_UrinaryUI_Initial = bowelBladder_UrinaryUI_Initial;
	}

	public String getBowelBladder_UrinaryUI_C() {
		return BowelBladder_UrinaryUI_C;
	}

	public void setBowelBladder_UrinaryUI_C(String bowelBladder_UrinaryUI_C) {
		BowelBladder_UrinaryUI_C = bowelBladder_UrinaryUI_C;
	}

	public String getBowelBladder_UrinaryUI_C_Initial() {
		return BowelBladder_UrinaryUI_C_Initial;
	}

	public void setBowelBladder_UrinaryUI_C_Initial(
			String bowelBladder_UrinaryUI_C_Initial) {
		BowelBladder_UrinaryUI_C_Initial = bowelBladder_UrinaryUI_C_Initial;
	}

	public String getBowelBladder_Catheterisation() {
		return BowelBladder_Catheterisation;
	}

	public void setBowelBladder_Catheterisation(String bowelBladder_Catheterisation) {
		if("0".equalsIgnoreCase(bowelBladder_Catheterisation)) {
			BowelBladder_Catheterisation = "none";
		}else if("1".equalsIgnoreCase(bowelBladder_Catheterisation)) {
			BowelBladder_Catheterisation = "intermittent self-catheterisation";
		}else if("2".equalsIgnoreCase(bowelBladder_Catheterisation)) {
			BowelBladder_Catheterisation = "constant catheterisation";
		}
	}

	public String getBowelBladder_Catheterisation_Initial() {
		return BowelBladder_Catheterisation_Initial;
	}

	public void setBowelBladder_Catheterisation_Initial(String bowelBladder_Catheterisation_Initial) {
		BowelBladder_Catheterisation_Initial = bowelBladder_Catheterisation_Initial;
	}

	public String getBowelBladder_Catheterisation_C() {
		return BowelBladder_Catheterisation_C;
	}

	public void setBowelBladder_Catheterisation_C(String bowelBladder_Catheterisation_C) {
		BowelBladder_Catheterisation_C = bowelBladder_Catheterisation_C;
	}

	public String getBowelBladder_Catheterisation_C_Initial() {
		return BowelBladder_Catheterisation_C_Initial;
	}

	public void setBowelBladder_Catheterisation_C_Initial(String bowelBladder_Catheterisation_C_Initial) {
		BowelBladder_Catheterisation_C_Initial = bowelBladder_Catheterisation_C_Initial;
	}

	public String getBowelBladder_BowelDysfunction() {
		return BowelBladder_BowelDysfunction;
	}

	public void setBowelBladder_BowelDysfunction(String bowelBladder_BowelDysfunction) {
		if("0".equalsIgnoreCase(bowelBladder_BowelDysfunction)) {
			BowelBladder_BowelDysfunction = "none";
		}else if("1".equalsIgnoreCase(bowelBladder_BowelDysfunction)) {
			BowelBladder_BowelDysfunction = "mild";
		}else if("2".equalsIgnoreCase(bowelBladder_BowelDysfunction)) {
			BowelBladder_BowelDysfunction = "moderate";
		}else if("3".equalsIgnoreCase(bowelBladder_BowelDysfunction)) {
			BowelBladder_BowelDysfunction = "severe";
		}else if("4".equalsIgnoreCase(bowelBladder_BowelDysfunction)) {
			BowelBladder_BowelDysfunction = "loss of function";
		}
	}

	public String getBowelBladder_BowelDysfunction_Initial() {
		return BowelBladder_BowelDysfunction_Initial;
	}
	
	public void setBowelBladder_BowelDysfunction_Initial(String bowelBladder_BowelDysfunction_Initial) {
		BowelBladder_BowelDysfunction_Initial = bowelBladder_BowelDysfunction_Initial;
	}

	public String getBowelBladder_BowelDysfunc_C() {
		return BowelBladder_BowelDysfunc_C;
	}

	public void setBowelBladder_BowelDysfunc_C(String bowelBladder_BowelDysfunc_C) {
		BowelBladder_BowelDysfunc_C = bowelBladder_BowelDysfunc_C;
	}

	public String getBowelBladder_BowelDysfunc_C_Initial() {
		return BowelBladder_BowelDysfunc_C_Initial;
	}

	public void setBowelBladder_BowelDysfunc_C_Initial(
			String bowelBladder_BowelDysfunc_C_Initial) {
		BowelBladder_BowelDysfunc_C_Initial = bowelBladder_BowelDysfunc_C_Initial;
	}

	public String getBowelBladder_SexualDysfunction() {
		return BowelBladder_SexualDysfunction;
	}

	public void setBowelBladder_SexualDysfunction(String bowelBladder_SexualDysfunction) {
		if("0".equalsIgnoreCase(bowelBladder_SexualDysfunction)) {
			BowelBladder_SexualDysfunction = "none";
		}else if("1".equalsIgnoreCase(bowelBladder_SexualDysfunction)) {
			BowelBladder_SexualDysfunction = "mild";
		}else if("2".equalsIgnoreCase(bowelBladder_SexualDysfunction)) {
			BowelBladder_SexualDysfunction = "moderate";
		}else if("3".equalsIgnoreCase(bowelBladder_SexualDysfunction)) {
			BowelBladder_SexualDysfunction = "severe";
		}else if("4".equalsIgnoreCase(bowelBladder_SexualDysfunction)) {
			BowelBladder_SexualDysfunction = "loss of function";
		}
	}

	public String getBowelBladder_SexualDysfunction_Initial() {
		return BowelBladder_SexualDysfunction_Initial;
	}

	public void setBowelBladder_SexualDysfunction_Initial(String bowelBladder_SexualDysfunction_Initial) {
		BowelBladder_SexualDysfunction_Initial = bowelBladder_SexualDysfunction_Initial;
	}

	public String getBowelBladder_SexualDysfunc_C() {
		return BowelBladder_SexualDysfunc_C;
	}

	public void setBowelBladder_SexualDysfunc_C(String bowelBladder_SexualDysfunc_C) {
		BowelBladder_SexualDysfunc_C = bowelBladder_SexualDysfunc_C;
	}

	public String getBowelBladder_SexualDysfunc_C_Initial() {
		return BowelBladder_SexualDysfunc_C_Initial;
	}

	public void setBowelBladder_SexualDysfunc_C_Initial(String bowelBladder_SexualDysfunc_C_Initial) {
		BowelBladder_SexualDysfunc_C_Initial = bowelBladder_SexualDysfunc_C_Initial;
	}

	public String getBowelBladder_Comments() {
		return BowelBladder_Comments;
	}

	public void setBowelBladder_Comments(String bowelBladder_Comments) {
		BowelBladder_Comments = bowelBladder_Comments;
	}

	public String getBowelBladder_Comments_Initial() {
		return BowelBladder_Comments_Initial;
	}

	public void setBowelBladder_Comments_Initial(String bowelBladder_Comments_Initial) {
		BowelBladder_Comments_Initial = bowelBladder_Comments_Initial;
	}

	public String getCerebral_Depression() {
		return Cerebral_Depression;
	}

	public void setCerebral_Depression(String cerebral_Depression) {
		if("0".equalsIgnoreCase(cerebral_Depression)) {
			Cerebral_Depression = "none";
		}else if("1".equalsIgnoreCase(cerebral_Depression)) {
			Cerebral_Depression = "present";
		}
	}

	public String getCerebral_Depression_Initial() {
		return Cerebral_Depression_Initial;
	}

	public void setCerebral_Depression_Initial(String cerebral_Depression_Initial) {
		Cerebral_Depression_Initial = cerebral_Depression_Initial;
	}

	public String getCerebral_Depression_C() {
		return Cerebral_Depression_C;
	}

	public void setCerebral_Depression_C(String cerebral_Depression_C) {
		Cerebral_Depression_C = cerebral_Depression_C;
	}

	public String getCerebral_Depression_C_Initial() {
		return Cerebral_Depression_C_Initial;
	}

	public void setCerebral_Depression_C_Initial(String cerebral_Depression_C_Initial) {
		Cerebral_Depression_C_Initial = cerebral_Depression_C_Initial;
	}

	public String getCerebral_Euphoria() {
		return Cerebral_Euphoria;
	}

	public void setCerebral_Euphoria(String cerebral_Euphoria) {
		if("0".equalsIgnoreCase(cerebral_Euphoria)) {
			Cerebral_Euphoria = "none";
		}else if("1".equalsIgnoreCase(cerebral_Euphoria)) {
			Cerebral_Euphoria = "present";
		}
	}

	public String getCerebral_Euphoria_Initial() {
		return Cerebral_Euphoria_Initial;
	}

	public void setCerebral_Euphoria_Initial(String cerebral_Euphoria_Initial) {
		Cerebral_Euphoria_Initial = cerebral_Euphoria_Initial;
	}

	public String getCerebral_Euphoria_C() {
		return Cerebral_Euphoria_C;
	}

	public void setCerebral_Euphoria_C(String cerebral_Euphoria_C) {
		Cerebral_Euphoria_C = cerebral_Euphoria_C;
	}

	public String getCerebral_Euphoria_C_Initial() {
		return Cerebral_Euphoria_C_Initial;
	}

	public void setCerebral_Euphoria_C_Initial(String cerebral_Euphoria_C_Initial) {
		Cerebral_Euphoria_C_Initial = cerebral_Euphoria_C_Initial;
	}

	public String getCerebral_DecreaseMentation() {
		return Cerebral_DecreaseMentation;
	}

	public void setCerebral_DecreaseMentation(String cerebral_DecreaseMentation) {
		if("0".equalsIgnoreCase(cerebral_DecreaseMentation)) {
			Cerebral_DecreaseMentation = "none";
		}else if("1".equalsIgnoreCase(cerebral_DecreaseMentation)) {
			Cerebral_DecreaseMentation = "signs only";
		}else if("2".equalsIgnoreCase(cerebral_DecreaseMentation)) {
			Cerebral_DecreaseMentation = "mild";
		}else if("3".equalsIgnoreCase(cerebral_DecreaseMentation)) {
			Cerebral_DecreaseMentation = "moderate";
		}else if("4".equalsIgnoreCase(cerebral_DecreaseMentation)) {
			Cerebral_DecreaseMentation = "marked";
		}else if("5".equalsIgnoreCase(cerebral_DecreaseMentation)) {
			Cerebral_DecreaseMentation = "dementia";
		}
	}

	public String getCerebral_DecreaseMentation_Initial() {
		return Cerebral_DecreaseMentation_Initial;
	}

	public void setCerebral_DecreaseMentation_Initial(
			String cerebral_DecreaseMentation_Initial) {
		Cerebral_DecreaseMentation_Initial = cerebral_DecreaseMentation_Initial;
	}

	public String getCerebral_DecreaseMentation_C() {
		return Cerebral_DecreaseMentation_C;
	}

	public void setCerebral_DecreaseMentation_C(String cerebral_DecreaseMentation_C) {
		Cerebral_DecreaseMentation_C = cerebral_DecreaseMentation_C;
	}

	public String getCerebral_DecreaseMentation_C_Initial() {
		return Cerebral_DecreaseMentation_C_Initial;
	}

	public void setCerebral_DecreaseMentation_C_Initial(
			String cerebral_DecreaseMentation_C_Initial) {
		Cerebral_DecreaseMentation_C_Initial = cerebral_DecreaseMentation_C_Initial;
	}

	public String getCerebral_Fatigue() {
		return Cerebral_Fatigue;
	}

	public void setCerebral_Fatigue(String cerebral_Fatigue) {
		if("0".equalsIgnoreCase(cerebral_Fatigue)) {
			Cerebral_Fatigue = "none";
		}else if("1".equalsIgnoreCase(cerebral_Fatigue)) {
			Cerebral_Fatigue = "mild";
		}else if("2".equalsIgnoreCase(cerebral_Fatigue)) {
			Cerebral_Fatigue = "moderate";
		}else if("3".equalsIgnoreCase(cerebral_Fatigue)) {
			Cerebral_Fatigue = "severe";
		}
	}

	public String getCerebral_Fatigue_Initial() {
		return Cerebral_Fatigue_Initial;
	}

	public void setCerebral_Fatigue_Initial(String cerebral_Fatigue_Initial) {
		Cerebral_Fatigue_Initial = cerebral_Fatigue_Initial;
	}

	public String getCerebral_Fatigue_C() {
		return Cerebral_Fatigue_C;
	}

	public void setCerebral_Fatigue_C(String cerebral_Fatigue_C) {
		Cerebral_Fatigue_C = cerebral_Fatigue_C;
	}

	public String getCerebral_Fatigue_C_Initial() {
		return Cerebral_Fatigue_C_Initial;
	}

	public void setCerebral_Fatigue_C_Initial(String cerebral_Fatigue_C_Initial) {
		Cerebral_Fatigue_C_Initial = cerebral_Fatigue_C_Initial;
	}

	public String getCerebral_Comments() {
		return Cerebral_Comments;
	}

	public void setCerebral_Comments(String cerebral_Comments) {
		Cerebral_Comments = cerebral_Comments;
	}

	public String getCerebral_Comments_Initial() {
		return Cerebral_Comments_Initial;
	}

	public void setCerebral_Comments_Initial(String cerebralComments_Initial) {
		Cerebral_Comments_Initial = cerebralComments_Initial;
	}

	public String getAmbulation_Distance_Patient() {
		return Ambulation_Distance_Patient;
	}

	public void setAmbulation_Distance_Patient(String ambulation_Distance_Patient) {
		Ambulation_Distance_Patient = ambulation_Distance_Patient;
	}

	public String getAmbulation_Distance_Patient_Initial() {
		return Ambulation_Distance_Patient_Initial;
	}

	public void setAmbulation_Distance_Patient_Initial(
			String ambulation_Distance_Patient_Initial) {
		Ambulation_Distance_Patient_Initial = ambulation_Distance_Patient_Initial;
	}

	public String getAmbulation_Distance_Patient_C() {
		return Ambulation_Distance_Patient_C;
	}

	public void setAmbulation_Distance_Patient_C(
			String ambulation_Distance_Patient_C) {
		Ambulation_Distance_Patient_C = ambulation_Distance_Patient_C;
	}

	public String getAmbulation_Distance_Patient_C_Initial() {
		return Ambulation_Distance_Patient_C_Initial;
	}

	public void setAmbulation_Distance_Patient_C_Initial(
			String ambulation_Distance_Patient_C_Initial) {
		Ambulation_Distance_Patient_C_Initial = ambulation_Distance_Patient_C_Initial;
	}

	public String getAmbulation_Time_Patient() {
		return Ambulation_Time_Patient;
	}

	public void setAmbulation_Time_Patient(String ambulation_Time_Patient) {
		Ambulation_Time_Patient = ambulation_Time_Patient;
	}

	public String getAmbulation_Time_Patient_Initial() {
		return Ambulation_Time_Patient_Initial;
	}

	public void setAmbulation_Time_Patient_Initial(
			String ambulation_Time_Patient_Initial) {
		Ambulation_Time_Patient_Initial = ambulation_Time_Patient_Initial;
	}

	public String getAmbulation_Time_Patient_C() {
		return Ambulation_Time_Patient_C;
	}

	public void setAmbulation_Time_Patient_C(String ambulation_Time_Patient_C) {
		Ambulation_Time_Patient_C = ambulation_Time_Patient_C;
	}

	public String getAmbulation_Time_Patient_C_Initial() {
		return Ambulation_Time_Patient_C_Initial;
	}

	public void setAmbulation_Time_Patient_C_Initial(
			String ambulation_Time_Patient_C_Initial) {
		Ambulation_Time_Patient_C_Initial = ambulation_Time_Patient_C_Initial;
	}

	public String getAmbulation_Assistance() {
		return Ambulation_Assistance;
	}

	public void setAmbulation_Assistance(String ambulation_Assistance) {
		if("0".equalsIgnoreCase(ambulation_Assistance)) {
			Ambulation_Assistance = "Without help or assistance";
		}else if("1".equalsIgnoreCase(ambulation_Assistance)) {
			Ambulation_Assistance = "Unilateral assistance";
		}else if("2".equalsIgnoreCase(ambulation_Assistance)) {
			Ambulation_Assistance = "Bilateral assistance";
		}else if("3".equalsIgnoreCase(ambulation_Assistance)) {
			Ambulation_Assistance = "Wheelchair";
		}
	}

	public String getAmbulation_Assistance_Initial() {
		return Ambulation_Assistance_Initial;
	}

	public void setAmbulation_Assistance_Initial(
			String ambulation_Assistance_Initial) {
		Ambulation_Assistance_Initial = ambulation_Assistance_Initial;
	}

	public String getAmbulation_Assistance_C() {
		return Ambulation_Assistance_C;
	}

	public void setAmbulation_Assistance_C(String ambulation_Assistance_C) {
		Ambulation_Assistance_C = ambulation_Assistance_C;
	}

	public String getAmbulation_Assistance_C_Initial() {
		return Ambulation_Assistance_C_Initial;
	}

	public void setAmbulation_Assistance_C_Initial(
			String ambulation_Assistance_C_Initial) {
		Ambulation_Assistance_C_Initial = ambulation_Assistance_C_Initial;
	}

	public String getAmbulation_Distance() {
		return Ambulation_Distance;
	}

	public void setAmbulation_Distance(String ambulation_Distance) {
		Ambulation_Distance = ambulation_Distance;
	}

	public String getAmbulation_Distance_Initial() {
		return Ambulation_Distance_Initial;
	}

	public void setAmbulation_Distance_Initial(String ambulation_Distance_Initial) {
		Ambulation_Distance_Initial = ambulation_Distance_Initial;
	}

	public String getAmbulation_Distance_C() {
		return Ambulation_Distance_C;
	}

	public void setAmbulation_Distance_C(String ambulation_Distance_C) {
		Ambulation_Distance_C = ambulation_Distance_C;
	}

	public String getAmbulation_Distance_C_Initial() {
		return Ambulation_Distance_C_Initial;
	}

	public void setAmbulation_Distance_C_Initial(
			String ambulation_Distance_C_Initial) {
		Ambulation_Distance_C_Initial = ambulation_Distance_C_Initial;
	}

	public String getAmbulation_Comments() {
		return Ambulation_Comments;
	}

	public void setAmbulation_Comments(String ambulation_Comments) {
		Ambulation_Comments = ambulation_Comments;
	}

	public String getAmbulation_Comments_Initial() {
		return Ambulation_Comments_Initial;
	}

	public void setAmbulation_Comments_Initial(String ambulation_Comments_Initial) {
		Ambulation_Comments_Initial = ambulation_Comments_Initial;
	}

	public String getFSS_Visual() {
		return FSS_Visual;
	}

	public void setFSS_Visual(String fSS_Visual) {
		FSS_Visual = fSS_Visual;
	}

	public String getFSS_Visual_Initial() {
		return FSS_Visual_Initial;
	}

	public void setFSS_Visual_Initial(String fSS_Visual_Initial) {
		FSS_Visual_Initial = fSS_Visual_Initial;
	}

	public String getFSS_Visual_Converted() {
		return FSS_Visual_Converted;
	}

	public void setFSS_Visual_Converted(String fSS_Visual_Converted) {
		FSS_Visual_Converted = fSS_Visual_Converted;
	}

	public String getFSS_Visual_Converted_Initial() {
		return FSS_Visual_Converted_Initial;
	}

	public void setFSS_Visual_Converted_Initial(String fSS_Visual_Converted_Initial) {
		FSS_Visual_Converted_Initial = fSS_Visual_Converted_Initial;
	}

	public String getFSS_Brainstem() {
		return FSS_Brainstem;
	}

	public void setFSS_Brainstem(String fSS_Brainstem) {
		FSS_Brainstem = fSS_Brainstem;
	}

	public String getFSS_Brainstem_Initial() {
		return FSS_Brainstem_Initial;
	}

	public void setFSS_Brainstem_Initial(String fSS_Brainstem_Initial) {
		FSS_Brainstem_Initial = fSS_Brainstem_Initial;
	}

	public String getFSS_Pyramidal() {
		return FSS_Pyramidal;
	}

	public void setFSS_Pyramidal(String fSS_Pyramidal) {
		FSS_Pyramidal = fSS_Pyramidal;
	}

	public String getFSS_Pyramidal_Initial() {
		return FSS_Pyramidal_Initial;
	}

	public void setFSS_Pyramidal_Initial(String fSS_Pyramidal_Initial) {
		FSS_Pyramidal_Initial = fSS_Pyramidal_Initial;
	}

	public String getFSS_Cerebellar() {
		return FSS_Cerebellar;
	}

	public void setFSS_Cerebellar(String fSS_Cerebellar) {
		FSS_Cerebellar = fSS_Cerebellar;
	}

	public String getFSS_Cerebellar_Initial() {
		return FSS_Cerebellar_Initial;
	}

	public void setFSS_Cerebellar_Initial(String fSS_Cerebellar_Initial) {
		FSS_Cerebellar_Initial = fSS_Cerebellar_Initial;
	}

	public String getFSS_Sensory() {
		return FSS_Sensory;
	}

	public void setFSS_Sensory(String fSS_Sensory) {
		FSS_Sensory = fSS_Sensory;
	}

	public String getFSS_Sensory_Initial() {
		return FSS_Sensory_Initial;
	}

	public void setFSS_Sensory_Initial(String fSS_Sensory_Initial) {
		FSS_Sensory_Initial = fSS_Sensory_Initial;
	}

	public String getFSS_BowelBladder() {
		return FSS_BowelBladder;
	}

	public void setFSS_BowelBladder(String fSS_BowelBladder) {
		FSS_BowelBladder = fSS_BowelBladder;
	}

	public String getFSS_BowelBladder_Initial() {
		return FSS_BowelBladder_Initial;
	}

	public void setFSS_BowelBladder_Initial(String fSS_BowelBladder_Initial) {
		FSS_BowelBladder_Initial = fSS_BowelBladder_Initial;
	}

	public String getFSS_BowelBladder_Converted() {
		return FSS_BowelBladder_Converted;
	}

	public void setFSS_BowelBladder_Converted(String fSS_BowelBladder_Converted) {
		FSS_BowelBladder_Converted = fSS_BowelBladder_Converted;
	}

	public String getFSS_BowelBladder_Converted_Initial() {
		return FSS_BowelBladder_Converted_Initial;
	}

	public void setFSS_BowelBladder_Converted_Initial(
			String fSS_BowelBladder_Converted_Initial) {
		FSS_BowelBladder_Converted_Initial = fSS_BowelBladder_Converted_Initial;
	}

	public String getFSS_Cerebral() {
		return FSS_Cerebral;
	}

	public void setFSS_Cerebral(String fSS_Cerebral) {
		FSS_Cerebral = fSS_Cerebral;
	}

	public String getFSS_Cerebral_Initial() {
		return FSS_Cerebral_Initial;
	}

	public void setFSS_Cerebral_Initial(String fSS_Cerebral_Initial) {
		FSS_Cerebral_Initial = fSS_Cerebral_Initial;
	}

	public String getFSS_Ambulation() {
		return FSS_Ambulation;
	}

	public void setFSS_Ambulation(String fSS_Ambulation) {
		FSS_Ambulation = fSS_Ambulation;
	}

	public String getFSS_Ambulation_Initial() {
		return FSS_Ambulation_Initial;
	}

	public void setFSS_Ambulation_Initial(String fSS_Ambulation_Initial) {
		FSS_Ambulation_Initial = fSS_Ambulation_Initial;
	}

	public String getEDSS_Step() {
		return EDSS_Step;
	}

	public void setEDSS_Step(String eDSS_Step) {
		EDSS_Step = eDSS_Step;
	}

	public String getEDSS_Step_Initial() {
		return EDSS_Step_Initial;
	}

	public void setEDSS_Step_Initial(String eDSS_Step_Initial) {
		EDSS_Step_Initial = eDSS_Step_Initial;
	}

	public String getEDSS_Step_Comments() {
		return EDSS_Step_Comments;
	}

	public void setEDSS_Step_Comments(String eDSS_Step_Comments) {
		EDSS_Step_Comments = eDSS_Step_Comments;
	}

	public String getEDSS_Step_Comments_Initial() {
		return EDSS_Step_Comments_Initial;
	}

	public void setEDSS_Step_Comments_Initial(String eDSS_Step_Comments_Initial) {
		EDSS_Step_Comments_Initial = eDSS_Step_Comments_Initial;
	}






}
