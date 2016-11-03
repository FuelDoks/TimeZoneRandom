package Figures;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Abbys {
    public void Date(){
        Date d = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("03, 11, 2016, 02:32");
        System.out.println(format1);
    }

    public void Abbys(){

        Calendar c = new GregorianCalendar(2016, 11, 03);
        c.add(Calendar.DAY_OF_YEAR, 1);
        System.out.println(c.getTime());
        c.add(Calendar.DAY_OF_YEAR, -1);
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));




    }

}

