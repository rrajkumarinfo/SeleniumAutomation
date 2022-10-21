package week3.day2.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		System.out.println("orginal data set" + Arrays.toString(data));
		System.out.println("------------");
		Set<Integer> set1=new TreeSet<Integer>();
		for (int i =0 ; i< data.length ; i++)
		{
			set1.add(data[i]);
			
		}
		
	
		System.out.println("Added set from array data set" + set1);
		
		List<Integer> list1 = new ArrayList<Integer>(set1);
		
		System.out.println("------------");
		System.out.println("Convert List from set " + list1);
		

		int lisSize=list1.size();
		System.out.println("------------");
		System.out.println("total List size is " + lisSize);
		
		System.out.println("second last element from List is " +list1.get(lisSize-2));
		
	}

}
