package week3.day2.assignment2;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] values = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		int len = values.length;
		System.out.println("length of the array " + len);
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
	for (int i = 3; i >= 0; i--) 
	{
			System.out.println(values[i]);
			
		}
	
	
	}

}
