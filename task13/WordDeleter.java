package task13;

public class WordDeleter {
    public static void main(String[] args) {
        System.out.println(new WordDeleter().remove("Hello Java", new String[]{"Java"}));
    }

    public String remove(String phrase, String[] words){
        String[] strings = phrase.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (!strings[i].equals(words[j])){
                    builder.append(strings[i]);
                }
            }
        }
        return builder.toString();
    }
}
