package problem2;
import java.util.*;

public class ExamController implements Mediator{
    //has instance of all the components
    //Vector<String> teacher = new Vector<String>(1);

    Map<String,Integer> stMarks = new HashMap<String, Integer>();
    private int st=0;

    Vector<Student> students=new Vector<Student>();
    Teacher teacher;

    public void RegisterExaminee(Student component)
    {
        students.add(component);
        st++;
    }

    public void RegisterTeacher(Teacher teacher)
    {
        this.teacher=teacher;
    }

    public void ShowCheckedMarks()
    {
        Vector<Integer> marks=teacher.getStMarks();

        int i=1;
        for(Integer value: marks){
            String id=String.valueOf(i);
            stMarks.put(id,value);
            i++;
        }
        System.out.println("---Marks after checking---");
        for (String id : stMarks.keySet()) {
            System.out.println("Student Id: " + id + " Marks: " + stMarks.get(id));
        }
        Scrutinize();
    }

    public void Scrutinize()
    {
        System.out.println("---Marks after correction---");
        for (String id : stMarks.keySet()) {
            if(stMarks.get(id)%2==0) {
                int prev=stMarks.get(id);
                Random rand = new Random();
                int random_integer = rand.nextInt(100 - 50) + 50;
                stMarks.replace(id, random_integer);
                if(prev!=stMarks.get(id))
                System.out.println("Student Id: " + id + " Previous Marks: " +prev+ " Corrected Marks: "+ stMarks.get(id));
            }
        }
        for(Student student:students)
        {
            student.setMarks(stMarks.get(student.getStudentId()));
        }

    }
    @Override
    public void notify(Teacher teacher, String str) {
        if(str.equalsIgnoreCase("marks checked"))
            ShowCheckedMarks();
    }

    @Override
    public void notify(Student student, String str) {
        if(str.equalsIgnoreCase("recheck"))
        {
            System.out.println("Re-examine request got from student id "+student.getStudentId());
            int newMark=teacher.reCheck();
            if(newMark>student.getMarks()) {
                System.out.println("Marks increased");
                System.out.println("Student Id: " + student.getStudentId() + " Previous Marks: " +student.getMarks()+ " Rechecked Marks: "+ newMark);
            }
            else if (newMark<student.getMarks())
            {
                System.out.println("Marks decreased");
                System.out.println("Student Id: " + student.getStudentId() + " Previous Marks: " +student.getMarks()+ " Rechecked Marks: "+ newMark);
            }
            else
            {
                System.out.println("Marks unchanged");
                System.out.println("Student Id: " + student.getStudentId() + " Previous Marks: " +student.getMarks()+ " Rechecked Marks: "+ newMark);
            }
            student.setMarks(newMark);
        }
    }

    @Override
    public void notify(String str) {

        if(str.equalsIgnoreCase("check"))
            teacher.check(st);

    }

}
