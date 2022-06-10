package C7_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArraylistTesting {
    public static void main(String[] args) {
        List<String> track = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i <70 ; i++) {
            int randNum = random.nextInt(3)+1;
            switch (randNum){
                case 1->{
                    for (int j = 0; j <3 ; j++) {
                        track.add("*");
                    }
                }
                case 2->{
                    for (int j = 0; j <6 ; j++) {
                        track.remove("*");
                    }
                }
                case 3->{
                    for (int j = 0; j <1 ; j++) {
                        track.add("*");
                    }
                }
            }
        }




        for (String in:track){
            System.out.print(in);
        }
        System.out.println(track.size());
    }
}
