package src.homeWork.h6;

import java.util.Arrays;

class PunctuationMarkCounter {
    public int count(String phrase) {
        String[] words = phrase.split("");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(".") || words[i].equals(",") || words[i].equals("!") || words[i].equals(":") || words[i].equals(";")){
                count ++;
            }
        }
        return count;
    }
}

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}