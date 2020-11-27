package Git04.SimpleObjects.Task10;


import java.util.Date;

/*
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 */
public class Airline {
    String pointTo;
    String flightNumber;
    String plainType;
    Time departureTime;
    DayWeek dayWeek;

    public Airline(String pointTo, String flightNumber, String plainType, Time departureTime, DayWeek dayWeek) {
        this.pointTo = pointTo;
        this.flightNumber = flightNumber;
        this.plainType = plainType;
        this.departureTime = departureTime;
        this.dayWeek = dayWeek;
    }

    public String getPointTo() {
        return pointTo;
    }

    public void setPointTo(String pointTo) {
        this.pointTo = pointTo;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlainType() {
        return plainType;
    }

    public void setPlainType(String plainType) {
        this.plainType = plainType;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public DayWeek getDayWeek() {
        return dayWeek;
    }

    public void setDayWeek(DayWeek dayWeek) {
        this.dayWeek = dayWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "pointTo='" + pointTo + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", plainType='" + plainType + '\'' +
                ", departureTime=" + departureTime +
                ", dayWeek=" + dayWeek +
                '}';
    }
}
