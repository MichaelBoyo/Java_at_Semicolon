package C5_Java;

public class Edmodo {
    public static void main(String[] args) {
        int temp =180;
        while (temp != 80) {
            if (temp > 90) {
                System.out.print("This porridge is too hot! ");

                // cool down
                temp = temp- (temp > 150 ? 100 : 20);
            }
            else {
                if (temp < 70) {
                    System.out.print("This porridge is too cold! ");

                    // warm up
                    temp = temp + (temp < 50 ? 30 : 20);
                }
            }
        }

        if (temp == 80) {
            System.out.println("This porridge is just right!");
        }
    }
}
