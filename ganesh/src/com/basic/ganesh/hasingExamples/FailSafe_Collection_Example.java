package com.basic.ganesh.hasingExamples;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe_Collection_Example {
	    
	    public static void main(String[] args)
	    {
	        ConcurrentHashMap<String,String> premiumPhone = 
	                               new ConcurrentHashMap<String,String>();
	        premiumPhone.put("Apple", "iPhone");
	        premiumPhone.put("HTC", "HTC one");
	        premiumPhone.put("Samsung","S5");
	        
	        Iterator iterator = premiumPhone.keySet().iterator();
	        
	        while (iterator.hasNext())
	        {
	            System.out.println(premiumPhone.get(iterator.next()));
	            premiumPhone.put("Sony", "Xperia Z");
	        }
	        
	    }
	    
	    
	    /*Fail Safe Iterator makes copy of the internal data structure (object array) and iterates over the copied data structure.
	     * Any structural modification done to the iterator affects the copied data structure.  
	     * So , original data structure remains  structurally unchanged .Hence , 
	     * no ConcurrentModificationException throws by the fail safe iterator.*/
	    
	}

