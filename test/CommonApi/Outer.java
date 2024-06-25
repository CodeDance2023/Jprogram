public class Outer {        //外部类对象
    String name = "外部类";
    class Inner {
//        String name = "内部类";
        void show() {
            System.out.println(name);
        }
    }

    public Inner getInner() {     //获取内部类对象的方法
        return new Inner();   //内部类对象不是要先创建一个外部类对象吗，为什么这里没有创建
    }
}

class TestDemo {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        //Outer$Inner inner = new Outer$Inner(new Outer());  本质：会把外部类对象的地址作为参数传给内部类对象
        inner.show();

    }
}