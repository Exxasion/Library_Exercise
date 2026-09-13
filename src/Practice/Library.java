package Practice;

import java.util.ArrayList;

public class Library {

    // Attributes -------------------------------------------------------------------------------------------------
    private ArrayList<LibraryItem> items = new ArrayList<>();

    // Methods -------------------------------------------------------------------------------------------------

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void borrowByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                if (item.isAvailable()) {
                    item.borrow();
                } else {
                    System.out.println(title + " is currently unavailable.");
                }
                return;
            }
        }
        System.out.println("No item found with title: " + title);
    }

    public void printSummary() {
        int availableCount = 0;
        int borrowedCount = 0;

        for (LibraryItem item : items) {
            if (item.isAvailable()) {
                availableCount++;
            } else {
                borrowedCount++;
            }
        }

        System.out.println("--- Library Summary ---");
        System.out.println("Available: " + availableCount);
        System.out.println("Borrowed: " + borrowedCount);
    }
}