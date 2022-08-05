package C16_Java;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));

        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>(Arrays.asList(removeColors));

        System.out.println("ArrayList: ");
        System.out.println(list);

        removeColors(list,removeList);
        System.out.printf("%n%nArrayList after calling removeColors:%n");
        System.out.println(list);


    }

    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        collection1.removeIf(collection2::contains);
    }
}
