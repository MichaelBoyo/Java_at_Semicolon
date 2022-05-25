package C7_Java;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        int[][] grades = new int[3][3];
        GradeBook school1= new GradeBook("java",grades);
        
        Scanner scanner = new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter score for SUBJECT 1: ");
            school1.setScore(scanner.nextInt());

            System.out.println("Enter score for SUBJECT 2: ");
            school1.setScore(scanner.nextInt());

            System.out.println("Enter score for SUBJECT 3: ");
            school1.setScore(scanner.nextInt());

            System.out.println("Press 0 to end  or 1 to enter another score:");
            input = scanner.nextInt();
        }while (input!=0);

        school1.processGrades();
    }
//    GradeBook test = new GradeBook(java,)
}
