package com.goldmsg.timeTransform;

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

/**
 *获取时间戳
 * 时间戳字符串转Data对象
 * 计算时间差
 * */
public class TimeTransform {
    public static void main(String[] args) throws ParseException {
//        String b = "1481199044684_44dc08d7-44cc-4090-9b2d-ece94cf0d35b.png";
        String url = "1481199044684";//时间戳
        Date d = new Date(Long.parseLong(url));//时间戳转Date对象
        System.out.println("时间戳字符串："+url);

        Long nowDate =new Date().getTime();
        System.out.println("当前时间："+nowDate);

        Long a = nowDate - d.getTime();//计算当前时间与时间戳时间的时间差（毫秒）
        int day= (int) (a/1000/60/60/24);
        int hour= (int) (a/1000/60/60);
        int minute= (int) (a/1000/60);
        System.out.println("相差天数"+day);
        System.out.println("相差小时"+hour);
        System.out.println("相差分钟"+minute);

        String nowtime ="2016-11-23 10:15:30";
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date nowdate = format.parse(nowtime);
        calendar.setTime(nowdate);
        calendar.add(Calendar.DAY_OF_MONTH,10);
        System.out.println(format2.format(calendar.getTime()));

    }
}
