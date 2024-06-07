package string;

public class MyStringBuilder {
    public static void main(String[] args) {
        //无参构造创建空字符串
//        StringBuilder s = new StringBuilder();
//        System.out.println(s);

        //带参构造创建字符串
        //1.//传入数字设置capacity
        StringBuilder s1 = new StringBuilder(10);
        System.out.println(s1.capacity());  //10   -----可以装多少
        System.out.println(s1.length());  //0      -----实际长度


        //2.传入字符串创建一个字符串
        StringBuilder s2 = new StringBuilder("梁琦玮");
        System.out.println(s2);


        //append： 添加数据并返回对象本身
        StringBuilder s3 = new StringBuilder();
        s3.append("梁");
        s3.append("琦");
        s3.append("玮");
        System.out.println(s3);

        //reverse: 反转容器中的内容并返回对象本身
        StringBuilder s3reverse = s3.reverse();
        System.out.println(s3reverse);

        //toString: 把StringBuilder对象变成String对象
//        System.out.println(s3 instanceof String);  //报错
        String s3String = s3.toString();
        //源码
        //   public String toString() {
        //        return new String(this);
        //    }
        System.out.println(s3String instanceof String);  //true




    }
}
