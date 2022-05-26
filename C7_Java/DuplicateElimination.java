package C7_Java;

import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];

        int counter = 0;
        do {
            System.out.println("enter numbers between 10 -100: ");
            num[counter] = scanner.nextInt();
            counter++;

        } while (num[num.length - 1] == 0);

        System.out.println("Result");

        int[] a = ArrayDuplicateEliminationAlgo.duplicateEliminate(num);
        for (int j : a) {
            System.out.println(j);
        }
    }
}