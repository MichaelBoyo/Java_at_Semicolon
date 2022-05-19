package C6_Java;

public class TableOfBinaryOctalAndHexadecimalNumbers {
    public static void main(String[] args) {

        for (int i = 1; i <= 256; i++) {
            System.out.println(String.format("%8s", Integer.toBinaryString(i)).replace(' ', '0'));
        }

//        for (int i = 0; i <=256 ; i++) {
//
//        }
    }

}
