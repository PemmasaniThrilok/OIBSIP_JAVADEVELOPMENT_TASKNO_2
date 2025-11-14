package Task;

import java.util.Random;
import java.util.Scanner;

public class Number {

    public static void main(String[] args) {

        System.out.println("Welcome to the Guess the Number Game");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1;
            int maxAttempts = 7;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("I have selected a number between 1 and 100");
            System.out.println("You have attempts to guess it="+ maxAttempts);

            while (attempts < maxAttempts) {
                System.out.println("Enter your guess Number:- ");
                int number = scanner.nextInt();
                attempts++;

                if (number == randomNumber) {
                    System.out.println("Correct! You guessed the number in" + attempts + "attempts!");
                    guessed = true;
                    break;
                } else if (number > randomNumber) {
                    System.out.println("Try a lower number");
                } else {
                    System.out.println("Try a higher number");
                }

                System.out.println("Attempts left:" +(maxAttempts - attempts));
            }

            if (!guessed) {
                System.out.println("The correct number was:" + randomNumber);
            }

            System.out.println("Do you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();

            if (!response.equals("yes")) {
                playAgain = false;
                System.out.println("Thanks for playing");
            }
        }
    }
}

