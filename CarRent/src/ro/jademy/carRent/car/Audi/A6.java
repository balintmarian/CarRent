package ro.jademy.carRent.car.Audi;

import ro.jademy.carRent.car.Engine;

import java.math.BigDecimal;

public class A6 extends Audi {
    public A6(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
              String color, String transmissionType, Integer year, BigDecimal basePrice, String availability) {
        super("Audi", "A6", carType, engine, doorNumber, fuelType,
                color, transmissionType, year, basePrice, availability);

    }
}
