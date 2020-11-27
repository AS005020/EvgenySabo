package Git04.AggregationAndComposition.Task5;

public class TouristPackage {
    TouristType type;
    String transport;
    int mealsCount;
    int dayCount;
    private int transportPriority = 40;
    private int mealPriority = 30;
    private int dayPriority = 10;


    public TouristPackage(TouristType type, String transport, int mealsCount, int dayCount) {
        this.type = type;
        this.transport = transport;
        this.mealsCount = mealsCount;
        this.dayCount = dayCount;
    }
    int getPriority(String transport, int mealsCount, int dayCount){
        int priory = 0;
        if(this.transport.equals(transport)) {
            priory += transportPriority;
        }
        priory+=mealPriority;
        priory-=Math.abs(this.mealsCount-mealsCount)*10;

        priory-=Math.abs(this.dayCount - dayCount)*2;
        priory+=dayPriority;
        return priory;
    }
    @Override
    public String toString() {
        return "TouristPackage{" +
                "type=" + type +
                ", transport='" + transport + '\'' +
                ", mealsCount=" + mealsCount +
                ", dayCount=" + dayCount +
                '}';
    }
}
