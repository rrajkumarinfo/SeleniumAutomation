package week3.day2.assignment2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String val1="PayPal India";
		char[] charvalus = val1.toCharArray();
		
		
		System.out.println("Orginal Text is "+"' "+ val1+" ' ");
		System.out.println("----------------------------");
			
		System.out.println("convert from string to Char"+Arrays.toString(charvalus));
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		
		
		for (int i =0; i<charvalus.length-1;i++ )
		{
			if (charSet.add(charvalus[i])==true)
					{charSet.add(charvalus[i]);
				
				
					}
			else
				{dupCharSet.add(charvalus[i]);}
			
			
		}
		System.out.println("First version of char set"+charSet);
		System.out.println("Duplicate char set"+ dupCharSet);	
		

		
	}

}
