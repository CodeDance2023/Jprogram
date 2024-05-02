package multiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<Integer> {   //自定义类实现Callable接口，并且重写call方法
    @Override
    public Integer call(){              //重写call方法
        Thread T = Thread.currentThread();   //获得当前线程，运用static方法currentThread
        System.out.println("这是线程：" + T.getName());
        int a = 1;
        int b = 2;
        return a + b;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();    //创建MyCallable对象，为多线程要进行的任务
        FutureTask<Integer> futureTask= new FutureTask<>(myCallable);  //创建FutureTask对象，管理线程运行的结果
        Thread t1 = new Thread(futureTask);   //创建Thread对象，即线程
        t1.setName("t1");
        t1.start();   //开启线程
        Integer res = futureTask.get();   //获取多线程对象运行的结果
        System.out.println("线程运行的结果是 = " + res);
    }
}
