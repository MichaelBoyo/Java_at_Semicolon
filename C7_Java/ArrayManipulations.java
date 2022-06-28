package C7_Java;

import java.util.Arrays;

public class ArrayManipulations {
    public static void main(String[] args) {
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};

        Arrays.sort(doubleArray);
        for (double v : doubleArray) {
            System.out.print(v + " ");
        }
        System.out.println();

        int[] arrayFill = new int[12];
        Arrays.fill(arrayFill, 5);
        for (int j : arrayFill) {
            System.out.print(j + " ");
        }
        int[] intArr = {1, 2, 3, 4, 5, 6};
        int[] intArrCopy = new int[intArr.length];

        displayArray(intArr, "intArray");
        displayArray(intArrCopy, "intArrayCopy");

        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%n intArray %s intArrayCopy%n", (b ? "==" : "!="));

        b = Arrays.equals(intArray, arrayFill);
        System.out.printf("intArray %s filledIntArray%n", (b ? "==" : "!="));


        int location = Arrays.binarySearch(intArray, 5);
        if (location >= 0) {
            System.out.printf("Found 5 at element %d in intArray%n", location);
        } else {
            System.out.println("5 not found in intArray");
        }

        location = Arrays.binarySearch(intArray, 8763);
        if (location >= 0) {
            System.out.printf(
                    "Found 8763 at element %d in intArray%n", location);
        } else {
            System.out.println("8763 not found in intArray");
        }
    }


    private static void displayArray(int[] array, String description) {
        System.out.printf("%n%s: ", description);

        for (int value : array) {
            System.out.printf("%d ", value);
        }
    }


}
