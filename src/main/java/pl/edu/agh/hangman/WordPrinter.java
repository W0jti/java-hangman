package pl.edu.agh.hangman;

import java.util.Arrays;

public class WordPrinter {
    WordGenerator word = new WordGenerator();
    //private String generatedWord = word.generateWord();
    char[] gameWord = generatedWord.toCharArray();

    Arrays.fill(gameWord, 0, gameWord.length, '_');

    for (int i = 0; i < gameWord.length; i++){
        System.out.print(gameWord[i]);
    }


}
