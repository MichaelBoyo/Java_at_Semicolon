package C5_Java;

import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {
        int sumTotal= 0;
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int f=0;
        int i = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the integer grades in the range 0-100 or -1 to terminate: ");

        while (scanner.hasNext()){
            int grades = scanner.nextInt();

            sumTotal+=grades;
            ++i;
            switch (grades){
                case 90:
                case 100:
                    ++a;
                    break;
                case 80:
                    ++b;
                    break;
                case 70:
                    ++c;
                    break;
                case 60:
                    ++d;
                    break;
                default:
                    ++f;
            }
        }
        System.out.println("Grade Report: ");
        if(i!=0){
            double average = (double) sumTotal / i;
            System.out.printf("Total of the %d grades entered is %d%n",
                    i, sumTotal);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of students who received each grade:",
                    "A: ", a, "B: ", b, "C: ", c, "D: ", d, "F: ", f);
        }
        else {System.out.println("No grades were entered");}
    }
}
