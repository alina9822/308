package problem3;

public class MoreMoneyState implements State{
    private VendingMachineContext context;
    private int amount=0;
    private int change;

    public MoreMoneyState(VendingMachineContext context,int amount)
    {
        this.context=context;
        this.amount=amount;
        change=amount-10;
    }

    @Override
    public void Print() {
        System.out.println("===You are currently at More Money State===");
    }

    @Override
    public void Select() {
        System.out.println("**You've already selected**");
    }

    @Override
    public boolean AddMoney() {
        System.out.println("**Enough money deposited**");

        return false;
    }

    @Override
    public void Deposit(int amount) {

    }

    @Override
    public void Deliver() {
        System.out.println("**Product delivered**");
        System.out.println("**Change= "+change+" taka");
        context.setStock(context.getStock()-1);
        if (context.getStock()>0)
            context.ChangeState(new InStockState(context));
        else
            context.ChangeState(new StockOutState(context));
    }

    @Override
    public void Cancel() {
        System.out.println("**Selection cancelled**");
        System.out.println("**Change= "+amount+" taka");
        context.ChangeState(new InStockState(context));
    }
}
