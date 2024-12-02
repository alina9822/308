package Problem1;

import java.util.Scanner;
import java.util.Vector;

public class AdapterDemo {

    public static String takeInput()
    {
        Scanner sn=new Scanner(System.in);
        String str = sn.nextLine();
        return str;
    }

    public static void main(String[] args) {

        Vector<Crewmate> crewmateList = new Vector<>();
        Vector<Imposter> imposterList = new Vector<>();
        Vector<Crewmate> adaptedImposterList = new Vector<>();


        while (true) {
            System.out.println("What do you want to do\n1.Add\n2.Show");
            Scanner sn = new Scanner(System.in);
            char ch = sn.next().charAt(0);



            if (ch == '1') {
                System.out.println("What do you want to add\n1.Crewmate\n2.Imposter");
                ch = sn.next().charAt(0);
                if (ch == '1') {
                    String name = takeInput();
                    ConcreteCrewmate crewmate = new ConcreteCrewmate(name);
                    crewmateList.add(crewmate);
                } else if (ch == '2') {
                    String name = takeInput();
                    ConcreteImposter imposter = new ConcreteImposter(name);
                    Crewmate adaptedImposter = new ImposterAdapter(imposter);
                    imposterList.add(imposter);
                    adaptedImposterList.add(adaptedImposter);
                }

            }
            else if (ch == '2') {
                for (int i = 0; i < crewmateList.size(); i++) {
                    crewmateList.get(i).PrintName();
                    crewmateList.get(i).getType();
                    crewmateList.get(i).getJob();
                }

                for (int i = 0; i < imposterList.size(); i++) {
                    imposterList.get(i).PrintName();
                    System.out.println("What actual imposter does");
                    imposterList.get(i).getType();
                    imposterList.get(i).getJob();
                    System.out.println("What the crewmates see");
                    adaptedImposterList.get(i).getType();
                    adaptedImposterList.get(i).getJob();
                }

            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}
