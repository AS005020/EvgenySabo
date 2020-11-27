package Git04.SimpleObjects.Task8;
/*
8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

 */
public class Solution {


    public static void main(String[] args) {
        BaseCustomers customers = new BaseCustomers();
        customers.show();
        customers.sortByFIO();
        customers.show();
        customers.showWithAccountNumberBetween(1000000, 5000000);
    }
}
