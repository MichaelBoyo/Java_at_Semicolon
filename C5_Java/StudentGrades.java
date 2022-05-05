package C5_Java;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a =0;
        int b =0;
        int c =0;
        int d =0;
        int f =0;

        int i=1;


        System.out.print("enter your name: ");
        String name = scanner.next();
        System.out.print("enter your letter grade(A-E): ");
        String grade = scanner.next();

        while(i<=5){
            switch (grade) {
                case "A" -> a++;
                case "B" -> b++;
                case "C" -> c++;
                case "D" -> d++;
                default->f++;
            }
            i++;
            System.out.print("enter your name: ");
            name = scanner.next();
            System.out.print("enter your letter grade(A-E): ");
            grade = scanner.next();
        }
        System.out.println("Result Summary:");
        System.out.println("No of Students that got A: "+a);
        System.out.println("No of Students that got B: "+b);
        System.out.println("No of Students that got C: "+c);
        System.out.println("No of Students that got D: "+d);
        System.out.println("No of Students that got F: "+f);


    }
}
