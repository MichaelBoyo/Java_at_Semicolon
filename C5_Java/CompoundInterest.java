package C5_Java;

public class CompoundInterest {
    public static void main(String[] args) {
        int p = 1000;
        double r = 0.05 + 1;
        System.out.printf("%s%20s%n", "Year", "Amount");
        for (int n = 1; n <= 10; n++) {
            double a = p * Math.pow(r, n);
            System.out.printf("%4d%,22.2f%n", n, a);
        }
    }
}
