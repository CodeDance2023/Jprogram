package multiThread;

public class MyRunnable implements Runnable {  //自定义类实现Runnable接口
    @Override
    public void run() {                //重写run方法
        Thread T = Thread.currentThread();  //获取当前线程
        System.out.println("这是线程: " + T.getName());  //获取当前线程名字
    }

    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();  //创建自己类的对象 ----- 多线程要执行的任务
        MyRunnable r2 = new MyRunnable();
        MyRunnable r3 = new MyRunnable();
        Thread t1 = new Thread(r1);            //创建一个Thread对象，并传递任务
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        t1.setName("t1");
        t2.setName("t2");   //设置线程名字
        t3.setName("t3");
        t1.start();   //开启线程
        t2.start();
        t3.start();

    }
}
