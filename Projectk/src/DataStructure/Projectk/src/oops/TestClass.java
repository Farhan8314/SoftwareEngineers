package oops;

public class TestClass {

	public static void main(String[] args) {
Car car = new Toyota();
	car.start(); 
	car.wheel();
	car.stop();
	
	Toyota camry = new Toyota();
	camry.motorVehicle();
	camry.EngineRunbyBattery();
	
	
	ElectricCar model3 = new Toyota();
	model3.EngineRunbyBattery();
	
	BMW series5 = new BMW();
	series5.start();
	series5.wheel();
	series5.stop();
	
	
	FlyingCar kittyhawk = new Toyota();  // this came from abstract flyingcar, but was instansized in Toyota . 
	kittyhawk.flyingfeatures();
	kittyhawk.Flyingsaucer();
	
	}

}
