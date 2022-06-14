package SchoolMAnagementSystemTest;

import SchoolManagementSystem.Course;
import SchoolManagementSystem.School;
import SchoolManagementSystem.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School school;
    Student student;
    Course course;

    @BeforeEach
    void setUp() {
        school = new School("mySchool","Sabo");
        student = new Student("Ace", "Kobo", 23, "Male");
        course = new Course("Java");

        school.addStudent(student);
        school.addCourse(course);

        student.offerCourse(course);

    }

    @AfterEach
    void tearDown() {
        school.clearDatabase();
    }

    @Test
    void getSchoolName() {
        assertEquals("mySchool",school.getSchoolName());
    }

    @Test
    void getLocation() {
        assertEquals("Sabo",school.getLocation());
    }

    @Test
    void addCourse() {
        assertEquals(1, school.getListOfCourses().size());
    }

    @Test
    void getCourse() {
        assertNotNull(school.getListOfCourses());
    }

    @Test
    void getAllCourses() {
        Course course1 = new Course("Python");
        school.addCourse(course1);
        assertEquals(2,school.getListOfCourses().size());
    }

    @Test
    void removeCourse() {
        school.removeCourse("Java");
        assertEquals(0,school.getListOfCourses().size());
    }

    @Test
    void addStudent() {
        assertEquals(1,school.getTotalStudents());
    }

    @Test
    void getStudent() {
        Student student1 = school.getStudent(1001);
        assertNotNull(student1);
    }

    @Test
    void getAllStudents() {
        assertNotNull(school.getListOfStudents());
    }

    @Test
    void expelStudent() {
        school.expelStudent(1001);
       assertEquals(0,school.getListOfStudents().size());
    }

    @Test
    void editInfo() {
        school.editInfo(1001,40);
        assertEquals(40,student.getAge());

    }

    @Test
    void testEditInfo() {
        school.editInfo(1001, "female");
        assertEquals("female",student.getGender());
    }

    @Test
    void testEditInfo1() {
        school.editInfo("F","Ace","Uzo");
        assertEquals("Uzo",student.getFirstName());
    }

    @Test
    void getAllExpelledStudents() {
        school.editInfo("L","Kobo","Mali");
        assertEquals("Mali",student.getLastName());
    }

    @Test
    void editCourseName() {
        school.editCourseName(100,"React");
        assertEquals(course.getCourseName(),"React");
    }

    @Test
    void getTotalStudents() {
        assertEquals(1,school.getTotalStudents());

    }

    @Test
    void clearDatabase() {
        school.clearDatabase();
        assertEquals(0,school.getTotalStudents());
    }

    @Test
    void getListOfCourses() {
        assertNotNull(school.getListOfCourses());
    }

    @Test
    void getStudentOfferingACourse() {

        assertEquals(1,school.getStudentOfferingACourse(100));
    }
}