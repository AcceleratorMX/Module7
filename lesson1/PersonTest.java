package lesson1;

import java.util.Arrays;

public class PersonTest {

    public static void main(String[] args) {
//        ImmutablePerson person = new ImmutablePerson("Bobo", new String[] {"yoga", "chess", "cats"});
//        ImmutablePerson person2 = new ImmutablePerson("BoboJan", new String[] {"domino", "karate", "dogs"});
//        System.out.println(person.getName());
//        System.out.println(person2.getName());
//        System.out.println(Arrays.toString(person.getHobby()));
//        System.out.println(Arrays.toString(person2.getHobby()));

        String input = "I`am a cool java dev from GOIT";
//      Довжина рядка
        System.out.println(input.length());
//      Довжина рядка по індексу
        System.out.println(input.charAt(7));
//      Перевести рядок в масив символів
        char[] chars = input.toCharArray();

        String a = "aaa";
        String b = "AaA";

//        Зміна регістру символів у рядку
        System.out.println("input.toUpperCase() = " + input.toUpperCase());
        System.out.println("input.toLowerCase() = " + input.toLowerCase());

//        Взяти підрядок з рядка
            String fullName = "Ivanov Ivan Ivanuch";
            char[] nameChars = fullName.toCharArray();
            int firstWhitespace = 0;
            for (int i = 0; i < nameChars.length; i++) {
                if (String.valueOf(nameChars[i]).equals(" "));
                firstWhitespace = i;
            break;
        }
        System.out.println("fullName.substring(0,x) = " + fullName.substring(0, firstWhitespace));
    }
}
