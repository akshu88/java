package tut53;

public class Main {
    public static void main(String[] args) {
        // Aggregation = Represents a "has-a" reltionship between the objects.
        //               One object contain another object as part of its structure,
        //               but the contained object/s can exist independently.

        Book book1 = new Book("The Deep Work",290);
        Book book2 = new Book("The 5 am club",336);
        Book book3 = new Book("Before the coffee gets cold", 272);

        Book[] books = {book1,book2,book3};

        Library library = new Library("NYC Public Library", 1897, books);

        //System.out.println(book1.displayInfo());
        /* 
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
        */

        library.displayInfo();

    }
}
