package string;

public class Constructor {
    public static void main(String[] args) {
        //直接赋值
        String name1 = "梁";
        System.out.println(name1);

        //通过new创建
        String name2= new String("梁");
        System.out.println(name2);

        //通过字符数组创建+1
        char[] chars = {'a','b','c'};
        String name3 = new String(chars);
        System.out.println(name3);

        //通过字节数组创建
        byte[] bytes = {'a','b','c'};
        String name4 = new String(bytes);
        System.out.println(name4);
    }
}
