package C5_Java;

public class CompoundInterest {
    public static void main(String[] args) {
        double a;
        int p= 1000;
        double r =0.05;
        int n;
        System.out.printf("%s%20s%n","Year","Amount");
        for(n=1;n<=10;n++){
            a= p* Math.pow(1+0.05,n);
            System.out.printf("%4d%,22.2f%n",n,a);
        }
    }
}
