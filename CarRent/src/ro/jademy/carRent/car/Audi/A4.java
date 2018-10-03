package ro.jademy.carRent.car.Audi;

import ro.jademy.carRent.car.Engine;

import java.math.BigDecimal;

public class A4 extends Audi {
    public A4(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
              String color, String transmissionType, Integer year, BigDecimal basePrice, String availability){
        super("Audi", "A4", carType, engine, doorNumber, fuelType,
                color, transmissionType,year, basePrice,  availability) ;

    }
}
