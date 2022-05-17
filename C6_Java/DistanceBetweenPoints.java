package C6_Java;

import static Java_Flex.Ober.displayln;

public class DistanceBetweenPoints {
    public static double distance(double x1,double x2, double y1,double y2){
        return y2 - y1 /x2 -x1;
    }

    public static void main(String[] args) {

        System.out.printf("%.2f",distance(1.3,-2.3,4.6,3.4));
    }
}