//initialize gallons to 0
//initialize mileage to 0
// initialize totalGallons to 0
// initialize totalMileage to 0
// initialize gallonsCounter to 0
// initialize mileageCounter to 0

// prompt uer to enter gallons
// while gallonsCounter is not equal to -1
//collect gallon inputs
// get the totalGallon by adding gallon input to totalGallons
// add 1 to gallonsCounter
//calculate the average gallon by dividing totalGallons by gallonsCounter
// print average gallon

// prompt uer to enter mileage
// while mileageCounter is not equal to -1
//collect mileage inputs
// get the totalMileage by adding mileage inputs to totalMileage
// add 1 to mileageCounter
//calculate the average mileage by dividing totalMileage by mileageCounter
// print average mileage

package C4_Java;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gallons ;
        int mileage;
        int totalGallons = 0;
        int totalMileage = 0;
        int gallonsCounter = 0;
        int mileageCounter = 0;

        System.out.print("Enter gallon or -1 to end: ");
        gallons = scanner.nextInt();

        while(gallons != -1 ){
             totalGallons = totalGallons+ gallons;
             gallonsCounter = gallonsCounter +1;

            System.out.print("Enter gallon or -1 to end: ");
            gallons = scanner.nextInt();
        }
        if(gallonsCounter!=0){
        double averageGallons= (double) totalGallons/ gallonsCounter;

        System.out.println("average gallons is "+ averageGallons);}
        else{
            System.out.println("no gallons were entered");
        }

        System.out.print("Enter mileage or -1 to end: ");
        mileage =scanner.nextInt();

        while(mileage != -1){
           totalMileage = totalMileage + mileage;
            mileageCounter = mileageCounter +1;

            System.out.print("Enter mileage or -1 to end: ");
            mileage =scanner.nextInt();
        }
        if(mileageCounter != 0){
        double averageMileage= (double) totalMileage/gallonsCounter;
        System.out.println("average mileage  is "+ averageMileage);}

        else{
            System.out.println("no mileage was entered");
        }
    }
}
