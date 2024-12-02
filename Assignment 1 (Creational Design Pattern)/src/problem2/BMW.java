package problem2;

public class BMW implements Car{
    public Color carColor;
    public Engine carEngine;
    public DriveTrain carDT;
    public DominatingCountry carDC;

    public BMW()
    {
        carColor=new Black();
        carEngine=new ElectricEngines();
        carDT=new RearWheel();
        carDC=new Germany();
    }

    @Override
    public void Print() {
        System.out.println("Name of the company : BMW");
        System.out.println("Permitted Continent : Europe");
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
