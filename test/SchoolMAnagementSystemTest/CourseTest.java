package SchoolMAnagementSystemTest;

import SchoolManagementSystem.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course course;
    @BeforeEach
    void setUp(){
        course = new Course("Java");
        course.resetId();
    }

    @Test
    void getCourseId() {
        assertEquals(100, course.getCourseId());
    }

    @Test
    void getCourseName() {
        assertEquals("Java",course.getCourseName());
    }

    @Test
    void setName() {
        course.setName("Python");
        assertEquals("Python",course.getCourseName());
    }

    @Test
    void resetId() {
        course.resetId();
        assertEquals(100,course.getCourseId());
    }
}