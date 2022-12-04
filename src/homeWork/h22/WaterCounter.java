package src.homeWork.h22;
class WaterCounter {
    public double count(String text) {

        double result = 0;

        for (char s : text.toCharArray()) {
            if (String.valueOf(s).equals(" ")) {
                result++;
            }
        }
        return result / text.length();
    }
}

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}
