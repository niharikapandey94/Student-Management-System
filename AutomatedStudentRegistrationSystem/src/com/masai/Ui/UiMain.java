package com.masai.Ui;



	
	import java.util.Scanner;



	public class UiMain {
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int choice = 0;
			do {
				System.out.println("1. Admin Login\n2.Student  Sign Up\n3.Student Login \n0 Exits\nEnter selection");
				choice = sc.nextInt();
				switch(choice) {
					case 0:
						System.out.println("Thank you, Visit again");
						break;
					case 1:
						AdminUi.adminLogin(sc);
						break;
					case 2:
						StudentUi.addStudentUI(sc);
						break;
				    case 3:
					StudentUi.loginstudentUI(sc);
					break;
//					case 4:
//						StudentUi.UpdatepasswordUi(sc);
//						break;
					case 5:
					
						break;
						
					default:
						System.out.println("Invalid Selection, try again");
				}
			}while(choice != 0);
			sc.close();
		}

		
	}

