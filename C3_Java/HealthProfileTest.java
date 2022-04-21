package C3_Java;

import java.util.Scanner;
public class HealthProfileTest {
    public static void main(String... args){

            Scanner userInput = new Scanner(System.in);

            System.out.print("Enter your full name: ");
            String name = userInput.nextLine();

            System.out.print("Enter your gender: ");
            String gender = userInput.next();

            System.out.print("Enter your year of birth: ");
            int YearOfBirth = userInput.nextInt();

            System.out.print("Enter your month of birth: ");
            String MonthOfBirth = userInput.next();

            System.out.print("Enter your day of birth: ");
            int DayOfBirth = userInput.nextInt();

            System.out.print("Enter your height in inches: ");
            int HeightInInches = userInput.nextInt();

            System.out.print("Enter your weight in pounds: ");
            double WeightInPounds = userInput.nextDouble();

            HealthProfile Patient = new HealthProfile(name,gender,YearOfBirth,MonthOfBirth,DayOfBirth,HeightInInches,WeightInPounds);
            printInfo(Patient);

    }
    public static HealthProfile Patient(String name, String gender, int YearOfBirth, String MonthOfBirth, int DayOfBirth,int HeightInInches,double WeightInPounds){
        HealthProfile Patient;
        Patient = new HealthProfile(name,gender,YearOfBirth,MonthOfBirth,DayOfBirth,HeightInInches,WeightInPounds);
        return Patient;
    }
    public static void printInfo(HealthProfile Patient){
        System.out.printf("%s's age is %d%n", Patient.getName(), Patient.getAge());
        System.out.printf("%s Max Heart Rate is %d%n", Patient.getName(), Patient.getMaxHeartRate());
        System.out.printf("%s Target Heart Rate is %f%n", Patient.getName(), Patient.getTargetHeartRate());
        System.out.printf("%s BMI is %.2f%n", Patient.getName(), Patient.getBMI());

    }

}
