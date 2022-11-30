package src.homeWork.h7;

class DoubleSpaceCleaner {
    public String clean(String phrase){

        while (phrase.contains("  ")){
            String replace = phrase.replace("  ", " ");
            phrase = replace;
        }
            return phrase.trim();
    }
}

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}
