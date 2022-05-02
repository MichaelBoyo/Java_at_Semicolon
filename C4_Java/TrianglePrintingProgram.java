package C4_Java;

public class TrianglePrintingProgram {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++)
        {
            for(int j=1; j<=i; j++){
                System.out.print("*");}
            System.out.println();
        }
//
        System.out.println(" ");

        for (int i = 1; i <=10 ; i++)
        {
            for(int s =1; s <= 10-i; s++){
            System.out.print(" ");}
            for(int j=1; j<=i; j++){
                System.out.print("*");}
            System.out.println();
        }

        System.out.println(" ");

        for (int i = 10; i>=0; i--)
        {
            for(int j=i; j>=0; j--){
                System.out.print("*");}
            System.out.println();
        }

        System.out.println(" ");

        for (int i = 10; i >=0 ; i--)
        {
            for(int s =10; s >= i+1; s--){
                System.out.print(" ");}
            for(int j=i; j>=0; j--){
                System.out.print("*");}
            System.out.println();
        }

    }
}


