package animal;
//主类
public class Test {
    public static void main(String[] args) {
        //创建Bird对象并调用方法
        Bird bird = new Bird();
        Animal.show();
        bird.eat();
        bird.ability();
        //创建Fish类并调用方法
        Fish fish = new Fish();
        Animal.show();
        fish.eat();
        fish.ability();
        Animal.show();
        //创建Monkey类并调用方法
        Monkey monkey = new Monkey();
        monkey.eat();
        monkey.ability();
    }
}
