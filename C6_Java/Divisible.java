package C6_Java;

public class Divisible {
    private static boolean isDivisible(int num){
        return num%5==0;
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(4));
        System.out.println(isDivisible(15));
    }
}
