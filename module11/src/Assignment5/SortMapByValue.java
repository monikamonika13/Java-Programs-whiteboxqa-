package Assignment5;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValue {

	public static void main(String[] args) {
		HashMap<Integer,String>h= new HashMap<Integer,String>();
		h.put(1, "monika");
		h.put(2, "chiya");
		h.put(3, "akshu");
		h.put(4, "amit");
		System.out.println("Hashmap before sorting");
        Set<Entry<Integer, String>> entries = h.entrySet();
        for(Entry<Integer, String> entry : entries){ 
        	System.out.println(entry.getKey() + "  " + entry.getValue()); }

        Comparator<Entry<Integer, String>> valueComparator = new Comparator<Entry<Integer,String>>(){
        	@Override 
        	public int compare(Entry<Integer, String> e1, Entry<Integer, String> e2) 
        	{ 
        		String v1 = e1.getValue(); 
        	String v2 = e2.getValue(); 
        	return v1.compareTo(v2); } 
        	};
        	
      ArrayList<Entry<Integer, String>> listOfEntries = new ArrayList<Entry<Integer, String>>(entries);
        Collections.sort(listOfEntries,valueComparator);

   LinkedHashMap<Integer, String> sortedByValue = new LinkedHashMap<Integer, String>(listOfEntries.size());
     for(Entry<Integer, String> entry : listOfEntries)
     { sortedByValue.put(entry.getKey(), entry.getValue()); }
     System.out.println("HashMap after sorting entries by values "); 
     Set<Entry<Integer, String>> entrySetSortedByValue = sortedByValue.entrySet(); 
     for(Entry<Integer, String> mapping : entrySetSortedByValue){ 
    	 System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
     }
}}

              




	


