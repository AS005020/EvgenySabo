package Git04.AggregationAndComposition.Task2;

/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.
 */
public class Solution {


    public static void main(String[] args) {
        Car car = new Car("Рено");
        car.toDrive(1000);

        car.refuel(60);
        car.changeWheel(new Wheel(600));
        car.showBrand();
    }
}
