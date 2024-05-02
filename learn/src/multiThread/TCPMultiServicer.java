package multiThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPMultiServicer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10055);
        while (true) {   //循环接受客户端的连接
            Socket socket = ss.accept();  //每一个连接就开一个线程
            TCPMyRunnable myrun = new TCPMyRunnable(socket);
            Thread t = new Thread(myrun);
            t.start();   //开启线程
        }
    }
}
