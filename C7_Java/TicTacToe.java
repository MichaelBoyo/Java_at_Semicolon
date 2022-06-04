package C7_Java;

import java.util.Objects;

public class TicTacToe {
    private final String[][] ticTacTo;
    private final int SIZE =3;
    private enum plays {X, O, EMPTY}

    public TicTacToe(){
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


    public void player1(int num) {


        for (int i = 0; i < ticTacTo.length; i++) {
            for (int j = 0; j < ticTacTo.length; j++) {

                if (num >= 1 && num <= 3 && i == 0 && Objects.equals(ticTacTo[0][num - 1], " ")) {
                    ticTacTo[i][num - 1] = String.valueOf(plays.X);
                }
                if (num >= 4 && num <= 6 && i == 1 && Objects.equals(ticTacTo[1][num - 4], " ")) {
                    ticTacTo[i][num - 4] = String.valueOf(plays.X);
                }
                if (num >= 7 && num <= 9 && i == 2 && Objects.equals(ticTacTo[2][num - 7], " ")) {
                    ticTacTo[i][num - 7] = String.valueOf(plays.X);
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
    public void player2(int num) {

        for (int i = 0; i < ticTacTo.length; i++) {
            for (int j = 0; j < ticTacTo.length; j++) {
                if (num >= 1 && num <= 3 && i == 0 && Objects.equals(ticTacTo[0][num - 1], " ")) {
                    ticTacTo[i][num - 1] = String.valueOf(plays.O);
                }
                if (num >= 4 && num <= 6 && i == 1 && Objects.equals(ticTacTo[1][num - 4], " ")) {
                    ticTacTo[i][num - 4] = String.valueOf(plays.O);
                    ;
                }
                if (num >= 7 && num <= 9 && i == 2 && Objects.equals(ticTacTo[2][num - 7], " ")) {
                    ticTacTo[i][num - 7] = String.valueOf(plays.O);
                    ;
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

    public String result1() {
        String result = " ";
        String p = String.valueOf(plays.X);
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
            result = "Player 1 wins";
        }
        return result;
    }

    public String result2() {
        String result = " ";
        String p = String.valueOf(plays.O);
        ;
        int row1 = 0, row2 = 0, row3 = 0;
        int column1 =0, column2=0, column3=0;
        int diagonal1=0, diagonal2=0;
        for (int i = 0; i <3 ; i++) {
            if (Objects.equals(ticTacTo[0][i], p)) {
                row1+=1;
            }
            if (Objects.equals(ticTacTo[1][i], p)) {
                row2+=1;
            }
            if (Objects.equals(ticTacTo[2][i], p)) {
                row3+=1;
            }
            if (Objects.equals(ticTacTo[i][0], p)) {
                column1+=1;
            }
            if (Objects.equals(ticTacTo[i][1], p)) {
                column2+=1;
            }
            if (Objects.equals(ticTacTo[i][2], p)) {
                column3+=1;
            }
            if (Objects.equals(ticTacTo[i][i], p)) {
                diagonal1+=1;
            }
            if (Objects.equals(ticTacTo[i][2-i], p)) {
                diagonal2+=1;
            }
        }
        if (row1==3||row2==3||row3==3||column1==3||column2==3||column3==3||diagonal1==3||diagonal2==3){
            result="Player 1 wins";
        }
        return result;
    }
}