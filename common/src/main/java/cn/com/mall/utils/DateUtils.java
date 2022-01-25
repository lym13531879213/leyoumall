package cn.com.mall.utils;

import org.apache.commons.lang.StringUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class DateUtils {


    public static final long DAY_MILLIS = 86400000; // 一天的毫秒数
    public static final long HOUR_MILLIS = 3600000; // 一小时的毫秒数
    public static final long MINUTE_MILLIS = 60000;

    /**
     * 获得当前系统时间
     *
     * @return
     */
    public static Date getNow() {
        return new Date(System.currentTimeMillis());
    }

    /**
     * 根据秒级时间戳获取日期：入参有误则返回null值
     *
     * @param secTimeStamp 秒级时间戳
     * @return 日期对象
     */
    public static Date getDateBySecTimeStamp(Long secTimeStamp) {
        if (secTimeStamp == null || secTimeStamp <= 0) {
            return null;
        }
        return new Date(secTimeStamp * 1000);
    }

    /**
     * 根据毫秒级时间戳获取日期：入参有误则返回null值
     *
     * @param timeMillis 毫秒级时间戳
     * @return 日期对象
     */
    public static Date getDateByTimeMillis(Long timeMillis) {
        if (timeMillis == null || timeMillis <= 0) {
            return null;
        }
        return new Date(timeMillis);
    }

    /**
     * 判断这个时间是否是今天内(包含边界)
     *
     * @param date
     * @return
     */
    public static boolean validate(Date date) {
        if (date.getTime() >= getToday().getTime() && date.getTime() <= getTodayLast().getTime()) {
            return true;
        }
        return false;
    }

    public static String formatDateTime2(Date date) {
        return format2(date, "yyyy-MM-dd HH:mm:ss");
    }

    public static String format2(Date date, String fmt) {
        TimeZone zone = TimeZone.getTimeZone("GMT");
        DateFormat formatter = new SimpleDateFormat(fmt);
        formatter.setTimeZone(zone);
        return formatter.format(date);
    }

    /**
     * 判断这个时间是否是在某段时间内(包含边界)
     *
     * @param date
     * @return
     */
    public static boolean validate(Date date1, Date date2, Date date) {
        if (date.getTime() >= date1.getTime() && date.getTime() <= date2.getTime()) {
            return true;
        }
        return false;
    }

    /**
     * 获得当天的00:00:00时间
     *
     * @return
     */
    public static Date getToday() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    /**
     * 获得给定时间的00:00:00时间
     *
     * @param date
     * @return
     */
    public static Date getBeginOfDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    /**
     * 获得当天的23:59:59时间
     *
     * @return
     */
    public static Date getTodayLast() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        return cal.getTime();
    }

    /**
     * 获得给定时间的23:59:59时间
     *
     * @param date
     * @return
     */
    public static Date getEndOfDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    /**
     * 得到24小时内某小时的开始时间
     *
     * @param date
     * @param sub
     * @return
     */
    public static Date getSubsectionHourBegin(Date date, int sub) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, sub);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    /**
     * 得到24小时内某小时的末尾时间
     *
     * @param date
     * @param sub
     * @return
     */
    public static Date getSubsectionHourEnd(Date date, int sub) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, sub);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        return cal.getTime();
    }

    /**
     * 获得几天前当天时间
     *
     * @param date
     * @param dayNum
     * @return
     */
    public static Date getSomeDate(Date date, int dayNum) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(date.getTime() + DAY_MILLIS * (long) dayNum);
        return cal.getTime();
    }

    /**
     * 获得几月前当天时间
     *
     * @param date
     * @param monthNum
     * @return
     */
    public static Date getSomeMonthDate(Date date, int monthNum) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) + monthNum);
        return cal.getTime();
    }

    /**
     * 在给定时间上增加给定天数的时间
     *
     * @param date
     * @param days
     * @return
     */
    public static Date dateAdd(Date date, int days) {
        long time = date.getTime();
        return new Date(time + days * DAY_MILLIS);
    }

    /**
     * 获得某天是星期几(星期天是1，星期一是2...星期六是7)
     *
     * @param date
     * @return
     */
    public static int getDayOfWeek(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * 获得某个星期的第一天（周日）的现在时间
     *
     * @param date
     * @return
     */
    public static Date getFirstDayOfWeek(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int i = cal.get(Calendar.DAY_OF_WEEK);
        cal.add(Calendar.DATE, -i + 1);
        return cal.getTime();
    }

    /**
     * 获得某个星期的最后一天(周六)的现在时间
     *
     * @param date
     * @return
     */
    public static Date getLastDayOfWeek(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int i = cal.get(Calendar.DAY_OF_WEEK);
        cal.add(Calendar.DATE, -i + 7);
        return cal.getTime();
    }

    /**
     * 获得某月的第一天的现在时间
     *
     * @param date
     * @return
     */
    public static Date getFirstDayOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }

    /**
     * 当前月的开始时间
     *
     * @return
     */
    public static Date getFirstDayOfMonth() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 1);
        return getBeginOfDay(cal.getTime());
    }

    /**
     * 获得某月的最后一天的现在时间
     *
     * @param date
     * @return
     */
    public static Date getLastDayOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), 1);
        cal.add(Calendar.MONTH, 1);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        return cal.getTime();
    }

    /**
     * 获得当前月的最后一天的现在时间
     *
     * @param
     * @return
     */
    public static Date getLastDayOfMonth() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        return getEndOfDay(cal.getTime());
    }

    /**
     * 获得给定时间的小时
     *
     * @param date
     * @return
     */
    public static int getHour(Date date) {
        Calendar cld = Calendar.getInstance();
        cld.setTime(date);
        return cld.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * 获得给定时间的分钟
     *
     * @param date
     * @return
     */
    public static int getMinutes(Date date) {
        Calendar cld = Calendar.getInstance();
        cld.setTime(date);
        return cld.get(Calendar.MINUTE);
    }

    /**
     * 获得给定时间的日
     *
     * @param date
     * @return
     */
    public static int getDayOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 获得给定时间的月
     *
     * @param date
     * @return
     */
    public static int getMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.MONTH) + 1;
    }

    /**
     * 获得给定时间的年
     *
     * @param date
     * @return
     */
    public static int getYear(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.YEAR);
    }

    /**
     * 获得开始时间到结束时间内,跟开始时间相同的时分秒的时间数组
     *
     * @param start
     * @param end
     * @return
     */
    /*
     * public static Date[] getDays(Date start, Date end) { if
     * (start.after(end)) { return null; } Date startDay = getBeginOfDay(start);
     * Date endDay = getBeginOfDay(end); long d = (endDay.getTime() -
     * startDay.getTime()) / DAY_MILLIS; // 相差的天数 Date[] days = new Date[new
     * Long(d).intValue() + 1]; // long型转换成int型,因为数组定义不能用long类型 for (int i = 0;
     * i < days.length; i++) { days[i] = dateAdd(startDay, i); } return days; }
     */

    /**
     * 得到一个月内所有天
     *
     * @param date
     * @return
     */
    public static List<Date> getAllDayByMonth(Date date) {
        List<Date> list = new ArrayList<Date>();
        Date d1 = getFirstDayOfMonth(date); // 得到本月的开始
        list.add(d1);
        Date d2 = getFirstDayOfMonth(getSomeMonthDate(date, 1));// 得到下月的开始时间
        Date d3 = getSomeDate(d2, -1);// 得到本月结束时间
        Date d4 = d1;
        while (d4.getTime() != d3.getTime()) {
            d4 = getSomeDate(d4, 1);// 从本月开始时间计算+1 到结束时间
            list.add(d4);
        }
        return list;
    }

    /**
     * 得到本月开始之到当前日期的时间
     *
     * @param date
     * @return
     */
    public static List<Date> getAllDayByMonthAndDay(Date date) {
        List<Date> list = new ArrayList<Date>();
        // 得到本月的开始
        Date d1 = getFirstDayOfMonth(date);
        list.add(d1);
        Date d4 = d1;
        while (d4.getTime() != date.getTime()) {
            d4 = getSomeDate(d4, 1); // 从本月开始时间计算+1 到结束时间
            list.add(d4);
        }
        return list;
    }

    /**
     * 格式化:时间转化成字符串
     *
     * @param date
     * @param fmt
     * @return
     */
    public static String format(Date date, String fmt) {
        DateFormat formatter = new SimpleDateFormat(fmt);
        return formatter.format(date);
    }

    /**
     * 格式化:字符串转化成时间
     *
     * @param date
     * @param fmt
     * @return
     * @throws ParseException
     */
    public static Date format(String date, String fmt) throws ParseException {
        DateFormat formatter = new SimpleDateFormat(fmt);
        return formatter.parse(date);
    }

    /**
     * 格式化：yyyy-MM-dd 时间数据
     *
     * @param date
     * @return
     */
    public static String formatDate(Date date) {
        try {
            return format(date, "yyyy-MM-dd");
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * 格式化：yyyy-MM-dd 时间数据
     *
     * @param date
     * @return
     * @throws ParseException
     */
    public static Date formatDate(String date) throws ParseException {
        return format(date, "yyyy-MM-dd");
    }

    /**
     * 格式化：yyyy-MM-dd HH:mm:ss 时间数据
     *
     * @param date
     * @return
     */
    public static String formatDateTime(Date date) {
        return format(date, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 格式化：yyyy-MM-dd HH:mm:ss 时间数据
     *
     * @param timeMillis 时间戳 毫秒
     * @return 字符串
     */
    public static String formatDateTimeByTimeMillis(Long timeMillis) {
        if (timeMillis == null) {
            return null;
        }
        return format(new Date(timeMillis), "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 格式化：yyyy-MM-dd HH:mm:ss 时间数据
     *
     * @param date
     * @return
     * @throws ParseException
     */
    public static Date formatDateTime(String date) throws ParseException {
        return format(date, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 设置时间 yyyy-MM-dd HH:mm:ss.SSS 相应的字段
     *
     * @param year
     * @param month
     * @param day
     * @param hour
     * @param minute
     * @param second
     * @param milliSecond
     * @return
     */
    public static Date createDate(int year, int month, int day, int hour,
                                  int minute, int second, int milliSecond) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, second);
        cal.set(Calendar.MILLISECOND, milliSecond);
        return cal.getTime();
    }

    /**
     * n分钟前或后 + -
     *
     * @param date
     * @param minute
     * @return
     */
    public static Date addMinute(Date date, int minute) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, minute);
        return new Date(cal.getTime().getTime());
    }

    /**
     * n小时前或后 + -
     *
     * @param date
     * @param hour
     * @return
     */
    public static Date addHour(Date date, int hour) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, hour);
        return new Date(cal.getTime().getTime());
    }

    /**
     * n天前或后 + -
     *
     * @param date
     * @param day
     * @return
     */
    public static Date addDay(Date date, int day) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, day);
        return new Date(cal.getTime().getTime());
    }

    /**
     * n月前或后 + -
     *
     * @param date
     * @param month
     * @return
     */
    public static Date addMonth(Date date, int month) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, month);
        return new Date(cal.getTime().getTime());
    }

    /**
     * n年前或后 + -
     *
     * @param date
     * @param year
     * @return
     */
    public static Date addYear(Date date, int year) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, year);
        return new Date(cal.getTime().getTime());
    }

    /**
     * 计算两个日期之间的天数
     *
     * @param date1
     * @param date2
     * @return
     */
    public static int getDays(Date date1, Date date2) {
        int days = 0;
        days = (int) (Math.abs((date2.getTime() - date1.getTime())) / DAY_MILLIS);
        return days;
    }

    /**
     * 计算两个日期字符串之间的天数
     *
     * @param date1
     * @param date2
     * @return
     * @throws ParseException
     */
    public static int getDays(String date1, String date2) throws ParseException {
        int days = 0;
        days = (int) (Math.abs((format(date1, "yyyy-MM-dd").getTime() - format(
                date2, "yyyy-MM-dd").getTime())) / DAY_MILLIS);
        return days;
    }

    /**
     * 计算两个日期之间的时间差 详细到秒 返回类型为String
     *
     * @param date1
     * @param date2
     * @return
     */
    public static String getDayDif(Date date1, Date date2) {
        long between = Math.abs((date2.getTime() - date1.getTime()));
        long day = between / DAY_MILLIS;
        long hour = (between / HOUR_MILLIS - day * 24);
        long min = ((between / MINUTE_MILLIS) - day * 24 * 60 - hour * 60);
        long s = (between / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        return "" + day + "天" + hour + "小时" + min + "分" + s + "秒";
    }

    /**
     * 计算两个日期之间的时间差 详细到秒 时间格式为yyyy-MM-dd HH:mm:ss
     *
     * @param date1
     * @param date2
     * @return
     * @throws ParseException
     */
    public static String getDayDif(String date1, String date2)
            throws ParseException {
        long between = Math.abs(format(date1, "yyyy-MM-dd HH:mm:ss").getTime()
                - format(date2, "yyyy-MM-dd HH:mm:ss").getTime());
        long day = between / DAY_MILLIS;
        long hour = (between / HOUR_MILLIS - day * 24);
        long min = ((between / MINUTE_MILLIS) - day * 24 * 60 - hour * 60);
        long s = (between / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        return "" + day + "天" + hour + "小时" + min + "分" + s + "秒";
    }

    /**
     * 得到当前小时最后时间
     *
     * @param
     * @param
     * @return
     */
    public static Date getCurHourLast() {
        Calendar cal = Calendar.getInstance();
        Date date = getNow();
        cal.setTime(date);
        int sub = getHour(date);
        cal.set(Calendar.HOUR_OF_DAY, sub);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        return cal.getTime();
    }

    /**
     * 解析字符串日期为Date
     *
     * @param dateStr 日期字符串
     * @param pattern 格式
     * @return Date
     */
    public static Date parse(String dateStr, String pattern) {

        LocalDateTime localDateTime = LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern(pattern));
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

    /**
     * 计算是否为周末 周日或周六
     *
     * @param date 传入的时间
     * @return
     */
    public static boolean isWeekend(Date date) {
        boolean result = false;
        try {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int weekIndex = cal.get(Calendar.DAY_OF_WEEK);
            if (weekIndex == Calendar.SUNDAY || weekIndex == Calendar.SATURDAY) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    /**
     * 格式化：yyyy-MM-dd 时间数据
     *
     * @param date
     * @return
     */
    public static Long formatDateToLong(Date date) {
        try {
            return Long.parseLong(format(date, "yyyyMMdd"));
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * 获得当天时间的前几天当前时间
     *
     * @param date
     * @param dayNum
     * @return
     */
    public static Date getSomeBeforeDate(Date date, int dayNum) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(date.getTime() - DAY_MILLIS * (long) dayNum);
        return cal.getTime();
    }


    /**
     * 获取现在到次日凌晨的时间间隔秒数
     * @return 时间间隔秒数
     */
    public static long getSecondsGapToEarlyMorning() {
        // 取明天的00:00:00减去此刻
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return (cal.getTimeInMillis() - System.currentTimeMillis()) / 1000;
    }


    /**
     * 判断字符串是否为时间格式
     * @param dateString 时间字符串
     * @param dateFormat 时间格式
     */
    public static Boolean isDateFormat(String dateString,String dateFormat){
        if (StringUtils.isBlank(dateString) || StringUtils.isBlank(dateFormat) ){
            return false;
        }
        try {
            parse(dateString,dateFormat);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static Boolean isDateFormat(String dateString){
        return isDateFormat(dateString, "yyyy-MM-dd HH:mm:ss");
    }

}
