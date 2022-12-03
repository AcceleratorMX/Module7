package src.homeWork.h20;

class BigOrSmall {
    public String calculate(String text) {                    //Приймає рядок із тестів, що внизу.
        text.replaceAll(" ", "");            //Видаляє з рядку усі пробіли.
        int up = 0;                                           //Змінна, в яку вноситься кількість великих літер.
        int low = 0;                                          //Змінна, в яку вноситься кількість маленьких літер.
        for (int i = 0; i < text.length(); i++) {             //Цикл, який перевіряє кожен символ рядка.
            if (Character.isUpperCase(text.charAt(i))) up++;  //Якщо цикл знаходить велику літеру, то відповідна змінна збільшується на 1.
            if (Character.isLowerCase(text.charAt(i))) low++; //Якщо цикл знаходить маленьку літеру, то відповідна змінна збільшується на 1.
        }
        if (up < low) return "Small";                         //Якщо меленьких літер більше ніж великих, виводить "Small".
        if (up > low) return "Big";                           //Якщо великих літер більше ніж маленьких, виводить "Big".
        if (up == low) return "Same";                         //Якщо кількість великих і маленьких літер однакова, виводить "Same".
        return null;
    }
}
                                                            //Нижче тестові варіанти рядків для цього завдання.
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
