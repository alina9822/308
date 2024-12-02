package problem3;

public interface State {
    public void Print();
    public void Select();
    public boolean AddMoney();
    public void Deposit(int amount);
    public void Deliver();
    public void Cancel();

}
