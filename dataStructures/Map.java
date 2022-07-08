package dataStructures;

import java.util.Objects;

public class Map {
    private String[][] map;
    private int size;
    private int capacity;

    public Map(int capacity) {
        this.capacity =capacity;
        map = new String[2][capacity];
    }

    public void addItem(String key, String value){
        capacityCheck();
        for (int i = 0; i <size; i++) {
            if(Objects.equals(key, map[0][i])){
                map[1][i] = value;
                return;
            }
        }
        for (int i = 0; i < capacity; i++) {
            if(map[0][i] == null){
                map[0][i] = key;
                map[1][i] = value;
                size++;
                return;
            }
        }
    }

    private void capacityCheck() {
        if (size == capacity) {
            String[][] freshArray = new String[2][capacity*=2];
            for (int i = 0; i <size ; i++) {
                freshArray[0][i] = map[0][i];
                freshArray[1][i] = map[1][i];
            }
            map = freshArray;
        }
    }

    public String getItem(String key){
        for (int i = 0; i <map.length ; i++) {
            if(map[0][i].equals(key)){
                return map[1][i];
            }
        }
        return "";
    }
    public void removeItem(String key){
        for (int i = 0; i <map.length ; i++) {
            if(map[0][i].equals(key)){
                map[0][i] = null;
                map[1][i] = null;
                size--;
                break;
            }
        }
    }
    public int getSize() {
        return size;
    }
}
