package com.masai.Ui;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import com.masai.Dao.BatchDao;
import com.masai.Dao.BatchDaoImpl;
import com.masai.Dao.CourseDao;
import com.masai.Dao.CourseDaoImpl;
import com.masai.Dto.Batchseat;
import com.masai.Dto.BatchseatImpl;
import com.masai.Dto.Course;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomethingWentWrongException;

public class BatchUI {
	
	
	
	
	static void addBatchUI(Scanner sc) {
	
		System.out.print("Enter batch name");
		String batchname = sc.next();
		
		System.out.print("Enter course id ");
		int  cid = sc.nextInt();
		
		System.out.print("Enter Coursename ");
		String coursename = sc.next();
		
		System.out.print("Enter total seats ");
		
		 int totalseats = sc.nextInt();
		
		
        System.out.print("Enter seatsFilled ");
		
		 int seatsFilled = sc.nextInt();
		
		
        System.out.print("Enter startdate ");
		
        LocalDate startdate = LocalDate.parse(sc.next());
        
        
        
        System.out.print("Enter enddate ");
		
        LocalDate enddate= LocalDate.parse(sc.next());
		
		
		
		
		
		
		Batchseat batch = new BatchseatImpl(batchname,cid,coursename,totalseats,seatsFilled,startdate, enddate,false);
		
		BatchDao batchdao = new BatchDaoImpl();
		
		try {
			batchdao.addbatch(batch);	
			System.out.println(" Batch added successfully");
		}catch(SomethingWentWrongException ex) {
			System.out.println(ex);
		}
		
	}

	
	static void searchbatchbybatchnameUi(Scanner sc) {
		System.out.print("Enter batch name ");
		String bname = sc.next();
		
		BatchDao brDAO = new BatchDaoImpl();
		try {
			List<Batchseat> brList =brDAO.searchbatachbybatchname(bname);
			Consumer<Batchseat> con = cr -> System.out.println("Batch name " + cr.getBatchname() + " Course id" + cr.getcId()
			+ "Course name " + cr.getCoursename() + " totalseats " + cr.getTotalSeats()+" seatFiiled"+cr.getSeatsFilled()+" startdate"+cr.getStartdate()+" enddate "+cr.getEndDate());
			brList.forEach(con);
		}catch(SomethingWentWrongException | NoRecordFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	static void searchbatchbystartdateUi(Scanner sc) {
		System.out.print("Enter start date ");
		LocalDate date = LocalDate.parse(sc.next());
		
		BatchDao brDAO = new BatchDaoImpl();
		try {
			List<Batchseat> brList =brDAO.searchbatchbystartrange(date);
			Consumer<Batchseat> con = cr -> System.out.println("Batch name " + cr.getBatchname() + " Course id" + cr.getcId()
			+ "Course name " + cr.getCoursename() + " totalseats " + cr.getTotalSeats()+" seatFiiled"+cr.getSeatsFilled()+" startdate"+cr.getStartdate()+" enddate "+cr.getEndDate());
			brList.forEach(con);
		}catch(SomethingWentWrongException | NoRecordFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	

	static void searchbatchbyenddate(Scanner sc) {
		System.out.print("Enter end date");
		LocalDate date = LocalDate.parse(sc.next());
		
		BatchDao brDAO = new BatchDaoImpl();
		try {
			List<Batchseat> brList =brDAO.searchbatchbyenddate(date);
			Consumer<Batchseat> con = cr -> System.out.println("Batch name " + cr.getBatchname() + " Course id" + cr.getcId()
			+ "Course name " + cr.getCoursename() + " totalseats " + cr.getTotalSeats()+" seatFiiled"+cr.getSeatsFilled()+" startdate"+cr.getStartdate()+" enddate "+cr.getEndDate());
			brList.forEach(con);
		}catch(SomethingWentWrongException | NoRecordFoundException ex) {
			System.out.println(ex.getMessage());
		}
	
	}
	
	static void searchbatchbycoursenameUi(Scanner sc) {
		System.out.print("Enter course name ");
		String bname = sc.next();
		
		BatchDao brDAO = new BatchDaoImpl();
		try {
			List<Batchseat> brList =brDAO.searchbatachbybatchname(bname);
			Consumer<Batchseat> con = cr -> System.out.println("Batch name " + cr.getBatchname() + " Course id" + cr.getcId()
			+ "Course name " + cr.getCoursename() + " totalseats " + cr.getTotalSeats()+" seatFiiled"+cr.getSeatsFilled()+" startdate"+cr.getStartdate()+" enddate "+cr.getEndDate());
			brList.forEach(con);
		}catch(SomethingWentWrongException | NoRecordFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	static void updateBatchUI(Scanner sc) {
	
     System.out.print("Enter course id ");
		int cid = sc.nextInt();
		
		System.out.print("Enter  Batchname  ");
		String name = sc.next();
		
		
		System.out.print("Enter  Coursename  ");
		String Cname = sc.next();
		
		System.out.print("Enter  totalSeats ");
		int  totalSeats = sc.nextInt();
		
		System.out.print("Enter seatfilled ");
		int  seatsFilled = sc.nextInt();
		
		System.out.print("Enter  startdate ");
		LocalDate startDate = LocalDate.parse(sc.next());	
		
		System.out.print("Enter  enddate ");
		LocalDate enddate = LocalDate.parse(sc.next());
		
		
		Batchseat batch = new BatchseatImpl(name,cid,Cname,totalSeats,seatsFilled,startDate,enddate,false);
		
		BatchDao batchDAO = new BatchDaoImpl();
		try {
			
			 batchDAO.updateBatch(batch);
			
			System.out.println("batch updated successfully");
		}catch(SomethingWentWrongException ex) {
			
			System.out.println(ex);
		}
	}
	
}
