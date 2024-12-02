package Problem3;

import javax.imageio.ImageReader;
import java.util.*;

public class Manager extends Component{
    String project;
    String name;
    String parent;
    ArrayList supervisees = new ArrayList();

    public Manager(String name,String project,String company)
    {
        this.name=name;
        this.project=project;
        this.parent=company;
    }

    public void add(Component component)
    {
        supervisees.add(component);
    }

    public void remove(Component component)
    {
        supervisees.remove(component);
    }

    public Component getChild(int i)
    {
        return (Component)supervisees.get(i);
    }

    public int getChildSize()
    {
        return supervisees.size();
    }

    public String getName()
    {
        return name;
    }

    public String getProject()
    {
        return project;
    }

    public String getParent()
    {
        return parent;
    }


    public String getDescription()
    {
        System.out.println("manager_component_details():");
        System.out.println("Name: "+name);
        System.out.println("Role: Project Manager");
        System.out.println("Current Project: "+project);
        System.out.println("Number of Supervisees: "+supervisees.size());
        return null;
    }

    public void printHierarchy()
    {

        System.out.println("\t\t- "+name+" ("+project+")");

        Iterator iterator = supervisees.iterator();
        while(iterator.hasNext())
        {
            Component component=(Component)iterator.next();
            component.printHierarchy();
        }
    }

}
