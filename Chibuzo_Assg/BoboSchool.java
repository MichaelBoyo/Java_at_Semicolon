package Chibuzo_Assg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoboSchool {
    public static void main(String[] args) {
        StudentGradeTracker school1 = new StudentGradeTracker(3,3);
        Scanner scanner = new Scanner(System.in);
        int input;

        try{
            do {

                System.out.println("Enter score for SUBJECT 1: ");
                school1.setScore(scanner.nextInt());

                System.out.println("Enter score for SUBJECT 2: ");
                school1.setScore(scanner.nextInt());

                System.out.println("Enter score for SUBJECT 3: ");
                school1.setScore(scanner.nextInt());

                System.out.println("Press 0 to end  or 1 to enter another name:");
                input = scanner.nextInt();

            } while (input != 0);
        }  catch (InputMismatchException e) {
        System.out.println("you entered the wrong input");
    }


        receiptLine();
        System.out.printf("%s %8s %5s %7s %7s %6s %6s %n", "STUDENT", "SUB1", "SUB2", "SUB3", "TOT", "AVE", "POS");
        receiptLine();
        System.out.print("Student 1"); System.out.print("    ");
        System.out.print(school1.scores[0][0]); System.out.print("    ");
        System.out.print(school1.scores[0][1]); System.out.print("     ");
        System.out.print(school1.scores[0][2]); System.out.print("     "); school1.getStudentTotal(1);
        System.out.print(school1.total[0]); System.out.print("     ");
        System.out.printf("%.2f",school1.getAverage(1)); System.out.print("     ");
        System.out.print(school1.getPosition(1)); System.out.println("     ");

        System.out.print("Student 2"); System.out.print("    ");
        System.out.print(school1.scores[1][0]); System.out.print("    ");
        System.out.print(school1.scores[1][1]); System.out.print("     ");
        System.out.print(school1.scores[1][2]); System.out.print("     "); school1.getStudentTotal(2);
        System.out.print(school1.total[1]); System.out.print("     ");
        System.out.printf("%.2f",school1.getAverage(2)); System.out.print("     ");
        System.out.print(school1.getPosition(2)); System.out.println("     ");



    }

    private static void receiptLine() {
        for (int i = 0; i < 53; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

}