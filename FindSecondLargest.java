package week1.day2.assignments;

import java.util.Arrays;

public class FindSecondLargest {
public static void main(String[] args) {
	int[] data = {3,2,11,4,6,7};
	int[] dataAsc= new int[6];
	
	Arrays.sort(data);
//Ascending order	
	//Option #1
	System.out.println("Ascending order - Option #1:");
	for (int i =0; i<data.length;i++)
		  System.out.println(data[i]);
	System.out.println("----------------------------");
	
	//Option #2
	for (int j =0; j<data.length;j++)
		dataAsc[j]= data[j];  
		System.out.println("Ascending order - Option #2:"+ Arrays.toString(dataAsc));
		
	System.out.println("----------------------------");
	//Option #3
	System.out.println("Ascending order - Option #3:"+ Arrays.toString(data));
	
	System.out.println("----------------------------");
//2nd element from the last is	
	System.out.println("2nd element from the last is :" + data[data.length-2]);
	
	System.out.println("----------------------------");


	
}
	

	
	
	
}
