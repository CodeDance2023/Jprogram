package classroom.person;

public class Me extends Person implements Father, Mother {
    //重写Person类的抽象方法
    @Override
    void eat(){
        System.out.println("我爱吃面");
    }
    void sleep(){
        System.out.println("睡觉");
    }
    //自己的成员方法
    void study(){
        System.out.println("我爱学习Java");
    }
    //重写Father接口的抽象方法
    @Override
    public void sports() {
        System.out.println("运动");
    }
    public void smoking(){
        System.out.println("抽烟");
    }
    //重写Mother接口的抽象方法
    public void cook(){
        System.out.println("做饭");
    }

    @Override
    public void wathTV() {
        System.out.println("看电视");
    }
}
