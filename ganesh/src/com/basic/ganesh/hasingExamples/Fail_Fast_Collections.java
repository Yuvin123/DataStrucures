package com.basic.ganesh.hasingExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Fail_Fast_Collections {
	
	/*Fail fast iterator while iterating through the collection , 
	 * instantly throws Concurrent Modification Exception if there is structural modification  of the collection . 
	 * Thus, in the face of concurrent modification, the iterator fails quickly and cleanly, 
	 * rather than risking arbitrary, non-deterministic behavior at an undetermined time in the future. */

	
	    public static void main(String[] args)
	    {
	        Map<String,String> premiumPhone = new HashMap<String,String>();
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
	    
	}


/*output iPhone 
Exception in thread "main" java.util.ConcurrentModificationException
at java.util.HashMap$HashIterator.nextEntry(Unknown Source)
at java.util.HashMap$KeyIterator.next(Unknown Source)
at FailFastExample.main(FailFastExample.java:20)*/
	
	
	

