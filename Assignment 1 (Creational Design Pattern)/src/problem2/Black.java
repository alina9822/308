package problem2;

public class Black implements Color{
    @Override
    public void Print() {
        System.out.println("black");
    }

    @Override
    public String getName() {
        return "black";
    }
}
