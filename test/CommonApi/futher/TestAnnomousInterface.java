package futher;

interface OuterInterface {
    String name = "我是接口";
}


//总结： 1.写在成员位置的匿名内部类实现接口和继承类没有区别，都要传外部类对象的地址
//      2. 但是实现接口不能传其他的参数给父类的构造方法，因为它的父类是Object，Object的构造方法是没有参数的





public class TestAnnomousInterface {
    String name = "我是外部类";
    OuterInterface outerInterface = new OuterInterface() {
        String name = "我是匿名内部类";
    };


}

class TestDemo {
    public static void main(String[] args) {
        TestAnnomousInterface testAnnomousInterface = new TestAnnomousInterface();
    }


}