package problem1;

public interface Subject {

    public void NotifyAllUsers();
    public void AddObserver(Observer observer);
    public void RemoveObserver(Observer observer);
    public void ChangeState(String str);
}
