package homework10.Task3;

import java.util.Arrays;

public class Lambda {
    public static void splitAndPrint(String sentence) {
        Arrays.stream(sentence.split(" "))
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        splitAndPrint("Hello country and world");
    }
}
