package C6_Java;

public class TestForLeapYear {
    private static boolean isLeapYear(int year){
        return year % 4 == 0 && year != 0 && year % 400 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2001));
        System.out.println(isLeapYear(2003));
        System.out.println(isLeapYear(2000));
    }
}
