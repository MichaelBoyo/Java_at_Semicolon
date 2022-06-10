package C7_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TortoiseAndHare {
    public void hareMove(String animal) {
        Random random = new Random();
        int randNum = random.nextInt(10)+1;
        int plod = 0;

        if(randNum<=5){
            plod = 1;
        }
        if(randNum>=6 && randNum <=7){
            plod = 2;
        }
        if(randNum>=8 && randNum <=9){
            plod = 3;
        }
        if(randNum>=10 ){
            plod = 4;
        }

        switch (plod){
            case 1->{
                for (int i = 0; i <9 ; i++) {
                    hareTrack.add(animal);
                }
            }
            case 2->{
                for (int i = 0; i <12 ; i++) {
                    hareTrack.remove(animal);
                }
            }
            case 3->{
                for (int i = 0; i <1 ; i++) {
                    hareTrack.add(animal);
                }
            }
            case 4->{
                for (int i = 0; i <2 ; i++) {
                    hareTrack.remove(animal);
                }
            }
        }
    }

    public void printHareTrack() {
        for (String in:hareTrack){
            System.out.print(in);
        }
    }

    private  List<String> tortoiseTrack = new ArrayList<>();
    private List<String> hareTrack = new ArrayList<>();

    public int getNumberOfSquares() {
        return tortoiseTrack.size();
    }
    public int checkHareMoves(){
        return hareTrack.size();
    }

    public void tortoiseMove(String animal) {
        Random random = new Random();
        int randNum = random.nextInt(10)+1;
        int plod = 0;

        if(randNum<=5){
            plod = 1;
        }
        if(randNum>=6 && randNum <=7){
            plod = 2;
        }
        if(randNum>=8 ){
            plod = 3;
        }


        switch (plod){
            case 1->{
                for (int i = 0; i <3 ; i++) {
                    tortoiseTrack.add(animal);
                }
            }
            case 2->{
                for (int i = 0; i <6 ; i++) {
                    tortoiseTrack.remove(animal);
                }
            }
            case 3->{
                for (int i = 0; i <1 ; i++) {
                    tortoiseTrack.add(animal);
                }
            }
        }
    }
    public  void printTortoiseTrack(){
        for (String in:tortoiseTrack){
            System.out.print(in);
        }
    }
}
