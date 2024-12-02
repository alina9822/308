package problem3;

public class LessMoneyState implements State{

    private VendingMachineContext context;
    private int amount=0;

    public LessMoneyState(VendingMachineContext context,int amount)
    {
        this.context=context;
        this.amount=amount;
    }

    @Override
    public void Print() {
        System.out.println("===You are currently at Less Money State===");
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
        this.amount+=amount;
        System.out.println("**"+this.amount+" taka deposited**");
        if(this.amount>10) {
            context.ChangeState(new MoreMoneyState(context,this.amount));
        }
        else if(this.amount==10)
        {
            context.ChangeState(new ExactMoneyState(context,this.amount));
        }
    }

    @Override
    public void Deliver() {
        System.out.println("**Not enough money deposited**");
    }

    @Override
    public void Cancel() {
        System.out.println("**Selection cancelled**");
        System.out.println("**Change= "+amount+" taka");
        context.ChangeState(new InStockState(context));
    }
}
