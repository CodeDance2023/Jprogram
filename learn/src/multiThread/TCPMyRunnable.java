package multiThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPMyRunnable implements Runnable {
    Socket socket;
    public TCPMyRunnable(Socket socket){   //利用构造方法传入Socket对象
        this.socket = socket;
    }

    public void run(){  //重写run方法
        InputStream is;
        try {
            is = socket.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(isr);
        int b;
        try {
            while ( (b = bf.read()) != -1){
                System.out.print((char) b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (socket != null){  //避免在尝试关闭一个未初始化(即为null)的socket时引发NullPointerException
            try {
                socket.close();   //释放这一次的连接通道，连接通道是每一次都可以释放，但是服务器不可以随便关闭
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
