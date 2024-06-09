import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        //空参： 获取当前计算机的时间
        Date date = new Date();
        System.out.println(date);   //Sat Jun 08 00:05:08 CST 2024

        //带参数： 传入一个时间毫秒值，获取的是距离计算机时间原点的时间
        Date date1 = new Date(1000);
        System.out.println(date1);   //Thu Jan 01 08:00:01 CST 1970

        //修改时间对象中的时间毫秒值

        date1.setTime(2000);
        System.out.println(date1);    //Thu Jan 01 08:00:02 CST 1970

        //获取时间对象中的时间毫秒值
        long time = date1.getTime();
        System.out.println(time);  //output: 2000
    }
}
