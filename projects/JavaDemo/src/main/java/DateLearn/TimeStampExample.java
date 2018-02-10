package DateLearn;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class TimeStampExample {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

    public static void main(String[] args) {

        //method 1
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("timestamp"+timestamp);

        //method 2 - via Date
        Date date = new Date();
        System.out.println("this a:"+new Timestamp(date.getTime()));

        //return number of milliseconds since January 1, 1970, 00:00:00 GMT
        System.out.println(timestamp.getTime());

        //format timestamp
        System.out.println(sdf.format(timestamp));

//        LocalDate localDate=LocalDate.now();
//        localDate.c
//        LocalDate localDate1=new LocalDate("")

    }
}
