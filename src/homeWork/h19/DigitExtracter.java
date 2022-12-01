package src.homeWork.h19;

import java.util.Arrays;

class DigitExtracter {

    public int[] extract(String text){
        text = text.replaceAll("[^\\d]+", "");
        char[] chars = text.toCharArray();
        int[] result = new int[chars.length];

        for (int i = 0; i < chars.length; i++){
            result[i] = chars[i] - '0';
        }

        return result;
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
