package Problem2;

public class ChocolateSauce extends Decorators{
    Beverage beverage;

    public ChocolateSauce(Beverage beverage)
    {
        this.beverage=beverage;
    }

    public String getDescription()
    {
        return beverage.getDescription()+", Chocolate Sauce";
    }

    public double cost()
    {
        return 60+beverage.cost();
    }
}
