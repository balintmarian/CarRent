package ro.jademy.carRent.car;

import java.util.Objects;

public class Engine implements Comparable<Engine> {
    private int horsePawer;
    private int capacity;

    public int getHorsePawer() {
        return horsePawer;
    }

    public int getCapacity() {
        return capacity;
    }

    public Engine(int horsePawer, int capacity) {
        this.horsePawer=horsePawer;
        this.capacity = capacity;

    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePawer=" + horsePawer +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return horsePawer == engine.horsePawer &&
                capacity == engine.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(horsePawer, capacity);
    }

    @Override
    public int compareTo(Engine o) {
        return 0;
    }
}


