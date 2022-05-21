package Chibuzo_Assg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentGradeTrackerTest {
    StudentGradeTracker kingsCollege;

    @BeforeEach void setUp() {
        kingsCollege = new StudentGradeTracker(3,3);
    }

    @Test void testSaveScores(){
        kingsCollege.setScore(98);
        kingsCollege.setScore(80);
        kingsCollege.setScore(60);

        kingsCollege.setScore(40);
        kingsCollege.setScore(12);
        kingsCollege.setScore(43);

        kingsCollege.setScore(32);
        kingsCollege.setScore(66);
        kingsCollege.setScore(77);

        for (int i = 0; i < kingsCollege.subjects; i++) {
            System.out.print('[');
            for (int j = 0; j <kingsCollege.students ; j++) {
                System.out.print(kingsCollege.scores [i][j] + " ");
            }
            System.out.println("]");
        }

        assertEquals(kingsCollege.scores[0][0],98);
        assertEquals(kingsCollege.scores[0][1],80);
        assertEquals(kingsCollege.scores[0][2],60);

        assertEquals(kingsCollege.scores[1][0],40);
        assertEquals(kingsCollege.scores[1][1],12);
        assertEquals(kingsCollege.scores[1][2],43);

        assertEquals(kingsCollege.scores[2][0],32);
        assertEquals(kingsCollege.scores[2][1],66);
        assertEquals(kingsCollege.scores[2][2],77);

        kingsCollege.getStudentTotal(1);
        kingsCollege.getStudentTotal(2);
        kingsCollege.getStudentTotal(3);

    }
    @Test void testTotal(){
        kingsCollege.setScore(98);
        kingsCollege.setScore(80);
        kingsCollege.setScore(60);

        kingsCollege.setScore(40);
        kingsCollege.setScore(12);
        kingsCollege.setScore(43);

        kingsCollege.setScore(32);
        kingsCollege.setScore(66);
        kingsCollege.setScore(77);

        for (int i = 0; i < kingsCollege.subjects; i++) {
            System.out.print('[');
            for (int j = 0; j <kingsCollege.students ; j++) {
                System.out.print(kingsCollege.scores [i][j] + " ");
            }
            System.out.println("]");
        }

        assertEquals(kingsCollege.getStudentTotal(1),98+80+60 );
        assertEquals(kingsCollege.getStudentTotal(2),40+12+43 );
        assertEquals(kingsCollege.getStudentTotal(3),32+66+77 );


    }
    @Test void testAverage(){
        kingsCollege.setScore(98);
        kingsCollege.setScore(80);
        kingsCollege.setScore(60);

        kingsCollege.setScore(40);
        kingsCollege.setScore(12);
        kingsCollege.setScore(43);

        kingsCollege.setScore(32);
        kingsCollege.setScore(66);
        kingsCollege.setScore(77);

        for (int i = 0; i < kingsCollege.subjects; i++) {
            System.out.print('[');
            for (int j = 0; j <kingsCollege.students ; j++) {
                System.out.print(kingsCollege.scores [i][j] + " ");
            }
            System.out.println("]");
        }


        System.out.println("Student 1 total is "+kingsCollege.getStudentTotal(1));
        System.out.println("Student 2  total is "+kingsCollege.getStudentTotal(2));
        System.out.println("Student 3 total is "+kingsCollege.getStudentTotal(3));


        System.out.println("Student 1 average is "+ kingsCollege.getAverage(1));
        System.out.println("Student 2 average is "+ kingsCollege.getAverage(2));
        System.out.println("Student 3 average is "+ kingsCollege.getAverage(3));

        assertEquals(kingsCollege.getAverage(1),(98+80+60)/3.0 );
        assertEquals(kingsCollege.getAverage(2),(40+12+43)/3.0 );
        assertEquals(kingsCollege.getAverage(3),(32+66+77)/3.0 );


    }
    @Test void testPosition(){
        kingsCollege.setScore(98);
        kingsCollege.setScore(80);
        kingsCollege.setScore(60);

        kingsCollege.setScore(40);
        kingsCollege.setScore(12);
        kingsCollege.setScore(43);

        kingsCollege.setScore(32);
        kingsCollege.setScore(66);
        kingsCollege.setScore(77);

        kingsCollege.getStudentTotal(1);
        kingsCollege.getStudentTotal(2);
        kingsCollege.getStudentTotal(3);




        System.out.println();
        System.out.print("[");
        for (int i = 0; i < kingsCollege.students ; i++) {

            System.out.print(kingsCollege.total[i]+ " ");

        }System.out.println("]");
        int one = kingsCollege.getPosition(1);
        int two = kingsCollege.getPosition(2);
        int three = kingsCollege.getPosition(3);

        System.out.println("student 1 position is "+one);
        System.out.println("student 2 position is "+two);
        System.out.println("student 3 position is "+three);
        assertEquals(one,1);
        assertEquals(two,3);
        assertEquals(three,2);

    }
}