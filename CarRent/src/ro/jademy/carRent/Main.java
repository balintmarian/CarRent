package ro.jademy.carRent;

import ro.jademy.carRent.car.Time;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("hue");
        Shop shop=new Shop();
       // shop.showMenu();
        Date d1=new Date(2018,8,12,14,20,15 );
        Date d2=new Date(2018,8,16,16,25,15);
        Time t1=new Time(d1,d2);
        System.out.println("huehue");
        t1.timeFrameIs("01/14/2012 09:29:58","01/15/2012 10:31:48");

        //shop.showHeader();
       // shop.showListAllCars();
        //shop.showListAvailableCars();
    }
}
