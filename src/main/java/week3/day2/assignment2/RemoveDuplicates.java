package week3.day2.assignment2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String val1 = "PayPal India";
		char[] charvalus = val1.toCharArray();

		System.out.println("Orginal Text is " + "' " + val1 + " ' ");
		System.out.println("----------------------------");

		System.out.println("convert from string to Char" + Arrays.toString(charvalus));

		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		for (int i = 0; i < charvalus.length - 1; i++) 
		{

			if (charvalus[i] != ' ') 
			{
					if (charSet.add(charvalus[i]) == true) 
					{
						charSet.add(charvalus[i]);
					}
	
					else 
					{
						dupCharSet.add(charvalus[i]);
						charSet.remove(charvalus[i]);
					}
			}

		}

		System.out.println("First version of char set1 " + charSet);
		System.out.println("Duplicate char set1 " + dupCharSet);

	}

}
