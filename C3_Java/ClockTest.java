package C3_Java;

public class ClockTest {
    public static void main(String... args) {
        Clock eden = new Clock(40, 54,13);

        eden.setHour(40);
        eden.setMinute(54);
        eden.setSecond(13);

        System.out.printf("the time is %d:%d:%d", eden.getHour(), eden.getMinute(), eden.getSecond());
    }
}
