package week1.day2.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class DescendingArray {

	public static void main(String[] args) {	
		
	int[] data = {3,2,11,4,6,7};
	int[] dataAsc= new int[6];
	int[] dataDes= new int[6];
	Arrays.sort(data);
	
	
	
	System.out.println("Ascending order:" +Arrays.toString(data) );
	
	//Descending order		
		
//Option # 1
		System.out.println("Descending order Option1 are:");
		for (int k =data.length-1; k>=0;k--)
		{
			
			System.out.println(data[k]);
		}

	
//Option # 2
				System.out.println("Descending order Option2 are:");
				for (int i =data.length-1; i>=0;i--)
				{
					dataDes[i]= data[i];
				}
					
				System.out.println(Arrays.toString(dataDes));
				
//Option # 3	
		//Arrays.sort(data,Collections.reverseOrder());
		//System.out.println("Descending order Option3 are:"+Arrays.toString(data));
//Option # 4
		//	Arrays.sort(data);	
		//reverse(data);
		//System.out.println("Descending order Option3 are:"+Arrays.toString(data));		
	}
}
