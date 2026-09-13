package Library;

import java.util.List;
import java.util.ArrayList;

public class Catalog<T extends LibraryItem> {
    //Attributes -------------------------------------------------------------------------------------------------------
    private ArrayList<T> items = new ArrayList<>();
    //Methods ----------------------------------------------------------------------------------------------------------
    public List<T> findByGenre(Genre g) {
        List<T> results = new ArrayList<>();
        for (T item : items) {
            if (item.getGenre() == g) {
                results.add(item);
            }
        }
        return results;
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

}
