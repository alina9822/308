package problem3;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        VendingMachineContext context=new VendingMachineContext();
        Scanner sn=new Scanner(System.in);
        char ch ;

        System.out.println("---We have only one product costs 10 taka---");
        System.out.println("---The product is in stock!---");

        while (true)
        {
            System.out.println("");
            context.Print();
            System.out.println("Here are your options");
            System.out.println("1.Select\n2.Add Money\n3.Deliver\n4.Cancel\n5.Leave");
            ch=sn.next().charAt(0);

            if(ch=='1')
            {
                context.Select();
            }
            else if(ch=='2')
            {
                if(context.AddMoney())
                {
                    System.out.println("Enter the amount");
                    context.Deposit(sn.nextInt());
                }
            }
            else if(ch=='3')
            {
                context.Deliver();
            }
            else if(ch=='4')
            {
                context.Cancel();
            }
            else if(ch=='5')
            {
                break;
            }
            else
                System.out.println("**Invalid Input**");
        }
    }
}
