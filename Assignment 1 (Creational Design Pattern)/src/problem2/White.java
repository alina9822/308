package problem2;

public class White implements Color{
    @Override
    public void Print() {
        System.out.println("white");
    }

    @Override
    public String getName() {
        return "white";
    }
}
