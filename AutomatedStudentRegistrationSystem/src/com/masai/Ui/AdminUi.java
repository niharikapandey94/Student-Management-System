package com.masai.Ui;

import java.util.Scanner;

public class AdminUi {
	
	
	
	
	
	static void displayAdminMenu() {
		System.out.println("0. Log out Admin");
		System.out.println("1. Add new Courses ");
		System.out.println("2. Search by Coursename");
		System.out.println("3. Search by Course Duration");
		System.out.println("4. Search by Course fee");
		System.out.println("5. Add batchcourse");
		System.out.println("6. Search  batch by batchname");
		System.out.println("7. Search batch  by coursename");
		System.out.println("8.Search batch by startdate ");
		System.out.println("9. Search batch by endadate");
		System.out.println("10. upadte batch");
		System.out.println("11. viewstudent");
		System.out.println("12. viewstudentwithbatch");
	}
	
	static void adminMenu(Scanner sc) {
		int choice = 0;
		do {
			displayAdminMenu();
			System.out.print("Enter selection ");
			choice = sc.nextInt();
			switch(choice) {
				case 0:
					System.out.println("Bye Bye admin");
					break;
				case 1:
					CourseUi.addCourseUI(sc);
					break;
				case 2:
					CourseUi.searchCoursebyCoursenameUi(sc);
					break;
				case 3:
					CourseUi.searchCoursebyDurationUi(sc);
					break;
				case 4:
					CourseUi.searchCoursebyFeesUi(sc);
					break;
				case 5:
					BatchUI.addBatchUI(sc);
					break;
				case 6:
					BatchUI.searchbatchbybatchnameUi(sc);
					break;
				case 7:
					BatchUI.searchbatchbycoursenameUi(sc);
					break;
				case 8:
					BatchUI.searchbatchbystartdateUi(sc);
					break;
					
				case 9:
					BatchUI.searchbatchbyenddate(sc);
					break;
				case 10:
					BatchUI.updateBatchUI(sc);
					break;	
					
				case 11:
					StudentUi.viewStudent();
					break;	
				case 12:
					StudentUi.viewStudentwithbatch();
					break;	
					
					
				default:
					System.out.println("Invalid Selection, try again");
			}
		}while(choice != 0);
	}
	
	static void adminLogin(Scanner sc) {
		System.out.print("Enter username ");
		String username = sc.next();
		System.out.print("Enter password ");
		String password = sc.next();
		
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			adminMenu(sc);
		}else {
			System.out.println("Invalid Username and Password");
		}
	}
	static void displayUserMenu() {
		System.out.println("1. Update Password");
		System.out.println("2.Available course list");
		System.out.println("3. Available Batches");
		System.out.println("4. Register in the batch");
		
		System.out.println("5. Delete My Account");
		System.out.println("0. Logout");
	
	}
	static void StudentMenu(Scanner sc) {
		int choice = 0;
		do {
			displayUserMenu();
			System.out.print("Enter selection ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					StudentUi.UpdatepasswordUi(sc);
					break;
				case 2:
				CourseUi.searchAvailablecourseUi(sc); 
					break;
				case 3:
					BatchUI.searchAvailablebatchUi(sc);
					break;
				case 4:
					StudentUi.RegisterstudentUI(sc);
					break;
				case 5:
					StudentUi.deleteUi(sc);
					break;
			
					
				case 0:
					StudentUi.Studentlogout();
					break;
				default:
					System.out.println("Invalid Selection, try again");
			}
		}while(choice != 0);
	}
}


