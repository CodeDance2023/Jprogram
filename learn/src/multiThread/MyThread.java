package multiThread;

public class MyThread extends Thread{   //创建Mythread类来继承Thread类
    @Override
    public void run(){      //重写run方法
        System.out.println("这是线程：" + getName());  //获取线程名字
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2= new MyThread();
        MyThread t3= new MyThread();
        //多线程或并发的在同一个cpu交替执行
        t1.setName("t1");   //设置线程名字
        t2.setName("t2");
        t3.setName("t3");
        t1.start();  //开启线程
        t2.start();
        t3.start();
    }
}
