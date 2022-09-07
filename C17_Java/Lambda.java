package C17_Java;

import java.security.SecureRandom;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda {

    public static void main(String[] args) {
        Human human = name -> System.out.println("hello " + name);
        Human human2 = val -> System.out.println(val.toUpperCase());

        human.sayHello("mike");
        human2.sayHello("mi ke");

        human.sayHello("mike");

        Function<String, ?> count = String::length;
        BiFunction<String, String, ?> concat = (val1, val2) -> val1 + " " + val2;

        Predicate<String> contains = val -> val.contains("m");
        Consumer<?> print = System.out::println;

        System.out.println(count.apply("mike"));
        System.out.println(concat.apply("mike", "hello"));

        System.out.println(contains.test("mike"));




        System.out.println(
                IntStream.rangeClosed(1, 10)
                        .map(x -> x * 2)
                        .filter(x -> x > 10)
                        .sum()
        );

        System.out.println(
                IntStream.rangeClosed(1,10)
                        .filter(x -> x % 2 == 0)
                        .map(x -> x * 3)
                        .sum()
        );
        SecureRandom random = new SecureRandom();

        System.out.println(
                random.ints(10, 1, 10)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "))

        );
    }
}
