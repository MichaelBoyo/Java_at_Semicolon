package C7_Java;

import java.util.Arrays;

public class Stuff {
    public static void deposit(int money){
        money = money *10;
        System.out.println("new money is "+money);
    }

    public static void main(String[] args) {
//        int money = 100;
//        deposit(money);
//        System.out.println("local variable money is still "+money);
//        int[] values ={1,2,3,4,5,6,7,8,9};
//        deposit(values);
//        System.out.println(Arrays.toString(values));
        String amount = "500";
        deposit(amount);
        System.out.println(amount);
    }
    public static void deposit(int[] values){
        values[0]=70;
        values[values.length-1]= 89;
    }
    public static void deposit(String amount){
        amount= amount+3;
        System.out.println(amount);
    }
}
