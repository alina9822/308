package Problem1;

public abstract class Imposter {
    public String getType()
    {
        System.out.println("Space Monster");
        return "Space Monster";
    };
    public void getJob()
    {
        System.out.println("Damaging the spaceship & poisoning the crewmates\n");
    };
    public abstract void PrintName();
}
