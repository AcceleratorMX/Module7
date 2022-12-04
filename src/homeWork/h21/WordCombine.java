package src.homeWork.h21;

import java.util.Arrays;

class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord){

        boolean value = false;
        for (char s : targetWord.toCharArray()) {
            if(sourceWord.toLowerCase().contains(String.valueOf(s).toLowerCase())) {return true;}
        }
        return value;
    }
}

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}