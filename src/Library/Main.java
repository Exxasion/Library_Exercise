package Library;

public class Main {
    public static void main(String[] args){
        Library library = new Library();

        Book book1 = new Book("Dune", Genre.SCIENCE);
        Book book2 = new Book("1984", Genre.FICTION);
        Magazine mag1 = new Magazine("National Geographic", Genre.NON_FICTION);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(mag1);

        library.borrowByTitle("Dune");

        library.borrowByTitle("Dune");

        book1.returnItem();

        library.borrowByTitle("Dune");
        /*
        library.borrowByTitle("Fake Book");

        library.borrowByTitle("National Geographic");

        library.printSummary();

         */
        Catalog<Book> bookCatalog = new Catalog<>();
        bookCatalog.addItem(book1);
        bookCatalog.addItem(book2);

        System.out.println("Science books:");
        for (Book b : bookCatalog.findByGenre(Genre.SCIENCE)) {
            System.out.println(" - " + b.getTitle());
        }
    }
}
