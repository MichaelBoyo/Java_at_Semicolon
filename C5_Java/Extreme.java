package C5_Java;

import java.util.Scanner;

public class Extreme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max =0;
        int min=999999999;
        int i=2;

        System.out.print("Enter 10 integers and enter 0 to terminate:");
        int number=scanner.nextInt();
        do{
           if(number> max){
               max = number;
           }
           if(number<min){
               min = number;
           }
            System.out.print("Enter integer "+i+":");
            number=scanner.nextInt();
            i++;
        }while(number!=0 && i<=10);

        System.out.println("the largest number is "+max);
        System.out.println("the smallest number is "+min);

        int sum= max+ min;
        System.out.println("the sum of the largest and smallest is "+sum);


    }
}
