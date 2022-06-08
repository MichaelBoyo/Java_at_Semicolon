package C6_Java;

import java.util.Scanner;

import static C8_Java.Java_Flex.Ober.displayln;
import static C8_Java.Java_Flex.Ober2.display;

public class ParkingCharges {
    private static final int chargesPer3Hours = 2;
    private static final double chargesPerHourAfter3Hours = 0.5;
    private static final int maxChargePer24Hours = 10;

    public static void main(String[] args) {
        calculateCharges();
    }

    private static void calculateCharges() {
        Scanner hoursParked = new Scanner(System.in);

        display("Enter Hours parked: ");
        int hours = hoursParked.nextInt();
        double chargesPerCustomer = 0;
        double totalCharges = 0;

        while(hours!=0){

            if (hours == 3){
                chargesPerCustomer =chargesPer3Hours;
            }
            if (hours>3&& hours<24){
                chargesPerCustomer = chargesPer3Hours + ((hours-3)*0.5);
            }
            if(hours== 24){
                chargesPerCustomer= maxChargePer24Hours;
            }
            totalCharges +=chargesPerCustomer;
            displayln("your charge is $"+chargesPerCustomer);


            display("Enter Hours parked: ");
             hours = hoursParked.nextInt();
        }
        display("total receipts yesterday is $"+totalCharges);
    }

}
