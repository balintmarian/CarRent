package ro.jademy.carRent.car;

import java.util.Comparator;

public class ModelComparator implements Comparator<Car> {
    public int compare(Car object1,Car object2){
        return object1.getModel().compareTo(object2.getModel());
    }
}
