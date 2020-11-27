package Git04.AggregationAndComposition.Task3;

import java.util.Arrays;

public class State {
    String state;
    Oblast[] oblasts;

    public State(String state, Oblast ... oblasts) {
        this.state = state;
        this.oblasts = oblasts;
    }




    @Override
    public String toString() {
        return "State{" +
                "state='" + state + '\'' +
                ", oblasts=" + Arrays.toString(oblasts) +
                '}';
    }
}
