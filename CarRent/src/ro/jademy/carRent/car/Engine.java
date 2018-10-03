package ro.jademy.carRent.car;

public class Engine {
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
}


