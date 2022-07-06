package dataStructures;

import java.util.Objects;

public class ArrayList implements List {
    private int size;
    private int capacity = 5;
    private String[] elements = new String[capacity];

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
        capacityCheck();
        elements[size] = item;
        size++;
    }

    private void capacityCheck() {
        if (size == capacity) {
            String[] freshArray = new String[capacity*=2];
            System.arraycopy(elements, 0,
                    freshArray, 0, elements.length);
            elements = freshArray;
        }
    }

    public void print() {
        for (String e : elements) {
            System.out.println(e);
        }
    }

    @Override
    public boolean contains(String item) {
        for(var item_: elements){
            if(item_.equals(item)){
                return true;
            }
        }
        return false;
    }


    @Override
    public void remove(String item) {
        reArrange(item);
        size--;
    }

    private void reArrange(String item) {
        String[] tempArray = new String[elements.length];
        int i = 0;
        for (String str : elements) {
            if (!Objects.equals(str, item)) {
                tempArray[i] = str;
                i++;
            }
        }
        elements =  tempArray;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index) {
        return elements[index];
    }

    @Override
    public int capacity() {
        return capacity;
    }

    public void clear() {
        size = 0;
        elements = new String[5];
    }
}
