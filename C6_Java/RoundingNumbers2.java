package C6_Java;

public class RoundingNumbers2 {
    public static double round(double number){
        return Math.floor(number + 0.5);
    }
    public static double roundTo10th(double number){
        return Math.floor(number * 10 + 0.5) / 10;
    }
    public static double roundTo100th(double number){
        return Math.floor(number * 100 + 0.5) / 100;
    }
    public static double roundTo1000th(double number){
        return Math.floor(number * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) {

        System.out.println(round(0.7));
        System.out.println(roundTo10th(0.7));
        System.out.println(roundTo100th(0.7));
        System.out.println(roundTo1000th(0.7));
    }
}
