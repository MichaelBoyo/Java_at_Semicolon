package C9_Java;

public class CarLoan extends Loan {
    public CarLoan(String email, String address, String phoneNo, int principal, int loanTenure) {
        super(email, address, phoneNo, principal, loanTenure);
    }

    @Override
    public double monthlyInstallments() {
        int interest = 16;
        return super.monthlyInstallments() * interest/100;
    }
    @Override
    public String toString() {
        return String.format("Monthly installment for Car loan rate is %.2f ",monthlyInstallments());
    }
}
