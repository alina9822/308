package problem1;

import java.io.IOException;
import java.util.Scanner;

public class BuildPC {
    public static void main(String[] args) {
        char ch;
        Scanner scr=new Scanner(System.in);


        int order=0;
        while (true)
        {
            PC pc=null;
            ch=scr.next().charAt(0);

            if(ch=='O' || ch=='o')
            {
                long sum=0;
                order++;
                while (true)
                {
                    System.out.println("Processing order "+order);
                    System.out.println("Choose the PC type:");
                    System.out.println("1 --> Intel type 1");
                    System.out.println("2 --> Intel type 2");
                    System.out.println("3 --> Intel type 3");
                    System.out.println("4 --> Gaming PC");
                    System.out.println("E --> End the order");

                    ch=scr.next().charAt(0);

                    if(ch=='1')
                    {
                        Builder pc_builder =new IntelPC1_Builder();
                        Director director =new Director(pc_builder);
                        int r1=0,r2=0;
                        int c1=0,c2=0;

                        while (true)
                        {
                            System.out.println("Choose the add ons");
                            System.out.println("1 --> add ram");
                            System.out.println("2 --> add graphics card");
                            System.out.println("3 --> no more add on");

                            ch=scr.next().charAt(0);
                            if (ch=='1')
                            {
                                System.out.println("Select the variation");
                                System.out.println("1 -->  8 GB DDR4 RAM(2666MHz)");
                                System.out.println("2 -->  8 GB DDR4 RAM(3200MHz)");
                                ch=scr.next().charAt(0);
                                if(ch=='1')
                                {
                                    r1++;
                                    director.addRam1("8 GB DDR4 RAM(2666MHz)*"+r1);
                                }
                                else if (ch=='2')
                                {
                                    r2++;
                                    director.addRam2("8 GB DDR4 RAM(3200MHz)*"+r2);
                                }
                                else if(ch=='o' || ch=='O')
                                    System.out.println("Finish the order first");
                                else
                                    System.out.println("invalid input");

                            }
                            else if(ch=='2')
                            {
                                System.out.println("Select the size");
                                System.out.println("1 --> 2GB");
                                System.out.println("2 --> 4GB");
                                ch=scr.next().charAt(0);
                                if(ch=='1')
                                {
                                    c1++;
                                    director.addGraphicsCard1("2GB Graphics Card*"+c1);
                                }
                                else if(ch=='2')
                                {
                                    c2++;
                                    director.addGraphicsCard2("4GB Graphics Card*"+c2);
                                }
                                else if(ch=='o' || ch=='O')
                                    System.out.println("Finish the order first");
                                else
                                    System.out.println("invalid input");
                            }
                            else if (ch=='3')
                            {
                                director.buildPC();
                                //pc=new PC();
                                pc=director.getPC();
                                System.out.println(pc.toString());
                                pc.Print();
                                sum+=pc.getTotal_price();
                                break;
                            }
                            else if(ch=='o' || ch=='O')
                                System.out.println("Finish the order first");
                        }
                    }
                    else if(ch=='2')
                    {
                        Builder pc_builder =new IntelPC2_Builder();
                        Director director =new Director(pc_builder);
                        int r1=0,r2=0;
                        int c1=0,c2=0;

                        while (true)
                        {
                            System.out.println("Choose the add ons");
                            System.out.println("1 --> add ram");
                            System.out.println("2 --> add graphics card");
                            System.out.println("3 --> no more add on");

                            ch=scr.next().charAt(0);
                            if (ch=='1')
                            {
                                System.out.println("Select the variation");
                                System.out.println("1 -->  8 GB DDR4 RAM(2666MHz)");
                                System.out.println("2 -->  8 GB DDR4 RAM(3200MHz)");
                                ch=scr.next().charAt(0);
                                if(ch=='1')
                                {
                                    r1++;
                                    director.addRam1("8 GB DDR4 RAM(2666MHz)*"+r1);
                                }
                                else if (ch=='2')
                                {
                                    r2++;
                                    director.addRam2("8 GB DDR4 RAM(3200MHz)*"+r2);
                                }
                                else if(ch=='o' || ch=='O')
                                    System.out.println("Finish the order first");
                                else
                                    System.out.println("invalid input");

                            }
                            else if(ch=='2')
                            {
                                System.out.println("Select the size");
                                System.out.println("1 --> 2GB");
                                System.out.println("2 --> 4GB");
                                ch=scr.next().charAt(0);
                                if(ch=='1')
                                {
                                    c1++;
                                    director.addGraphicsCard1("2GB Graphics Card*"+c1);
                                }
                                else if(ch=='2')
                                {
                                    c2++;
                                    director.addGraphicsCard2("4GB Graphics Card*"+c2);
                                }
                                else if(ch=='o' || ch=='O')
                                    System.out.println("Finish the order first");
                                else
                                    System.out.println("invalid input");
                            }
                            else if (ch=='3')
                            {
                                director.buildPC();
                                //pc=new PC();
                                pc=director.getPC();
                                System.out.println(pc.toString());
                                pc.Print();
                                sum+=pc.getTotal_price();
                                break;
                            }
                            else if(ch=='o' || ch=='O')
                                System.out.println("Finish the order first");
                        }
                    }
                    else if(ch=='3')
                    {
                        Builder pc_builder =new IntelPC3_Builder();
                        Director director =new Director(pc_builder);
                        int r1=0,r2=0;
                        int c1=0,c2=0;

                        while (true)
                        {
                            System.out.println("Choose the add ons");
                            System.out.println("1 --> add ram");
                            System.out.println("2 --> add graphics card");
                            System.out.println("3 --> no more add on");

                            ch=scr.next().charAt(0);
                            if (ch=='1')
                            {
                                System.out.println("Select the variation");
                                System.out.println("1 -->  8 GB DDR4 RAM(2666MHz)");
                                System.out.println("2 -->  8 GB DDR4 RAM(3200MHz)");
                                ch=scr.next().charAt(0);
                                if(ch=='1')
                                {
                                    r1++;
                                    director.addRam1("8 GB DDR4 RAM(2666MHz)*"+r1);
                                }
                                else if (ch=='2')
                                {
                                    r2++;
                                    director.addRam2("8 GB DDR4 RAM(3200MHz)*"+r2);
                                }
                                else if(ch=='o' || ch=='O')
                                    System.out.println("Finish the order first");
                                else
                                    System.out.println("invalid input");

                            }
                            else if(ch=='2')
                            {
                                System.out.println("Select the size");
                                System.out.println("1 --> 2GB");
                                System.out.println("2 --> 4GB");
                                ch=scr.next().charAt(0);
                                if(ch=='1')
                                {
                                    c1++;
                                    director.addGraphicsCard1("2GB Graphics Card*"+c1);
                                }
                                else if(ch=='2')
                                {
                                    c2++;
                                    director.addGraphicsCard2("4GB Graphics Card*"+c2);
                                }
                                else if(ch=='o' || ch=='O')
                                    System.out.println("Finish the order first");
                                else
                                    System.out.println("invalid input");
                            }
                            else if (ch=='3')
                            {
                                director.buildPC();
                                //pc=new PC();
                                pc=director.getPC();
                                System.out.println(pc.toString());
                                pc.Print();
                                sum+=pc.getTotal_price();
                                break;
                            }
                            else if(ch=='o' || ch=='O')
                                System.out.println("Finish the order first");
                        }
                    }
                    else if(ch=='4')
                    {
                        Builder pc_builder =new GamingPC_Builder();
                        Director director =new Director(pc_builder);
                        int r1=0,r2=0;
                        int c1=0,c2=0;

                        while (true)
                        {
                            System.out.println("Choose the add ons");
                            System.out.println("1 --> add ram");
                            System.out.println("2 --> add graphics card");
                            System.out.println("3 --> no more add on");

                            ch=scr.next().charAt(0);
                            if (ch=='1')
                            {
                                System.out.println("Select the variation");
                                System.out.println("1 -->  8 GB DDR4 RAM(2666MHz)");
                                System.out.println("2 -->  8 GB DDR4 RAM(3200MHz)");
                                ch=scr.next().charAt(0);
                                if(ch=='1')
                                {
                                    r1++;
                                    director.addRam1("8 GB DDR4 RAM(2666MHz)*"+r1);
                                }
                                else if (ch=='2')
                                {
                                    r2++;
                                    director.addRam2("8 GB DDR4 RAM(3200MHz)*"+r2);
                                }
                                else if(ch=='o' || ch=='O')
                                    System.out.println("Finish the order first");
                                else
                                    System.out.println("invalid input");

                            }
                            else if(ch=='2')
                            {
                                System.out.println("Select the size");
                                System.out.println("1 --> 2GB");
                                System.out.println("2 --> 4GB");
                                ch=scr.next().charAt(0);
                                if(ch=='1')
                                {
                                    c1++;
                                    director.addGraphicsCard1("2GB Graphics Card*"+c1);
                                }
                                else if(ch=='2')
                                {
                                    c2++;
                                    director.addGraphicsCard2("4GB Graphics Card*"+c2);
                                }
                                else if(ch=='o' || ch=='O')
                                    System.out.println("Finish the order first");
                                else
                                    System.out.println("invalid input");
                            }
                            else if (ch=='3')
                            {
                                director.buildPC();
                                //pc=new PC();
                                pc=director.getPC();
                                System.out.println(pc.toString());
                                pc.Print();
                                sum+=pc.getTotal_price();
                                break;
                            }
                            else if(ch=='o' || ch=='O')
                                System.out.println("Finish the order first");
                        }
                    }
                    else if(ch=='o' || ch=='O')
                        System.out.println("Finish the order first");
                    else if (ch=='E' || ch=='e')
                    {
                        if(pc==null)
                        {
                            System.out.println("Order at least one PC");
                        }
                        else
                        {
                            System.out.println("Total of order "+order+" = "+sum);
                            break;
                        }
                    }
                }
            }
            else
                System.out.println("Invalid input");

        }
    }
}
