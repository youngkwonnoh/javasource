package ch8;

public class DriverEx extends Driver {
	public static void main(String[] arge) {
		
		Driver driver = new Driver();
		// drive(Vehicle vehicle)
		driver.drive(new Vehicle());
		driver.drive(new Bus());
		driver.drive(new Taxi());
		
	}
	
	
}
