package Git04.SimpleObjects.Task9;

public class BookArray {
    Book[] books;
    int size;

    public BookArray(int n) {
        size = n;
        books=new Book[n];
        for (int i = 0; i < n ; i++) {
           books[i]= new Book(("Книга"+(i+1)),BD.authorsGenerate(),BD.puplishingHouseGenerate(),(int)(Math.random()*30 + 1990),(int)(Math.random()*300 + 100),(int)(Math.random()*100 + 10),Cover.getRandom());
        }
    }
    public void show(){
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        System.out.println();
    }

    public void showBooksAuthor(String author){
        System.out.println("Книги автора " + author);
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[i].authors.length; j++) {
                if(books[i].authors[j].equals(author)){
                    System.out.println(books[i]);
                    break;
                }
            }
        }
        System.out.println();
    }
    public void showBooksPublishingHouse(String publishingHouse){
        System.out.println("Книги издательства " + publishingHouse);
        for (int i = 0; i < books.length; i++) {
            if(books[i].publishingHouse.equals(publishingHouse))
                System.out.println(books[i]);
        }
        System.out.println();
    }

    public void showPublishingAfter(int year){
        System.out.println("Книги выпущенные после " + year);
        for (int i = 0; i < books.length; i++) {
            if(books[i].publishingYear >= year)
                System.out.println(books[i]);
        }
    }

}
