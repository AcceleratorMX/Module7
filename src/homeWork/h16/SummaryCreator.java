package src.homeWork.h16;

class SummaryCreator {
    public String create(String text){
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.length() <= 15) return text;
            if (text.length() >= 16) result = text.substring(0,15);
            if (text.charAt(15) != ' ') result = text.substring(0,15) + "...";
        }
        return result;
    }
}

class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}
