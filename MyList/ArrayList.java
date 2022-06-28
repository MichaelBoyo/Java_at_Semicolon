package MyList;

import java.util.Objects;

public class ArrayList implements List {
    private int size;
    private String[] element = new String[8];

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
        element[size] = item;
        size++;
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
}
