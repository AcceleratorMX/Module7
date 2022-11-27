package lesson1;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class ReflectionTest {
    public static void main(String[] args) {
        Class<Integer> integerClass = Integer.class;
        System.out.println("integerClass.getName() = " + integerClass.getName());

        Class<String> stringClass = String.class;
        System.out.println("integerClass.getInterfaces() = " + Arrays.toString(stringClass.getInterfaces()));

        Object o1 = String.valueOf(1);
        Object o2 = "vfhfhgdh";
        Object o3 = 234;
        System.out.println("o1.getClass().equals(o2.getClass()) = " + o1.getClass().equals(o2.getClass()));
        System.out.println("o1.getClass().equals(o3.getClass()) = " + o1.getClass().equals(o3.getClass()));

        System.out.println("stringClass.getSuperclass() = " + stringClass.getSuperclass());

        Class<List> listClass = List.class;
        System.out.println("listClass.getSuperclass() = " + listClass.getSuperclass());

        Method[] methods = String.class.getMethods();
        System.out.println(Arrays.toString(methods));
    }
}
