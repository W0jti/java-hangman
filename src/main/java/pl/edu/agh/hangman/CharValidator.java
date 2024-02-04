package pl.edu.agh.hangman;
import java.util.Arrays;
import java.util.Scanner;

public class CharValidator {
    public void scanWord(char[] testArray, String letter){
        Scanner scanner = new Scanner(Arrays.toString(testArray));

        while (scanner.hasNext()) {
            String next = scanner.next();
            if (next.equals(letter)) {
                System.out.println(letter);
            }
        }

        scanner.close();
    }
}
