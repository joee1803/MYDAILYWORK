package internshipTasks;
import java.util.*;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner input = new Scanner(System.in);

		System.out.println("***NUMBER GAME***");
		System.out.print("ENTER YOUR USERNAME: ");
		String name = input.next();
		System.out.printf("Hi %s, This is a guessing game. Your job is to guess a random number between 1 and 50. You have 5 trials. Goodluck ^_~👌\n", name.toUpperCase());

		int score = 0;
		int rounds = 0;
		boolean retry = false;
		int guess;
		
		try {
			do {
				int randomNo = rand.nextInt(1,50);
				System.out.println("***");
				System.out.println("**");
				System.out.println("*");
				System.out.println("Random Number Generated👍");
				int trials = 5;
				int points = 50;
				
				while(trials > 0) {
					System.out.print("\nENTER YOUR GUESS: ");
					guess = input.nextInt();
					if (guess == randomNo) {
						System.out.println("Great Guess ✔️");
						break; 
					}
					
					if (guess< randomNo) {
						System.out.printf("Number is greater than %d\n",guess);
					}else if (guess> randomNo) {
						System.out.printf("Number is less than %d\n",guess);
					}
					
					trials--;	
					System.out.printf("%d trial(s) left\n", trials);
					points-=5;	
					if ((trials == 0) && (guess != randomNo)) {
						
						System.out.println("The number was "+ randomNo +". Better luck next time💔...");
					}
					
				}
				score += points;
				rounds++;
				System.out.println("Press 1 to play another round: ");
				retry = (input.nextInt() == 1);
			
			}while(retry);
			if(score == rounds*50) {
				System.out.print("\nPerfect Score🥳🥳🥳!!! Well Done👏");
			}
			System.out.printf("\nYour Score: %d/%d\n", score,rounds * 50);
			System.out.println("Thanks for playing🙏");
		} catch (InputMismatchException e) {
			retry = false;
			System.out.printf("\nYour Score: %d/%d\n", score,rounds * 50);
			System.out.println("Thanks for playing🙏");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("An error occurred😢");
		}
		input.close();
	}

}
