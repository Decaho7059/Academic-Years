//Q8

//import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println("Today is " + date1);

        SimpleDateFormat date2 = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        System.out.println("On est le "+ date2.format(date1));
    }





}
