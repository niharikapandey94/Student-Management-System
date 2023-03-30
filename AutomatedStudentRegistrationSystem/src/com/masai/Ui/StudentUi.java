package com.masai.Ui;

import java.util.Scanner;

import com.masai.Dao.CourseDao;
import com.masai.Dao.CourseDaoImpl;
import com.masai.Dao.StudentDao;
import com.masai.Dao.StudentDaoimpl;
import com.masai.Dto.Course;
import com.masai.Dto.CourseImpl;
import com.masai.Dto.Student;
import com.masai.Dto.StudentImpl;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomethingWentWrongException;

public class StudentUi {
	
	
	
	static void addStudentUI(Scanner sc) {
		
		System.out.print("Enter first_Name");
		String  first_Name = sc.next();
		
		System.out.print("Enter last name ");
		String last_name = sc.next();
		
		System.out.print("Enter address ");
		String address = sc.next();
		
		System.out.print("Enter mobile_no");
		int mobile_no = sc.nextInt();
		
		System.out.print("Enter email ");
		String  email = sc.next();
		
		System.out.print("Enter password ");
		String  password= sc.next();
		
		Student stu = new StudentImpl(first_Name,last_name,address,password,email,mobile_no,false);
		
		StudentDao stuDAO = new StudentDaoimpl();
		
		try {
			stuDAO.addRegister(stu);
			System.out.println("Course added successfully");
		}catch(SomethingWentWrongException | NoRecordFoundException ex) {
			System.out.println(ex);
		}
		
	}
	
public static void loginstudentUI(Scanner sc) {
	

	System.out.print("Enter email");
	String email = sc.next();
	System.out.print("Enter password");
	String password= sc.next();
	StudentDao StuDAO = new StudentDaoimpl();
	
	String result;
		try {
			result = StuDAO.loginstudent(email, password);
			 System.out.println(result);
		} catch (SomethingWentWrongException e) {
			System.out.println("somthing wrong");
			
		} catch (NoRecordFoundException e) {
			System.out.println("Invalid Credential");
		}	
	      
	
		

	
}
     
     static void UpdatepasswordUi(Scanner sc) {
    	 System.out.print("Enter email");
    		String email = sc.next();
    		
    		System.out.print("Enter  new password ");
    		String password = sc.next();
    		
    		
    		Student  stu = new  StudentImpl(email,password);
    		
    		StudentDao stuDAO = new StudentDaoimpl();
    		
    		try {
    			stuDAO.Updatepassword(stu);
    			System.out.println("password updated successfully");
    		}catch(SomethingWentWrongException ex) {
    			System.out.println(ex);
    		}
    	 
     }

}


