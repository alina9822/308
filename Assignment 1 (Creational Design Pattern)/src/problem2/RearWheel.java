package problem2;

public class RearWheel implements DriveTrain{
    @Override
    public void Print() {
        System.out.println("rear wheel");
    }

    @Override
    public String getType() {
        return "rear wheel";
    }
}
