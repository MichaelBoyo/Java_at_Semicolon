package C5_Java.Chibuzo_Assg;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest= 0;
        int smallest = 0;

        System.out.print("Enter numbers not more than 9 digits each or -1 to end: ");
        int numbers = input.nextInt();
        int i=0;
        while (numbers!=-1) {
            while(i<=numbers){
               if(numbers>largest){largest =numbers;}
                i++;
            }
            while(i>=numbers){
                if(numbers<largest){smallest =numbers;}
                i--;
            }
            i++;
            System.out.print("Enter numbers not more than 9 digits each or -1 to end: ");
            numbers = input.nextInt();
        }
        if(largest!=0){System.out.println(largest+" is the largest number");}
        if (smallest != 0) {System.out.println(smallest+" is the smallest number");}

    }
}
