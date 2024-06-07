package regularExpression;

public class Greedy {
    public static void main(String[] args) {
        String s = "adddddddd";
        String regx = "ad+";   //默认就是贪婪匹配
        String regx1 = "ad+?";  //非贪婪匹配
        String s1 = s.replaceAll(regx,"贪婪");  //ouput: 贪婪
        String s2 = s.replaceAll(regx1,"贪婪");  //ouput：贪婪ddddddd
        System.out.println(s1);
        System.out.println(s2);

    }
}
