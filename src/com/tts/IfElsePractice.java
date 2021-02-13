package com.tts;
import java.util.Scanner;


//Practicing implementing skills from MadLib exercise
//scanner, parseInt, if/else statements
//got an error when i put only one = in the parameters of the if
//statement since that would be assigning value instead of comparing value

public class IfElsePractice {

    public static void main(String[] args) {

        int secretNumber = 2;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 10: ");

        int guessNumber = Integer.parseInt(userInput.nextLine());

        if (guessNumber == secretNumber) {
            System.out.println("Wow!");
        } else {
            System.out.println("Nope!");
        }

        int passingGrade = 60;
        System.out.println("What is your number grade?: ");
        int userGrade = Integer.parseInt(userInput.nextLine());
        if (userGrade >= passingGrade) {
            System.out.println("You passed.");
        } else {
            System.out.println("Sorry, you will need to repeat this course.");
        }

        int numPicked = 88;
        System.out.println("Pick a number between 1 and 100: ");
        int userNumber = Integer.parseInt(userInput.nextLine());
        if (userNumber == numPicked) {
            System.out.println("Wow, Perfect!");
        } else if (userNumber > (numPicked - 5) || userNumber < (numPicked + 5)) {
            System.out.println("Oh! So close!");
        } else {
            System.out.println("Not even close.");
        }


    }


}
