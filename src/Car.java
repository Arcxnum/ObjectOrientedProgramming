
public class Car {
	
	/* String make = "Jeep";
	String model = "Wrangler";
	int year = 2002;
	String color = "Red";
	double price = 35000.00; */ // Every car will be a Jeep Wrangler with this code
	
	// constructor: a special method that is called when an object is instantiated (created)
	
	String make;
	String model;
	int year;
	String color;
	double price;
	
	Car (String make, String model, int year, String color, double price) { // constructor
		
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		
	}
	
	void drive() {
		
		System.out.println("You drive the " + this.make + " " + this.model + ".");
		
	}
	
	void brake() {
		
		System.out.println("You hit the brakes of the " + this.make + " " + this.model + ".");
		
	}
	
}
