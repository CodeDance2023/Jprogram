package JavaSocketPrograming;

import javax.print.DocFlavor;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);    //记得绑定客户端的端口号
        //创建监视等待客户端连接 ----如果连接成功就会返回客户端的连接对象
        Socket socket = ss.accept();
        //获取输入流
        InputStream is= socket.getInputStream();  //字节流
        //因为用字节流中文会出现乱码，因此要转为字符流 -----用转换流InputStreamReader类进行转换
        InputStreamReader isr = new InputStreamReader(is);  //字符流
        //提高读取数据的速度，用BufferedReader类
        BufferedReader br = new BufferedReader(isr);
        //写入数据
        int b;
        while ((b = br.read()) != -1){
            System.out.print((char)b);
        }
        //释放资源
        ss.close();  //关闭服务器
        socket.close();   //关闭连接通道,写不写到可以，关闭服务器就没有了连接通道
    }
}
