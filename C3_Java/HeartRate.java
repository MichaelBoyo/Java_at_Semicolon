package C3_Java;

public class HeartRate {
    private String fullName;
    private int day;
    private String month;
    private int year;

    public HeartRate(String fullName, int day, String month, int year) {
        this.fullName = fullName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getFullName() {return fullName;}
    public int getDay() {return day;}
    public String getMonth() {return month;}
    public int getYear() {return year;}
    public void setFullName(String fullName) {this.fullName = fullName;}
    public void setDay(int day) {if (day > 0 && day < 31) {this.day = day;}}
    public void setMonth(String month) {this.month = month;}
    public void setYear(int year) {if (year > 1940) {this.year = year;}}
    public int calculateAge () {
        int currentYear = 2022;
        int age;
        age = currentYear - year;
        return age;
    }
    public int calculateMaximumHeartRate () {
        int heartRate;
        heartRate = 220 - calculateAge();
        return heartRate;
    }
    public double targetHeartRate () {
        // Average
        double targetHeartRate;
        targetHeartRate = calculateMaximumHeartRate() * .675;
        return targetHeartRate;
    }
}