package C5_Java;

public class SummingIntegersWithForLoop {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 2; i<=20; i+=2){
            total+=i;
        }
        System.out.println(total);
//        for(int i = 2; i<=20; total+=i, i+=2){
//            ;
//        }
//        System.out.println(total);
    }
}
