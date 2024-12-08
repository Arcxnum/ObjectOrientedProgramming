
public class Objects {
	
	public static void main(String[] args) {
		
		// Objects: an instance of a class that may contain attributes and methods
		// example: (phone, desk, computer, cup)
		
		Car myCar1 = new Car("Jeep", "Wrangler", 2002, "Black", 35000.00);
		Car myCar2 = new Car("Chevrolet", "Corvette", 2016, "Blue", 50000.00);
		
		System.out.println(myCar1.make);
		System.out.println(myCar1.model);
		System.out.println("$" + myCar1.price);
		System.out.println(myCar1.color);
		System.out.println(myCar1.year);
		
		myCar1.drive();
		myCar1.brake();
		
		System.out.println(myCar2.make);
		System.out.println(myCar2.model);
		System.out.println("$" + myCar2.price);
		System.out.println(myCar2.color);
		System.out.println(myCar2.year);
		
		myCar2.drive();
		myCar2.brake();
		
		System.out.println("You have two cars");
		
	}
	
}