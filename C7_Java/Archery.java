package C7_Java;

import java.util.Random;

public class Archery {
    Random shooting = new Random();
    public int[][] scores;
    public final int CHANCES = 3;

    public Archery(int players) {
        scores = new int[players][CHANCES];
    }

    public int shoot() {
        int random = 1 + shooting.nextInt(10);
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j <CHANCES ; j++) {
                if(scores[i][j]==0){
                    scores[i][j]=random;
                    return random;
                }
            }
        }
        return 0;
    }

    public int playerSum(int playerNumber) {
        int total =0;
        for (int i = 0; i <CHANCES ; i++) {
           total+=scores[playerNumber-1][i];
        }
        return total;
    }
}
