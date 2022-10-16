package week3.day1.assignment3;

public class AxisBank extends BankInfo{

	
	public void deposit() {
		System.out.println(" Axis deposit ac ");
	}
	
	public void bankDeposit() {
		
		this.deposit();
	
		super.deposit();
	}
	public static void main(String[] args) {
	AxisBank ax= new AxisBank();	
	
	BankInfo ban=new BankInfo();
	System.out.println("this Axis deposit");
	ax.deposit();
	System.out.println("Super is Bankinfo deposit");
	ban.deposit();
	
	}

}
