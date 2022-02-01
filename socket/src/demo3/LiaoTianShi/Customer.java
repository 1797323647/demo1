package demo3.LiaoTianShi;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端
 */
public class Customer {
    public static void main(String[] args) {
        try {
            //创建socket管道
            Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
            //获取socket字节输出流
            OutputStream os = socket.getOutputStream();
            //字节输出流包装成打印流
            PrintStream ps = new PrintStream(os);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("请输入：");
                String s = scanner.nextLine();
                ps.println(socket.getRemoteSocketAddress() + "：" + s);
                ps.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
