package Problem3;

import java.util.Iterator;

public class Developer extends Component{
    String name;
    String project;
    String parent;

    public Developer(String name, String project,String parent)
    {
        this.name=name;
        this.project=project;
        this.parent=parent;
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
        System.out.println("developer_component_details():");
        System.out.println("Name: "+name);
        System.out.println("Role: Project Developer");
        System.out.println("Current Project: "+project);
        return null;
    }

    public void printHierarchy()
    {
        System.out.println("\t\t\t- "+name);
    }


}
