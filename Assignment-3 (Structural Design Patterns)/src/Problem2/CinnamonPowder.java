package Problem2;

public class CinnamonPowder extends Decorators{
    Beverage beverage;

    public CinnamonPowder(Beverage beverage)
    {
        this.beverage=beverage;
    }

    public String getDescription()
    {
        return beverage.getDescription()+", Cinnamon Powder";
    }

    public double cost()
    {
        return 50+ beverage.cost();
    }
}
