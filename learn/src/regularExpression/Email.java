package regularExpression;
//邮箱正则
public class Email {
    //323232@qq.com zhangsan@itcast.com
    //diai000099@163.com die0000999988@pci.com.cn
    public static void main(String[] args) {
//        String regx = "(\\w&&[^_])+";  //在（）中的字符为普通的&&字符
//        String regx1 = "([\\w&&[^_]])";  //在[]中的&&才为并集
        String regx1 = "[\\w&&[^_]]+@[\\w&&[^_]]{2,6}(\\.[\\w&&[^_]]{2,3}){1,2}";

//        String regx1 = "[\\w&&[^_]]+@[\\w&&[^_]]{2,6}(\\.[\\w&&[^_]]{2,3}){1,2}";

        String s1 = "323232@qq.com";
        String s2 = "zhangsan@itcast.com";
        String s3 = "diai000099@163.com";
        String s4 = "die0000999988@pci.com.cn";
        System.out.println(s1.matches(regx1));
        System.out.println(s2.matches(regx1));
        System.out.println(s3.matches(regx1));
        System.out.println(s4.matches(regx1));
    }

}
