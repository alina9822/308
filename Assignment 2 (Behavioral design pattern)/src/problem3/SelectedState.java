package problem3;

public class SelectedState implements State{
    private VendingMachineContext context;

    public SelectedState(VendingMachineContext context)
    {
        this.context=context;
    }

    @Override
    public void Print() {
        System.out.println("===You are currently at Selected State===");
    }

    @Override
    public void Select() {
        System.out.println("**You've already selected**");
    }

    @Override
    public boolean AddMoney() {
        return true;
    }

    @Override
    public void Deposit(int amount) {
        System.out.println("**"+amount+" taka deposited**");
        State state;
        if(amount>10) {
            context.ChangeState(new MoreMoneyState(context,amount));
        }
        else if(amount==10)
        {
            context.ChangeState(new ExactMoneyState(context,amount));
        }
        else {
            context.ChangeState(new LessMoneyState(context,amount));
        }

    }

    @Override
    public void Deliver() {
        System.out.println("**Deposit money first**");
    }

    @Override
    public void Cancel() {
        System.out.println("**Selection cancelled**");
        context.ChangeState(new InStockState(context));
    }
}
