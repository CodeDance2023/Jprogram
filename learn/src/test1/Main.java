//package practice.test_1;
//public class Hello{
//    public static void main(String[] args){
//        point p = new point();  //创建对象
//        System.out.println(p);   //打印对象名可以看到对象的全类名和地址
//        p.x = 1;                        //practice.test_1.point@2f4d3709
//                                        //其中test_1.point为全类名：即包名+类名
//                                        //2f4d3709为对象的地址
//        p.y = 2;
//        int ret = p.add(1,3);
//        System.out.print(ret);
//    }
//}
//class point{ //point类
//
//
//    int x; //成员变量（属性）
//    int y;
//    public int add(int x,int y){  //成员方法（行为）
//        return x + y;
//    }
//}
//
//
//

package test1;
class Stu{
    static void show(){
        System.out.println(1);
    }
    void method(){
        show();
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(1);
        Stu s = new Stu();
        s.method();
    }

}
