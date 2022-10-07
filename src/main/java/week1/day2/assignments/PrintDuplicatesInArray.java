package week1.day2.assignments;

import java.util.Arrays;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {	
	
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20,18};
	int len=arr.length;
	System.out.println("length of the array:"+len);
	int count;
	for (int i=0;i<len-1;i++)
	{
	count=0;
		for (int j=i;j<len-1;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				
			}
		}
		if (count>1)
		{
		System.out.println("print the first array variable" + arr[i] );
		System.out.println("Count of " + arr[i] + " Duplicate = " + count );
	
		}
		
	}
	}
}
