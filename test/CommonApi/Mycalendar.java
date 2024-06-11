import java.util.Calendar;
import java.util.Date;

public class Mycalendar {
    public static void main(String[] args) {
        //通过静态方法获取日历对象
        Calendar c = Calendar.getInstance();
        System.out.println(c);  //output: [time=1718121661117,
        // areFieldsSet=true,areAllFieldsSet=true.....

        //getTime方法获取当前日期对象
        Date time = c.getTime();   //底层会new Date( getTimeInMills() )
        System.out.println(time);

        //setTime给日历设置日期对象
//        Date date2 = new Date(1000L);
//        c.setTime(date2);
//        System.out.println(c);

        //getTimeInMills: 获取毫秒值
        long timeInMillis = c.getTimeInMillis();
        System.out.println(timeInMillis);  //1000

        //get: 获取某个字段的信息，可以进行修改
        //星期数组: 每个day的下标可以对应一个中文的星期值
        String[] days = {" ","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};

        int era = c.get(Calendar.ERA);  //什么纪元
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DAY_OF_MONTH);
        int day = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(era);
        System.out.println(year);
        System.out.println(month + 1); //一月是0,其他依次类推
        System.out.println(date);
        System.out.println(days[day]);    //星期日是1，其他依次类推

        //set方法，修改某个字段的信息

        c.set(Calendar.YEAR,2022);
        int year1 = c.get(Calendar.YEAR);
        System.out.println(year1);   //output: 2022

        //add方法： 修改指定的值
        c.add(Calendar.YEAR, 1);  //正数是+
        int year2 = c.get(Calendar.YEAR);
        System.out.println(year2);   //output: 2023


        c.add(Calendar.YEAR, -1);  //负数是-
        int year3 = c.get(Calendar.YEAR);
        System.out.println(year3);   //output: 2022


    }

}
