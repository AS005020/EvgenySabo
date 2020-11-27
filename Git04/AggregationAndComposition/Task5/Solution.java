package Git04.AggregationAndComposition.Task5;

public class Solution {
    public static void main(String[] args) {
        TouristPackageArray array = new TouristPackageArray(25);
        array.showArray();
        array.showTouristWithTour(TouristType.getRandomizeType());
        array.showTouristWithTransport(BD.getRandomizeTransport());
        array.showTouristWithMeals(3);
        array.showTouristWithDay(8);
        array.showSortByOptimal(BD.getRandomizeTransport(),2,7);
    }


}
