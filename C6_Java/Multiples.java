package C6_Java;

public class Multiples {
    private static boolean isMultiple(int num1, int num2){
        return num1%num2==0;
    }

    public static void main(String[] args) {
        System.out.println(isMultiple(2,3));
        System.out.println(isMultiple(16,4));
    }
}
