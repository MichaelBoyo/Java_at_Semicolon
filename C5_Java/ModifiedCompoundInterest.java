package C5_Java;

public class ModifiedCompoundInterest {
    public static void main(String[] args) {
        double a;
        int p = 1000;
        double r = 0.05;
        int n = 1;
        System.out.printf("%s%20s%n", "Year", "Amount");

            do {


                a = p * Math.pow(1 + r, n);
                System.out.printf("%4d%,22.2f%n", n, a);
                n++;
                r+=0.01;
            } while (n <= 10);


    }
}