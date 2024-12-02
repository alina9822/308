package problem2;

public class Red implements Color{

    public String getName()
    {
        return "red";
    }

    @Override
    public void Print() {
        System.out.println("red");
    }
}
