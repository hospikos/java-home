package homework11;

import java.util.HashMap;
import java.util.Map;

public class LettersСounter {
    public static Map<Character, Integer> countLetters(String str) {
        Map<Character, Integer> letterCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowercase = Character.toLowerCase(c);
                letterCount.put(lowercase, letterCount.getOrDefault(lowercase, 0) + 1);
            }
        }
        return letterCount;
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        Map<Character, Integer> letterCounts = countLetters(input);
        for (Map.Entry<Character, Integer> entry : letterCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}