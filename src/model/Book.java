package model;

public class Book extends Entity {
    @Override
    public String toString() {
        return "This is a book with " + get_weight() + " grams.";
    }
}
