import java.util.Random;

public class DiceRoller {

	DiceRoller () {
		
		Random random = new Random();
		int number = 0;
		roll(random, number); // fix the scope issue by adding these two variables as arguments to roll();
		
	}
	
	void roll(Random random, int number) {
		
		number = random.nextInt(6) + 1;
		System.out.println(number);
		
	}
	
}
