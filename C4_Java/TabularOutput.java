package C4_Java;

public class TabularOutput {
    public static void main(String[] args) {
        int i;
        int j;

        System.out.print("n\0b2\tn1\tn2\tn3\tn4");

        System.out.println();System.out.println();

        for(i=1;i<=5;i++){
            System.out.print(1 + "\t");
        }

        System.out.println();

        for(j=1;j<=5;j++){
            System.out.print(2 * j + "\t");
        }
        System.out.println();

        for(j=1;j<=5;j++){
            System.out.print(3 * j + "\t");
        }
        System.out.println();

        for(j=1;j<=5;j++){
            System.out.print(4 * j + "\t");
        }
        System.out.println();

        for(j=1;j<=5;j++){
            System.out.print(5 * j + "\t");
        }
    }
}
