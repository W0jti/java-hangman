package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.Arrays;

import static pl.edu.agh.hangman.WordGenerator.wordGenerator;

public class WordPrinter {
    WordGenerator wordGenerator = new WordGenerator();
    ArrayList<String> wordList = new ArrayList<>();
    private String generatedWord = wordGenerator(wordList);
    private char[] gameWord = generatedWord.toCharArray();

    private String masked = new String(new char[generatedWord.length()]).replace("\0", "_");


//    for (int i = 0; i < gameWord.length(); i++){
//        System.out.print(gameWord[i]);
//    }



}
