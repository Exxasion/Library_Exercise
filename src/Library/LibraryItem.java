package Library;

public abstract class LibraryItem implements Borrowable {

    //Attributes -------------------------------------------------------------------------------------------------------
    protected String title;
    protected Genre genre;
    protected boolean available = true;

    //Methods ----------------------------------------------------------------------------------------------------------

    LibraryItem(String title, Genre genre) {
        this.title = title;
        this.genre = genre;
    }

    abstract String getItemType();

    public void printInfo(){
        System.out.println("Title: " + this.title);
        System.out.println("Genre: " + this.genre);
        System.out.println("Type: " + getItemType());
    }

    @Override
    public void borrow() {

    }

    @Override
    public void returnItem() {

    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    //Getter Setter ----------------------------------------------------------------------------------------------------
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

}
