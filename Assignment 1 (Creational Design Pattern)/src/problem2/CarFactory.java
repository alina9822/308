package problem2;

public class CarFactory {

    public Car getCar(String location)
    {
        if(location.equalsIgnoreCase("ASIA"))
            return new Toyota();
        if(location.equalsIgnoreCase("EUROPE"))
            return new BMW();
        if(location.equalsIgnoreCase("US"))
            return new Tesla();
        else
            return null;
    }
}
