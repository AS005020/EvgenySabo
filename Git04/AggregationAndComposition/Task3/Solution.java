package Git04.AggregationAndComposition.Task3;
/*
3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры.
 */
public class Solution {
    public static void main(String[] args) {

        State state1 = new State("Беларусь",
                            new Oblast("Брестскся область",
                                    new Region("Берёзовский район",
                                            new City("Береза"),
                                            new City("Белоозёрск")),
                                    new Region("Дрогичинский район",
                                            new City("Дрогичин"))),
                            new Oblast("Витебская область",
                                    new Region("Верхнедвинский район",
                                            new City("Верхнедвинск"))));
        System.out.println(state1);
    }

}
