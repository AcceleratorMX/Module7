package src.homeWork.h18;

class AvgWordLength {
    public double count(String phrase){
        String[] str = phrase.split(" ");
        float length = 0;
        for (String s : str) {
            length += s.length();
        }
        return length / str.length;
    }
}

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}