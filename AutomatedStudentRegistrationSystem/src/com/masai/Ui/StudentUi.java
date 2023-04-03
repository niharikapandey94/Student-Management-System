package com.masai.Ui;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import com.masai.Dao.CourseDao;
import com.masai.Dao.CourseDaoImpl;
import com.masai.Dao.StudentDao;
import com.masai.Dao.StudentDaoimpl;
import com.masai.Dao.Studentrecorddao;
import com.masai.Dao.Studentrecorddaoimpl;
import com.masai.Dto.Course;
import com.masai.Dto.CourseImpl;
import com.masai.Dto.Student;
import com.masai.Dto.StudentImpl;
import com.masai.Dto.Studentrecord;
import com.masai.Dto.StudentrecordImpl;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomethingWentWrongException;

public class StudentUi {
	
	
	
	static void addStudentUI(Scanner sc) {
		
		System.out.print("Enter first_Name");
		String  first_Name = sc.next();
		
		System.out.print("Enter last name ");
		String last_name = sc.next();
		
		System.out.print("Enter address");
		
		String address = sc.next();
		
		System.out.print("Enter mobile_no");
		String mobile_no = sc.next();
		
		
		System.out.print("Enter email ");
		String  email = sc.next();
		System.out.print("Enter password");
		String  password= sc.next();
		
		
		
		
		
		
		
		
		
		Student stu = new StudentImpl(first_Name,last_name,address,mobile_no,email,password,false);
		
		StudentDao stuDAO = new StudentDaoimpl();
		
		try {
			stuDAO.addRegister(stu);
			System.out.println("Student added successfully");
			 
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
			result = StuDAO.loginstudent(email,password);
			System.out.println(result);
			 AdminUi.StudentMenu(sc);
	} catch (SomethingWentWrongException e) {
//			System.out.println("something wrong");
		e.printStackTrace();
		
	} catch (NoRecordFoundException e){
			
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
     
     
     static void deleteUi(Scanner sc) {
    	 System.out.print("Enter email");
    		String email = sc.next();
    		
    		
    		
    		
    		
    		Student  stu = new  StudentImpl(email);
    		
    		StudentDao stuDAO = new StudentDaoimpl();
    		
    		try {
    			stuDAO.delete(stu);
    			System.out.println("account deleted successfully");
    		}catch(SomethingWentWrongException ex) {
  			System.out.println(ex);
  		}
    	 
     }
     
     static void RegisterstudentUI(Scanner sc) {
 		
 		System.out.print("Enter Batch_Name");
 		String  Batchname = sc.next();
 		
 		System.out.print("Enter cid ");
 		int cid = sc.nextInt();
 		
 		System.out.print("Enter bid ");
 		int bid = sc.nextInt();
 		
 		System.out.print("Enter email");
 		
 		String email = sc.next();
 		
 		System.out.print("Enter father name");
 		String father = sc.next();
 		
 		
 		System.out.print("Enter Mother name ");
 		String Mother = sc.next();
 		
 		
 		System.out.print("Enter 10th percentage ");
 		Double tenth = sc.nextDouble();
 		
 		System.out.print("Enter 12th percentage ");
 		Double twelth = sc.nextDouble();
 		
 		System.out.print("Enter Gender");
 		String  Gender= sc.next();
 		
 		
Studentrecord stu = new StudentrecordImpl(Batchname,cid,bid,email,father,Mother,tenth,twelth,Gender);
 		
 		Studentrecorddao stuDAO = new Studentrecorddaoimpl();
 		
 		try {
 			stuDAO.Resigterstudent(stu);
 			System.out.println("Student register successfully");
 			 
 		}catch(SomethingWentWrongException ex) {
			System.out.println(ex);
		}
		
 		
 	}
     static void Studentlogout() {
    	 UiMain.main(null);
    	 
     }
     static void viewStudentwithbatch() {
 		
 		Studentrecorddao studao = new Studentrecorddaoimpl();
 		try {
 			List<Student> empList = studao.getStudentList();
 			Consumer<Student> con = emp -> System.out.println("firstname " + emp.getFirsttName() + " lastName " + emp.getLastName()
 			+ " address " + emp.getAddress() + " mobile_no " + emp.getMobile_no()+" email"+emp.getsEmail()+"x"+emp.getStudentrecordImpl());
 			empList.forEach(con);
 		}catch(SomethingWentWrongException | NoRecordFoundException ex) {
 			System.out.println(ex.getMessage());
 		}
 	}
 	
     static void viewStudent() {
  		
  		Studentrecorddao studao = new Studentrecorddaoimpl();
  		try {
  			List<Student> empList = studao.getStudentList();
  			Consumer<Student> con = emp -> System.out.println("firstname " + emp.getFirsttName() + " lastName " + emp.getLastName()
  			+ " address " + emp.getAddress() + " mobile_no " + emp.getMobile_no()+" email"+emp.getsEmail());
  			empList.forEach(con);
  		}catch(SomethingWentWrongException | NoRecordFoundException ex) {
  			System.out.println(ex.getMessage());
  		}
  	} 

}


