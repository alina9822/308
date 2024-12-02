package problem1;

public interface Observer {
    public void Notify();
    public String getObserverId();
    public void setObserverId(String observerId);
    public String getType();
}
