package problem1;

import java.util.Scanner;

public class ObserverDemo {
    public static void main(String[] args) {

        ABCserver subject=new ABCserver();

        Observer regular=new RegularUser(subject);
        Observer premium=new PremiumUser(subject);

        subject.AddObserver(regular);
        subject.AddObserver(premium);

        while(true)
        {
            System.out.println("The current state of server : "+subject.getCurrState());
            System.out.println("choose the state");
            System.out.println("1.Operational");
            System.out.println("2.Partially down");
            System.out.println("3.Fully down");
            Scanner scn=new Scanner(System.in);

            char ch;
            ch=scn.next().charAt(0);

            if(ch=='1')
            {
                subject.ChangeState("Operational");
            }
            else if(ch=='2')
            {
                subject.ChangeState("Partially down");
            }
            else if(ch=='3')
            {
                subject.ChangeState("Fully down");
            }
            else
            {
                System.out.println("Invalid input");
            }



        }

    }
}
