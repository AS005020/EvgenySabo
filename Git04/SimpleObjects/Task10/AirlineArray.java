package Git04.SimpleObjects.Task10;

import static java.lang.Math.*;

public class AirlineArray {
    Airline[] airlines;
    static String[] cites = {"Брест", "Минск", "Гродно", "Гомель","Витебск"};
    public AirlineArray(int size) {
        this.airlines = new Airline[size];
        for (int i = 0; i < size; i++) {
            this.airlines[i] = new Airline(cites[(int)(random()*cites.length)], "A" +(random() * 10000 + 10000),"Тип" + i,Time.getRandomize(), DayWeek.getRandomize());
        }
    }
    public void showAirlines(){
        for (int i = 0; i <airlines.length ; i++) {
            System.out.println(airlines[i]);
        }
        System.out.println();
    }

    public void showByPoint(String pointTo){
        System.out.println("Cписок рейсов в " + pointTo);
        for (int i = 0; i < airlines.length; i++) {
            if(airlines[i].pointTo.equals(pointTo))
                System.out.println(airlines[i]);
        }
        System.out.println();
    }

    public void showByDayWeek(DayWeek dayWeek){
        System.out.println("Cписок рейсов в " + dayWeek);
        for (int i = 0; i < airlines.length; i++) {
            if(airlines[i].dayWeek.equals(dayWeek))
                System.out.println(airlines[i]);
        }
        System.out.println();
    }
    public void showByDayWeekAndAfterTime(DayWeek dayWeek, Time time){
        System.out.println("Cписок рейсов в " + dayWeek + " после "+ time);
        for (int i = 0; i < airlines.length; i++) {
            if(airlines[i].dayWeek.equals(dayWeek) && airlines[i].departureTime.compareTo(time) != -1)
                System.out.println(airlines[i]);
        }
        System.out.println();
    }
}
