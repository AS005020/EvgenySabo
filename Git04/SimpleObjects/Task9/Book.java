package Git04.SimpleObjects.Task9;

import java.util.Arrays;

/*
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 */
public class Book {
    static int id;
    String nameBook;
    String[] authors;
    String publishingHouse;
    int publishingYear;
    int pageCount;
    int price;
    Cover type;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Book.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Cover getType() {
        return type;
    }

    public void setType(Cover type) {
        this.type = type;
    }


    public Book(String nameBook,String[] authors, String publishingHouse, int publishingYear, int pageCount, int price, Cover type) {
        this.nameBook = nameBook;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.pageCount = pageCount;
        this.price = price;
        this.type = type;

    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", pageCount=" + pageCount +
                ", price=" + price +
                ", type=" + type +
                '}';
    }

    public boolean isContainAuthor(String author){
        for (int i = 0; i < authors.length; i++) {
            if(author.equals(authors[i]))
                return true;
        }
        return false;
    }
}
