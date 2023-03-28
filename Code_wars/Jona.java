package Code_wars;

import C7_Java.Array;

import java.util.Arrays;

public class Jona {
    public static void main(String[] args) {
        // sliding window algorithm
        int[] numbers = {1, 12, 4, 3};
        int[] arr = getSumResutinfToSeven(numbers);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] getSumResutinfToSeven(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length) {
                if (numbers[i] + numbers[i + 1] == 7) {
                    return new int[]{i, i + 1};
                }
            }
        }
        return null;
    }
}
