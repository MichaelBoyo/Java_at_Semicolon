package C7_Java;

public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards test = new DeckOfCards();
        test.shuffle();

        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-19s", test.dealCard());

            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}
