package Library;

public class Magazine extends LibraryItem {

    //Methods ----------------------------------------------------------------------------------------------------------
    Magazine(String title, Genre genre) {
        super(title, genre);
    }


    @Override
    public void borrow() {

    }

    @Override
    public void returnItem() {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    String getItemType() {
        return "Magazine";
    }
}
