package demo1.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 服务端（负责输出数据）
 */
public class OutTest {
    public static void main(String[] args) throws Exception {
        //创建输出端对象，
        DatagramSocket socket = new DatagramSocket();
        //创建一个数据包用来存放需要传输的数据
        byte[] bytes = "Hello World，你好世界！！！".getBytes();
        InetAddress host;
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 8888);
        //发送数据
        socket.send(packet);
        //关闭输出端流对象
        socket.close();

    }
}
