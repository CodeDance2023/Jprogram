package test;

import java.util.Scanner;

public class Inherit {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
        Scanner in = new Scanner(System.in);
        in.next();

    }
}

class Fu{
    String name = "父类";
    int age = 20;

}

class Zi extends Fu{
    void show(){
        System.out.println(name);
    }
}