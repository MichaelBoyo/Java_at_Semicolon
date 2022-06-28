package C16_Java;

import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class _IntStream {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,10)
                .sum()); // sum of numbers between 1 and 10 inclusive
        System.out.println( IntStream.rangeClosed(1,10)
                .map((int x)-> x * 2)
                .sum());


        BiFunction<Integer,Integer, Integer> sum = (a, b) -> a * b;

        System.out.println(sum.apply(2,4));
    }
}
