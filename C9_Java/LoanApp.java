package C9_Java;

import java.util.Scanner;

public class LoanApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter principal: ");
        int principal = scanner.nextInt();
        System.out.println("enter loan tenure(years): ");
        int tenure = scanner.nextInt();
        PersonalLoan personalLoan = new PersonalLoan("boyo","mowe","08103297538",principal,tenure);
        System.out.println(personalLoan);

        CarLoan carLoan = new CarLoan("boyo","mowe","08103297538",principal,tenure);
        System.out.println(carLoan);

        HomeLoan homeLoan = new HomeLoan("boyo","mowe","08103297538",principal,tenure);
        System.out.println(homeLoan);

    }
}
