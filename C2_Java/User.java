package C2_Java;

import java.util.Scanner;

public class User{
    public static void main(String... args){
        Scanner num = new Scanner(System.in);

        System.out.print("enter either 1 or 0: ");
                int Num = num.nextInt();

                if(Num == 1){
                    System.out.print("the num is 0");
                }
        if(Num == 0){
            System.out.print("the num is 1");
        }
    }
}