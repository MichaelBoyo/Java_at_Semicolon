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
        kingsCollege.setScore(23);
        kingsCollege.setScore(12);
        kingsCollege.setScore(34);

        kingsCollege.setScore(13);
        kingsCollege.setScore(67);
        kingsCollege.setScore(12);

        kingsCollege.setScore(99);
        kingsCollege.setScore(98);
        kingsCollege.setScore(100);

        System.out.println("""
                STUDENTS IN ROWS
                SUBJECTS IN COLUMNS
                """);

        for (int i = 0; i < kingsCollege.subjects; i++) {
            System.out.print('[');
            for (int j = 0; j <kingsCollege.students ; j++) {
                System.out.print(kingsCollege.scores [i][j] + " ");
            }
            System.out.println("]");
        }

    }
    @Test void testSaveScores(){




    }
    @Test void testTotal(){

        int[] result = {kingsCollege.scores[0][0],kingsCollege.scores[0][1],kingsCollege.scores[0][2]};
        int[] student1Score =kingsCollege.getScore(1);
        int total=0;
        for (int j : result) {
            total += j;
        }
        int averageTest= total/kingsCollege.subjects;

        int student1Total= kingsCollege.getTotal(student1Score);
        int average = kingsCollege.getAverage(student1Total);





        assertArrayEquals(student1Score,result);
        assertEquals(total,student1Total);
        assertEquals(averageTest,average);


    }
    @Test void largestScore(){

        int highestScore = kingsCollege.getHighestScore();
        assertEquals(highestScore,100);

        int lowestScore = kingsCollege.getLowestScore();
        assertEquals(lowestScore,12);

        String bestStudent = kingsCollege.getBestStudent();
        assertEquals(bestStudent,"Student 3 Scoring 100");

        String worstStudent = kingsCollege.getWorstStudent();
        assertEquals(worstStudent,"Student 2 Scoring 12");


        String sub1best= kingsCollege.getSub1BestStudent();
        assertEquals(sub1best,"Student 3 Scoring 99");

        String sub2best = kingsCollege.getSub2BestStudent();
        assertEquals(sub2best,"Student 3 Scoring 98");

        String sub3best = kingsCollege.getSub3BestStudent();
        assertEquals(sub3best,"Student 3 Scoring 100");

        int sub1total = kingsCollege.getSubjectsTotal(1);
        assertEquals(sub1total,135);

        int sub2total = kingsCollege.getSubjectsTotal(2);
        assertEquals(sub2total,177);

        int sub3total = kingsCollege.getSubjectsTotal(3);
        assertEquals(sub3total,146);

        int sub1Average = kingsCollege.getSubjectsAverage(1);
        assertEquals(sub1Average,45);

        int sub2Average = kingsCollege.getSubjectsAverage(2);
        assertEquals(sub2Average,59);

        int sub3Average = kingsCollege.getSubjectsAverage(3);
        assertEquals(sub3Average,48);

        int nunPasses=kingsCollege.getNoOfPasses();
        assertEquals(nunPasses,4);
        int numFails =kingsCollege.getNoOfFails();
        assertEquals(numFails,5);

        String easiest = kingsCollege.getSubPassAndFails(1);
        assertEquals(easiest,"the easiest subject is 2 with 2 passes and 1 failures");

        String hardest = kingsCollege.getSubPassAndFails(2);
        assertEquals(hardest, "the hardest subject is 1 with 2 failures and 1 pass");

    }
    @Test void sub1BestAndWorstStudent(){


        String best = kingsCollege.getSub1BestStudent();
        assertEquals(best,"Student 3 Scoring 99");

        String worst = kingsCollege.getSub1WorstStudent();
        assertEquals(worst,"Student 2 Scoring 13");


    }
    @Test void studentPositionCanBeSet(){

        int average =kingsCollege.getAverage(kingsCollege.getTotal(kingsCollege.getScore(1)));
        int average2 =kingsCollege.getAverage(kingsCollege.getTotal(kingsCollege.getScore(2)));
        int average3 =kingsCollege.getAverage(kingsCollege.getTotal(kingsCollege.getScore(3)));

        int[] studentAverages = {23,30,99};
        int[] savedAverages = kingsCollege.studentAverages;
        assertEquals(23,average);
        assertEquals(30,average2);
        assertEquals(99,average3);
        assertArrayEquals(studentAverages,savedAverages);

        int position = kingsCollege.getPosition(savedAverages,1);
        int position1 = kingsCollege.getPosition(savedAverages,2);
        int position2 = kingsCollege.getPosition(savedAverages,3);

        assertEquals(position,3);
        assertEquals(position1,2);
        assertEquals(position2,1);

    }

}