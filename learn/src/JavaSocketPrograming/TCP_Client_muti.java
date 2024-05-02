package JavaSocketPrograming;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCP_Client_muti {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //创建Socket对象同时连接服务端的主机和端口号
        Socket socket = new Socket("127.0.0.1",10086);
        //如果连接成功就可以获取输出流
        OutputStream os = socket.getOutputStream();
        while (true) {
            System.out.print("请输入你要发送的信息:");
            String message = input.nextLine();
            os.write(message.getBytes());
            if (message.equals("886")){
                break;
            }
            os.flush();  //刷新输出流，即把所有在通道中的输出全部清理出去
        }
        //释放资源
        socket.close();   //关闭和服务器的连接通道
//        os.close();   //关闭输出流 ------ 注意：这个关不关都可以，因为流在通道里，关闭socket就同时关闭了流
    }
}

