package C7_Java;

public class VariableLengthArgs {
    public static double average(double... values){
         double total =0;
         for(double value:values){
             total+=value;
         }
        return total/values.length;
    }

    public static void main(String[] args) {
        double result =average(3.6,4.6,5.6,3.6,4.6,5.6,7.8);
        System.out.printf("%.2f",result);
    }
}