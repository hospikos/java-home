package homework7.Task1;

public class StringManipulator {
    public static String removeCharacters(String input, char[] charsToRemove) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            boolean shouldRemove = false;
            for (char removeChar : charsToRemove) {
                if (c == removeChar) {
                    shouldRemove = true;
                    break;
                }
            }
            if (!shouldRemove) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
