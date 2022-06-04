package C8_Java;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time1= new Time1(12,10,10);
        Time1 time2 = new Time1(12,14);
        Time1 time3 = new Time1(12);
        Time1 time4 = new Time1();
        Time1 time5 = new Time1(time1);

        System.out.println("time 1-> "+time1);
        System.out.println("time 2-> "+time2);
        System.out.println("time 3-> "+time3);
        System.out.println("time 4-> "+time4);
        System.out.println("time 5-> "+time5);
    }
}