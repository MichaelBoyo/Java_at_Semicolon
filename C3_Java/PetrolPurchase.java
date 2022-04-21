package C3_Java;

public class PetrolPurchase {
    private String stationLocation;
    private String typeOfPetrol;
    private int Quantity;
    private double PricePerLitre;
    private double PercentageDiscount;

    public PetrolPurchase() {
    }
    public void setStationLocation(String stationLocation){
        this.stationLocation = stationLocation;}
    public String getStationLocation(){return stationLocation;}

    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }
    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setQuantity(int Quantity) {this.Quantity = Quantity;}
    public int getQuantity() {
        return Quantity;
    }

    public void setPricePerLitre(double pricePerLitre) {
        PricePerLitre = pricePerLitre;
    }

    public double getPricePerLitre() {
        return PricePerLitre;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        PercentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {
        return PercentageDiscount;
    }

    public double getPurchase(){return ((Quantity * PricePerLitre) - PercentageDiscount /100);}

}