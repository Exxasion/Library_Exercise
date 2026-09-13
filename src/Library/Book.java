package Library;

import java.time.LocalDate;

public class Book extends LibraryItem {
    //Attributes -------------------------------------------------------------------------------------------------------
    private LocalDate dueDate;

    //Methods ----------------------------------------------------------------------------------------------------------
    Book(String title, Genre genre) {
        super(title, genre);
    }

    @Override
    public void borrow() {
        if (isAvailable()) {
            available = false;
            dueDate = LocalDate.now().plusWeeks(2);
            System.out.println(title + " borrowed. Due: " + dueDate);
        }

    }

    @Override
    public void returnItem() {

    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    String getItemType() {
        return "Book";
    }

}
