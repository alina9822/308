package Problem3;

public abstract class Component {
    public void add(Component component)
    {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component)
    {
        throw new UnsupportedOperationException();
    }
    public Component getChild(int i)
    {
        throw new UnsupportedOperationException();
    }

    public int getChildSize()
    {
        throw new UnsupportedOperationException();
    }

    public String getName()
    {
        throw new UnsupportedOperationException();
    }

    public String getProject()
    {
        throw new UnsupportedOperationException();
    }

    public String getParent()
    {
        throw new UnsupportedOperationException();
    }

    public String getDescription()
    {
        throw new UnsupportedOperationException();
    }

    public void printHierarchy()
    {
        throw new UnsupportedOperationException();
    }

}
