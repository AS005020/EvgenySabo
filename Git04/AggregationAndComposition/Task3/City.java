package Git04.AggregationAndComposition.Task3;

public class City {
    String city;

    public City(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "\n\t\t\tCity{" +
                "city='" + city + '\'' +
                '}';
    }
}
