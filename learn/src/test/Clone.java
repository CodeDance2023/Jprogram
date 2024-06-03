package test;

class D implements Cloneable {     //实现了这个标记接口CLoneable这个类的对象才可以被克隆
    int num = 1;
    int age = 2;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "D{" +
                "num=" + num +
                ", age=" + age +
                '}';
    }
    
}

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        D d = new D();
        Object a = d.clone();     //克隆一份
        System.out.println(a == d);   //false: 地址不一样
        System.out.println(d.clone());
    }
}