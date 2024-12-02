package problem1;

import java.util.Scanner;

public class PremiumUser implements Observer{
    ABCserver subject;
    String observerId;
    String type="Premium";

    public PremiumUser(ABCserver subject)
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


            }
            else if (subject.getPrevState().equalsIgnoreCase("Fully down"))
            {
                System.out.println("The ABC server Previous state: "+subject.getPrevState()+"-->Current state: "+subject.getCurrState());
            }
        }
        else if (subject.getCurrState().equalsIgnoreCase("Partially down"))
        {
            if (subject.getPrevState().equalsIgnoreCase("Operational"))
            {
                System.out.println("The ABC server Previous state: "+subject.getPrevState()+"-->Current state: "+subject.getCurrState());
                System.out.println("Choose from one of these options");
                System.out.println("1.Share service from ABC & DEF server");
                System.out.println("2.Take full service from DEF server");
                Scanner scn=new Scanner(System.in);
                char ch = scn.next().charAt(0);
                if(ch=='1')
                {
                    System.out.println("You are getting some service from ABC server and some service from DEF server");
                }
                else if(ch=='2')
                {
                    System.out.println("You are getting full service from DEF server");
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
                System.out.println("As ABC server is fully down now you will get all services from DEF server");
            }
            else if (subject.getPrevState().equalsIgnoreCase("Operational"))
            {
                System.out.println("The ABC server Previous state: "+subject.getPrevState()+"-->Current state: "+subject.getCurrState());
                System.out.println("Your service is now provided from DEF server");
            }
        }
    }
}
