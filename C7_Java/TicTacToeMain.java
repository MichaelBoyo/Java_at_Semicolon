package C7_Java;
import java.util.*;

public class TicTacToeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        do{game.display();
            ticTacToe(input, game);
            System.out.println("press 1 to play again or 0 to end");
        }while (input.nextInt()!= 0);
    }
    private static void ticTacToe(Scanner input, TicTacToe game) {
        List<Integer> choices = new ArrayList<>();
        String result = " ";
        int full =0;
        try{do{System.out.print("Player 1 lets Go>> ");
            int play = validateInput(input, choices);
            choices.add(play);
                game.play(play,"X");
                result = game.result("X");
                if(Objects.equals(result, " ")){
                    System.out.print("Player 2 lets Go>> ");
                    int play2 = validateInput(input,choices);
                    choices.add(play2);
                    game.play(play2,"O");
                    result = game.result("O");}
                full = game.draw();
            }while (Objects.equals(result, " ")&& full !=9);
        }catch (InputMismatchException e){System.out.println("Wrong Input.. restart application");}
        if(full==9) System.out.println("No winner..");
        if(!Objects.equals(result, " ")) System.out.println(result);
    }

    private static int validateInput(Scanner input, List<Integer> choices) {
        int play = input.nextInt();
        for (Integer integer : choices) {
            while (play == integer || play>9) {
                if(play>9){
                    System.out.print("invalid input.. choose a valid spot ");
                }
                if(play ==integer) System.out.printf("slot %d taken play again:",play);
                play = input.nextInt();
            }
        }
        return play;
    }
}