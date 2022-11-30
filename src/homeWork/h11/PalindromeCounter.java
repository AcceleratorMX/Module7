package src.homeWork.h11;

class PalindromeCounter {
    public int count(String phrase){
        String builder = new StringBuilder(phrase).reverse().toString();
        String[] str = phrase.split(" ");
        String[] str2 = builder.split(" ");
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str[i].equalsIgnoreCase(str2[j])){
                    count ++;
                }
            }
        }
        return count;
    }
}

/*
class PalindromeCounter{

    public int count(String phrase){
        int count=0;

        for (String s: phrase.split(" ")) {
            String str = new StringBuilder(s).reverse().toString();
            if (s.equalsIgnoreCase(str))
            count++;
        }
        return count;
    }
}
*/
class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}
