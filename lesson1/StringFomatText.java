package lesson1;

public class StringFomatText {
    public static void main(String[] args) {
        String fatherName = "Bobert";
        int age = 25;
        String sonName = "Bobo";
        int weight = 100;

//        System.out.println("Father name " + fatherName + " he is " + age + ", his son is " + sonName + ". His weight is " + weight);
        System.out.printf("Father name %s he is %d, his son is %s. His weight is %d",
                sonName, age, fatherName, weight);
    }
}
/*
%s - String;
%d - цілі числа та їх обгортки;
%f - числа з лаваючою крапкою флоат;
%d - boolean;
%c - char;
%t - date;
%% - символ %;
 */