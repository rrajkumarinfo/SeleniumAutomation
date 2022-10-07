package week1.day2.assignments;

import java.util.Scanner;

public class CheckIfTheNumberIsPositiveOrNegative {
public static void main(String[] args) {
	//int number= 35;
	int number;
	Scanner sc=new Scanner(System.in);
	System.out.print("Input the number =" );	
	number = sc.nextInt();
	
	
	
	if (number >0)
		System.out.println("The number is positive" );
	else if (number <0)
		System.out.println("The number is negative" );		
	else
		System.out.println("The number is neither positive nor negative" );

}
}

