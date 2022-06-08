package C9_Java;

public class HomeLoan extends Loan {

    public HomeLoan(String email, String address, String phoneNo, int principal, int loanTenure) {
        super(email, address, phoneNo, principal, loanTenure);
    }

    @Override
    public double monthlyInstallments() {
        int interest = 12;
        return super.monthlyInstallments() * interest/100;
    }

    @Override
    public String toString() {
        return String.format("Monthly installment for Home loan rate is %.2f ",monthlyInstallments());
    }
}