package src.homeWork.h24;

class NameCounter {
    public int count(String text) {
        int count = 0;
        for (String s : text.split(" ")) {
            if (s.matches("[A-Z]{1}[a-z]+")) {count++;
            }
        }
        return count;
    }
}


class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}