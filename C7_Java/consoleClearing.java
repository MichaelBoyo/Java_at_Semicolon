package C7_Java;

public class consoleClearing {
    public static void main(String... args) {
        for (int i = 1; i < 4; i++) {
            System.out.println("This code will get erased after it is printed " + (4 - i) + " more time(s)");
            try {
                Thread.sleep(2000);
            } catch (Exception ignored) {

            }
        }

        // code to clear screen
        System.out.print("\f");
        clearScreen();
        // printing after erased
        System.out.println("Code was erased!!");

    }

    public static void clearScreen() {

        System.out.print("\033[H\033[2J");

        System.out.flush();
    }
}