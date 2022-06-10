package C11_Java;

public class Cohort11_Exception extends RuntimeException{
    public Cohort11_Exception(){
        super();
    }
    public Cohort11_Exception(String message){
        super(message);
    }
    public Cohort11_Exception(Throwable ex){
        super(ex);
    }
    public Cohort11_Exception(String message, Throwable ex){
        super(message,ex);
    }
}