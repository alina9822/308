package problem2;

public interface Student {
    public String getStudentId();

    public void setStudentId(String studentId);

    public Integer getMarks();

    public void setMarks(Integer marks);
    public void PrintMarks();
    public void requestRecheck();
}