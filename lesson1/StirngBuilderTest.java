package lesson1;

public class StirngBuilderTest {
    public static void main(String[] args) {
        String name  = "Bobo";
        StringBuilder nameBuilder = new StringBuilder(name);
        //.append
        System.out.println("nameBuilder.append(\"!\") = " + nameBuilder.append("!"));
        //.deleteCharAt
        System.out.println("nameBuilder.deleteCharAt(4) = " + nameBuilder.deleteCharAt(4));
        //.delete
        System.out.println("nameBuilder.delete(2,3) = " + nameBuilder.delete(1, 3));
            System.out.println("nameBuilder.append(\"bert\") = " + nameBuilder.append("bert"));
        //.replace
        System.out.println("nameBuilder.replace(3,6,\"onator\") = " + nameBuilder.replace(3, 6, "onator"));
        //.reverse
        System.out.println("nameBuilder.reverse() = " + nameBuilder.reverse());

        String s = nameBuilder.toString();
        System.out.println(s);
    }

}
