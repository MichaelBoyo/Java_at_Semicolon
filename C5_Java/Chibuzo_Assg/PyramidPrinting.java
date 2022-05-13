package C5_Java.Chibuzo_Assg;

public class PyramidPrinting {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j+"  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"  ");
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
    }
}
