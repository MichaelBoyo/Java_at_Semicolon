package C7_Java;

import java.util.Objects;
import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        game.display();

        String result = " ";
        int full =0;
        do{
            System.out.print("Player 1 lets Go>> ");
            game.player1(input.nextInt());
            result =game.result1();
            if(Objects.equals(result, " ")){
                System.out.print("Player 2 lets Go>> ");
                game.player2(input.nextInt());
                result = game.result2();
            }
            full = game.draw();


        }while (Objects.equals(result, " ")&& full !=9);
        if(full==9){
            System.out.println("No winner..");
        }
        if(!Objects.equals(result, " ")){
            System.out.println(result);
        }


    }
}
