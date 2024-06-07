package regularExpression;

public class Group {
    public static void main(String[] args) {
        String s = "aaaaaaaa";
        String regx = "(.)\\1+?";  //非贪婪匹配
        String regx1 = "(.)\\1+";  //贪婪匹配

        String s1 = s.replaceAll(regx, "b");  //底层会调用find()方法，一直找匹配regx中的内容，找到了替换为b
        //因此一次匹配了一个aa，因此会输出四个b
        String s2 = s.replaceAll(regx1, "b");
        System.out.println(s1);  //bbbb
        System.out.println(s2);  //b
    }
}
