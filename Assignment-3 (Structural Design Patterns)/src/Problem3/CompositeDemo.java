package Problem3;

import java.util.HashMap;
import java.util.Scanner;

public class CompositeDemo {
    public static String takeInput()
    {
        Scanner sn=new Scanner(System.in);
        String str = sn.nextLine();
        return str;
    }
    public static void main(String[] args) {

        HashMap<String,Component> companyList = new HashMap<>();
        HashMap<String,Component> managerList = new HashMap<>();
        HashMap<String,Component> developerList = new HashMap<>();

        Component company1 =new SoftwareCompany("Company1");
        Component company2 =new SoftwareCompany("Company2");

        companyList.put("Company1",company1);
        companyList.put("Company2",company2);

        Component manager1 =new Manager("C1M1","CSE301","Company1");
        company1.add(manager1);
        Component manager2 =new Manager("C2M1","CSE301","Company2");
        company2.add(manager2);

        managerList.put("C1M1",manager1);
        managerList.put("C2M1",manager2);

        company2.printHierarchy();



        Scanner sn=new Scanner(System.in);
        char ch ;

        while(true)
        {
            System.out.println("Your options->\n1.Add\n2.Remove\n3.Print");

            ch=sn.next().charAt(0);

            if(ch=='1')
            {
                System.out.println("What do you want to add->\n1.Software Company\n2.Project(New Manager)\n3.Developer");
                ch=sn.next().charAt(0);
                if(ch=='1')
                {
                    System.out.print("Insert the name of the company: ");
                    String name = takeInput();
                    Component component=new SoftwareCompany(name);
                    companyList.put(name,component);
                    System.out.println("New Software Company added");
                }
                else if(ch=='2')
                {
                    System.out.println("Available companies");
                    companyList.forEach(
                            (key, value)
                                    -> System.out.println(key));
                    System.out.println("Fill up the details");
                    System.out.print("Company name: ");
                    String c_name = takeInput();
                    if(companyList.get(c_name)==null)
                    {
                        System.out.println("Invalid Input");
                        continue;
                    }
                    companyList.get(c_name).getDescription();
                    System.out.print("Project name: ");
                    String p_name = takeInput();
                    System.out.print("Manager name: ");
                    String m_name = takeInput();
                    Component component= new Manager(m_name,p_name,c_name);
                    companyList.get(c_name).add(component);
                    managerList.put(m_name,component);
                    System.out.println("New Manager added");
                }
                else if(ch=='3')
                {
                    System.out.println("Available companies");
                    companyList.forEach(
                            (key, value)
                                    -> System.out.println(key));
                    System.out.println("Fill up the details: ");
                    System.out.print("Company name: ");
                    String c_name = takeInput();
                    if(companyList.get(c_name)==null)
                    {
                        System.out.println("Invalid Input");
                        continue;
                    }
                    companyList.get(c_name).getDescription();
                    System.out.print("Manager : ");
                    String m_name = takeInput();
                    if(managerList.get(m_name)==null)
                    {
                        System.out.println("Invalid Input");
                        continue;
                    }
                    System.out.print("Project : ");
                    String p_name = takeInput();
                    System.out.print("Developer name : ");
                    String d_name = takeInput();
                    Component component = new Developer(d_name,p_name,m_name);
                    managerList.get(m_name).add(component);
                    developerList.put(d_name,component);
                    System.out.println("New manager added");
                }
                else
                {
                    System.out.println("Invalid input");
                }

            }
            else if(ch=='2')
            {
                System.out.println("What do you want to delete\n1.Company\n2.Manager\n3.Developer");
                ch=sn.next().charAt(0);

                if(ch=='1')
                {
                    System.out.println("Available companies");
                    companyList.forEach(
                            (key, value)
                                    -> System.out.println(key));
                    //System.out.println("Fill up the details: ");
                    System.out.print("Company name: ");
                    String c_name = takeInput();
                    if(companyList.get(c_name)==null)
                    {
                        System.out.println("Invalid Input");
                        continue;
                    }
                    if(companyList.get(c_name).getChildSize()>0)
                    {
                        System.out.println("First delete the managers");
                        continue;
                    }
                    companyList.remove(c_name);
                }
                else if(ch=='2')
                {
                    System.out.println("Available managers");
                    managerList.forEach(
                            (key, value)
                                    -> System.out.println(key));

                    System.out.print("Manger name : ");
                    String m_name=takeInput();

                    Component component=managerList.get(m_name);
                    if(component==null)
                    {
                        System.out.println("Invalid input");
                        continue;
                    }
                    if(component.getChildSize()>0)
                    {
                        System.out.println("First delete the developers");
                        continue;
                    }
                    companyList.get(component.getParent()).remove(component);
                    managerList.remove(m_name);
                }
                else if(ch=='3')
                {
                    System.out.println("Available developers");
                    developerList.forEach(
                            (key, value)
                                    -> System.out.println(key));

                    System.out.print("Developer name : ");
                    String d_name=takeInput();

                    Component component=developerList.get(d_name);
                    if(component==null)
                    {
                        System.out.println("Invalid input");
                        continue;
                    }
                    managerList.get(component.getParent()).remove(component);
                    developerList.remove(d_name);
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else if(ch=='3')
            {
                System.out.println("What do you print->\n1.Company details\n2.Manager details\n3.Developer details");
                ch=sn.next().charAt(0);

                if(ch=='1')
                {
                    System.out.println("Available companies");
                    companyList.forEach(
                            (key, value)
                                    -> System.out.println(key));

                    System.out.print("Company name : ");
                    String c_name=takeInput();
                    if(companyList.get(c_name)==null)
                    {
                        System.out.println("Invalid Input");
                        continue;
                    }
                    companyList.get(c_name).printHierarchy();
                }
                else if(ch=='2')
                {
                    System.out.println("Available managers");
                    managerList.forEach(
                            (key, value)
                                    -> System.out.println(key));

                    System.out.print("Manger name : ");
                    String m_name=takeInput();
                    if(managerList.get(m_name)==null)
                    {
                        System.out.println("Invalid input");
                        continue;
                    }
                    managerList.get(m_name).getDescription();
                }
                else if(ch=='3')
                {
                    System.out.println("Available developers");
                    developerList.forEach(
                            (key, value)
                                    -> System.out.println(key));

                    System.out.print("Developer name : ");
                    String d_name=takeInput();
                    if(developerList.get(d_name)==null)
                    {
                        System.out.println("Invalid input");
                        continue;
                    }
                    developerList.get(d_name).getDescription();
                }
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else
            {
                System.out.println("Invalid input");
            }

        }
    }
}
