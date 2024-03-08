import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        
        System.out.println("Welcome to Guess the Number Challenge!");
        
        while (true) {
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            final int maxAttempts = 10;
            
            System.out.println("I have chosen a number between 1 and 100. You have 10 attempts to guess it.");
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                
                if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + targetNumber + " in " + attempts + " attempts!");
                    score++;
                    break;
                }
            }
            
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The number was " + targetNumber + ".");
            }
            
            System.out.print("Do you want to play again? (y/n]): ");
            String playAgain = scanner.next().toLowerCase();
            if(!playAgain.equals('y')){
                break;
            }
            
        }
        System.out.println("your final score is "+score+".");
        scanner.close();
        
    }
}
