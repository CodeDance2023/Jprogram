package futher;

class AnnomousOuter {
    String name;
    AnnomousOuter(String name) {
        this.name = name;
    }
}















public class TestAnnomousClass {
    String s = "我是外部类";
    AnnomousOuter annomousOuter = new AnnomousOuter("匿名内部类的父类") {
        String s = "我是匿名内部类";
    };

}
//总结： 1. 当匿名内部类写在成员位置的时候，创建外部类的对象时，会将这个对象的地址传给内部类对象的无参构造方法（实际上隐含一个外部类对象的参数）接收
//      2. 如果在父类的括号里面写参数，内部类的构造方法就会自动增加一个形参，并且将这个形参传给父类的构造方法。

                                  //1.匿名内部类（父类构造方法没有参数的情况）
//底层:  AnnomousOuter = new AnnomousOuter() ->  AnnomousOuter annomousOuter = new 1(this);  将this(这个“this”不是匿名内部类对象的地址，而是JVM自动传的外部类对象的地址)传被内部类的构造方法
//内部类的构造方法：TestAnnomousClass$1(final TestAnnomousClass this$0) {} //JVM自动生成的，接收外部类对象的地址

                                  //2.匿名内部类(父类构造方法有参数的情况)
//AnnomousOuter annomousOuter = new AnnomousOuter("匿名内部类的父类") -> nnomousOuter annomousOuter = new AnnomousOuter(this, "匿名内部类的父类")
//内部类的构造方法： TestAnnomousClass$1(final TestAnnomousClass this$0, String name) ->

// TestAnnomousClass$1(final TestAnnomousClass this$0, String name) {
//        super(name);      //会将参数传给父类的构造方法
//    }




class Main {
    public static void main(String[] args) {
        TestAnnomousClass testAnnomousClass = new TestAnnomousClass();

    }
}


