package dataStructures;

public interface Queue {
    void addItem(String item);
    void removeItem(String item);
    int size();
    boolean isEmpty();
    String peek();
    String poll();
    String set(int index, String item);
    String get(int index);
    void clear();
}
