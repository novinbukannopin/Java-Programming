import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, +2);
        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
        Date result = calendar.getTime();
        System.out.println(result);
    }
}
