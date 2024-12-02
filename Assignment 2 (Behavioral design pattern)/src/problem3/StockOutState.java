package problem3;

public class StockOutState implements State{
    private VendingMachineContext context;

    public StockOutState(VendingMachineContext context)
    {
        this.context=context;
    }

    @Override
    public void Print() {
        System.out.println("===You are currently at Stock Out State===");
    }

    @Override
    public void Select() {
        System.out.println("**Not enough stock**");
    }

    @Override
    public boolean AddMoney() {
        return false;
    }

    @Override
    public void Deposit(int amount) {
        System.out.println("**Not enough stock**");
    }

    @Override
    public void Deliver() {
        System.out.println("**Not enough stock**");
    }

    @Override
    public void Cancel() {
        System.out.println("**Not enough stock**");
    }
}
