package C3_Java;

public class Car {
    private String model;
    private String year;
    private double price;
    private double percentageDiscount;

    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        if(price > 0){this.price = price;}
    }

    public Car() {
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {

        return percentageDiscount;
    }
    public double getActualPrice(){
        double ActualPrice;
        ActualPrice = getPrice() - (getPrice() * (getPercentageDiscount() / 100));
        return ActualPrice;
}
}