import java.text.SimpleDateFormat;
import java.util.Date;

public class Current_Time {

    public static void main(String args[]){

        Date currentDate = new Date();
        System.out.println(currentDate);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(simpleDateFormat.format(currentDate));

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(currentDate));

        SimpleDateFormat format = new SimpleDateFormat("EEEE");
        System.out.println(format.format(currentDate));

        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm:a");
        System.out.println(clockFormat.format(currentDate));
    }

}
