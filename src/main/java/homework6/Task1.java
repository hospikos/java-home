package homework6;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 22, 25, 12, 33, 94};
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverseArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
    }
}
