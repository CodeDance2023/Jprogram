package multiThread;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPMultiSender {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10055);
        OutputStream os = socket.getOutputStream();
        os.write("你好啊".getBytes());
        socket.close();    //释放这一次的连接通道
    }
}
