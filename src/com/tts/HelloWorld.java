package com.tts;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, World!\n");
        System.out.print("Today is awesome!");
        System.out.print("...don't you think?\n");

        Scanner input = new Scanner(System.in);
        //This will allow the user to input information in the terminal
//        System.out.println("What is your name?");
//        String firstName = input.nextLine();
//        System.out.printf("Hello %s!\n", firstName);
//        System.out.printf("Goodbye %s!\n", firstName);

        //Got an error here below because I tried to define firstName again
        //I had already defined it in previous scanner method
        //I commented out first method and ran it again and it worked

        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = userInput.nextLine();
        System.out.println("What is your last name?");
        String lastName = userInput.nextLine();
        System.out.printf("Hello %s %s!\n", firstName, lastName);
        System.out.printf("Goodbye %s, %s!\n", lastName, firstName);



    }



}

