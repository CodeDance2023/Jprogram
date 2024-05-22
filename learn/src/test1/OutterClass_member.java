package test1;

public class OutterClass_member {
    String name;
    final int age;
    public OutterClass_member(int age){
        this.age = age;
    }

    class Inner{
        String name = "静态成员内部类";
        void showOutter()
        {
            System.out.println(age);  // 先创建外部类对象才能拥有外部类对象的引用，区别与局部内部类。

        }
    }

}

class Mainclass{
    public static void main(String[] args) {
       OutterClass_member.Inner inner = new OutterClass_member(20).new Inner();
       inner.showOutter();
    }
}