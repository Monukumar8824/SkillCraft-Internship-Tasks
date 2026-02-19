package random;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        // Random number generate between 1 to 100
        int randomNumber = random.nextInt(100) + 1;

        int guess;
        boolean isCorrect = false;

        System.out.println("Guess a number between 1 and 100");

        while (!isCorrect) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess == randomNumber) {
                System.out.println("Correct! You guessed the number 🎉");
                isCorrect = true;
            } 
            else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } 
            else {
                System.out.println("Too high! Try again.");
            }
        }

        sc.close();
    }
}
