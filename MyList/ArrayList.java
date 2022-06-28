package MyList;

import java.util.Objects;

public class ArrayList implements List {
    private int size;
    private int capacity = 5;
    private String[] element = new String[capacity];

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
        int count = 0;
        for (String str : element) {
            if (str != null) {
                count++;
            }
        }
        if(count== capacity-1){
            int oldCAp = capacity;
            capacity *=2;
            String[] freshArray = new String[capacity];
            for (int i = 0; i <oldCAp ; i++) {
                freshArray[i] = element[i];
            }
            element = freshArray;
        }
        element[size] = item;
        size++;

    }
    public void print(){
        for (String e : element){
            System.out.println(e);
        }
    }

    @Override
    public void remove(String item) {
        String[] tempArray = new String[element.length];
        for (int i = 0; i < tempArray.length; i++) {
            for (String str : element) {
                if (!Objects.equals(str, item)) {
                    tempArray[i] = str;
                    i++;
                }
            }
        }
        element = tempArray;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index) {
        return element[index];
    }

    @Override
    public int capacity() {
        return capacity;
    }
}
