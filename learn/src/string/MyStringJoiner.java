package string;

import java.util.StringJoiner;

public class MyStringJoiner {
    public static void main(String[] args) {
        //带参构造传入字符串拼接时的符号 ","
        StringJoiner s= new StringJoiner(",");
        //add()； 添加数据并返回对象本身
        s.add("梁");
        s.add("琦");
        s.add("玮");
        System.out.println(s);  //output:   梁,琦,玮

        //带参构造传入拼接时的 分隔符号(",") , 开始符号( "[" ),结束符号("]")
        StringJoiner s1 = new StringJoiner(",", "[", "]");
        s1.add("梁");
        s1.add("琦");
        s1.add("玮");
        //toString()，返回拼接后的字符串
        String s2 = s1.toString();
        System.out.println(s2);   //output: [梁,琦,玮]

        //length()： 返回实际长度
        System.out.println(s2.length());   //7

    }
}
