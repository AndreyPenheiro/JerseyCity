package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
    public static String returnNextMonth(){
        //Create date object
        Date dNow = new Date();

        //create calendar object for Gregorian calendar
        Calendar calender = new GregorianCalendar();
        //set calendar date to current date.
        calender.setTime(dNow);

        SimpleDateFormat sdf = new SimpleDateFormat("MMM-yyyy");
        calender.add(Calendar.MONTH,1);

        return sdf.format(calender.getTime());
    }
}
