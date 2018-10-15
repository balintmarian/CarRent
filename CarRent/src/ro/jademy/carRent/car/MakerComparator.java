package ro.jademy.carRent.car;

import java.util.Comparator;

public class MakerComparator implements Comparator<Car> {
    public int compare(Car object1, Car object2){
        return object1.getMake().compareTo(object2.getMake());
    }
}
