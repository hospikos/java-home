package homework7.Task3;

public class Calculator {

    public static int calculate(RomanNumber val1, RomanNumber val2, String operator) {
        int num1 = val1.getValue();
        int num2 = val2.getValue();
        int result = 0;
        switch (operator) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            default -> System.out.println("Invalid operator (use +,-,*,/)");
        }
        return result;
    }
}
