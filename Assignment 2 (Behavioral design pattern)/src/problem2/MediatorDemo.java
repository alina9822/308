package problem2;

import java.util.Scanner;

public class MediatorDemo {
    public static void main(String[] args) {

        ExamController mediator= new ExamController();

        Teacher teacher = new Teacher(mediator);

        Student examinee1= new Examinee("1",mediator);
        Student examinee2= new Examinee("2",mediator);
        Student examinee3= new Examinee("3",mediator);
        Student examinee4= new Examinee("4",mediator);
        Student examinee5= new Examinee("5",mediator);


        mediator.RegisterTeacher(teacher);

        mediator.RegisterExaminee(examinee1);
        mediator.RegisterExaminee(examinee2);
        mediator.RegisterExaminee(examinee3);
        mediator.RegisterExaminee(examinee4);
        mediator.RegisterExaminee(examinee5);

        mediator.notify("check");

        System.out.println("---Printing from student side---");
        examinee1.PrintMarks();
        examinee2.PrintMarks();
        examinee3.PrintMarks();
        examinee4.PrintMarks();
        examinee5.PrintMarks();

        while(true)
        {
            System.out.println("===If you want to recheck type yes and enter student id===");
            Scanner scn= new Scanner(System.in);
            String s = scn.nextLine();

            if(s.equalsIgnoreCase("yes"))
            {
                s=scn.nextLine();
                if(s.equals("1"))
                    examinee1.requestRecheck();
                else if(s.equals("2"))
                    examinee2.requestRecheck();
                 else if(s.equals("3"))
                    examinee3.requestRecheck();
                 else if(s.equals("4"))
                    examinee4.requestRecheck();
                 else if(s.equals("5"))
                    examinee5.requestRecheck();

            }

        }

    }
}
