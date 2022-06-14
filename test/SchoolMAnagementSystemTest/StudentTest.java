package SchoolMAnagementSystemTest;

import SchoolManagementSystem.Course;
import SchoolManagementSystem.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;
    Course course;

    @BeforeEach
    void setUp() {
        student = new Student("Ace", "Kobo", 23, "Male");
        student.resetId();
        course = new Course("Java");
        student.offerCourse(course);
    }

    @Test
    void getFirstName() {
        assertEquals("Ace", student.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Kobo", student.getLastName());
    }

    @Test
    void getStudentId() {
        assertEquals(1001, student.getStudentId());
    }

    @Test
    void getGender() {
        assertEquals("Male", student.getGender());
    }

    @Test
    void getAge() {
        assertEquals(23, student.getAge());
    }

    @Test
    void setFirstName() {
        student.setFirstName("Chukwudi");
        assertEquals("Chukwudi", student.getFirstName());
    }

    @Test
    void setLastName() {
        student.setLastName("ponmo");
        assertEquals("ponmo", student.getLastName());
    }

    @Test
    void setAge() {
        student.setAge(25);
        assertEquals(25, student.getAge());
    }

    @Test
    void setGender() {
        student.setGender("female");
        assertEquals("female", student.getGender());
    }


    @Test
    void resetId() {
        student.resetId();
        assertEquals(1001, student.getStudentId());
    }

    @Test
    void offerCourse() {
        assertEquals(1, student.getCourseOffered().size());
    }


    @Test
    void getACourseOffered() {
        assertEquals(course, student.getACourseOffered("Java"));
    }

    @Test
    void getAllCoursesOffered() {
       assertNotNull(student.getCourseOffered());
    }

    @Test
    void getCourseOffered() {
        assertNotNull(student.getACourseOffered("Java"));
    }

    @Test
    void dropCourse() {
        student.dropCourse("Java");
        assertEquals(0,student.getCourseOffered().size());
    }
}