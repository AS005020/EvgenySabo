package Git04.AggregationAndComposition.Task3;

import java.util.Arrays;

public class Oblast {
    String oblast;
    Region[] regions;

    public Oblast(String oblast, Region ... regions) {
        this.oblast = oblast;
        this.regions = regions;

    }

    @Override
    public String toString() {
        return "\n\tOblast{" +
                "oblast='" + oblast + '\'' +
                ", regions=" + Arrays.toString(regions) +
                '}';
    }
}
