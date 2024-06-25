public class CommonDemo {
    public CommonDemo getClassDemo() {
        return new CommonDemo();
    }
}


class TestDemo1 {
    public static void main(String[] args) {
        CommonDemo commonDemo = new CommonDemo();
        CommonDemo classDemo = commonDemo.getClassDemo();
    }
}