package Chibuzo_Assg;

import C7_Java.Array;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.LinkedHashSet;

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
        kingsCollege.setScore(23);
        kingsCollege.setScore(12);
        kingsCollege.setScore(34);

        kingsCollege.setScore(13);
        kingsCollege.setScore(67);
        kingsCollege.setScore(12);

        kingsCollege.setScore(99);
        kingsCollege.setScore(98);
        kingsCollege.setScore(100);

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


        int average1=kingsCollege.getAverage(1);
        int average2=kingsCollege.getAverage(2);
        int average3 =kingsCollege.getAverage(3);

        assertEquals(average1,23 );
        assertEquals(average2,30 );
        assertEquals(average3,99);

        int position=kingsCollege.getStudentPositionFromGrade(average1);
        int position2 = kingsCollege.getStudentPositionFromGrade(average2);
        int position3 = kingsCollege.getStudentPositionFromGrade(average3);
        assertEquals(position,3);
        assertEquals(position2,2);
        assertEquals(position3,1);


    }
    @Test void largestScore(){
        kingsCollege.setScore(23);
        kingsCollege.setScore(12);
        kingsCollege.setScore(34);

        kingsCollege.setScore(13);
        kingsCollege.setScore(67);
        kingsCollege.setScore(12);

        kingsCollege.setScore(99);
        kingsCollege.setScore(98);
        kingsCollege.setScore(100);

        int highestScore = kingsCollege.getHighestScore();
        int lowestScore = kingsCollege.getLowestScore();
        String bestStudent = kingsCollege.getBestStudent();
        for (int i = 0; i < kingsCollege.subjects; i++) {
            System.out.print('[');
            for (int j = 0; j <kingsCollege.students ; j++) {
                System.out.print(kingsCollege.scores [i][j] + " ");
            }
            System.out.println("]");
        }


        String worstStudent = kingsCollege.getWorstStudent();
        String sub1best= kingsCollege.getSub1BestStudent();
        System.out.println(sub1best);
        String sub2best = kingsCollege.getSub2BestStudent();
        System.out.println(sub2best);
        String sub3best = kingsCollege.getSub3BestStudent();
        System.out.println(sub3best);
        int sub1total = kingsCollege.getSubjectsTotal(1);
        int sub2total = kingsCollege.getSubjectsTotal(2);
        int sub3total = kingsCollege.getSubjectsTotal(3);

        int sub1Average = kingsCollege.getSubjectsAverage(1);
        int sub2Average = kingsCollege.getSubjectsAverage(2);
        int sub3Average = kingsCollege.getSubjectsAverage(3);

        int nunPasses=kingsCollege.getNoOfPasses();
        int numFails =kingsCollege.getNoOfFails();

        String easiest = kingsCollege.getSubPassAndFails(1);
        String hardest = kingsCollege.getSubPassAndFails(2);
//        System.out.println(easiest);
//        System.out.println(hardest);

        assertEquals(nunPasses,4);
        assertEquals(numFails,5);


        assertEquals(sub1total,135);
        assertEquals(sub2total,177);
        assertEquals(sub3total,146);

        assertEquals(sub1Average,45);
        assertEquals(sub2Average,59);
        assertEquals(sub3Average,48);



    }
    @Test void sub1BestAndWorstStudent(){
        kingsCollege.setScore(23);
        kingsCollege.setScore(12);
        kingsCollege.setScore(34);

        kingsCollege.setScore(13);
        kingsCollege.setScore(67);
        kingsCollege.setScore(12);

        kingsCollege.setScore(99);
        kingsCollege.setScore(98);
        kingsCollege.setScore(100);

        for (int i = 0; i < kingsCollege.subjects; i++) {
            System.out.print('[');
            for (int j = 0; j <kingsCollege.students ; j++) {
                System.out.print(kingsCollege.scores [i][j] + " ");
            }
            System.out.println("]");
        }

        String best = kingsCollege.getSub1BestStudent();
        String worst = kingsCollege.getSub1WorstStudent();
        System.out.println(best);
        System.out.println(worst);
        int total =kingsCollege.getSubjectsTotal(1);
        int total2 = kingsCollege.getSubjectsTotal(2);
        int total3 = kingsCollege.getSubjectsTotal(3);

        System.out.print("s1  "+total+" ");
        System.out.print("s2  "+total2+" ");
        System.out.print("s3  "+total3+" ");

        int average1 = kingsCollege.getSubjectsAverage(1);
        int average2 = kingsCollege.getSubjectsAverage(2);
        int average3 = kingsCollege.getSubjectsAverage(3);

        assertEquals(total,135);
        assertEquals(total2,177);
        assertEquals(total3,146);

        assertEquals(average1,45);
        assertEquals(average2,59);
        assertEquals(average3,48);
        System.out.println();

        String pass = kingsCollege.getSubPassAndFails(1);
        String fail = kingsCollege.getSubPassAndFails(2);
        System.out.println(pass);
        System.out.println(fail);

    }

}