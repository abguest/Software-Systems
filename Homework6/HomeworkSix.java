import java.lang.Math;
import java.util.Random;

//Simulate each game a million times and print
//out wins and losses, assuming each bet was for
//$1

public class HomeworkSix {
	public static void firstTest(int trials) {
		int successes=0;
		int failures=0;
		
		Random random = new Random();
		for (int i=0; i<trials; i++) 
		{
			for (int j=0; j<4; j++) 
			{
				int outcome=random.nextInt(6)+1;
				if(outcome==6) 
				{
					successes++;
					break;
				}
			}
		}
		failures=trials-successes;
		
		System.out.println("You win $"+successes+" if rolled 4 times");
		System.out.println("You lose $"+failures+"if rolled 4 times");
	}
	public static void secondTest(int trials) {
		int successes=0;
		int failures;
		Random random = new Random();
		
		for (int i=0; i<trials; i++) {
			for (int j=0; j<24; j++) {
				int outcome1=random.nextInt(6)+1;
				int outcome2=random.nextInt(6)+1;
				if (outcome1==6 && outcome2==6) {
					successes++;
					break;
				}
			}
		}
		failures=trials-successes;
		
		System.out.println("You win $"+successes+" if rolled 24 times");
		System.out.println("You lose $"+failures+"if rolled 24 times");
		
	}
	public static void main(String[] args){
		firstTest(1000000);
		secondTest(1000000);
		
	}
}
