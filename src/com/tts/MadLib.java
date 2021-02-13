package com.tts;
import java.util.Scanner;

public class MadLib {

    //errors here on the System.out.println
    //maybe because it is outside the method?


//    System.out.println("How old are you?");

    //tried to modify the variable below to but it threw an error
    //instead followed the error instructions to have it put inside a constructor
    //as is seen in the public MadLib() directly below the variable declaration

    //why do i need this? don't think i do. may be left over.
    int age;

//    public MadLib() {
//        age = Integer.parseInt(userInput.nextLine());
//    }
    //this did not work so I am moving it to the main method below sout "how old are you"

    public static void main(String[] args) {

        //moved this to the main method, before i had it inside the class but not
        //inside the method
        int ageLimit = 18;

        //placed it here below the scanner to fix error issue

        //this declares a new scanner we name userInput to be called upon later
        Scanner userInput = new Scanner(System.in);

        System.out.println("How old are you?");

        //When getting input using userInput.nextLine(), the data is
        //captured as a String type. Since we are looking for an integer
        //value, we need to convert the input to an integer. We do this by using:
        //Integer.parseInt() which converts the input to an integer, and allows it
        //to be stored in the age variable
        int age = Integer.parseInt(userInput.nextLine());

        //comparing age and age limit
        //the conditional placed below compares the variable age and ageLimit
        //the else brackets allows the user to play if they meet the age requirement
        //this is what i was lacking in previous exercises, the if/elsde/system.exit
        //performs the
        if (age < ageLimit) {
            System.out.println("Your are too young! Sorry!");
            System.exit(0);
        } else {
            //Program continues as normal because they passed the age test
        }


        System.out.println("Enter an name: ");
        String name = userInput.nextLine();
        System.out.println("Give me an adverb: ");
        String adverb = userInput.nextLine();
        System.out.println("Give me an adjective: ");
        String adjective = userInput.nextLine();
        System.out.println("Give me a noun: ");
        String noun = userInput.nextLine();
        System.out.println("Give me another noun: ");
        String noun2 = userInput.nextLine();
        System.out.println("Give me a number: ");
        String number = userInput.nextLine();
        System.out.println("Give me your name: ");
        String yourName = userInput.nextLine();


        //Got an error below when I defined noun2 above and nounTwo below
        //Good reminder to stay consistent and exact with syntax, code, etc..
        System.out.printf("Here is your story: \n");
        System.out.printf("\n Dear %s,", name);
        System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, noun);
        System.out.printf("\n I want to go to the %s with you in %s days.", noun2, number);
        System.out.printf("\n Sincerely, %s \n", yourName);

    }
}
