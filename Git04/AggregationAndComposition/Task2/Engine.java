package Git04.AggregationAndComposition.Task2;

public class Engine {
    double durability;
    double fuelСonsumptionPerMeter;
    public Engine() {
        durability = 1000;
        fuelСonsumptionPerMeter = 10.0 / (100.0 * 1000);
    }

    public Engine(double durability) {
        this.durability = durability;
    }
}
