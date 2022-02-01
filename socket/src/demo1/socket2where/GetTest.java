package demo1.socket2where;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * 客户端（负责接受）
 */
public class GetTest {
    public static void main(String[] args) throws Exception {

        //创建一个客户端对象
        DatagramSocket socket = new DatagramSocket(8888);
        //创建一个数据包用来接受
        byte[] bytes = new byte[1024 * 64];
        while (true) {
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
            //接受数据包
            socket.receive(packet);
            //取出数据包数据
            String str = new String(packet.getData(), 0, packet.getLength());
            //控制台输出数据包数据
            System.out.println("ip地址为" + packet.getAddress() + " 端口为" + packet.getPort() + "的用户发来一条消息" + str);
        }

    }
}
