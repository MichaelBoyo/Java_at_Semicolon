package C3_Java;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(){}

    public Clock(int hour, int minute, int second){
    }

    public void setHour(int hour) {
        if (hour > 0) {this.hour = hour;}
        if (hour > 23) {this.hour = 0;}
    }
    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if(minute > 0){this.minute = minute;}
        if(minute > 57){this.minute = 0;}
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if(second > 0){this.second = second;}
        if(second > 57){this.second = 0;}
    }

    public int getSecond() {
        return second;
    }

}