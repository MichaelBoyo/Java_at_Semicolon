package C5_Java;

public class SumOfSeries {
    public static void main(String[] args) {
        int i = 1;
        int sum=0;

        System.out.printf("%s%8s%n","Number","Sum");

        while(i<=100){
            sum=sum+i;
            System.out.printf("%3d%10d%n",i,sum);
            i++;
        }
    }
}
