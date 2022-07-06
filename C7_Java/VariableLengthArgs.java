package C7_Java;

import java.util.Arrays;

public class VariableLengthArgs {
    public static double average(double... values){
        return Arrays.stream(values).sum()/values.length;
    }

    public static void main(String[] args) {
        var result =average(3.6,4.6,5.6,3.6,4.6,5.6,7.8,3,3,3,3,3,3);
        System.out.printf("%.2f",result);
    }
}