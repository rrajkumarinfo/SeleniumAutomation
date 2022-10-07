package week1.day2.assignments;

public class SumOfDigits {
	public static void main(String[] args) {
		int inpNumber=123;
		int sum=0;
		while (inpNumber>0)
		{
			int reminder=(inpNumber%10);
			System.out.println("Reminder:"+reminder);
			sum=sum+reminder;
			System.out.println("sum and reminder:"+sum);
			inpNumber=(inpNumber/10);
			System.out.println("New input number as quotient:"+inpNumber);
			
		}
		System.out.println("Final sum:"+sum);
		
	}

}
