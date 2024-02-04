package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.Random;

public class WordGenerator {

    static String wordGenerator(ArrayList<String> list) {
        Random random = new Random();
        int upperbound = list.size();
        int int_random = random.nextInt(upperbound);
        String word = list.get(int_random);
        System.out.println(word);
        return word;

    }
}
