package week3.day2.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int[] data = { 1, 3, 8, 4, 5, 7, 8, 3, 10 };
		Set<Integer> set1 = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) 
		{
			set1.add(data[i]);

		}
		
		System.out.println("Covert array from Set remove duplicate and asending order" + set1);

		List<Integer> list1 = new ArrayList<Integer>(set1);
		System.out.println("Covert Set from List " + list1);
		int lenList1 = list1.size();
		System.out.println("List length is :" + lenList1);
		System.out.println("Missing number are :" );
			for (int j = 0; j < lenList1-1; j++) 
			{
						if (!list1.get(j).equals(list1.get(j + 1) - 1)) 
						//if (list1.get(j)!=(list1.get(j + 1) - 1))	
						{
							
							System.out.println((list1.get(j + 1) - 1));
						}
				}

		}
	}


