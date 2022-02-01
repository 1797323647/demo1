package demo1.socket2where;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * 服务端，负责输出
 */
public class OutTest {
    public static void main(String[] args) throws Exception {
        //创建扫描器，用于接受用户输入的内容
        Scanner scanner = new Scanner(System.in);
        //创建一个客户端对象
        DatagramSocket socket = new DatagramSocket();
        while (true) {
            System.out.println("请输入");
            //接受用户输入的内容
            String str = scanner.nextLine();
            if ("exit".equals(str)) {
                System.out.println("通信结束");
                socket.close();
            }
            //包装数据
            byte[] bytes = str.getBytes();
            DatagramPacket packe = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 8888);
            socket.send(packe);
        }
    }
}
