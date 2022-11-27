package lesson1;

public class StringVsStringBuilderClass {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 100000000; i++) {
            s += "1";

        }
    }

}
