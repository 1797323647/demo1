package demo2;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端
 */
public class Customer {
    public static void main(String[] args) throws Exception {
        //创建socket管道
        Socket socket = new Socket(InetAddress.getLocalHost(), 7777);
        //获取socket管道字节输出流
        OutputStream os = socket.getOutputStream();
        //使用打印流输出字符
        PrintStream ps = new PrintStream(os);
        ps.println("你好，我是客户端，现在正在发出一则消息！");
        //刷新输出流管道
        ps.flush();

    }
}
