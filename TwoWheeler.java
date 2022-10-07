package week1.day2.assignments;

public class TwoWheeler {
public static void main(String[] args) {
TwoWheeler obj = new TwoWheeler ();

int noOfWheels= obj.noOfWheels(1);
	System.out.println("Number of Wheels are :" +noOfWheels);

short noOfMirrors=obj.noOfMirrors();
	System.out.println("no Of Mirrors are :" +noOfMirrors);
long chassisNumber=obj.chassisNumber(123456789l);
	System.out.println("chassis Number is :" +chassisNumber);
	
boolean isPunctured =obj.isPunctured(false);
	System.out.println("Vehicle is Punctured:" +isPunctured);
	
String bikeName=obj.bikeName("Passion Pro");
	System.out.println("my bike Name  is :" +bikeName);
	
double runningKM = obj.runningKM(987456321.54);
	System.out.println("running KM are :" +runningKM);
	
}

	public int noOfWheels(int noofWheels){
		return noofWheels;
	
	}
	
	
	public short noOfMirrors() {
		short noOfMirrors = 2;
		return noOfMirrors;
	}
	
	public long chassisNumber (long chassisNumber) {
		return chassisNumber;
	}
	public boolean isPunctured(boolean isPunctured) {
		return isPunctured;
	}
	
	public String bikeName(String bikeName) {
		return bikeName;
	}
	public double runningKM (double runningKM) {
		return runningKM;
	}

	
	
}

