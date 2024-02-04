package pl.edu.agh.hangman;


import java.util.ArrayList;
import java.util.Arrays;


public class Hangman {

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };


    public static void main(String[] args) throws Exception {

        ArrayList<String> wordList = WordList.wordList("src/main/resources/slowa.txt");
        String word = WordGenerator.wordGenerator(wordList);

        for (int i = 0; i < HANGMANPICS.length; i++) {
            System.out.println(HANGMANPICS[i]);
        }
        String test = "Jacek";
        char[] testArray = test.toCharArray();

        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i]);
        }


        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i]);
        }

        String letter = CharInput.enterLetter();
        
    }
}
