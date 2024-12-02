package problem2;

public class ElectricEngines implements Engine {
    @Override
    public String getType() {
        return "electric engine";
    }

    @Override
    public void Print() {
        System.out.println("electric engine");

    }
}
