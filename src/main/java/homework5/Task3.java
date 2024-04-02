package homework5;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] occurrences = new int[101];
        int sum = 0;
        int count = 0;

        while (true) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println("Generated number: " + randomNumber);
            sum += randomNumber;
            count++;

            occurrences[randomNumber]++;
            if (occurrences[randomNumber] == 2) {
                break;
            }
        }

        System.out.println("Total sum of generated numbers: " + sum);
        System.out.println("Total amount of numbers: " + count);
    }
}