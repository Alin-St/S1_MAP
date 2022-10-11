package model;

public class Cake extends Entity {
    @Override
    public String toString() {
        return "This is a cake with " + get_weight() + " grams.";
    }
}
