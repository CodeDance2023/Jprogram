package test1;

public class Outter_local {
    String name = "外部类";
    int age;
    void method(){
        class Inner{
            String name = "局部内部类";
        }
        Inner inner = new Inner();
        System.out.println(inner.name);
        System.out.println(name);               //编译时就拥有外部类对象的引用，不用线创建外部类对象就可以访问到外部类的成员

    }
}

class Mainclass1 {
    public static void main(String[] args) {
        Outter_local outterLocal = new Outter_local();
        outterLocal.method();
    }
}