package ro.jademy.carRent.car;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    private Date startDate;
    private Date endDate;
    public Time(Date startDate, Date endDate){
        this.startDate= startDate;
        this.endDate= endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    public void timeFrameIs(String startDate, String endDate){
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date d1=null;
        Date d2=null;
        d1 = format.parse(startDate);
        d2 = format.parse(endDate);


        long diff = d2.getTime() - d1.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000);
        System.out.println("time difference is "+diffDays+" Days");

    }
}
