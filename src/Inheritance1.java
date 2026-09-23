class Vehicle{
	void startVehicle() {
		System.out.println("Vehicle start");
	}
}

class Car extends Vehicle{
	void driveCar() {
		System.out.println("Drive car");
	}
}

public class Inheritance1 {
	
	public static void main(String[]arg) {
		
		Car car = new Car();
		car.startVehicle();
		car.driveCar();
		
	}
}