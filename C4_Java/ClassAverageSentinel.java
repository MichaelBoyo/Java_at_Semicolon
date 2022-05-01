package C4_Java;

import java.util.Scanner;

public class ClassAverageSentinel {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int totalScore = 0;
         int scoreCount = 0;
        System.out.print("Enter sore or -1 to end: ");
        int score= scanner.nextInt();

         while( score != -1){
             totalScore = totalScore + score;
             scoreCount = scoreCount +1;

             System.out.print("Enter sore or -1 to end: ");
             score= scanner.nextInt();
        }
         if(scoreCount != 0){
             double average = (double )totalScore / scoreCount;
             System.out.printf("the average is %.2f", average);
         }
         else{
             System.out.println("no grades were entered");
         }
    }
}
