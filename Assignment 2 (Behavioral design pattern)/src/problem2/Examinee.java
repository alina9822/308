package problem2;

public class Examinee implements Student{
    //has the mediator interface
    private String studentId;
    private Integer marks;
    private Mediator mediator;

    public Examinee(String studentId,Mediator mediator)
    {
        this.studentId=studentId;
        this.mediator=mediator;
    }

    //business logic
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public void PrintMarks() {
        System.out.println("Student Id: " + studentId + " Marks: " +marks);
    }

    @Override
    public void requestRecheck() {
        System.out.println("Re-examine request sent from student id "+studentId);
        mediator.notify(this,"recheck");
    }
}
