package src.homeWork.h15;

class DigitText {
    public boolean detect(String text){
        String[] str = text.toLowerCase().split("");
        for (int i = 0; i < str.length; i++) {
            String s = "[a-zA-Z]+";
            if (str[i].matches(s)) {
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
