package problem1;

import java.util.*;

public class ABCserver implements Subject{

    private List<Observer> users;
    private String prevState;
    private String currState;
    private int nextId=1;

    public ABCserver(){
        users=new ArrayList<>();
        currState="Operational";
    }

    public List<Observer> getUsers() {
        return users;
    }

    public void setUsers(List<Observer> users) {
        this.users = users;
    }

    public String getPrevState() {
        return prevState;
    }

    public void setPrevState(String prevState) {
        this.prevState = prevState;
    }

    public String getCurrState() {
        return currState;
    }

    public void setCurrState(String currState) {
        this.currState = currState;
    }

    public void ChangeState(String str)
    {
        if(str.equalsIgnoreCase(currState))
        {
            System.out.println("Already in the state");
            return;
        }


        setPrevState(getCurrState());
        setCurrState(str);

        NotifyAllUsers();
    }

    @Override
    public void NotifyAllUsers() {
        for(Observer o: users)
        {
            o.Notify();
        }
    }

    @Override
    public void AddObserver(Observer observer) {
        users.add(observer);
        users.get(nextId-1).setObserverId(String.valueOf(nextId));
        nextId++;
    }

    @Override
    public void RemoveObserver(Observer observer) {
        for(Observer o: users)
        {
            if(o==observer)
                users.remove(o);
        }
    }
}
