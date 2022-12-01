package src.homeWork.h17;

class MathDetector {
    public boolean isMath(String text) {
        String[] str = text.toLowerCase().split(" ");
        String s = "\\d.{2,}+";
        for (int i = 0; i < str.length; i++) {
            if ((str[i].contains("=") || str[i].contains("-") || str[i].contains("+") || str[i].contains("*") ||
                    str[i].contains("/")) && str[i].matches(s)) return true;
        }
        return false;
    }
}

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}
