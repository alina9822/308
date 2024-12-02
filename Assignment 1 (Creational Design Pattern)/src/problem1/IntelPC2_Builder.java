package problem1;

public class IntelPC2_Builder implements Builder{
    private PC pc;

    public IntelPC2_Builder()
    {
        this.pc = new PC();
    }

    @Override
    public void addName() {
        pc.setName("Intel type 2");
    }

    @Override
    public void addProcessor() {
        pc.setProcessor("Core i7");
    }

    @Override
    public void addHardDisc() {
        pc.setHardDisc("1 TB HDD");
    }

    @Override
    public void addCooler() {
        pc.setCooler("liquid cooler");
    }

    @Override
    public void addRam1(String ram1) {
        pc.setRam1(ram1);
    }

    @Override
    public void addRam2(String ram2) {
        pc.setRam2(ram2);
    }

    @Override
    public void addDVDdrive() {
        pc.setDVDdrive("not added");
    }

    @Override
    public void addGraphicsCard1(String card1) {
        pc.setGraphicsCard1(card1);
    }

    @Override
    public void addGraphicsCard2(String card2) {
        pc.setGraphicsCard2(card2);
    }

    @Override
    public PC getPC() {
        return this.pc;
    }
}
