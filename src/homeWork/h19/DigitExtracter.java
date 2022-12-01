package src.homeWork.h19;

import java.util.Arrays;

class DigitExtracter {
    public int[] extract(String text) {
        String[] str = text.split("\\d+/");
        int[] result = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            if (!str[i].matches("\\w+")) {
                result[i] = Integer.parseInt(str[i]);
            }
        }
        return new int[]{result.length};
    }
}
class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}
