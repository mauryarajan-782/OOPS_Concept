package association2;

class Engine {
	void startEngine() {
		System.out.println("Engine  Strart");
	}
}
 
class Car{
	 
	private Engine engine;
	
	Car(Engine engine){
		this.engine = engine;
	}
	
	void driveCar() {
		engine.startEngine();
		System.out.println("Dirve Car");
	}
}


