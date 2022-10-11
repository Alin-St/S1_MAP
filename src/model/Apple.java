package model;

public class Apple extends Entity {
    @Override
    public String toString() {
        return "This is an apple with " + get_weight() + " grams.";
    }
}
