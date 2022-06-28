package Code_wars;

import java.util.Arrays;
import java.util.List;

public class vowels {
    public static void main(String[] args) {
////        System.out.println(count("abakadabra"));
//        List<String> scores = new ArrayList<String>();
//        Random rand = new Random();
//        int points = 0;
//        for (int i = 0; i < 10; i++) {
//            int a =rand.nextInt(9);
//            int b = rand.nextInt(9);
//            String score = a +":" + b;
//
//            if(a > b){
//                points+=3;
//                score += " home 3";
//            }
//            if(a==b){
//                points+=1;
//                score+= " home 1";
//            }
//            scores.add(score);
//        }
////        System.out.println(points);
////        for (String score : scores) {
////            System.out.println(score);
////        }
//        List<String> questions = new ArrayList<String>();
//        char[]ops = {'/','-','+','*'};
//        for (int i = 0; i <10 ; i++) {
//            String q = String.valueOf(rand.nextInt(9)) +  + rand.nextInt(9);
//            questions.add(q);
//            System.out.println(q);
//        }
//        int[] a = reverse(5);
//        System.out.println(Arrays.toString(a));

//       Scanner scanner = new Scanner(System.in);
//       int input =scanner.nextInt();




       int[]arr = solution(0,2,10);
        System.out.println(Arrays.toString(arr));


//        System.out.println(negative(1));
//        System.out.println(points(scores));
    }
    public  static int[] reverse(int n){
        int[] arr = new int[n];
        for(int i= n; i > 0 ; i--){
            arr[n-i] = i;
        }
        return  arr;
    }
    public static int[] solution(int a, int b, int c){
        int[] arr = new int[c];
        int z =1;
        int sum = 0;
        for(int i = 1; i < c; i++){
            sum = a +z* b;
            b*=2;
            arr[i] = sum;
        }
        return arr;
    }


    private static int basicOp(char op, int value1, int value2) {
        if (op == '+') {
            return value1 + value2;
        }
        if (op == '-') {
            return value1 - value2;
        }
        if (op == '*') {
            return value1 * value2;
        }
        return value1 /value2;

    }

    private static int negative(int num) {
        if(num<0) return num;
        return -num;
    }

    private static int points(List<String> scores) {
        int home_score = 0;
        for (String sc: scores){
            if(sc.charAt(0) > sc.charAt(2)){
                home_score+=3;
            }else if(sc.charAt(0)== sc.charAt(2)){
                home_score+=1;
            }
        }
        return home_score;
    }

    private static int count(String sentence) {
        char[] arr = sentence.toCharArray();
        char[] vowels = {'a','e','i','o','u'};
        int count = 0;
        for (char c : arr) {
            for (char vowel : vowels) {
                if (c == vowel) {
                    count++;
                }
            }
        }
        return count;
    }
}
