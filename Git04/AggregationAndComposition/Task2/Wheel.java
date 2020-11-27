package Git04.AggregationAndComposition.Task2;

public class Wheel {
    private double durability;
    public final double maxWear;
    boolean isAlive = true;

    public Wheel() {
        durability = 400;
        maxWear = durability;
    }

    public Wheel(double durability) {
        setDurability(durability);
        maxWear = durability;
    }

    public double getDurability() {
        return durability;
    }

   private void setDurability(double durability) {
        if(durability <= 0){
            System.out.println("У вас лопнула шина");
            durability = 0;
            isAlive = false;
        }
        this.durability = durability;
    }
    public void wearOnMeter(double meter){
        this.setDurability(getDurability() - (1.0/1000)*meter);
    }
}
