package com.masai.Ui;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import com.masai.Dao.CourseDao;
import com.masai.Dao.CourseDaoImpl;
import com.masai.Dto.Course;
import com.masai.Dto.CourseImpl;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomethingWentWrongException;

public class CourseUi {
	
	static void addCourseUI(Scanner sc) {
		
		System.out.print("Enter course id ");
		int cid = sc.nextInt();
		
		System.out.print("Enter course name ");
		String name = sc.next();
		
		System.out.print("Enter fees ");
		int fees = sc.nextInt();
		
		System.out.print("Enter courseinfo");
		String Cinfo= sc.next();
		
		System.out.print("Enter duration in year ");
		int Dur = sc.nextInt();
		
		
		Course cr = new CourseImpl(cid,name,fees,Cinfo,Dur,false);
		
		CourseDao crDAO = new CourseDaoImpl();
		
		try {
			crDAO.addcourse(cr);
			System.out.println("Course added successfully");
		}catch(SomethingWentWrongException ex) {
			System.out.println(ex);
		}
		
	}
	static void searchCoursebyCoursenameUi(Scanner sc) {
		System.out.print("Enter course name ");
		String Cname = sc.next();
		
		CourseDao crDAO = new CourseDaoImpl();
		try {
			List<Course> crList =crDAO.searchCoursebycoursename(Cname);
			Consumer<Course> con = cr -> System.out.println("Course Id " + cr.getcId() + " Name " + cr.getCname()
			+ "Course info " + cr.getcInfo() + " Course Fees " + cr.getFees()+" duration_in_years"+cr.getDuration_course_in_Y());
			crList.forEach(con);
		}catch(SomethingWentWrongException | NoRecordFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	static void searchCoursebyDurationUi(Scanner sc) {
		System.out.print("Enter course duration ");
		int duration = sc.nextInt();
		
		CourseDao crDAO = new CourseDaoImpl();
		try {
			List<Course> crList =crDAO.searchCoursebydurationrange(duration);
			Consumer<Course> con = cr -> System.out.println("Course Id " + cr.getcId() + " Name " + cr.getCname()
			+ "Course info " + cr.getcInfo() + " Course Fees " + cr.getFees()+" duration_in_years"+cr.getDuration_course_in_Y());
			crList.forEach(con);
		}catch(SomethingWentWrongException | NoRecordFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
	

	
	static void searchAvailablecourseUi(Scanner sc) {
		
		
		CourseDao crDAO = new CourseDaoImpl();
		try {
			List<Course> crList =crDAO.AvailableCourse();
			Consumer<Course> con = cr -> System.out.println("Course Id " + cr.getcId() + " Name " + cr.getCname()
			+ "Course info " + cr.getcInfo() + " Course Fees " + cr.getFees()+" duration_in_years"+cr.getDuration_course_in_Y());
			crList.forEach(con);
		}catch(SomethingWentWrongException | NoRecordFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	static void searchCoursebyFeesUi(Scanner sc) {
		System.out.print("Enter course fee ");
		int fee= sc.nextInt();
		
		CourseDao crDAO = new CourseDaoImpl();
		try {
			List<Course> crList =crDAO.searchCoursebyFeerange(fee);
			Consumer<Course> con = cr -> System.out.println("Course Id " + cr.getcId() + " Name " + cr.getCname()
			+ "Course info " + cr.getcInfo() + " Course Fees " + cr.getFees()+" duration_in_years"+cr.getDuration_course_in_Y());
			crList.forEach(con);
		}catch(SomethingWentWrongException | NoRecordFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	static void updateCourseUI(Scanner sc) {
		
		System.out.print("Enter course id ");
		int cid = sc.nextInt();
		
		System.out.print("Enter Course name ");
		String name = sc.next();
		
		System.out.print("Enter fees");
		int fees = sc.nextInt();
		
		System.out.print("Enter Course info ");
		String Cinfo = sc.next();
		
		System.out.print("Enter  duration_in_years ");
		 int  dur = sc.nextInt();
		 
		
		
		
		Course cr = new CourseImpl(cid,name,fees,Cinfo,dur,false);
		
		
		CourseDao crDAO = new CourseDaoImpl();
		try {
			
			crDAO.updateCourseDetails(cr);
			
			System.out.println("Course updated successfully");
		}catch(SomethingWentWrongException ex) {
			
			System.out.println(ex);
		}
	}
	
}
