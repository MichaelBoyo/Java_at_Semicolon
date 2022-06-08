package C8_Java.Java_Flex;

public class position {
    public static void main(String[] args) {

        int[] scores = {45,55,67,33,11};

        for (int i = 0; i <scores.length ; i++) {
            System.out.print(scores[i]+" ");
        }
        int[] position = new int[5];
        int max = scores[0];
        for (int i = 0; i < scores.length ; i++) {
            if(scores[i]>= max){
                max = scores[i];
            }
        }

        for (int j = 0; j < scores.length; j++) {
            for (int i = 0; i < scores.length; i++) {
                if(scores[i] >= max){
                    position[i] = 1;
                    scores[i] = -1;
                }
            }
        }

        System.out.println();
        for (int i = 0; i <position.length ; i++) {
            System.out.print(position[i]+" ");
        }
    }
}