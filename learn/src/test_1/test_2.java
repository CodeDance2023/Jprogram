package test_1;
//static的作用：
//1.可以被这个类的所有成员共享
//2.不需要创建对象，直接用类名就可以进行调用
//3.在类加载进方法区的同时也被加载进入堆区的静态成员区
//注意事项：
//1.static的方法只能访问到static的方法或者成员
//2.static方法中不能出现this关键字 .......... 因为static的方法优先于对象出现，在堆区的对象还没有出现，所以this关键字还不是对象的地址，
//不能用来调用成员
//在一个类中调用方法可以直接调用
public class test_2 {

    public static int add(int x, int y)
    {
        return x + y;
    }
    public static void main(String[] args) {   //public:要被虚拟机掉用 //static：main方法可以更加简单的被调用
                                               //String[]是一个字符串数组，args为数组名（可以改为其他的）,原本用来记录键盘输入的数据，现在没有了，作为一个传统的保留
        int ret;
        ret = add(1,2);
        System.out.println(ret);
    }
}


//不同类中的方法要用对象名或者类名（加了static）才能调用
//public class test_2 {
//    public static void main(String[] args)
//    {
//        int ret;
//        ret = fun.add(1,2);
//        System.out.println(ret);
//    }
//}
//class fun{
//    public static int add(int x, int y){
//        return x + y;
//    }
//}