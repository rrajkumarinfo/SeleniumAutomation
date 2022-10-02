package week1.day1;

public class HomeWorkFactorial {
	public static void main(String[] args) {
		
		
		int factorialNum =5;
		int factVal =1;
		int i;
					
		for (i=factorialNum; i >=1 ;i--) {
			factVal=i*factVal;
			
		}
		System.out.println("Factorial result of " + factorialNum + "! is "+ factVal);
		
		
	}

}
