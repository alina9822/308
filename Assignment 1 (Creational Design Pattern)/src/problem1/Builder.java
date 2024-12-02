package problem1;

public interface Builder {
    public void addName();
    public void addProcessor ();
    public void addHardDisc ();
    public void addCooler ();
    //extra
    public void addRam1 (String ram1);
    public void addRam2 (String ram2);

    public void addDVDdrive ();
    //graphics
    public void addGraphicsCard1 (String card1);
    public void addGraphicsCard2 (String card2);

    public PC getPC();
}
