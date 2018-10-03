package ro.jademy.carRent.car;


import java.math.BigDecimal;

public abstract class Car {
    private String make;
    private String model;
    private String carType;
    Engine engine;
    private Integer doorNumber;
    private String fuelType;
    private String color;
    private String transmissionType;
    private BigDecimal basePrice;
    private Integer year;
    private String availability;


    public Car(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
               String color, String transmissionType, Integer year, BigDecimal basePrice, String availability) {
        this.make = make;
        this.model = model;
        this.carType = carType;
        this.engine = engine;
        this.doorNumber = doorNumber;
        this.fuelType = fuelType;
        this.color = color;
        this.transmissionType = transmissionType;
        this.year = year;
        this.basePrice = basePrice;
        this.availability = availability;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getCarType() {
        return carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public Integer getDoorNumber() {
        return doorNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getColor() {
        return color;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public String getAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", carType='" + carType + '\'' +
                ", engine=" + engine +
                ", doorNumber=" + doorNumber +
                ", fuelType='" + fuelType + '\'' +
                ", color='" + color + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                ", year=" + year +
                ", basePrice=" + basePrice +
                ", availability='" + availability + '\'' +
                '}';
    }

    public void show() {
    }

    public void showCarSpecifications() {
        String specifications = String.format("|| %-10s || %-10s || %-10s || %-12s || %-12s || %-5s || %-10s || %-15s " +
                        "|| %-15s || %-10s || %-10s || %-10s ||", getMake(), getModel(), getCarType(),
                getEngine().getHorsePawer(), getEngine().getCapacity(), getDoorNumber(), getFuelType(),
                getColor(), getTransmissionType(), getYear(),
                getBasePrice(), getAvailability());
        System.out.println(specifications);
    }
}
