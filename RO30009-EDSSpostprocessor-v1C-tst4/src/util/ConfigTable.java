/**
 * Class of ConfigTable
 * 	This Class inherits the Table and is used to load all the configuration file.
 * Two labels have to be defined : PARAMETER and VALUE
 * the function getValueOfParameter() loads all the parameters with the right reference.
 * 
 * @author Furat Shawki
 * @version 1
 * @since  01-Nov-2012
 * @Copyright © 2014 CRF Health All rights reserved.
 */
package util;

public class ConfigTable extends Table {
	
    /** getValueOfParameter 
     *  the function returns the value found in the config Table related to the reference  
     *  given as parameter
     *  @param String ref
	 */
	public String getValueOfParameter(String ref)
	{
		String col1,col2;
		for (int i =0 ; i <= this.getRows().size(); i++)
		{
			col1 = this.getValue(i, "PARAMETER");
			if(ref.equals(col1))
				return(this.getValue(i, "VALUE"));
		}
		return null;	
	}
}
