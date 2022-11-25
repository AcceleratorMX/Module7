package src.homeWork.h4;
import java.util.Arrays;
import java.util.stream.Collectors;

class Phrase {
    private final String[] words;
    private final String[] newWords;

    public Phrase(String[] words) {
        this.words = words;
        newWords = new String[0];
    }

    @Override
    public String toString() {
        return String.join(" ", words);
    }
}

class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}
