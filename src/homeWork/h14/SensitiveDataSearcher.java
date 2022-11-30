package src.homeWork.h14;

class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase){
        String[] str = phrase.toLowerCase().split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("pass")|| str[i].contains("key")
            || str[i].contains("login") || str[i].contains("email")) return true;
        }
        return false;

    }
}

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}
