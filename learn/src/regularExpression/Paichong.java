package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paichong {
    public static void main(String[] args) {
        String s = "java是进了房间数量发生发生，java8是黑厉害的" +
                "，java10,和纽宾凯反倒是垃圾分类收集" +
                "，java17,艰苦拉拉是否建立时间";
        //获取
        Pattern p = Pattern.compile("java(?!8|17|10)");
        Matcher m = p.matcher(s);
        while (m.find()) {
            String substr = m.group();
            System.out.println(substr);
        }
    }
}
