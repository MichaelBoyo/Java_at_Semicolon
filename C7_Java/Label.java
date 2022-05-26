package C7_Java;

public class Label {
    public static void main(String[] args) {
        int[][]table = new int[5][6];

        for (int col = 0; col < 6; col++)
        {
            for (int row = 0; row < 5; row++)
            {
                table[row][col] = 0;
                System.out.printf("column %d row  %d%n",col,row);
            }
            System.out.println();
        }

    }
}
