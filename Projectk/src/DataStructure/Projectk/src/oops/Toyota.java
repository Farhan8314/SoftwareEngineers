package oops;

public class Toyota extends FlyingCar implements Car, ElectricCar  { // extend is for abstrct class, implements is for Interface. extends is written before impplements

	
	public void start() {
		System.out.println("start the car");
	}

	
	public void stop() {
		System.out.println("press the break to stop the car");
	}

	public void wheel() {
		System.out.println("car should run on wheels");
	
	}
	
	public void motorVehicle() {
		System.out.println("Run on engine");
	
	
	}


	
	public void EngineRunbyBattery() {
	System.out.println("Solar panel gives enough power, so lets build electric car");	
	
	
	}


	
	public void flyingfeatures() {
		System.out.println("It has flying Features");
	}
	public void Flyingsaucer() {
	System.out.println("This is flying Saucer");
	
	}

}

