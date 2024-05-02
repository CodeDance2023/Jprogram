//UDP协议（发送数据）
package JavaSocketPrograming;
import java.io.IOException;
import java.net.*;
import java.util.*;

public class UDP_ChattingRoom_send {
    public static void main(String[] args) throws IOException{
        //细节：
        //绑定端口：以后我们就是通过这个端口往外发送
        //空参： 所有可用的端口中随机一个进行使用
        //带参： 指定端口号进行绑定

        // 1.创建DatagramSocket数据包端口对象 （快递公司）
        DatagramSocket ds = new DatagramSocket();
        Scanner input = new Scanner(System.in);

        // 2.打包数据
        while (true) {
            System.out.print("请输入你要说的话：");
            String message = input.nextLine();
            if (message.equals("886")){
                break;
            }
            byte[] bytes = message.getBytes();  //需要转成byte数组

            InetAddress address = InetAddress.getByName("127.0.0.1");  //主机对象

            int port = 10086;  //端口号
            //给哪台电脑的那个端口发送全部bytes里面的所有信息

            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);  //发送给address主机的port端口

            //3.发送数据
            ds.send(dp);
        }

        //4.释放资源 （付钱走人）
        ds.close();
    }
}