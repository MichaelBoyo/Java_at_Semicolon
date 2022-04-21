package C3_Java;

public class ClockTest {
    public static void main(String... args) {
        Clock mike = new Clock();
        mike.setHour(23);
        mike.setMinute(54);
        mike.setSecond(13);

        System.out.printf("the time is %d:%d:%d", mike.getHour(), mike.getMinute(), mike.getSecond());
    }
}
