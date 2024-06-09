import com.sun.source.tree.UsesTree;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MysimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        //使用无参构造-----------默认格式化模式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date date1 = new Date();
        String format1 = sdf1.format(date1);
        System.out.println(format1);  //output: 2024/6/9 23:51



        //使用带参构造 -----------指定格式化模式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date2 = new Date();
        String format2 = sdf2.format(date2);
        System.out.println(format2);  //output: 2024/6/9 23:51

        //parse: 将表示时间的字符串变为Date对象  -----------SimpleDateFormat的参数要和parse时的字符串格式一致
        String sdate2 = "2024年6月9日 22:22:22";
        Date parse = sdf2.parse(sdate2);
        System.out.println(parse);
    }

}
