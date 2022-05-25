package Chibuzo_Assg;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoboSchool {


   public static void main(String[] args) {
       StudentGradeTracker school1 = new StudentGradeTracker(3, 3);
       Scanner scanner = new Scanner(System.in);
       int input;
       try {
           do {
               input = prompt(school1, scanner);
           } while (input != 0);
       } catch (InputMismatchException e) {
           System.out.println("you entered the wrong input");
       }
       header();
       System.out.println(Arrays.toString(school1.getScore(1)));
       footer();


   }

    private static int prompt(StudentGradeTracker school1, Scanner scanner) {
        int input;
        System.out.println("Enter score for SUBJECT 1: ");
        school1.setScore(scanner.nextInt());

        System.out.println("Enter score for SUBJECT 2: ");
        school1.setScore(scanner.nextInt());

        System.out.println("Enter score for SUBJECT 3: ");
        school1.setScore(scanner.nextInt());

        System.out.println("Press 0 to end  or 1 to enter another score:");
        input = scanner.nextInt();
        return input;
    }
    static void data(StudentGradeTracker school1){
        int score1 = school1.getStudent1Scores(0);
        int score2 = school1.getStudent1Scores(1);
        int score3 = school1.getStudent1Scores(2);
        int total = school1.getStudentTotal(1);

        int score11 = school1.getStudent2Scores(0);
        int score22 = school1.getStudent2Scores(1);
        int score33 = school1.getStudent2Scores(2);
        int total1 = school1.getStudentTotal(2);

        int score12 = school1.getStudent3Scores(0);
        int score21 = school1.getStudent3Scores(1);
        int score32 = school1.getStudent3Scores(2);
        int total3 = school1.getStudentTotal(3);

        int student1Average= school1.getAverage(1);
        int student2Average= school1.getAverage(2);
        int student3Average= school1.getAverage(3);

        int position1 =school1.getStudentPositionFromGrade(student1Average);
        int position11 =school1.getStudentPositionFromGrade(student2Average);
        int position3 =school1.getStudentPositionFromGrade(student3Average);

        System.out.printf("%s %7d %7d %8d %6d %7d %4d %n","STUDENT'1",score1,score2,score3,total,student1Average,position1);

        System.out.printf("%s %7d %7d %8d %6d %7d %4d %n","STUDENT'2",score11,score22,score33,total1,student2Average,position11);

        System.out.printf("%s %7d %7d %8d %6d %7d %4d %n","STUDENT'3",score12,score21,score32,total3,student3Average,position3);
    }

    static void header() {
        receiptLine();
        System.out.printf("%s %10s %7s %8s %5s %6s %6s %n", "STUDENT", "SUB1", "SUB2", "SUB3", "TOT", "AVE", "POS");
        receiptLine();
    }

    private static void receiptLine() {
        for (int i = 0; i < 55; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    static void footer() {
        receiptLine();
        receiptLine();
        System.out.println();
    }
    static void sub1Summary(StudentGradeTracker school1){
        System.out.println("*".repeat(21));
        System.out.println("SUBJECT 1 SUMMARY ***");
        System.out.println("*".repeat(21));

        String highestScoringStudent  = school1.getSub1BestStudent();
        String lowestScoringStudent = school1.getSub1WorstStudent();

    }

}