package C8_Java;

public class Time1 {
    private int hours;
    private int minutes;
    private int seconds;

    public Time1(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }
    public Time1(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
    public Time1(int hours) {
        this.hours = hours;
    }
    public Time1() {
    }
    public Time1(Time1 time) {
        this(time.hours, time.minutes, time.seconds);
    }


    public void setTime(int hours, int minutes, int seconds) {
        if (hours < 0 || hours >= 24 || minutes < 0 || minutes >= 60 || seconds < 0 || seconds >= 60) {
            throw new IllegalArgumentException("hour, minute and/or seconds is out of range");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }



    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);

    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hours == 0 || hours == 12) ? 12 : hours % 12),
                minutes, seconds, (hours < 12 ? "AM" : "PM"));
    }

    public int getHour() {
        return hours;
    }

    public int getMinute() {
        return minutes;
    }

    public int getSecond() {
        return seconds;
    }
}
