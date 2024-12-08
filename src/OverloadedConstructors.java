
public class OverloadedConstructors {

	public static void main(String[] args) {
		
		// overloaded constructors = multiple constructors within a class that share the same name,
		//                           but have different parameters
		//                           name + parameters = signature
		
		Pizza pepperoniPizza = new Pizza("Thin Crust", "Tomato", "Mozzarella", "Pepperoni");
		Pizza cheesePizza = new Pizza("Thicc Crust", "Tomato", "Mozzarella"); 
		
		System.out.println("Here are the ingredients for your pepperoni pizza:");
		System.out.println("--------------------------------------------------");
		System.out.println(pepperoniPizza.bread);
		System.out.println(pepperoniPizza.sauce);
		System.out.println(pepperoniPizza.cheese);
		System.out.println(pepperoniPizza.topping);
		
		System.out.println();
		
		System.out.println("Here are the ingredients for your cheese pizza:");
		System.out.println("--------------------------------------------------");
		System.out.println(cheesePizza.bread);
		System.out.println(cheesePizza.sauce);
		System.out.println(cheesePizza.cheese);

	}

}
