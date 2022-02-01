package demo1.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 客户端（接受数据）
 */
public class GetTest {
    public static void main(String[] args) throws Exception {
        //创建接收端对象，并注册端口
        DatagramSocket socket = new DatagramSocket(8888);
        //创建一个数据包用来存放数据，数据包大小为udp的max
        byte[] bytes = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        //等待接受数据
        socket.receive(packet);
        //取出数据
        String str = new String(packet.getData(), 0, packet.getLength());
        //把数据输出到控制台
        System.out.println("客户端接受到了" + str);
        //关闭接收端对象
        socket.close();
    }
}
