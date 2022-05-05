package C5_Java;

public class ModifiedCompoundInterest {
    public static void main(String[] args) {
        double a;
        int aa;
        double dCent;
        int cent;
        int p= 1000;
        double r =0.05;
        int n;
        System.out.printf("%s%20s%15s%n","Year","dollar Amount","Cents");
        do{
            for(n=1;n<=10;n++){
                a= ( p* Math.pow(1+r,n));
                aa= (int)a;
                dCent= (a*10) % 10;
                cent = (int) (dCent*10);

                System.out.printf("%4d%15d%20d%n",n,aa,cent);

            }
            System.out.println();
            r=r+0.01;
        }while (r<=0.1);

    }
}