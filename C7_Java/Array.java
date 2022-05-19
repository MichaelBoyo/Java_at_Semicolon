package C7_Java;

public class Array {
    int [] myArray= {2,4}; // a type of array initialization
    static int[] arrayMi; // array declaration
    static int [] myAraay= new int[12];  //another type of array declaration
    String [] array = {"hello", "baby", "34"}; // String array
    static String [] ar = new String [8];

    // how to know number of properties in an array
    public static void main(String[] args) {
        int amt = myAraay.length;
        //System.out.println(myAraay.length);
        // how to access an array
        arrayMi= new int[]{10, 20, 33, 6, 7};
        //System.out.println(Arrays.toString(arrayMi));

       // how to add items to array
        ar[0]= "hello";
        ar[1]="nwe";
        ar[2]= "no";
       // System.out.println(arrayMi[arrayMi.length -2]);
        //  index are used to read and write
        int sum = 0;
        int smallest=arrayMi[0];
        int largest= arrayMi[0];
//        for (int j : arrayMi) {
//            if(j<smallest){
//                smallest=j;
//            }
//            if(j>largest){
//                largest=j;
//            }
//            sum +=j;
//        }
//        for (int j : arrayMi) {
//            sum += j;
//            if ( largest< j) {
//                largest = j;
//            }
//            if (smallest>j ) {
//                smallest = j;
//            }
//
//        }
//        System.out.println("the sum is "+sum);
//        System.out.println("the smallest is "+smallest);
//        System.out.println("the largest is "+largest);
        int[] newArray = {1,3,4,5,66,67,-55};
//        for (int i = 0; i <newArray.length ; i++) {
//           int random = (int) (Math.random() *10);
//           try {  n
//               System.out.println("array at random index "+random+" is "+ newArray[random]);
//           }catch (ArrayIndexOutOfBoundsException e){
//               System.out.println("Invalid index encountered");
//           }
//        }
        for(int j: newArray){
            System.out.println(j*10);
        }
        // pass by value and pass by reference
    }
}