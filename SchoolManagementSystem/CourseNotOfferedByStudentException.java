package SchoolManagementSystem;

public class CourseNotOfferedByStudentException extends RuntimeException {
    public CourseNotOfferedByStudentException(){
        super();
    }
    public CourseNotOfferedByStudentException(String message){
        super(message);
    }
    public CourseNotOfferedByStudentException(Throwable ex){
        super(ex);
    }
    public CourseNotOfferedByStudentException(String message, Throwable ex){
        super(message,ex);
    }

}
