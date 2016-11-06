/**
 * Class of Attributes
 * 
 * @author Furat Shawki
 * @version 1
 * @since  01-Nov-2012
 * @Copyright © 2014 CRF Health All rights reserved.
 */

package util;

import java.util.Enumeration;
import java.util.Hashtable;

public class Attributes {
	
	// an item corresponds to a line of an exported file
	Hashtable<String, String> items;
    /** Constructor 
     *  to create the internal Hashtable if items.
	 */
	public Attributes()
	{
		items = new Hashtable<String, String>();
	}
    /** add 
     *  to add a value in the Hashtable at the index given as parameter  
     *  @param String index
     *  @param String value
	 */
	public void add(String ind, String value)
	{
		items.put(ind, value);
	}
    /** get 
     *  to get the value stored in the Hashtable at the index given as parameter  
     *  @param String index
	 */
	public String get(String ind)
	{
		Object obj = items.get(ind);
		String res = "";
		if (obj!=null)
			res = (String) obj;
		return res;
	}
    /** displayAllItems 
     *  display in the console all the Items of Hastable specified at the labels 
     *  given as parameter
     *  @param String []labs
	 */ 
	public void displayAllItems(String []labs)
	{
		String res = "";
		for(int i=0 ; i<labs.length ; i++)
		{
			res = res + labs[i]+"="+this.get(labs[i])+"\t";  
		}
		System.out.println(res);
	}
    /** copy 
     *  copy the attributes given as paramter in the Hashtable of the object  
     *  @param Attributes resultAtt
	 */ 	
	public void copy(Attributes resultAtt) {
		// TODO Auto-generated method stub
		Enumeration <String> keys = resultAtt.items.keys();
		while(keys.hasMoreElements())
		{
			String k = keys.nextElement();
			this.items.put(k, resultAtt.get(k));
		}
	}
	
}
