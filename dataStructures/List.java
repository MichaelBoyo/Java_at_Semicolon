package dataStructures;

public interface List {
    boolean isEmpty();
    void add (String item);

    void remove(String s);

    int size();

    String get(int index);

    int capacity();
    void print();
    boolean contains(String item);
}
