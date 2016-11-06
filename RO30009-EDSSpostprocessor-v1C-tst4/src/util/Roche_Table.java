/**
 * Class of Roche_Table
 * 	This Class inherits the Table and is used to load all the data of a csv file
 * coming from a cvs Data Export.
 * Its specificity is the calculation of the certain Data Items from others.
 * Example : getStartDate() /  Visit_Number / 
 * 
 * 
 * @author Furat Shawki
 * @version 1
 * @since  01-Nov-2012
 * @Copyright © 2014 CRF Health All rights reserved.
 */
package util;

import classes.EDSSInitial;

public class Roche_Table extends Table {
	// This object is created to load all types of forms from a TM data export.
	// As part of the object:  String TM_FORM_ID 
	// 
	
	private static String TM_FORM_ID;
    /** Constructor 
     * Create an Object Table and store the TrialManager Form ID. given as parameter
     *  @param String TM_FORM_ID
	 */
	public Roche_Table(String TM_FORM_ID)
	{
		super();
		this.TM_FORM_ID = TM_FORM_ID;
	}
	

}
