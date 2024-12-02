package problem2;

import java.util.Scanner;

public class CreateCar {

    public static void main(String[] args) {

        CarFactory carFactory= new CarFactory();

        System.out.println("Input the continent ");

        Scanner sc=new Scanner(System.in);
        String location =sc.nextLine();

        Car car=carFactory.getCar(location);

        car.Print();

//        char ch=sc.next().charAt(0);
//        if(ch=='q')
//        {
//            System.out.print("\033[2J\033[2J");
//            System.out.flush();
//        }
    }
}
