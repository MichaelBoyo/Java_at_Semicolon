package C5_Java;

public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel,
                      String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {
        this.state=state;


    }

    public String getState() {
        return state;
    }

    public boolean isNoFaultState() {
        boolean noFaultState = switch (getState()) {
            //CT for Connecticut, MA for Massachusetts, ME
            //for Maine, NH for New Hampshire, NJ for New Jersey, NY for New York, PA for Pennsylvania
            //and VT for Vermont
            case "MA", "NY", "PA","CT","ME", "NH", "NJ", "VT"-> true;
            default -> false;
        };

        return noFaultState;
    }
}
