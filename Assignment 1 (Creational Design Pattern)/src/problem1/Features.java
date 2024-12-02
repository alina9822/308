package problem1;

public interface Features {
    public void setName (String name);
    public void setProcessor (String processor);
    public void setHardDisc (String hardDisc);
    public void setCooler (String cooler);
    //extra
    public void setRam1 (String ram1);
    public void setRam2 (String ram2);
    public void setDVDdrive (String drive);
    //graphics
    public void setGraphicsCard1 (String card1);
    public void setGraphicsCard2 (String card2);

    public void Print();
}
