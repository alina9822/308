package Problem2;

public class DairyCream extends Decorators{
    Beverage beverage;

    public DairyCream(Beverage beverage)
    {
        this.beverage=beverage;
    }

    public String getDescription()
    {
        return beverage.getDescription()+", Dairy Cream";
    }

    public double cost()
    {
        return 40+ beverage.cost();
    }
}
