package com.goldmsg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2016/12/14
 * Time: 16:59
 */
public class aa {
    public static void main(String[] args) throws ParseException {
//        String b = "1481199044684_44dc08d7-44cc-4090-9b2d-ece94cf0d35b.png";
        String url = "1481199044684";
        Date d = new Date(Long.parseLong(url));
        Long a = new Date().getTime() - d.getTime();
        int day= (int) (a/1000/60/60/24);
        int hour= (int) (a/1000/60/60);
        int minute= (int) (a/1000/60);
        System.out.println(day);
        System.out.println(hour);
        System.out.println(minute);

//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(d);
//        System.out.println(Calendar.getInstance().getTime()calendar.getTime());

    }
}
