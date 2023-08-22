//Bhushan Chavan
package com.jspiders.cardekho_case_study.operation;

import java.util.*;

import com.jspiders.cardekho_case_study.entity.Car;

public class CarOperation {
	private List<Car> cars=new ArrayList<Car>();
	
	public void addCars(){
		Scanner scanner =new Scanner(System.in);
		int choice=scanner.nextInt();
		for(int i=1;i<=choice;i++){
			Car car=new Car();
			System.out.println("\nEnter Car id: ");
			car.setCar_id(scanner.nextInt());
			System.out.println("\nEnter Car Name: ");
			car.setName(scanner.next());
			System.out.println("\nEnter Car Model: ");
			car.setModel(scanner.next());
			System.out.println("\nEnter Car Brand: ");
			car.setBrand(scanner.next());
			System.out.println("\nEnter Car Fuel Type: ");
			car.setFuel_type(scanner.next());
			System.out.println("\nEnter Car Price: ");
			car.setPrice(scanner.nextDouble());
			cars.add(car);
			System.out.println("\n"+car.getName()+" added!!\n");
		}
		getAllCarDetails();
	}
	
	public void getAllCarDetails(){
		if(cars.isEmpty()){
			System.out.println("No Car Details Found!!! ");
		}
		else{
			System.out.println("===============================================================");
			System.out.println("Total Cars: "+cars.size());
			System.out.println("===============================================================");
			System.out.println("ID\t"+"Name\t"+"Model\t"+"Brand\t"+"Fuel Type\t"+"Price");
			System.out.println("===============================================================");
			for(Car car:cars){
				System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getModel()+"\t"+car.getBrand()+"\t"+car.getFuel_type()+"\t\t"+car.getPrice());
			}
		}
	}

	public void SearchByname() {
		getAllCarDetails();
		if(cars.isEmpty()){
			System.out.println("No Car Details Found!!");
		}
		else{
			Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter Car Name: ");
			String name=sc.next();
			List<Car>allCar=new ArrayList<Car>();
			for(Car car:cars){
				if(car.getName().equalsIgnoreCase(name)){
					allCar.add(car);
					break;
				}
				else{
					System.out.println("Invalid Input!!. Try Again!!");
				}
			}
			System.out.println("===============================================================\n");
			System.out.println("\n"+name+" is Found!!");
			System.out.println("===============================================================\n");
			System.out.println("\nTotal Cars: "+allCar.size());
			System.out.println("===============================================================\n");
			System.out.println("\nID\t"+"Name\t"+"Model\t"+"Brand\t"+"Fuel Type\t"+"Price");
			System.out.println("===============================================================\n");
			for(Car car:allCar){
				System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getModel()+"\t"+car.getBrand()+"\t"+car.getFuel_type()+"\t\t"+car.getPrice());
			}
		}	
	}
	
	public void SearchByBrand() {
		getAllCarDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Car Brand: ");
		String brand=sc.next();
		
		List<Car>allCar=new ArrayList<Car>();
		for(Car car:cars){
			if(car.getBrand().equalsIgnoreCase(brand)){
				allCar.add(car);
				break;
			}
			else{
				System.out.println("Invalid Input. Try Again!!");
			}
		}
		System.out.println("===============================================================\n");
		System.out.println("\n"+brand+" is Found!!");
		System.out.println("===============================================================\n");
		System.out.println("\nTotal Cars: "+allCar.size());
		System.out.println("===============================================================\n");
		System.out.println("\nID\t"+"Name\t"+"Model\t"+"Brand\t"+"Fuel Type\t"+"Price");
		System.out.println("===============================================================\n");
		for(Car car:allCar){
			System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getModel()+"\t"+car.getBrand()+"\t"+car.getFuel_type()+"\t\t"+car.getPrice());
		}
		
	}
	
	public void SearchByFuelType() {
		getAllCarDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Car Fuel Type: ");
		String fuel_type=sc.next();
		
		List<Car>allCar=new ArrayList<Car>();
		for(Car car:cars){
			if(car.getFuel_type().equalsIgnoreCase(fuel_type)){
				allCar.add(car);
				break;
			}
			else{
				System.out.println("Invalid Input. Try Again!!");
			}
		}
		System.out.println("===============================================================\n");
		System.out.println("\n"+fuel_type+" is Found!!");
		System.out.println("===============================================================\n");
		System.out.println("\nTotal Cars: "+allCar.size());
		System.out.println("===============================================================\n");
		System.out.println("\nID\t"+"Name\t"+"Model\t"+"Brand\t"+"Fuel Type\t"+"Price");
		System.out.println("===============================================================\n");
		for(Car car:allCar){
			System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getModel()+"\t"+car.getBrand()+"\t"+car.getFuel_type()+"\t\t"+car.getPrice());
		}	
	}
	
	public void SearchByModel() {
		getAllCarDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Car Model: ");
		String model=sc.next();
		
		List<Car>allCar=new ArrayList<Car>();
		for(Car car:cars){
			if(car.getModel().equalsIgnoreCase(model)){
				allCar.add(car);
				break;
			}
			else{
				System.out.println("Invalid Input. Try Again!!");
			}
		}
		System.out.println("===============================================================\n");
		System.out.println("\n"+model+" is Found!!");
		System.out.println("===============================================================\n");
		System.out.println("\nTotal Cars: "+allCar.size());	
		System.out.println("===============================================================\n");
		System.out.println("\nID\t"+"Name\t"+"Model\t"+"Brand\t"+"Fuel Type\t"+"Price");
		System.out.println("===============================================================\n");
		for(Car car:allCar){
			System.out.println(car.getCar_id()+"\t"+car.getName()+"\t"+car.getModel()+"\t"+car.getBrand()+"\t"+car.getFuel_type()+"\t\t"+car.getPrice());
		}
	}

	public void updateCar() {
		getAllCarDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Car Id to Update: ");
		int update_car_id=sc.nextInt();
		for(Car car:cars){
			if(update_car_id==car.getCar_id()){
				System.out.println("Enter Updated Car Name: ");
				String updated_name=sc.next();
				car.setName(updated_name);
				System.out.println("Enter Updated Car Model: ");
				String updated_model=sc.next();
				car.setModel(updated_model);
				System.out.println("Enter Updated Car Brand: ");
				String updated_brand=sc.next();
				car.setBrand(updated_brand);
				System.out.println("Enter Updated Car Fuel Type: ");
				String updated_fuel_type=sc.next();
				car.setFuel_type(updated_fuel_type);
				System.out.println("Enter Updated Car Price: ");
				double updated_price=sc.nextDouble();
				car.setPrice(updated_price);
				System.out.println(update_car_id+" is Updated!!");
				System.out.println("================================================\n");
				getAllCarDetails();
				break;
			}
			else{
				System.out.println("Invalid Input. Try Again!!");
			}
		}	
	}

	public void deleteCar() {
		System.out.println("================================================\n");
		getAllCarDetails();
		System.out.println("================================================\n");
		if(cars.isEmpty()==false){
			Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter Car Id You Want to Delete: ");
			int car_id=sc.nextInt();
			
			Car car1=null;
			for(Car car:cars){
				if(car.getCar_id()==car_id){
					car1=car;
				}
			}
			if(car1!=null){
				cars.remove(car1);
				System.out.println(car1.getName()+" is Deleted!!");
				getAllCarDetails();
			}
			else{
				System.out.println("Invalid Input.Try Again!!");
			}
		}
		else{	
			System.out.println("No Car Details Found!!");
		}
		
	}
	
	
	
	


	
	
}

