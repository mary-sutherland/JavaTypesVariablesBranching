package com.tts;

public class Branching {
    public static void main(String[] args) {
        int [] numbers = {10, 23, 19, 34, 23, 76, 39, 65, 24, 8, 0, 12, 55};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<=0) {
                System.out.println("Break statement coming because number is = " + numbers[i]);
                break;
            } else if (numbers[i]%2 != 0) {
                System.out.println("Odd number found in array, ignoring number " + numbers[i]);
                continue;
            } else
                sum = sum + numbers[i];
        }
        System.out.println("Sum of all even numbers is = " + sum);

    }
}
