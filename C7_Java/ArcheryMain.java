package C7_Java;

public class ArcheryMain {
    public static void main(String[] args) {
        Archery main = new Archery(4);
        System.out.println("ARCHERY GAME");
        for (int i = 0; i <main.scores.length ; i++) {
            for (int j = 0; j <main.CHANCES ; j++) {
                main.shoot();
            }
        }
        System.out.print("         shoot1    shoot2   shoot3      Total");
        System.out.println();

        for (int i = 0; i < main.scores.length; i++) {
            System.out.print("player"+ (i + 1)+"   ");
            for (int j = 0; j < main.CHANCES; j++) {
                System.out.printf("%4d      ",main.scores[i][j]);
            }
            System.out.printf("%4d",main.playerSum(i+1));
            System.out.println();

        }


    }
}
