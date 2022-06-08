package C9_Java;

public class Loan {
    private final String email;
    private final String address;
    private final String phoneNo;
    private final int principal;
    private final int loanTenure;

    public Loan(String email, String address, String phoneNo, int principal, int loanTenure) {
        this.email = email;
        this.address = address;
        this.phoneNo = phoneNo;
        this.principal = principal;
        this.loanTenure = loanTenure;
    }

    public int getPrincipal() {
        return principal;
    }

    public int getLoanTenure() {
        return loanTenure;
    }

    public double monthlyInstallments() {
        return (double) getPrincipal() / getLoanTenure();
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
}
