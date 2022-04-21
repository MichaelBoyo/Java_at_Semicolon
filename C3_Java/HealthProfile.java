package C3_Java;

public class HealthProfile {
    private String name;
    private String gender;
    private int YearOfBirth;
    private String MonthOfBirth;
    private int DayOfBirth;
    private int HeightInInches;
    private double WeightInPounds;

    public HealthProfile(){}

    public HealthProfile(String name, String gender, int YearOfBirth, String MonthOfBirth, int DayOfBirth, int HeightInInches, double WeightInPounds){
        this.name=name;
        this.gender=gender;
        this.YearOfBirth=YearOfBirth;
        this.MonthOfBirth=MonthOfBirth;
        this.DayOfBirth=DayOfBirth;
        this.HeightInInches=HeightInInches;
        this.WeightInPounds=WeightInPounds;
    }
    public void setName(String Name){name = Name;}
    public void setGender(String gender) {this.gender = gender;}
    public void setYearOfBirth(int yearOfBirth) {
       if(YearOfBirth > 1940) this.YearOfBirth = yearOfBirth;}
    public void setMonthOfBirth(String monthOfBirth) {MonthOfBirth = monthOfBirth;}
    public void setDayOfBirth(int dayOfBirth) {
        if(DayOfBirth > 0 && DayOfBirth < 31) this.DayOfBirth = dayOfBirth;}
    public void setHeightInInches(int heightInInches) {HeightInInches = heightInInches;}
    public void setWeightInPounds(double weightInPounds) {WeightInPounds = weightInPounds;}

    public String getName(){return name;}
    public String getGender() {return gender;}
    public int getYearOfBirth() {return YearOfBirth;}
    public String getMonthOfBirth() {return MonthOfBirth;}
    public int getDayOfBirth() {return DayOfBirth;}
    public int getHeightInInches() {return HeightInInches;}
    public double getWeightInPounds() {return WeightInPounds;}

    public int getAge(){
        int currentYear = 2022;
        int age;
        age = currentYear - YearOfBirth;
        return age;
    }
    public int getMaxHeartRate(){
        int MaxHeartRate;
        MaxHeartRate = 200 - getAge();
        return MaxHeartRate;
    }
    public double getTargetHeartRate(){
        double TargetHeartRate;
        TargetHeartRate = getMaxHeartRate() / 0.67;
        return TargetHeartRate;
    }
    public double getBMI(){
        double BMI;
        BMI = getWeightInPounds() * 0.45359237 / Math.pow((getHeightInInches() *  0.0254), 2);
        return BMI;
    }
}

