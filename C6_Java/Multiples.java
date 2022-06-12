package C6_Java;

public class Multiples {
    public static boolean isMultiple(int num1, int num2) {
        //this method returns true if the num1 is multiple of the num2
        return num1 % num2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isMultiple(2, 3));
        System.out.println(2%3);
        System.out.println(isMultiple(16, 4));
    }
}
