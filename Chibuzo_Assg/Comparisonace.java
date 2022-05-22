package Chibuzo_Assg;

public class Comparisonace {
    boolean getResult (String [] array1, String[] array2){
        if(array1.length != array2.length){
            return false;
        }
        for (int i = 0; i <array1.length ; i++) {
            if(array1[i]!=array2[i]){
                return false;
            }
        }

        return true;
    }
}
