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
		System.out.println("1. View All Products");
		System.out.println("2. Purchase a Product");
		System.out.println("3. View Order History");
		System.out.println("4. Update My Name");
		System.out.println("5. Update My Password");
		System.out.println("6. Delete My Account");
		System.out.println("0. Logout");
	}
	
	static void userLogin(Scanner sc) {
//		if(!UserUI.login(sc))
//			return;

		//you are here means login is successful
		int choice = 0;
		do {
			displayUserMenu();
			System.out.print("Enter selection ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					//productUI.viewAllProducts();
					break;
				case 2:
//					OrderUI.purchase(sc);
					break;
				case 3:
					//orderUI.viewOrderDetails();
					break;
				case 4:
					//userUI.updateNameOfUser();
					break;
				case 5:
					//userUI.changePassword();
					break;
				case 6:
					//userUI.deleteUser();
				case 0:
//					UserUI.logout();
					break;
				default:
					System.out.println("Invalid Selection, try again");
			}
		}while(choice != 0);
	}

}
