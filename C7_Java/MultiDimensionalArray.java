package C7_Java;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] values = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 23}};
      //  int[][] val = new int[6][8];

        for (int[] i : values) {
            for (int j : i) {
                System.out.println(j);
            }
        }


    }
}
