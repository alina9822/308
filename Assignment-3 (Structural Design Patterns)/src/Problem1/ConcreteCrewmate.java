package Problem1;

public class ConcreteCrewmate extends Crewmate{
    String name;
    public ConcreteCrewmate (String name)
    {
        this.name=name;
    }

    public void PrintName()
    {
        System.out.println(name);
    }
}
