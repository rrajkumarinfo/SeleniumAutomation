package week3.day2.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {4,3,6,8,29,1,2,4,7,8};
		Set<Integer> dup1=new LinkedHashSet<Integer>();
		System.out.println("Orginal array are "+Arrays.toString(data));		
		for (int i=0;i<data.length ;i++)
		{
			boolean valDup=dup1.add(data[i]);
			if (valDup == false)
			{	System.out.println("Duplicate are "+data[i]);}
		
	
		}
		System.out.println("Set are "+dup1);
	}

}
