package src.homeWork.h20;

class BigOrSmall {
    public String calculate(String text) {
        text.replaceAll(" ", "");
        int up = 0;
        int low = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) up++;
            if (Character.isLowerCase(text.charAt(i))) low++;
        }
        if (up < low) return "Small";
        if (up > low) return "Big";
        if (up == low) return "Same";
        return null;
    }
}

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}
