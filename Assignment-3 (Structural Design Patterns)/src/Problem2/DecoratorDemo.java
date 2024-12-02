package Problem2;
import java.util.*;

import java.util.Scanner;
import java.util.Vector;

public class DecoratorDemo {
    public static void main(String[] args) {

        int i=1;
        Scanner sn=new Scanner(System.in);
        char ch ;

        HashMap<Beverage,String> coffeeList = new HashMap<>();

        while (true)
        {
            System.out.println("Order No: "+ i);
            while (true)
            {
                System.out.println("Choose the coffee types form our menu");
                System.out.println("1.Americano");
                System.out.println("2.Espresso");
                System.out.println("3.Cappuccino");
                System.out.println("4.Mocha");
                System.out.println("5.Done");

                ch=sn.next().charAt(0);
                if(ch=='1')
                {
                    Beverage beverage = new BlackCoffee();
                    beverage = new GrinedCoffee(beverage);

                    coffeeList.put(beverage,"Americano");
                }
                else if(ch=='2')
                {
                    Beverage beverage = new BlackCoffee();
                    beverage =new DairyCream(beverage);

                    coffeeList.put(beverage,"Espresso");
                }
                else if(ch=='3')
                {
                    Beverage beverage = new MilkCoffee();
                    beverage =new CinnamonPowder(beverage);

                    coffeeList.put(beverage,"Cappuccino");
                }
                else if(ch=='4')
                {
                    Beverage beverage =new MilkCoffee();
                    beverage =new ChocolateSauce(beverage);

                    coffeeList.put(beverage,"Mocha");
                }
                else if(ch=='5')
                {
                    break;
                }
                else
                    System.out.println("Invalid input");
            }

            double total=0;

            for (Map.Entry<Beverage,String> mapElement : coffeeList.entrySet()) {
                Beverage key = mapElement.getKey();


                String value = mapElement.getValue();
                double price = key.cost()+100;
                total+=price;

                System.out.println(value+"->"+key.getDescription()+" "+price+"taka");
            }
            System.out.println("Total = "+total+"taka");

            System.out.println();
            i++;
            coffeeList.clear();

        }

    }
}
