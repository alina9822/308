package problem3;

public class InStockState implements State{
    private VendingMachineContext context;

    public InStockState(VendingMachineContext context)
    {
        this.context=context;
    }

    @Override
    public void Print() {
        System.out.println("===You are currently at In Stock State===");
    }

    @Override
    public void Select() {
        System.out.println("**One item has been selected**");
        context.ChangeState(new SelectedState(context));
    }

    @Override
    public boolean AddMoney() {
        System.out.println("**You haven't selected anything**");
        return false;
    }

    @Override
    public void Deposit(int amount) {

    }

    @Override
    public void Deliver() {
        System.out.println("**You haven't selected anything**");
    }

    @Override
    public void Cancel() {
        System.out.println("**You haven't selected anything**");
    }

}
