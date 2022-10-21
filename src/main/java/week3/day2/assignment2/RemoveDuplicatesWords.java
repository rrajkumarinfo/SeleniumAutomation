package week3.day2.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

public class RemoveDuplicatesWords {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		
		System.out.println("Orginal Text is "+"' "+ text+" ' ");
		System.out.println("----------------------------");
		String[] splt = {};
		splt = text.split(" ");
		int siz=splt.length;
		System.out.println("split text size is " + siz);
		System.out.println("split text is " + Arrays.toString(splt));
		System.out.println("----------------------------");
		
		
		Set<String> rmDupl=new LinkedHashSet<String>();
		
		for (int i=0 ;i <siz;i++) {
			
			rmDupl.add(splt[i])	;		
		}
		System.out.println("After removal - Now text size is " + rmDupl.size());
		System.out.println("After removal of duplicates are " + rmDupl);
	
		
		
		
		
	}

}
