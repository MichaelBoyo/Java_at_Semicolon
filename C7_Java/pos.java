package C7_Java;

import java.util.ArrayList;
import java.util.Arrays;

public class pos {
    public static void main(String[] args) {

        double []average={23.00,30.67,99.00,87.7};
        int size= average.length;
        double []reversed=new double[average.length];
        Arrays.sort(average);
        for(double a:average){
            reversed[size-1]=a;
            size--;
        }

        System.out.println(Arrays.toString(reversed));
    }
}
