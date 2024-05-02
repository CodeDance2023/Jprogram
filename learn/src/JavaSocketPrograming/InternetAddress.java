//InetAddress类的使用： 注意：这个类没有提供构造方法，因此要通过普通方法来获取对象
//常见方法：
// 1.static InetAddress getByName(String host)   //确定主机名称的IP地址（创建对象），主机名称可以是主机名或者IP地址
// 2. String getHosName()        获取此IP地址的主机名，通过对象来调用
// 3. String getHostAddress()        返回文本显示中的IP地址字符串

package JavaSocketPrograming;
import  java.net.InetAddress;
import java.net.UnknownHostException;
public class InternetAddress {
    public static void main(String[] args) throws UnknownHostException {
        //获取InetAddress的对象
                    //IP的对象 一台主机的对象
        InetAddress address = InetAddress.getByName("192.168.101.212");

        System.out.println(address);
        //调用方法获取主机名
        String name = address.getHostName();
        System.out.println(name);

        //调用方法获取ip地址串
        String ip = address.getHostAddress();
        System.out.println(ip);


    }
}

