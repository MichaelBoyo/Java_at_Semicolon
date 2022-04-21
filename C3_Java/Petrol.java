package C3_Java;

public class Petrol {
    public static void main(String... args){

        PetrolPurchase john = new PetrolPurchase();
        john.setStationLocation("Yaba");
        john.setTypeOfPetrol("PMS");
        john.setQuantity(300);
        john.setPricePerLitre(155.3);
        john.setPercentageDiscount(2.3);

        System.out.printf("John's petrol station location is %s%n", john.getStationLocation());
        System.out.printf("John's petrol type is %s%n", john.getTypeOfPetrol());
        System.out.printf("John's wants to buy %s litres of %s%n", john.getQuantity(), john.getTypeOfPetrol());
        System.out.printf("the price per litre is $%s per litre %n", john.getPricePerLitre());
        System.out.printf("John's was given a discount of %s percent %n%n", john.getPercentageDiscount());



        System.out.printf("John's net purchase amount of PMS is $%.2f%n", john.getPurchase());





    }
}
