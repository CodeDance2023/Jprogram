package animal;

//Animal接口
public interface Animal {
    //静态成员变量address
    String address = "广州动物园";
    //抽象方法
    static void show(){
        System.out.println("我是动物");
    }
    void ability();
    default void eat()
    {
        System.out.println("每天吃的饱饱的");
    }
}


  //Bird类实现Animal接口
class Bird implements Animal{
    //重写其方法
    public Bird(){
        System.out.println("我是" + Animal.address + "的鸟");
    }
    public void eat(){
        System.out.println("我爱吃虫子！每天都吃得饱饱的！");
    }
    public void ability(){
        System.out.println("我会飞！");
    }

}

//Fish实现类
class Fish implements Animal{
    //重写接口方法
    public Fish(){
        System.out.println("我是" + Animal.address + "的鱼");
    }
    public void eat(){
        System.out.println("我爱吃小虾！每天都吃得饱饱的！");
    }
    public void ability(){
        System.out.println("我会游泳！");
    }

}

//Monkey实现类
class Monkey implements Animal{
    //重写方法
    public Monkey(){
        System.out.println("我是" + Animal.address + "的猴子");
    }
    public void eat(){
        System.out.println("我爱吃香蕉！每天都吃得饱饱的！");
    }
    public void ability(){
        System.out.println("我会爬树！");
    }
}




