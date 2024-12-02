package problem2;
import java.util.*;

import java.util.Vector;

public class Teacher {
    //has the mediator interface
    private Mediator mediator;
    Vector<Integer> stMarks;

    public Teacher(Mediator mediator)
    {
        this.mediator=mediator;
    }

    public void check(int n)
    {
        boolean flag=true;
        stMarks= new Vector<>(n);
        while (n>0)
        {
            Random rand = new Random();
            int random_integer = rand.nextInt(100-50) + 50;
            if(random_integer%2==0)
            {
                flag=false;
            }
            n--;
            stMarks.add(random_integer);
            //System.out.println(random_integer);
        }
        if(flag)
        {
            Random rand = new Random();
            int random_integer = rand.nextInt(5) + 1;
            stMarks.set(random_integer,stMarks.get(random_integer)+1);//must case
        }
        mediator.notify(this,"marks checked");
    }

    public int reCheck()
    {
        Random rand = new Random();
        int random_integer = rand.nextInt(100-50) + 50;

        return random_integer;
    }

    public Vector<Integer> getStMarks()
    {
        return stMarks;
    }


    //business logic
}
