package JavaSocketPrograming;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_Receive {
    public static void main(String[] args) throws IOException {
        //1. 创建DatagramSocket对象  -------  快递公司
        DatagramSocket ds = new DatagramSocket(10086);  //注意绑定发送端的端口号
        //2.接收数据包   ------ 找到包裹
        byte[] bytes =  new byte[1024];   //正好1KB
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);
        //3.解析数据包           ---------- 拆开快递
        byte[] message = dp.getData();
       String name = dp.getAddress().getHostAddress();   //获取主机名称
       String address = dp.getAddress().getHostAddress();  //获取主机IP
       int port = dp.getPort();  //获取发送端的端口号
        int len = dp.getLength();  //获取字符串的长度,注意别用message.length
        System.out.println("信息：" + new String(message,0,len) + "是从主机名字为"  //将bytes数组的信息转为字符串时，一定要输入0和len，不然会出现中文乱码。

                + name + "IP为：" +  address + "的" + port + "端口" +  "发来的");
        //4.释放资源      --------签收走人
        ds.close();
    }

}
