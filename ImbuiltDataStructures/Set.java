package ImbuiltDataStructures;

import java.util.HashMap;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < 40; i++) {
            integers.add(i);
        }
        integers.add(1);
        System.out.println(integers);
        integers.stream().filter(x->x % 2 == 0).forEach(System.out::println);

        HashMap<String, String> dict = new HashMap<>();
        dict.put("kiki", "mordi");
        System.out.println(dict.get("kiki"));
    }
}
