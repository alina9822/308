package problem2;

public class AllWheel implements DriveTrain{


    @Override
    public void Print() {
        System.out.println("all wheel");
    }

    @Override
    public String getType() {
        return "all wheel";
    }
}
