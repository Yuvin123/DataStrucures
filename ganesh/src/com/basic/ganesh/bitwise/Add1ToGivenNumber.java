package com.basic.ganesh.bitwise;

public class Add1ToGivenNumber {
	
	 
	static int addOne(int x)
	{
	  int m = 1;
	 
	  /* Flip all the set bits until we find a 0 */
	  while( (x & m) != 0 )
	  {
	    x = x^m;
	    m <<= 1;
	  }
	 
	  /* flip the rightmost 0 bit */
	  x = x^m;
	  return x;
	}
	 
	/* Driver program to test above functions*/
	public static void  main(String args[])
	{
	  System.out.println(addOne(13));
	}
}
