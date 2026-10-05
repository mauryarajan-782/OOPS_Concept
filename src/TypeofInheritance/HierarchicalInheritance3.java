package TypeofInheritance;

class Vehicle {
	void fuelType() {
		System.out.println("Used fuel");
	}
}

class Car extends Vehicle {
	void fuelType() {
		System.out.println("Car is fuelType");
	}
	
	void typeTyers() {
		System.out.println("Car has a 4 Tyers");
	}
}

class Bike extends Vehicle {
	void fuelType() {
		System.out.println("Bike is fuelType");
	}
	
	void handlebar() {
		System.out.println("Bike is a handlbar");
	}
}

public class HierarchicalInheritance3 {
	
	public static void main(String[]args) {
		
		Car car = new Car();
		car.fuelType();
		car.typeTyers();
		
		System.out.println(" ");
		
		Bike bike = new Bike();
		bike.fuelType();
		bike.handlebar();
	}

}
