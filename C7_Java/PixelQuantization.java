package C7_Java;

public class PixelQuantization {
    public static void main(String[] args) {
        int[] pixel = new int[181];

        for (int i = 0; i <pixel.length; i++) {
            pixel[i] = i;
        }
//        For 0–20: 10
//        b) For 21–40: 30
//        c) For 41–60: 50
//        d) For 61–80: 70
//        e) For 81–100: 90
//        f) For 101–120: 110
//        g) For 121–140: 130
//        h) For 141–160: 150
//        i) For 161–180: 170,

        int[] quantized = new int[181];
        for (int i = 0; i <pixel.length ; i++) {
            if(pixel[i]<=20){
                quantized[i] =10;
            }
            if(pixel[i]>20 && pixel[i]<=40){
                quantized[i] =30;
            }
            if(pixel[i]>40 && pixel[i]<=60){
                quantized[i] =50;
            }
            if(pixel[i]>60 && pixel[i]<=80){
                quantized[i] =70;
            }
            if(pixel[i]>80 && pixel[i]<=100){
                quantized[i] =90;
            }
            if(pixel[i]>100 && pixel[i]<=120){
                quantized[i] =110;
            }
            if(pixel[i]>120 && pixel[i]<=140){
                quantized[i] =130;
            }
            if(pixel[i]>140 && pixel[i]<=160){
                quantized[i] =150;
            }
            if(pixel[i]>160 && pixel[i]<=180){
                quantized[i] =170;
            }
            if(pixel[i]>180 && pixel[i]<=180){
                quantized[i] =190;
            }

            System.out.println(quantized[i]);
        }

    }
}
