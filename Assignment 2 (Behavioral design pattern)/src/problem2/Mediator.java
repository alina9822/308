package problem2;

public interface Mediator {
    //has the notify method
    //this method will have all the code of inter communication
    public void notify(Teacher teacher,String st);
    public void notify(Student student,String st);
    public void notify(String st);
}
