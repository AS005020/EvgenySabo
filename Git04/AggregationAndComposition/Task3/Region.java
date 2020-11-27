package Git04.AggregationAndComposition.Task3;

import java.util.Arrays;

public class Region {
    String region;
    City[] cites;

    public Region(String region, City ... cites) {
        this.region = region;
        this.cites = cites;
    }

    @Override
    public String toString() {
        return "\n\t\tRegion{" +
                "region='" + region + '\'' +
                ", cites=" + Arrays.toString(cites) +
                '}';
    }
}
