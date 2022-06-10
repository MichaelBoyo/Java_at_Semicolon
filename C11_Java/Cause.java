package C11_Java;

import java.util.Scanner;

public class Cause {
    public static void main(String[] args) {
        try {
            collectInput();
        }catch (Cohort11_Exception e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }finally {
            System.out.println("idiot");
        }
    }
    public static void collectInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int input = s.nextInt();
        if(input<0){
            throw  new Cohort11_Exception("wrong input");
        }
    }

}
;