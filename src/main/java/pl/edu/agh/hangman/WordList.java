package pl.edu.agh.hangman;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordList {
    static ArrayList<String> wordList(String filename) throws IOException {
        Scanner s = new Scanner(new File(filename));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()) {
            list.add(s.next());
        }
        s.close();
        return list;
    }
}
