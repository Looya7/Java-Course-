import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateUtil {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe el año en que naciste: 'yyyy-mm-dd'");
        DateFormat format = new SimpleDateFormat("yyyy");
        Date date = format.parse(s.next());
        Date date2= new Date();
        int edadAnio=date2.getYear()-date.getYear();
        System.out.println("En 2023 tendrás " + edadAnio +" años.");
    }
}