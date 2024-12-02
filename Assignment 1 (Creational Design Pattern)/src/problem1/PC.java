package problem1;

public class PC implements Features{

    private String name;
    private String processor;
    private long pro_price=0;
    private String hardDisc;
    private long HD_price=0;
    private String cooler;
    private long cooler_price=0;
    private String ram1;
    private long ram1_price=0;
    private String ram2;
    private long ram2_price=0;
    private String drive;
    private long drive_price=0;
    private String card1;
    private long card1_price=0;
    private String card2;
    private long card2_price=0;

    private long total_price=70000;
    private int ram1_num=0,ram2_num=0;
    private int card1_num=0,card2_num=0;

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setProcessor(String processor) {
        this.processor=processor;

        if(processor=="AMD Ryzen 7 5700X") {
            pro_price = 28000;
            total_price+=pro_price;
        }
        else if(processor=="Core i5") {
            pro_price = 20000;
            total_price+=pro_price;
        }
        else if (processor=="Core i7") {
            pro_price = 37000;
            total_price+=pro_price;
        }
        else if(processor=="Core i9") {
            pro_price = 65000;
            total_price+=pro_price;
        }
    }

    @Override
    public void setHardDisc(String hardDisc) {
        this.hardDisc=hardDisc;
    }

    @Override
    public void setCooler(String cooler) {
        this.cooler=cooler;
        if (cooler=="CPU cooler") {
            cooler_price = 36000;
            total_price+=cooler_price;
        }    }

    @Override
    public void setRam1(String ram1) {
        this.ram1=ram1;
        if(ram1!= "not added") {
            ram1_num++;
            ram1_price += 2620;
            total_price+=2620;
        }
    }

    @Override
    public void setRam2(String ram2) {
        this.ram2=ram2;
        if(ram2!="not added") {
            ram2_num++;
            ram2_price += 2950;
            total_price+=2950;
        }
    }

    @Override
    public void setDVDdrive(String drive) {
        this.drive=drive;
    }

    @Override
    public void setGraphicsCard1(String card1) {
        this.card1=card1;
        if(card1!="not added") {
            card1_num++;
            card1_price += 6500;
            total_price+=6500;
        }
    }

    @Override
    public void setGraphicsCard2(String card2) {
        this.card2=card2;
        if(card2!="not added") {
            card2_num++;
            card2_price += 7600;
            total_price+=7600;
        }
    }

    public long getTotal_price()
    {
        return total_price;
    }

    @Override
    public String toString() {
        return "PC{" +
                "name='" + name + '\'' +
                ", processor='" + processor + '\'' +
                ", pro_price=" + pro_price +
                ", hardDisc='" + hardDisc + '\'' +
                ", HD_price=" + HD_price +
                ", cooler='" + cooler + '\'' +
                ", cooler_price=" + cooler_price +
                ", ram1='" + ram1 + '\'' +
                ", ram1_price=" + ram1_price +
                ", ram2='" + ram2 + '\'' +
                ", ram2_price=" + ram2_price +
                ", drive='" + drive + '\'' +
                ", drive_price=" + drive_price +
                ", card1='" + card1 + '\'' +
                ", card1_price=" + card1_price +
                ", card2='" + card2 + '\'' +
                ", card2_price=" + card2_price +
                ", total_price=" + total_price +
                ", ram1_num=" + ram1_num +
                ", ram2_num=" + ram2_num +
                ", card1_num=" + card1_num +
                ", card_num2=" + card2_num +
                '}';
    }

    @Override
    public void Print() {
        System.out.println("Name of the PC : "+name);
        System.out.println("Base price includes Motherboard and 1 TB HDD = 70000 BDT");
        System.out.println("Type of the processor : "+processor);
        System.out.println("Processor price = "+pro_price+" BDT");
        System.out.println("Cooler : "+cooler);
        System.out.println("Cooler price = "+cooler_price+" BDT");
        System.out.println("DVD drive : "+drive);
        System.out.println("Drive price = "+drive_price+" BDT");
        System.out.println("8 GB DDR4 RAM(2666MHz) : "+ram1_num);
        System.out.println("8 GB DDR4 RAM(3200MHz) : "+ram2_num);
        System.out.println("Ram price = ("+ram1_num+"*2620)+("+ram2_num+"*2950)="+(ram1_price+ram2_price)+" BDT");
        System.out.println("2 GB graphics card : "+card1_num);
        System.out.println("4 GB graphics card : "+card2_num);
        System.out.println("Graphics card price = ("+card1_num+"*6500)+("+card2_num+"*7600)="+(card1_price+card2_price)+" BDT");
        //total_price=70000+pro_price+cooler_price+drive_price+ram1_price+ram2_price+card1_price+card2_price;
        System.out.println("Total price of the pc = "+total_price+" BDT");
    }


}
