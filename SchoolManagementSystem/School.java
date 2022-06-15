package SchoolManagementSystem;

import java.util.ArrayList;

public class School {
    private final String name;
    private final String location;
    private final ArrayList<Course> listOfCourses = new ArrayList<>();
    private final ArrayList<Student> listOfStudents = new ArrayList<>();
    private final ArrayList<Student> expelledStudents = new ArrayList<>();

    public School(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getSchoolName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void addCourse(Course course) {
        for (Course course1 : listOfCourses) {
            if (course.getCourseName().equalsIgnoreCase(course1.getCourseName())) {
                throw new IllegalArgumentException(String.format("Course with name: %s already exist", course.getCourseName()));
            }
        }
        listOfCourses.add(course);
    }

    public Course getCourse(int courseId) {
        for (Course course : listOfCourses) {
            if (course.getCourseId() == courseId) {
                return course;
            }
        }
        throw new IllegalArgumentException("course with courseId: " + courseId + " not found");
    }

    public void getAllCourses() {
        for (Course course : listOfCourses) {
            System.out.println(course);
        }
    }

    public void removeCourse(String courseName) {
        Course courseToBeRemoved = null;
        for (Course course : listOfCourses) {
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                courseToBeRemoved = course;
                break;
            }
        }
        if (courseToBeRemoved == null) {
            throw new IllegalArgumentException("course with courseName: " + courseName + " not found");
        }
        listOfCourses.remove(courseToBeRemoved);

    }

    public void addStudent(Student student) {
        for (Student student1 : listOfStudents) {
            if (student.getFirstName().equalsIgnoreCase(student1.getFirstName())) {
                throw new IllegalArgumentException("student with name " + student.getFirstName() + " already exist");
            }
        }
        listOfStudents.add(student);
    }

    public Student getStudent(int studentId) {
        for (Student student : listOfStudents) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        throw new IllegalArgumentException("student with StudentId " + studentId + " not found");

    }


    public void getAllStudents() {
        for (Student student : listOfStudents) {
            System.out.println(student);
        }
    }

    public void expelStudent(int studentId) {
        for (Student student : listOfStudents) {
            if (student.getStudentId() == studentId) {
                listOfStudents.remove(student);
                expelledStudents.add(student);
                return;
            }
        }

        throw new IllegalArgumentException("student with StudentId " + studentId + " not found");

    }

    public void editInfo(String name, String oldName, String newName) {
        for (Student student : listOfStudents) {
            if (student.getFirstName().equalsIgnoreCase(oldName)) {
                if (name.equalsIgnoreCase("F")) {
                    student.setFirstName(newName);
                    return;
                }
            }
            if (student.getLastName().equalsIgnoreCase(oldName)) {
                if (name.equalsIgnoreCase("L")) {
                    student.setLastName(newName);
                    return;
                }
            }
        }

        throw new IllegalArgumentException("student with Name \"" + oldName + "\" not found");


    }

    public void editInfo(int studentId, int actualAge) {
        for (Student student : listOfStudents) {
            if (student.getStudentId() == studentId) {
                student.setAge(actualAge);
                return;
            }
        }
        throw new IllegalArgumentException("student with StudentId " + studentId + " not found");

    }

    public void editInfo(int studentId, String actualGender) {
        for (Student student : listOfStudents) {
            if (student.getStudentId() == studentId) {
                student.setGender(actualGender);
                return;
            }
        }
        throw new IllegalArgumentException("student with StudentId " + studentId + " not found");

    }

    public void getAllExpelledStudents() {
        for (Student student : expelledStudents) {
            System.out.println(student);
        }
    }

    public void editCourseName(int id, String newName) {
        for (Course course : listOfCourses) {
            if (course.getCourseId() == id) {
                course.setName(newName);
                return;
            }
        }
        throw new IllegalArgumentException("course with courseId: " + id + " not found");
    }

    public int getTotalStudents() {
        return listOfStudents.size();
    }

    public void clearDatabase() {
        for (Student student : listOfStudents) {
            student.resetId();
        }
        for (Course course : listOfCourses) {
            course.resetId();
        }
        listOfStudents.clear();
        expelledStudents.clear();
    }

    public ArrayList<Course> getListOfCourses() {
        return listOfCourses;
    }

    public int getStudentOfferingACourse(int courseId) {

        int noOfStudents = 0;
        for (Student student : listOfStudents) {
            ArrayList<Course> courses = student.getCourseOffered();
            for (Course course : courses) {
                if (!(course.getCourseId() == courseId)) {
                    throw new IllegalArgumentException("course id: "+courseId+" doesnt exist!");
                }else noOfStudents++;
            }
        }
        return noOfStudents;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }
}
