//Bhushan Chavan
package com.jspiders.cardekho_case_study.main;

import java.util.*;

import com.jspiders.cardekho_case_study.operation.CarOperation;


public class CarDekhoMenu{
	private static CarOperation operation=new CarOperation();
	private static boolean loop=true;
	
	public static void main(String[] args) {
		while(loop){
		CarDekhoMenu();
		}
	}
	private static void CarDekhoMenu(){
		System.out.println("\n=============================Menu=============================\n"
				+ "1. Add Car Details\n"
				+ "2. Search Car Details\n"
				+ "3. Update Car Details\n"
				+ "4. Delete Car Details\n"
				+ "5. Display All Cars Details\n"
				+ "6. Exit"
				);
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("===============================================================\n");
		System.out.printf("Enter Your Choice:");
		int choice1=scanner.nextInt();
	
		switch(choice1){
		case 1:
			System.out.println("===============================================================\n");
			System.out.println("How Many Cars You Want to Add?");
			operation.addCars();
			break;
			
		case 2:
			System.out.println("============================Menu===========================\n"
					+ "1. Search By Car Name\n"
					+ "2. Search By Car Model\n"
					+ "3. Search By Car Brand\n"
					+ "4. Search By Car FuelType[Petrol/Diesel]\n"
					+ "5. Go Back to Main Menu"
					);
			System.out.println("\nEnter Your Choice:");
			Scanner sc=new Scanner(System.in);
			int choice3=sc.nextInt();
			switch(choice3){
			case 1:
				operation.SearchByname();
				break;
			case 2:
				operation.SearchByModel();
				break;
			case 3:
				operation.SearchByBrand();
				break;
			case 4:
				operation.SearchByFuelType();
				break;	
			case 5:
				CarDekhoMenu();
				break;
			}	
			break;
			
		case 3:
			operation.updateCar();
			break;
		case 4:
			operation.deleteCar();
			break;
		case 5:
			operation.getAllCarDetails();
			break;
		case 6:
			System.out.println("**************Thank You!!!************");
			loop=false;
			scanner.close();
			break;
			
		default:
			System.out.println("Incorrect Input!! Try Again!!!");
		}
		
	};
}