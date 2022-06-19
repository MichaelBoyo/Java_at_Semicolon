package SchoolManagementSystem;

public class CourseNotFoundException extends RuntimeException {

    public CourseNotFoundException(){
        super();
    }
    public CourseNotFoundException(String message){
        super(message);
    }
    public CourseNotFoundException(Throwable ex){
        super(ex);
    }
    public CourseNotFoundException(String message, Throwable ex){
        super(message,ex);
    }

}
