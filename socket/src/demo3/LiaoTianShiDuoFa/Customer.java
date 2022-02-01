package demo3.LiaoTianShiDuoFa;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端 负责发送消息
 */
public class Customer {
    public static void main(String[] args) {
        //创建socket管道
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
            //获取socket管道字节输出流 并包装成高级打印流
            PrintStream ps = new PrintStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("请输入:");
                String s = scanner.nextLine();
                ps.println(socket.getRemoteSocketAddress() + ":   " + s);
                ps.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
