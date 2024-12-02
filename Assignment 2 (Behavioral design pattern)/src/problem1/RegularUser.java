package problem1;

import java.util.Scanner;

public class RegularUser implements Observer{
    ABCserver subject;
    String observerId;
    String type="Regular";
    boolean paying=false;

    public RegularUser (ABCserver subject)
    {
        this.subject=subject;
    }

    public String getType(){
        return type;
    }

    public String getObserverId() {
        return observerId;
    }

    public void setObserverId(String observerId) {
        this.observerId = observerId;
    }

    @Override
    public void Notify() {
        System.out.println("Notification from user :"+getObserverId());
        System.out.println("Type: "+getType());

        if (subject.getCurrState().equalsIgnoreCase("Operational"))
        {
            if (subject.getPrevState().equalsIgnoreCase("Partially down"))
            {
                System.out.println("The ABC server Previous state: "+subject.getPrevState()+"-->Current state: "+subject.getCurrState());
                if(paying)
                {
                    System.out.println("You dont have to pay DEF server anymore to get service ");
                    System.out.println("Your total bill is $250");
                }

            }
            else if (subject.getPrevState().equalsIgnoreCase("Fully down"))
            {
                System.out.println("The ABC server Previous state: "+subject.getPrevState()+"-->Current state: "+subject.getCurrState());
                if(paying)
                {
                    System.out.println("You dont have to pay DEF server anymore to get service ");
                    System.out.println("Your total bill is $450");
                }
            }
        }
        else if (subject.getCurrState().equalsIgnoreCase("Partially down"))
        {
            if (subject.getPrevState().equalsIgnoreCase("Operational"))
            {
                System.out.println("The ABC server Previous state: "+subject.getPrevState()+"-->Current state: "+subject.getCurrState());
                System.out.println("Choose from one of these options");
                System.out.println("1.Continue with limited functionality");
                System.out.println("2.Pay $20 per hour for full service from DEF server");
                Scanner scn=new Scanner(System.in);
                char ch = scn.next().charAt(0);
                if(ch=='1')
                {
                    System.out.println("You will get limited functionality from now");
                }
                else if(ch=='2')
                {
                    paying=true;
                    System.out.println("You are paying DEF server for full service");
                }
                else
                {
                    System.out.println("Invalid input");
                }

            }
            else if (subject.getPrevState().equalsIgnoreCase("Fully down"))
            {
                System.out.println("The ABC server Previous state: "+subject.getPrevState()+"-->Current state: "+subject.getCurrState());
            }
        }
        else if (subject.getCurrState().equalsIgnoreCase("Fully down"))
        {
            if (subject.getPrevState().equalsIgnoreCase("Partially down"))
            {
                System.out.println("The ABC server Previous state: "+subject.getPrevState()+"-->Current state: "+subject.getCurrState());

            }
            else if (subject.getPrevState().equalsIgnoreCase("Operational"))
            {
                System.out.println("The ABC server Previous state: "+subject.getPrevState()+"-->Current state: "+subject.getCurrState());
                System.out.println("Do you want to continue to take service from DEF server and pay $20 per hour");
                System.out.println("1.Yes\n2.No");
                Scanner scn=new Scanner(System.in);
                char ch = scn.next().charAt(0);
                if(ch=='1')
                {
                    System.out.println("You will get limited functionality from now");
                }
                else if(ch=='2')
                {
                    paying=true;
                    System.out.println("You are paying DEF server for full service");
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }
        }
    }
}
