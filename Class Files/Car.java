package helloapagain31;

public class Car {
	
		private String brand;

		private String model;

		private int year;

		private double horsePower;

		
		public Car (String brand, String model, int year, double horsePower) {
	 	System.out.println("New car has been created... ");
	 	this.brand = brand;
	 	this.model = model;
	 	this.year =year;
	 	this.horsePower = horsePower;
 }
		
 	public Car() {
	
}
		
 	public void driveCar(double kilometers) {
 		System.out.println("You have driven the car for " + kilometers + " km.");
 	}
		
 	public double getCarHP() {
 		return horsePower;
 	}
	public String getCarModel() {
		return model;
	}
	
	public void setCarHp(double newHP) {
		horsePower = newHP;
	}
	
	
	
	
}
