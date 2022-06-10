package C7_Java;

import java.util.Objects;

public class TicTacToe {
    private final String[][] ticTacTo;

    private enum plays {X, O, EMPTY}

    public TicTacToe(){
        int SIZE = 3;
        ticTacTo=new String[SIZE][SIZE];
    }
    public void display() {
        int  q=1;
        for (int i = 0; i < ticTacTo.length; i++) {
            for (int j = 0; j < ticTacTo.length; j++) {
                    ticTacTo[i][j] = "%d";
                    ticTacTo[i][j] = ticTacTo[i][j].formatted(j + q);
            }
            q+=3;
        }

        for (int i = 0; i < ticTacTo.length; i++) {
            for (int j = 0; j < ticTacTo.length; j++) {
                System.out.print(ticTacTo[i][j] + "     ");
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-------------");
            }

        }

        System.out.println();
        System.out.println("Enter any number from the board to play");
        System.out.println("player 1: X \n" +
                "Player 2: O");

        System.out.println("         *-----GAME HAS STARTED------*");

        for (int i = 0; i < ticTacTo.length; i++) {
            for (int j = 0; j < ticTacTo.length; j++) {
                ticTacTo[i][j] = " ";
            }
        }
    }

    public void play(int num, String player) {
        String play = String.valueOf(plays.X);
        if(player.equals("O")){
            play = String.valueOf(plays.O);
        }
        for (int i = 0; i < ticTacTo.length; i++) {
            for (int j = 0; j < ticTacTo.length; j++) {

                if (num >= 1 && num <= 3 && i == 0 && Objects.equals(ticTacTo[0][num - 1], " ")) {
                    ticTacTo[i][num - 1] = play;
                }
                if (num >= 4 && num <= 6 && i == 1 && Objects.equals(ticTacTo[1][num - 4], " ")) {
                    ticTacTo[i][num - 4] = play;
                }
                if (num >= 7 && num <= 9 && i == 2 && Objects.equals(ticTacTo[2][num - 7], " ")) {
                    ticTacTo[i][num - 7] = play;
                }
            }
        }
        for (int i = 0; i < ticTacTo.length; i++) {
            for (int j = 0; j < ticTacTo.length; j++) {
                System.out.print(ticTacTo[i][j] + "     ");
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-------------");
            }
        }
    }
    public int draw(){
        int result= 0;
        for (String[] strings : ticTacTo) {
            for (int j = 0; j < ticTacTo.length; j++) {
                if (!Objects.equals(strings[j], " ")) {
                    result ++;
                }
            }
        }
        return result;
    }

    public String result(String player) {
        String result = " ";
        String p = String.valueOf(plays.O);
        if(Objects.equals(player, "X")) p = String.valueOf(plays.X);

        int row1 = 0, row2 = 0, row3 = 0;
        int col1 = 0, col2 = 0, col3 = 0;
        int dgn1 = 0, dgn2 = 0;
        for (int i = 0; i < ticTacTo.length; i++) {
            if (Objects.equals(ticTacTo[0][i], p)) row1++;
            if (Objects.equals(ticTacTo[1][i], p)) row2++;
            if (Objects.equals(ticTacTo[2][i], p)) row3++;

            if (Objects.equals(ticTacTo[i][0], p)) col1++;
            if (Objects.equals(ticTacTo[i][1], p)) col2++;
            if (Objects.equals(ticTacTo[i][2], p)) col3++;

            if (Objects.equals(ticTacTo[i][i], p)) dgn1++;
            if (Objects.equals(ticTacTo[i][2 - i], p)) dgn2++;
        }

        if (row1 == 3 || row2 == 3 || row3 == 3 || col1 == 3 || col2 == 3 || col3 == 3 || dgn1 == 3 || dgn2 == 3) {
            result = "Player 2 wins";
            if(p.equals(String.valueOf(plays.X))) result = "Player 1 wins";
        }
        return result;
    }
}