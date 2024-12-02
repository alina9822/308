package problem2;

public class Tesla implements Car{

    public Color carColor;
    public Engine carEngine;
    public DriveTrain carDT;
    public DominatingCountry carDC;

    public Tesla()
    {
        carColor=new White();
        carEngine=new ElectricEngines();
        carDT=new AllWheel();
        carDC=new US();
    }

    @Override
    public void Print() {
        System.out.println("Name of the company : TESLA");
        System.out.println("Permitted Continent : United States");
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
