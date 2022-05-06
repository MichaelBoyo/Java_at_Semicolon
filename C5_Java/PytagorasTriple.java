package C5_Java;

public class PytagorasTriple {
    public static void main(String[] args) {
        System.out.printf("%s%17s%20s%n", "Side1", "Side2", "Hypotenuse");

        int i, j, k;
        for (i = 1; i < 500; i++) {
            for (j = 1; j < 500; j++) {
                for (k = 1; k < 500; k++) {

                    if ((Math.sqrt(i) + Math.sqrt(j)) == Math.sqrt(k)) {
                        if (i < j) {
                            System.out.printf("%2d%18d%18d%n", i, j, k);
                        }
                    }
                }
            }
        }
    }
}