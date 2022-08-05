package Code_wars;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> ist = new ArrayList<>();
        ist.add("d");
        ist.add("y");
        ist.add("f");
        ist.replaceAll(String::toLowerCase);


//        Scanner scanner = new Scanner(System.in);
//        int numberOfTerms = scanner.nextInt();
//        List<Integer> results = new ArrayList<>();
//        for (int i = 0; i < numberOfTerms; i++) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int n = scanner.nextInt();
//
//            for(int j = 0; j< n; j++){
//                a+= Math.pow(2,j) *b;
//                results.add(a);
//            }
//            results.add(-1);
//        }
//        for (Integer g: results){
//            if(g == -1){
//                System.out.println();
//                continue;
//            }
//            System.out.print(g+" ");
//        }
//        Predicate<Integer> check = g -> g >0; // this is same as line 33
//        results.stream()
//                .filter(g -> g > 0)
//                .toList().forEach(
//                g -> System.out.print(g + " "));
//        results.stream().dropWhile(g -> g! = -1).toList().forEach(
//                a -> {
//                    System.out.print(a+" ");
//                }
//        );

    }

    public static void main(char[] args) {
        System.out.println('a');
    }
}
