package C7_Java;

public class StudentPoll {
    public static void main(String[] args) {
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};

        int[] frequency = new int[6];

        for (int i = 0; i < responses.length; i++) {
            try {
                ++frequency[responses[i]];
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e); 
                System.out.printf(" responses[%d] = %d%n%n",
                        i, responses[i]);
            }
        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");
        for (int i = 1; i < frequency.length; i++) {
             System.out.printf("%6d%10d%n", i, frequency[i]);
             }

    }

    public static class ArrayOps {
        public static void main(String[] args) {
            int[] num = new int[21];
            for (int i = 0; i < num.length; i++) {
                num[i] = i * 2;
                System.out.println(num[i]);
            }
            for (int i = 0; i < num.length; i++) {
                if (i == 10) {
                    num[i] = 0;
                }
                if (i == 20) {
                    num[i] = 0;
                }
                System.out.println(num[i]);
            }
        }
    }
}
