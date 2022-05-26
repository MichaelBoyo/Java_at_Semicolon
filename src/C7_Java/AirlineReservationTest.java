package C7_Java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationTest {
    AirlineReservation test;
    @BeforeEach
    void setUp() {
        test= new AirlineReservation(10);

    }
    @AfterEach void result(){
        for (int i = 0; i <test.seats.length ; i++) {
            System.out.print(test.seats[i]+ " ");
            if(i==4){
                System.out.println();
            }
        }
    }
    @Test void testThatFirstClassCanBeBooked(){
        String name = "Akintolu";
        test.bookFlightFirstClass(name);
        name = "Akin";
        test.bookFlightFirstClass(name);
        name = "ife";
        test.bookFlightFirstClass(name);
        name = "Koko";
        test.bookFlightFirstClass(name);
        name = "tola";
        test.bookFlightFirstClass(name);
        name = "isreal";
        test.bookFlightFirstClass(name);

        for (int i = 0; i <test.seats.length/2 ; i++) {
            assertTrue(test.seats[i]);
        }


;
    }
    @Test void testThatEconomyCanBeBooked(){
        String name = "Akintolu";
        test.bookFlightEconomy(name);
        name = "Akin";
        test.bookFlightEconomy(name);
        name = "ife";
        test.bookFlightEconomy(name);
        name = "Koko";
        test.bookFlightEconomy(name);
        name = "tola";
        test.bookFlightEconomy(name);
        name = "isreal";
        test.bookFlightEconomy(name);

        for (int i = test.seats.length/2; i <test.seats.length ; i++) {
            assertTrue(test.seats[i]);
        }


        ;
    }
}