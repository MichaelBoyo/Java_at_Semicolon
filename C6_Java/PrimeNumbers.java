package C6_Java;

import C5_Java.Chibuzo_Assg.PrimeNumber;

public class PrimeNumbers {
    public static boolean isPrime(int number){
        return PrimeNumber.getFactors(number) == 2;
    }

    public static void main(String[] args) {
        int counter =0;
        for (int i = 1; i <10000 ; i++) {
            if(isPrime(i)){
                counter+=1;
                System.out.println(i);

            }

        }
        System.out.println("count "+counter);
    }
}
