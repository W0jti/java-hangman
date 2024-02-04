package pl.edu.agh.hangman;

import java.util.Scanner;

public class CharInput {
    public static void charInput(String[] args) {
    }

   static String enterLetter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź literę: ");
        return input.next();
    }

}
