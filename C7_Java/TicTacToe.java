package C7_Java;

public class TicTacToe {
    int[][] ticTacTo= new int[3][3];

    public void play(int number) {
        for (int j = 0; j < ticTacTo.length; j++) {
            for (int k = 0; k < ticTacTo.length; k++) {
                if(ticTacTo[j][k]==0){
                    ticTacTo[j][k]=number;
                    return;
                }

            }
        }
    }

    public void displayGame() {

                if (ticTacTo[0][0]==1) {
                    System.out.println("___________________");
                    System.out.println("|  "+"X"+"  |     |    |");
                    System.out.println("___________________");
                    System.out.println("|     |     |    |");
                    System.out.println("___________________");
                    System.out.println("|     |     |    |");

                }
                if (ticTacTo[0][0]==1 && ticTacTo[0][1]==2) {
                    System.out.println("___________________");
                    System.out.println("|  "+"X"+"  |   "+"X"+"  |    |");
                    System.out.println("___________________");
                    System.out.println("|     |     |    |");
                    System.out.println("___________________");
                    System.out.println("|     |     |    |");

                }
        if (ticTacTo[0][0]==1 && ticTacTo[0][1]==2 ) {
            System.out.println("___________________");
            System.out.println("|  "+"X"+"  |   "+"X"+"  |    |");
            System.out.println("___________________");
            System.out.println("|     |     |    |");
            System.out.println("___________________");
            System.out.println("|     |     |    |");

        }




    }

    public void disp() {
        for (int i = 0; i < ticTacTo.length; i++) {

            for (int j = 0; j < ticTacTo.length ; j++) {
                System.out.print(ticTacTo[i][j] + "     ");
            }
            System.out.println();
            System.out.println("-------------");
        }
        System.out.println();
        System.out.println("         *-----GAME HAS STARTED------*");
        System.out.println();
        for (int i = 0; i < ticTacTo.length; i++) {

            for (int j = 0; j < ticTacTo.length ; j++) {
                System.out.print("-" + "     ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public void currentPlay(int num) {
        String shape = "X";

        for (int i = 0; i < ticTacTo.length; i++) {
            for (int j = 0; j < ticTacTo.length ; j++) {
                if (num ==ticTacTo[i][j]){
                    System.out.printf(shape + "     %s %s",currentPlay2(2));

                    System.out.println();
                    System.out.println("-------------");
                    System.out.println();
                    System.out.println("-------------");
                    return;
                }

            }

        }
        System.out.println();
        System.out.println();
    }

    public Object currentPlay2(int num) {
        String shape2 = "O";
        for (int i = 0; i < ticTacTo.length; i++) {
            for (int j = 0; j < ticTacTo.length ; j++) {

                if (num ==ticTacTo[i][j]){

//                    System.out.print(shape2 + "     ");

                    return ("");
                }

            }

        }
        return shape2;
    }

}
