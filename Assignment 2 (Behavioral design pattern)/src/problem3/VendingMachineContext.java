package problem3;
import java.util.Random;

public class VendingMachineContext {

    private State currentState;
    private int  stock;
    //int amount;

   /* private InStockState inStock;
    private StockOutState stockOut;
    private SelectedState selected;
    private ExactMoneyState exactMoney;
    private MoreMoneyState moreMoney;
    private LessMoneyState lessMoney;*/

    public VendingMachineContext()
    {
        this.currentState=new InStockState(this);

        Random rand = new Random();
        stock = rand.nextInt(5);
        stock += 1;

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void Print()
    {
        System.out.println("Available Stock :"+stock);
        currentState.Print();
    }

    public void ChangeState(State st)
    {
        currentState=st;
    }

    public void Select() {
        currentState.Select();
    }

    public boolean AddMoney()
    {
        return currentState.AddMoney();
    }
    public void Deposit(int amount) {
        currentState.Deposit(amount);
    }

    public void Deliver() {
        currentState.Deliver();
    }

    public void Cancel() {
        currentState.Cancel();
    }


}
