package org.student;

import org.college.College;
import org.department.Department;

public class Student  {
	public void studentName() {
		System.out.println(" Rajkumar");
	}

	public void studentDept() {
		System.out.println(" studentDept is 'IT' ");
	}

	public void studentId() {
		System.out.println(" studentId is '104982' ");
	}
	
	
	public static void main(String[] args) {
		
		College coll= new College();
		coll.collegeName();
		coll.collegeCode();
		coll.collegeRank();
		
		Department dept= new Department();
		dept.deptName();
	
		
		
	}
	
	
}
