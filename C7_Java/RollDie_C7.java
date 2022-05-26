package C7_Java;

import java.util.Random;

public class RollDie_C7 {
     static Random random= new Random();
    static int[][] outcomes =new int[6][6];
    public static void main(String[] args) {
        rollDie();
        System.out.print("  ");

        for (int i = 1; i <=6; i++) {
            System.out.printf("%5d",i);
        }

        System.out.println();
        System.out.println("-".repeat(32));
        for (int i = 0; i < outcomes.length ; i++) {
            System.out.print(i+1+"|");
            for (int j = 0; j < outcomes.length ; j++) {
                System.out.printf("%5d",outcomes[i][j]);
            }
            System.out.println();
            System.out.println("+".repeat(32));

        }
    }
    public static void  rollDie(){
        int roll = random.nextInt(6)+1;
        int roll2 = random.nextInt(6)+1;
        for (int k = 0; k <36_000_000 ; k++) {

            for (int i = 0; i <outcomes.length ; i++) {
                for (int j = 0; j < outcomes.length; j++) {
                    if(outcomes[i][j]==0){
                        outcomes[i][j]=roll+roll2;
                        roll = random.nextInt(6)+1;
                        roll2 = random.nextInt(6)+1;
                    }
                }
            }
        }


    }
}
