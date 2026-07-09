class Book{
    String title ;
    double price ;

     Book(String title , double price){
        this.title = title;
        this.price = price;
    }
}
public class BookStore {
    public static void main(String[] args){
    Book[] books = new Book[2];
    books[0] = new Book("Java Basics" , 29.99);
    books[1] = new Book("Advanced Java" , 49.99);
    for (Book name : books){
        System.out.println("Book : " + name.title);
    }

    }
}
