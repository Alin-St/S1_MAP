package model;

public abstract class Entity {
    int _weight;

    public int get_weight() { return _weight; }
    public void set_weight(int value) { _weight = value; }

    public abstract String toString();
}
