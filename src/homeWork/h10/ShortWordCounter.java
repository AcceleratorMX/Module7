package src.homeWork.h10;

import java.util.Arrays;

public class ShortWordCounter{
    public int count(String phrase, int minLength){
        String[] str = phrase.split("");
        int count = 0;
        int result = 0;
        for (int i = 1; i < str.length; i++) {
                count++;
            if (count <= minLength) {
                result += count;
            }
        }
        return result;
    }
}

class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}
