package Git04.SimpleObjects.Task9;
/*
9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */

public class Solution {

    public static void main(String[] args) {
        BookArray bookArray = new BookArray(6);
        bookArray.show();
        bookArray.showBooksAuthor("Чайка");
        bookArray.showBooksPublishingHouse("МИНТ");
        bookArray.showPublishingAfter(2000);
    }


}
