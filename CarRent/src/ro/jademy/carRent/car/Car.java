package ro.jademy.carRent.car;


import java.math.BigDecimal;
import java.util.GregorianCalendar;

public abstract class Car implements Comparable<Car> {
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
    //private Time startDate;
    //private Time recoveryDate;
    private CarState carState = new CarState();

//    public Car(String startDate,String recoveryDate){
//        this.startDate=startDate;
//        this.recoveryDate=recoveryDate;
//    }

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

//    public Car(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
//               String color, String transmissionType, Integer year, BigDecimal basePrice, String availability,
//               Time startDate, Time recoveryDate) {
//        this.make = make;
//        this.model = model;
//        this.carType = carType;
//        this.engine = engine;
//        this.doorNumber = doorNumber;
//        this.fuelType = fuelType;
//        this.color = color;
//        this.transmissionType = transmissionType;
//        this.year = year;
//        this.basePrice = basePrice;
//        this.availability = availability;
//        this.startDate = startDate;
//        this.recoveryDate = recoveryDate;
//    }

    public CarState getCarState() {
        return carState;
    }

    public void setCarState(CarState carState) {
        this.carState = carState;
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
                getEngine().getHorsePower(), getEngine().getCapacity(), getDoorNumber(), getFuelType(),
                getColor(), getTransmissionType(), getYear(),
                getBasePrice(), getAvailability());
        System.out.println(specifications);
    }

    public void rentCar(GregorianCalendar start, GregorianCalendar end) {

        carState.setRented(true);

        carState.setStartDate(start);

        carState.setFinalDate(end);

    }


    public void returnCar() {

        carState.setRented(false);

        carState.setStartDate(null);

        carState.setFinalDate(null);

    }


    @Override
    public int compareTo(Car o) {
        if (make.compareTo(o.make) != 0) {
            return make.compareTo(o.make);
        }

        if (model.compareTo(o.model) != 0) {
            return model.compareTo(o.model);
        }
        if (carType.compareTo(o.carType) != 0) {
            return carType.compareTo(o.carType);
        }

        if (engine.compareTo(o.engine) != 0) {
            return engine.compareTo(o.engine);
        }

        if (doorNumber.compareTo(o.doorNumber) != 0) {
            return doorNumber.compareTo(o.doorNumber);
        }

        if (fuelType.compareTo(o.fuelType) != 0) {
            return fuelType.compareTo(o.fuelType);
        }

        if (color.compareTo(o.color) != 0) {
            return color.compareTo(o.color);
        }

        if (transmissionType.compareTo(o.transmissionType) != 0) {
            return transmissionType.compareTo(o.transmissionType);
        }

        if (year.compareTo(o.year) != 0) {
            return year.compareTo(o.year);
        }
        if (basePrice.compareTo(o.basePrice) != 0) {
            return basePrice.compareTo(o.basePrice);
        }
        if (availability.compareTo(o.availability) != 0) {
            return availability.compareTo(o.availability);
        }

        return 0;
    }
}
