package C7_Java;


public class TortoiseAndHareMain {
    public static void main(String[] args) {
        TortoiseAndHare game = new TortoiseAndHare();

        System.out.println("""
                BANG !!!!!!
                AND THEY'RE OFF!!!!
                """);

        while (game.checkHareMoves() != 70 && game.getNumberOfSquares() != 70) {
            game.hareMove("H ");
            game.tortoiseMove("T ");

            System.out.printf("""
                    hare moved %d
                    tortoise moved %d
                    """, game.checkHareMoves(), game.getNumberOfSquares());
            System.out.println();
            try
            {Thread.sleep(2000);}
            catch(Exception ignored) {}
        }

        game.printHareTrack();
        System.out.println();
        game.printTortoiseTrack();
        System.out.println();
        if (game.checkHareMoves() == 70) {
            System.out.println("hare won");
            System.out.println(game.checkHareMoves());
            System.out.println(game.getNumberOfSquares());
        } else {
            System.out.println("tortoise won");
            System.out.println(game.getNumberOfSquares());
        }
    }
}