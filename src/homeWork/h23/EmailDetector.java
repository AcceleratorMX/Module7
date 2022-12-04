package src.homeWork.h23;

class EmailDetector {
    public boolean isPresent(String text){
        for (char s : text.toCharArray()) {
            if (Character.valueOf(s).equals('@') && !Character.valueOf(s).equals(" ")) {return true;}
        }
        return false;
    }
}

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}
