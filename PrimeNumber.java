package week1.day2.assignments;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
				int inputVal=19;
				double halfIn=inputVal/2;

				boolean flag =false;
		
				

		// Iterate from 2 to half of the input

			for (int i=2;i<halfIn;i++)	

			{
				int rem=(inputVal%i);
					if (rem==0)
					{
						flag = true;
						break;			
					}
					
					
					
			}
			if (flag)
				System.out.println("Not prime number");
				else 
				System.out.println("Prime number");	
					
	}
	
	
}
