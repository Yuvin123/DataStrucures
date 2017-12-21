package com.basic.ganesh.stringExamples;

public class StringReverseWithOutSpecialChar {

	public void reverse(String str)
	{
		// Initialize left and right pointers
		int r = str.length() - 1, l = 0;

		// Traverse string from both ends until
		// 'l' and 'r'
		while (l < r)
		{
			// Ignore special characters
			if (!isAlphabet(str.charAt(l)))
				l++;
			else if(!isAlphabet(str.charAt(r)))
				r--;

			else // Both str[l] and str[r] are not spacial
			{
				//swap(str[l], str[r]);
				l++;
				r--;
			}
		}
	}

	public boolean isAlphabet(char x)
	{
		return ( (x >= 'A' &&  x <= 'Z') ||
				(x >= 'a' &&  x <= 'z') );
		
		//(x>='A' && x<='Z')||(x>='a'&& x<'z')
	}
	
	public void swap(char a, char b){
		char temp;
		temp = a;
		a = b;
		b= temp;
		
	}

	/* Driver program to test above function */
	public static void main(String[] args) 
	{
		String str = "Geek!@s for G$%e%^eks";
		StringReverseRecursive obj = new StringReverseRecursive();
		obj.reverse(str);
	}
}
