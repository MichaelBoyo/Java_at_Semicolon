package Chibuzo_Assg;

public class PyramidPrinting {
    public static void main(String[] args) {


        for (int i = 1; i <=10 ; i++)
        {
            for(int s =1; s <= 10-i; s++){
                System.out.print(" ");}
            for(int j=1; j<=i; j++){
                System.out.print("*");}
            for(int j=1; j<=i; j++){
                System.out.print("*");}
            System.out.println();
        }
        for (int i = 1; i <=5 ; i++)
        {
            for(int s =1; s <= 5-i; s++){
                System.out.print(" ");}
            for(int j=0; j<=i; j++){
                System.out.print(1+j);}
            for(int j=0; j<=i; j++){
                System.out.print(1+j);}
            System.out.println();
        }
    }
}
