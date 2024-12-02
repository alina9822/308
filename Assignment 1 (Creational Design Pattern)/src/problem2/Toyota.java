package problem2;

public class Toyota implements Car{
    public Color carColor;
    public Engine carEngine;
    public DriveTrain carDT;
    public DominatingCountry carDC;

    public Toyota()
    {
        carColor=new Red();
        carEngine=new FuelCell();
        carDT=new RearWheel();
        carDC=new Japan();
    }

    @Override
    public void Print() {
        System.out.println("Name of the company : Toyota");
        System.out.println("Permitted Continent : Asia");
        System.out.println("Color of the Car : "+carColor.getName());
        System.out.println("Dominated by : "+carDC.getName());
        System.out.println("Type of engine : "+carEngine.getType());
        System.out.println("Type of drive train : "+carDT.getType());

//    carColor.Print();
//    carEngine.Print();
//    carDT.Print();
//    carDC.Print();
    }

    @Override
    public Color getColor() {
        return carColor;
    }

    @Override
    public Engine getEngine() {
        return carEngine;
    }

    @Override
    public DominatingCountry getDominatingCountry() {
        return carDC;
    }

    @Override
    public DriveTrain getDriveTrain() {
        return carDT;
    }
}
