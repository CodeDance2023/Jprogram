public class Generic<T> {
    T age;
    public <E> void show(E a) {    //再修饰符后加上<>申明方法自己的泛型，只有自己才可以用
        System.out.println(a);
    }
}

class Test {
    public static void main(String[] args) {
        Generic<String> generic = new Generic<>();
        generic.show(1);   //因为方法有自己的泛型，因此可以传入任意类型的参数
    }
}