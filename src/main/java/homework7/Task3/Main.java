package homework7.Task3;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        RomanNumber num1 = RomanNumber.M;
        RomanNumber num2 = RomanNumber.V;

        String operation = "*";
        int result = calculator.calculate(num1, num2, operation);
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}
