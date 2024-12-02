package Problem3;

import java.util.*;

public class SoftwareCompany extends Component{
    String name;
    ArrayList manager = new ArrayList();

    public SoftwareCompany(String name)
    {
        this.name=name;
    }

    public void add(Component component)
    {
        manager.add(component);
    }

    public void remove(Component component)
    {
        manager.remove(component);
    }

    public Component getChild(int i)
    {
        return (Component)manager.get(i);
    }

    public int getChildSize()
    {
        return manager.size();
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        System.out.println("Current Projects -> Managers");
        Iterator iterator = manager.iterator();
        while(iterator.hasNext())
        {
            Component component=(Component)iterator.next();
            System.out.println("\t"+component.getProject()+" -> "+component.getName());
        }
        return null;
    }

    public void printHierarchy()
    {
        System.out.println("company_component_hierarchy():");
        System.out.println("\t- "+name);

        Iterator iterator = manager.iterator();
        while(iterator.hasNext())
        {
            Component component=(Component)iterator.next();
            component.printHierarchy();
        }
    }


}
