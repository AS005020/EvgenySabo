package Git04.AggregationAndComposition.Task5;

import static java.lang.Math.*;

public class BD {
    static  String[] transport = {"Самолёт","Автобус","Маршрутка", "Корабль"};

    static String getRandomizeTransport(){
        return transport[(int)(Math.random()*transport.length)];
    }


}
