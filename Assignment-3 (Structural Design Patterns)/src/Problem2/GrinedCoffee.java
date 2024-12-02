package Problem2;

public class GrinedCoffee extends Decorators{
    Beverage beverage;

    public GrinedCoffee(Beverage beverage)
    {
        this.beverage=beverage;
    }

    public String getDescription()
    {
        return beverage.getDescription()+", Grined coffee";
    }

    public double cost()
    {
        return 30+ beverage.cost();
    }
}
