package C6_Java;

public class PerfectNumber {
    public static boolean isPerfect(int num) {
        int sumOfFactors = 0;

        for (int j = 1; j < num; j++) {
            if (num % j == 0) {
                sumOfFactors += j;
            }
        }
        return sumOfFactors == num;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {

            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
}
