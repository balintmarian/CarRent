package ro.jademy.carRent.car;

import java.util.Objects;

public class Engine implements Comparable<Engine> {
    private Integer horsePower;
    private Integer capacity;

    public int getHorsePower() {
        return horsePower;
    }

    public int getCapacity() {
        return capacity;
    }

    public Engine(int horsePawer, int capacity) {
        this.horsePower =horsePawer;
        this.capacity = capacity;

    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return horsePower == engine.horsePower &&
                capacity == engine.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(horsePower, capacity);
    }

    @Override
    public int compareTo(Engine o) {
        if (horsePower.compareTo(o.horsePower) != 0) {
            return horsePower.compareTo(o.horsePower);
        }
        if (capacity.compareTo(o.capacity) != 0) {
            return capacity.compareTo(o.capacity);
        }
        return 0;
    }
}


