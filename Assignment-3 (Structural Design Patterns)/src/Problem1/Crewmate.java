package Problem1;

public abstract class Crewmate {

    public String getType()
    {
        System.out.println("Crewmate");
        return "Crewmate";
    };
    public void getJob()
    {
        System.out.println("Fixing the spaceship\n");
    };
    public abstract void PrintName();
}
