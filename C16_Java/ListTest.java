package C16_Java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        String[] colors =
                {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>(Arrays.asList(colors));

        String[] colors2 =
                {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>(Arrays.asList(colors2));
        list1.addAll(list2);
        list2 = null; // release resources
        printList(list1); // print list1 elements
        convertToUppercaseStrings(list1); // convert to uppercase string
        printList(list1); // print list1 elements

        System.out.printf("%nDeleting elements 4 to 6...");
        removeItems(list1, 4, 7); // remove items 4-6 from list
        printList(list1); // print list1 elements
        printReversedList(list1); // p
    }

    private static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.printf("%nReversed List:%n");
        while (iterator.hasPrevious()){
            System.out.printf("%s ",iterator.previous() );
        }

    }

    private static void removeItems(List<String> list, int start, int end) {
        list.subList(start,end).clear();
    }

    private static void printList(List<String> list) {
        System.out.printf("%nlist:%n");
        for (String color : list) {
            System.out.printf("%s ", color);
        }

        System.out.println();
    }


    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }
}
