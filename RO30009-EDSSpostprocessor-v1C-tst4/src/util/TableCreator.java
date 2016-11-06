/**
 * Class of TableCreator
 * 	This class creates a Table by reading a text file 
 * 	and splitting its lines according to a separator given as parameter.
 * 
 * @author Furat Shawki
 * @version 1
 * @since  01-Nov-2012
 * @Copyright © 2014 CRF Health All rights reserved.
 */
package util;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

public class TableCreator {
	private final static Logger LOGGER = Logger.getLogger(TableCreator.class.getName());
    /** readFileToTable
     * The function creates a Table by reading a text file
     * and splitting its lines according to a separator given as parameter.
     * @param String fileName
     *  @param String separator
	 */
	public Table readFileToTable(String fileName, String separator)
	{
		try{
		// fileName >> the file to be read.
		 //separator could be "\t" or ","
		   Table table = new Table();
		   FileInputStream fis = null;
		   BufferedInputStream bis = null;
		   DataInputStream dis = null;
		   
	       try {
	       	
				fis = new FileInputStream(new File (fileName));
			} catch (FileNotFoundException e1) {
				LOGGER.severe("Wrong path to the data file: "+fileName);
				return null;
			}
		  LOGGER.info("Start reading "+fileName);
	       // Here BufferedInputStream is added for fast reading.
	       bis = new BufferedInputStream(fis);
	       dis = new DataInputStream(bis);
	       int count = 0;
	       // dis.available() returns 0 if the file does not have more lines.
	       try {
				while (dis.available() != 0) 
				{
						String line = dis.readLine();
						//System.out.println(">>>>" + line);
						if(count == 0)
						{
							table.setIndex(line.split(separator));
						}
						else
						{
							String elts [] = line.split(separator);
							table.addRow(elts);
						}
						count++;						
				}
				fis.close();
			}   catch (IOException e) {
				LOGGER.severe("Problem while loading: "+fileName);
				e.printStackTrace();
				return null;
			}
			LOGGER.info("Table loaded");
			return table;
		}catch(Exception e){
			LOGGER.severe("Problems reading the file: "+fileName+":\n"+e.getMessage());
			throw new RuntimeException("Problems reading the file: "+fileName);
		}
	}
}
