package ro.jademy.carRent.car;

import java.util.Comparator;

public class YearComparator implements Comparator<Car> {
    public int compare(Car object1,Car object2){
        return object1.getYear().compareTo(object2.getYear());
    }
}
