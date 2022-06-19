package gigs;

import java.io.FileWriter;
import java.util.ArrayList;

public class GFG{
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<>();
        for (int i = 0; i <60 ; i++) {
            nums.add(String.valueOf(i));
        }
        try{
            FileWriter writer = new FileWriter("output.csv");
            for (int i = 0; i < nums.size(); i++) {
                String a = nums.get(i);
                writer.write(Integer.parseInt(a));
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}