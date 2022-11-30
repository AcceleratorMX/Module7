package src.homeWork.h15;

public class DigitText {
    public boolean detect(String text){
        String[] str = text.toLowerCase().split("");
        for (int i = 0; i < str.length; i++) {
            String s = "\\[a-z]";
            if (str[i].equals(s)) {
                return false;
            }
        }
        return true;
    }
}


class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}
