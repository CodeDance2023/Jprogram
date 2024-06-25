public class OuterA {
    String name = "外部类";
    static class InnerA {
        String name = "静态内部类";
    }
}


class OuterDemo {
    public static void main(String[] args) {
        OuterA.InnerA inner = new OuterA.InnerA();
        System.out.println(inner.name);

    }
}