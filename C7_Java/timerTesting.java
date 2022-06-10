package C7_Java;


public class timerTesting {
    public static void main(String[] args) {
        TortoiseAndHare game = new TortoiseAndHare();
        System.out.println("""
                BANG !!!!!!
                AND THEY'RE OFF!!!!
                """);
        try {
            while (game.checkHareMoves() != 70 && game.getNumberOfSquares() != 70) {
                game.hareMove("H ");
                game.tortoiseMove("T ");
                int remain = 70 - game.checkHareMoves();
                int remin = 70 - game.getNumberOfSquares();
                System.out.println("=".repeat(70)+" F");
                System.out.println(" ".repeat(game.checkHareMoves()) + "H" + " ".repeat(remain)
                        + "I Hare position: " + game.checkHareMoves());
                System.out.println("-".repeat(70)+" N");
                System.out.println(" ".repeat(game.getNumberOfSquares()) + "T" + " ".repeat(remin)
                        + "I Tortoise position: " + game.getNumberOfSquares());
                System.out.println("=".repeat(70)+" S");
                System.out.println("=".repeat(70)+" H");
                try {Thread.sleep(1000);}
                catch(Exception ignored) {}
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        if (game.checkHareMoves() >= 70 || game.getNumberOfSquares() >= 70) {
            System.out.println();
            if (game.checkHareMoves() >=70) {
                System.out.println("hare won the race");
            } else {
                System.out.println("tortoise won the race");
            }
        }
    }
}