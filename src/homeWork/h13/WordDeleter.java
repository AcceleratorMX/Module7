package src.homeWork.h13;

class WordDeleter {
    boolean containWord(String word, String[] words) {
        for (String item : words) {
            if (word.equals(item)) return true;
        }
        return false;
    }
    public String remove(String phrase, String[] words){
        StringBuilder result = new StringBuilder();
        for (String word : phrase.split(" ")) {
            if (!containWord(word, words)) {
                result.append(" " + word);
            }
        }
        return result.toString().strip();
    }
}

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}
