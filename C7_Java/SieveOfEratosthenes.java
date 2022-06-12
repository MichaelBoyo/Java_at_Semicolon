package C7_Java;

import java.util.ArrayList;
import java.util.List;
import static C6_Java.Multiples.isMultiple;
public class SieveOfEratosthenes {
    private List<Boolean> sieve = new ArrayList<Boolean>();
    public void initializeArray() {
        for (int i = 0; i <1000 ; i++) {
                sieve.add(true);
        }
    }
    public void multiple(){
        initializeArray();
        for (int i = 2; i < sieve.size(); i++) {
            if(sieve.get(i)){
                for (int j = 3; j < sieve.size(); j++) {
                    if(isMultiple(j,i)){
                        sieve.set(j,false);
                    }
                }
            }
        }
        print();
    }
    public void print(){
        for (int i = 0; i <sieve.size() ; i++) {
            if(sieve.get(i)){
                System.out.println(sieve.get(i)+" "+i);
            }
        }
    }
    private boolean prime(int value){
        //this method returns true if the value is prime
        int factors= 0;
        for(int i =1; i<=value; i++){
            if(value%i == 0){
                factors = factors+1;
            }
        }
        return factors == 2;
    }
}