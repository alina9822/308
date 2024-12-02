package problem2;

public class FuelCell implements Engine{
    @Override
    public String getType() {
        return "hydrogen fuel cell";
    }

    @Override
    public void Print() {
        System.out.println("hydrogen fuel cell");
    }
}
