/**
 * Class of Table
 * 	The Table class is used to store rows (or attributes) which have the same labels (index)
 * 	it is possible to browse all the elements and search for specific values 
 * 
 * @author Furat Shawki
 * @version 1
 * @since  01-Nov-2012
 * @Copyright © 2014 CRF Health All rights reserved.
 */
package util;

import java.util.ArrayList;
import java.util.List;

public class Table {

	private String [] index;
	private List <Attributes> elements;
    /** Constructor 
     * creates the an Array of elements (Attributes)
	 */
	public Table()
	{
		setRows(new ArrayList <Attributes>());
	}
    /** setIndex
     *  specify the index 
     *  @param String [] index
	 */
	public void setIndex(String [] index)
	{
		this.index = index;
	}
    /** addRow
     *  add a row of values in this Object
     *  @param String [] vals
	 */
	public void addRow(String []vals)
	{
		if (index==null) return;
		 Attributes temp = new Attributes();
		 for (int i=0 ; i<index.length; i++)
		 {
			 if(vals.length>=i+1)
				 temp.add(index[i],vals[i]);
			 else 
				 temp.add(index[i],"");
		 }
		 if(temp.items.size() > 0)
			 getRows().add(temp);
	}
    /** addRow
     *  add a row of Attributes in this Object
     *  @param Attributes attr
	 */
	public void addRow(Attributes attr)
	{
		this.elements.add(attr);
	}
    /** getValue
     * returns the value of the ith form at the label given as parameter.
     *  @param int i, 
     *  @param String lab
	 */
	public String getValue(int i, String lab)
	{
		return (((Attributes)getRows().get(i)).get(lab));
	}
	
    /** searchAndGetValuesInRow
     * The function searchs for the "values" indicated at the "labels" of the Table, 
     *  and returns the results (of ONE LINE) composed by the values at the "resultLabels". 
     *  @param String []searchedValues
     *  @param String []labels
     *  @param String []resultLabels
	 */
	public Attributes searchAndGetValuesInRow(String []searchedValues, String []labels, String []resultLabels)
	{
		Attributes res = new Attributes();
		for (int i=0 ; i< this.numberOfElements() ; i++)
		{
			boolean attibutesFound = true;
			int j=0;
			while(j < searchedValues.length && attibutesFound)
			{	
				String temp = this.getValue(i, labels[j]);
				if(!temp.equals(searchedValues[j]))
					attibutesFound = false;
				j++;	
			}
			if(attibutesFound)
			{
				int h=0;
				while(h < resultLabels.length)
				{	
					//  get the result in "Attributes" >> add (index,value)
					res.add((resultLabels[h]), getValue(i,resultLabels[h]));
					h++;	
				}
				return res;
			}
		}
		return res;
	}
    /** searchAndGetValuesInColumn
     * The function searchs for the "values" indicated at the "labels" of the Table, 
     * and returns the results (of MANY LINES) composed by the values at the "resultLabel". 
     *  @param String []searchedValues
     *  @param String []labels
     *  @param String []resultLabels
	 */
	public String [] searchAndGetValuesInColumn(String []searchedValues, String [] labels, String resultLabel)
	{
		String res = new String();
		for (int i=0 ; i< this.numberOfElements() ; i++)
		{
			boolean attibutesFound = true;
			int j=0;
			while(j < searchedValues.length && attibutesFound)
			{	
				String temp = this.getValue(i, labels[j]);
				if(!temp.equals(searchedValues[j]))
					attibutesFound = false;
				j++;	
			}
			if(attibutesFound)
			{	
				if (res.length()==0) res = new String (getValue(i,resultLabel));
				else res = res +"~"+ new String (getValue(i,resultLabel));	
			}
		}
		return res.split("~");
	}
    /** getRow
     * The function returns a row (Attributes) of the Table at the jth position.
     *  @param int j
	 */
	public Attributes getRow(int j)
	{ 
		return (Attributes)(this.getRows().get(j));
	}
    /** getRowOfElements
     * The function returns a row (String with "\t" separetor) 
     * of the Table at the jth position.
     *  @param int j
	 */
	public String getRowOfElements(int j)
	{ 
		String line = new String();
		for (int i=0 ; i<this.index.length ; i++)
		{
			Object obj = ((Attributes)(this.getRows().get(j))).get(index[i]);
				line = line +obj+"\t";
		}
		return line;
	}
    /** getRowOfElements
     * The function returns a row (String with "\t" separetor) 
     * of the Table at the jth position.
     *  @param int j
	 */
	public void setRows(List <Attributes> elements) {
		this.elements = elements;
	}
    /** getRows
     * The function returns all the rows: List of Attributes
	 */
	public List <Attributes> getRows() {
		return elements;
	}
    /** numberOfElements
     * The function returns the number of rows
	 */
	public int numberOfElements()
	{
		return this.elements.size();
	}
    /** clear
     * The function returns deletes the index and the rows of the Table
	 */
	public void clear()
	{
		index = null;
		elements.clear();	
	}
    /** getIndex
     * The function returns the index of the Table
	 */
	public String [] getIndex()
	{
		return index;
	}
}
