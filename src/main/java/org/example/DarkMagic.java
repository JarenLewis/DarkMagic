package org.example;

import java.util.Random;
import java.util.Scanner;

public class DarkMagic {

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        String[] lines = {
                "Welcome Traveler.",
                "I can tell you have come from lands far away.",
                "I can sense you have many questions.",
                "Ask to your heart's content or type 'end' to go on your way."
        };

        for (String printedLines : lines) {
            System.out.println(printedLines);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Death follows you. I can not help you.");
            }
        }

        while (true) {
            String questionString = input.nextLine();

            if(questionString.equalsIgnoreCase("end")){
                System.out.println("It is becoming dark. Safe travels.");
                break;
            }

            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
            
            int randNumber = new Random().nextInt(5);

            if (randNumber == 0) {
                System.out.println("Yes");
            } else if (randNumber == 1) {
                System.out.println("No");
            } else if (randNumber == 2) {
                System.out.println("Cannot predict now");
            } else if (randNumber == 3) {
                System.out.println("Most likely");
            } else if (randNumber == 4) {
                System.out.println("Very doubtful");
            }

            Thread.sleep(1000);
            System.out.println("");
            System.out.println("What else is on your mind?");
        }
    }
}