package Problem1;

public class ConcreteImposter extends Imposter{
    String name;

    public ConcreteImposter(String name)
    {
        this.name=name;
    }

    public void PrintName()
    {
        System.out.println(name);
    }

}
