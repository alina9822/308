package problem1;

public class Director {
    private Builder builder;
    private String ram1="not added";
    private String ram2="not added";
    private String card1="not added";
    private String card2="not added";

    public Director(Builder builder)
    {
        this.builder=builder;
    }

    public PC getPC()
    {
        return this.builder.getPC();
    }

    public void addRam1(String ram1)
    {
        this.builder.addRam1(ram1);
    }

    public void addRam2(String ram2)
    {
        this.builder.addRam2(ram2);
    }

    public void addGraphicsCard1(String card1)
    {
        this.builder.addGraphicsCard1(card1);
    }
    public void addGraphicsCard2(String card2)
    {
        this.builder.addGraphicsCard2(card2);
    }

    public void buildPC()
    {
        this.builder.addName();
        this.builder.addProcessor();
        this.builder.addCooler();
        this.builder.addHardDisc();
        this.builder.addDVDdrive();
//        this.builder.addRam1(ram1);
//        this.builder.addRam2(ram2);
//        this.builder.addGraphicsCard1(card1);
//        this.builder.addGraphicsCard2(card2);
    }

}
