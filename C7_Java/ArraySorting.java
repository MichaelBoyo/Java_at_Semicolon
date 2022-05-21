package C7_Java;

public class ArraySorting {

    public static void main(String[] args) {
        int temp;
        //initializing an array
        int a[] = {-900, 5, 56, -2,7000, 32,-5700, 2, -26, 9, 43, 94, -78,-6899};

        int b[] =new int[14];
        int largest = a[0];

        int smallest= a[0];
        for (int i = 0; i < a.length; i++) {
                smallest = Math.min(smallest, a[i]);

                largest = Math.max(largest, a[i]);
        }
        System.out.println(largest);
        System.out.println(smallest);
        System.out.println(a.length);

    }

}