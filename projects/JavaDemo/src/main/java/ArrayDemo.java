import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] stringArray = { "a", "b", "c", "d", "e","a" };
        boolean b = Arrays.asList(stringArray).contains("aa");
        System.out.println(b);
    }
}
