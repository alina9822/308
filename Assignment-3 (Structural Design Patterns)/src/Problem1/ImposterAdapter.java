package Problem1;

public class ImposterAdapter extends Crewmate{
    Imposter imposter;

    public ImposterAdapter(Imposter imposter)
    {
        this.imposter=imposter;
    }

    public String getType()
    {
        System.out.println("Crewmate");
        return "Crewmate";
    };
    public void getJob()
    {
        System.out.println("Fixing the spaceship\n");
    };
    public Imposter getImposter()
    {
        return imposter;
    }

    public void PrintName()
    {
        imposter.PrintName();
    }


}
