package C4_Java;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalScore = 0;
        int i = 1;
        while (i <= 10) {
            System.out.print("Enter Grade: ");
            int grade = scanner.nextInt();
            totalScore = totalScore + grade;
            i++;
        }
        int average = totalScore / 10;
        System.out.println("The average is " + average);
    }
}
