package Git04.SimpleObjects.Task10;
import java.util.Date;
/*
10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного
 */
public class Solution {
    public static void main(String[] args) {
        AirlineArray array = new AirlineArray(5);
        array.showAirlines();
        array.showByPoint("Брест");
        array.showByDayWeek(DayWeek.MON);
        array.showByDayWeekAndAfterTime(DayWeek.SUN, new Time(9,0,0));
    }
}
