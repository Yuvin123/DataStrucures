package com.basic.ganesh.arrayExamples;

import java.util.ArrayList;

public class FormMinimum_GivenSequene {
	
	//not completed... still working on it.
	/*
	 Input: D        Output: 21
   Input: I        Output: 12
   Input: DD       Output: 321
   Input: II       Output: 123
   Input: DIDI     Output: 21435
   Input: IIDDD    Output: 126543
   Input: DDIDDIID Output: 321654798 
	 */
	
	public static void form_sequence(String arr){
		
		char[] ch = arr.toCharArray();
		
		// min_avail represents the minimum number which is
	    // still available for inserting in the output vector.
	    // pos_of_I keeps track of the most recent index
	    // where 'I' was encountered w.r.t the output vector
	    int min_avail = 1, pos_of_I = 0;
	 
	    //array to store the output
	    ArrayList<Integer> v = new ArrayList<Integer>();
	 
	    // cover the base cases
	    if (ch[0]=='I')
	    {
	        v.add(1);
	        v.add(2);
	        min_avail = 3;
	        pos_of_I = 1;
	    }
	    else
	    {
	        v.add(2);
	        v.add(1);
	        min_avail = 3;
	        pos_of_I = 0;
	    }
	 
	    // Traverse rest of the input
	    for (int i=1; i<ch.length; i++)
	    {
	        if (ch[i]=='I')
	        {
	            v.add(min_avail);
	            min_avail++;
	            pos_of_I = i+1;
	        }
	        else
	        {
	            v.add(v.get(i));
	            for (int j=pos_of_I; j<=i; j++){
	            	  int c =v.get(j);
	            	  c++;
	            }
	            min_avail++;
	        }
	    }
	 
	    // print the number
	    
	       System.out.println(v);
	   
	}

	public static void main(String[] args) {
		String s = "IDID";
		FormMinimum_GivenSequene.form_sequence(s);	
		
	}

}
