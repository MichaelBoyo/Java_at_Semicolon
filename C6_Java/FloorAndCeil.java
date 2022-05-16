package C6_Java;

public class FloorAndCeil {
    private static int myFloor(double num) {
        return (int)num;
    }
    private static int myCeil(double num) {

        return (int)num +1;
    }

    public static void main(String[] args) {
        System.out.println(myCeil(2.1));
        System.out.println(myFloor(1.9));
    }
}
