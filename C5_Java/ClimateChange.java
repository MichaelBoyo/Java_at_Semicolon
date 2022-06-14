package C5_Java;

import java.util.Objects;
import java.util.Scanner;

public class ClimateChange {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        System.out.println("Answer the following Questions on Climate change ");

        System.out.println("1. Earths temperature are stable because we are" +
                " surrounded by ______ which allows the right amount of sunlight in to warm the earth");
        System.out.println("""
                A. A cloud layer
                B. An atmosphere
                C. Gravity
                D. Water
                """);
        System.out.print("Enter Answer: ");
        String question1 = answer.next();
        if(Objects.equals(question1,"B")){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect, the correct answer is Atmosphere");
        }

        System.out.println("2. Too many greenhouse gasses in the atmosphere my block heat from escaping into space and trap too much heat next to Earth's surface causing:");
        System.out.println("""
                A. Another ice age
                B. global warming
                C. earthquakes
                D. volcanic eruptions
                """);
        System.out.print("Enter Answer: ");
        String question2 = answer.next();
        if(Objects.equals(question2,"B")){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect, the correct answer is Global Warming");
        }

        System.out.println("3. How are humans making greenhouse gasses of our own?");
        System.out.println("""
                A. burning fossil fuels in our cars
                B. burning forests
                C. with large-scale agriculure
                D. all of these
                """);
        System.out.print("Enter Answer: ");
        String question3 = answer.next();
        if(Objects.equals(question3,"D")){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect, the correct answer is All of these");
        }

        System.out.println("4. The solar radiation that bounces off the Earth back toward the atmosphere is mostly_____(with a longer wavelength)");
        System.out.println("""
                A. gamma radiation
                B. x-rey radiation
                C. nuclear radiation
                D. infrared radiation
                """);
        System.out.print("Enter Answer: ");
        String question4 = answer.next();
        if(Objects.equals(question4,"D")){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect, the correct answer is infrared radiation");
        }

        System.out.println("5. The solar energy that warms the Earth includes visible light, infrared and_____coming from the sun");
        System.out.println("""
                A. gamma rays
                B. ultraviolet radiation
                C. microwaves
                D. sunspots
                """);
        System.out.print("Enter Answer: ");
        String question5 = answer.next();
        if(Objects.equals(question4,"B")){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect, the correct answer is ultraviolet radiation");
        }


        int i=1;
        int correct =0;
        while(i<=1){
            if(Objects.equals(question1,"B")){
                correct+=1;
            }
            if(Objects.equals(question2,"B")){
                correct+=1;
            }
            if(Objects.equals(question3,"D")){
                correct+=1;
            }
            if(Objects.equals(question4,"D")){
                correct+=1;
            }
            if(Objects.equals(question5,"B")){
                correct+=1;
            }

            i++;
        }
        System.out.printf("you got %d of 5%n", correct);

        if (correct==5) {
            System.out.println("Excellent");
        }
        if(correct==4){
            System.out.println("Very good");
        } else{
            System.out.println("Time to brush up on your knowledge of global warming," +
                    "https://climate.nasa.gov/evidence/" +
                    "https://www.dosomething.org/us/facts/11-facts-about-global-warming");
        }


    }
}