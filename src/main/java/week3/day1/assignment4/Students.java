package week3.day1.assignment4;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("id is " + id);
	}

	public void getStudentInfo(int id, String name) {

		System.out.println("id is " + id + " and Name is " + name);

	}

	public void getStudentInfo(String email, int phone) {
		System.out.println("email is " + email + " and phone is " + phone);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students stu = new Students();
		stu.getStudentInfo(12);
		stu.getStudentInfo(12, "Raj");
		stu.getStudentInfo("raj@mgai.com", 305123450);

	}

}
