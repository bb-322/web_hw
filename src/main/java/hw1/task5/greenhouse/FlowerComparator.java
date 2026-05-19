package hw1.task5.greenhouse;

import java.util.Comparator;

public class FlowerComparator {

    public static Comparator<Flower> byName() {
        return Comparator.comparing(Flower::getName);
    }

    public static Comparator<Flower> byId() {
        return Comparator.comparingInt(Flower::getId);
    }
}