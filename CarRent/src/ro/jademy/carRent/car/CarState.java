package ro.jademy.carRent.car;

import java.text.SimpleDateFormat;



import java.util.GregorianCalendar;


public class CarState {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat();
    private boolean isRented = false;
    private GregorianCalendar startDate;
    private GregorianCalendar finalDate;


    public boolean isRented() {

        return isRented;

    }


    public void setRented(boolean rented) {

        isRented = rented;

    }


    public GregorianCalendar getStartDate() {

        return startDate;

    }


    public void setStartDate(GregorianCalendar startDate) {

        this.startDate = startDate;

    }


    public GregorianCalendar getFinalDate() {

        return finalDate;

    }


    public void setFinalDate(GregorianCalendar finalDate) {

        this.finalDate = finalDate;

    }


    @Override

    public String toString() {

        return "CarState{" +

                "isRented=" + isRented +

                ", startDate=" + startDate +

                ", finalDate=" + finalDate +

                '}';

    }
}
