import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarPrinter {

    public void printCalendar(int year, Locale LOCALE) {
        DateFormat format = new SimpleDateFormat("EEEE dd MMMM", LOCALE);

        Calendar c = Calendar.getInstance();
        c.set(year, 11, 1);

        System.out.println(c.get(Calendar.YEAR));

        for(int i = 0; i <= 365; i++) {
            if(c.get(Calendar.DATE) == 1) {
                c.roll(Calendar.MONTH, true);
            }
            Date d = c.getTime();
            System.out.println(format.format(d));
            //System.out.println(c.getTime());
            c.roll(Calendar.DATE, true);
            if((c.get(Calendar.MONTH) == Calendar.DECEMBER) && c.get(Calendar.DATE) == 31) {
                Date date = c.getTime();
                System.out.println(format.format(date));
                //System.out.println(c.getTime());
                break;
            }
        }
    }


}
