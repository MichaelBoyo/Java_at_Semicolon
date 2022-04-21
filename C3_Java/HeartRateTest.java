package C3_Java;

import java.util.Scanner;

public class HeartRateTest {


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = userInput.nextLine();

        System.out.print("Enter your day of birth: ");
        int day = userInput.nextInt();

        System.out.print("Enter your month of birth: ");
        String month = userInput.next();

        System.out.print("Enter your year of birth: ");
        int year = userInput.nextInt();

        HeartRate patient1 = createPatient(fullName, day, month, year);
        printInformation(patient1);
    }
    public static HeartRate createPatient (String fullName, int day, String month, int year) {
        HeartRate patient;
        patient = new HeartRate(fullName, day, month, year);
        return patient;
    }

    public static void printInformation (HeartRate patient) {
        System.out.printf("%s, born on %d %s %d, is %d years old.%n", patient.getFullName(), patient.getDay(), patient.getMonth(), patient.getYear(), patient.calculateAge());
        System.out.printf("Maximum heart rate: %d bpm.%n", patient.calculateMaximumHeartRate());
        System.out.printf("Target heart rate of %s is %.2f bpm.%n", patient.getFullName(), patient.targetHeartRate());
    }
}