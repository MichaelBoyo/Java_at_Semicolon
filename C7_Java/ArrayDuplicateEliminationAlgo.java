package C7_Java;

public class ArrayDuplicateEliminationAlgo {
    public static int[] duplicateEliminate(int[] array){
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i]==array[j]){
                    array[i]=0;
                    break;
                }
            }
        }
        int count = 0;
        for (int j : array) {
            if (j != 0) {
                count++;
            }
        }
        int[]newArray = new int[count];
        int j =0;
        for (int k : array) {
            if (k != 0) {
                newArray[j] = k;
                j++;
            }
        }
        return newArray;
    }
}