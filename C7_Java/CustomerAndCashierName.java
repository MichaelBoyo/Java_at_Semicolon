package C7_Java;

public class CustomerAndCashierName {
    String customerName;
    String cashierName;

    public CustomerAndCashierName(String customerName, String cashierName) {
        this.customerName = customerName;
        this.cashierName = cashierName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }
}