package week1.day2.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
		int inpVal=153;
		int calculated=0;
		int remainder,original;
		original=inpVal;
		while (inpVal>0) {
			remainder=inpVal%10;
			inpVal=inpVal/10;
			calculated=calculated+(remainder*remainder*remainder);
			}
		if(original==calculated)
			System.out.println("Given Number " +original + " is Armstrong number");
		else 
			System.out.println("Given Number " +original + " is NOT an Armstrong number");
	}
}
