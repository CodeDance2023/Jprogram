package Textbook;

public class Dem {
    String name = "我是父类";
}


class ZiD extends Dem {
    void show() {
        System.out.println(super.name);    //super只能在方法里面用，因为只有在方法里面才知道是那个对象，
                                           //super才知道是哪个对象的父类存储空间
    }
}

class Main {
    public static void main(String[] args) {
        ZiD ziD = new ZiD();
        ziD.show();
    }
}