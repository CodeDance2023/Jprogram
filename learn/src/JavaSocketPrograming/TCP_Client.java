package JavaSocketPrograming;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCP_Client {
    public static void main(String[] args) throws IOException {
        //创建Socket对象同时连接服务端的主机和端口号
        Socket socket = new Socket("127.0.0.1",10000);
        //如果连接成功就可以获取输出流
        OutputStream os = socket.getOutputStream();
        //写出信息，只能写出字节流
        os.write("你好你好".getBytes());
        //释放资源
        socket.close();   //关闭和服务器的连接通道
//        os.close();   //关闭输出流 ------ 注意：这个关不关都可以，因为流在通道里，关闭socket就同时关闭了流
    }
}

