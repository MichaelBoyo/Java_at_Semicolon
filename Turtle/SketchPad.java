package Turtle;

public class SketchPad {
    public int[][] getFloor() {
        return floor;
    }
    private  void sleep(){
        try{
            Thread.sleep(1000);
        }catch(Exception ignored){}
    }
    public void displaySketchPad(){
        for (int[] ints : floor) {
            for (int j = 0; j < floor.length; j++) {
                if(ints[j] ==1){
                    System.out.print("*  ");
                }else System.out.print("   ");
            }
            System.out.println();
        }
    }

    private int[][] floor;
    public SketchPad(int length, int breath){
        floor = new int[length][breath];
    }

}
