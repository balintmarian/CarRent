package ro.jademy.carRent.car.Dacia;


import ro.jademy.carRent.car.Engine;

import java.math.BigDecimal;

public class Sandero extends Dacia {
    public Sandero(String make, String model, String carType, Engine engine, Integer doorNumber, String fuelType,
                   String color, String transmissionType, Integer year, BigDecimal basePrice, String availability){

        super("Dacia", "Sandero", carType, engine, doorNumber, fuelType,
                color, transmissionType, year,basePrice, availability );
    }

}
