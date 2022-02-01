package demo3.LiaoTianShiDuoFa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端 接受消息
 */
public class Service {
    public static void main(String[] args) {
        //创建socket管道
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            while (true) {
                Socket accept = serverSocket.accept();
                System.out.println(accept.getRemoteSocketAddress() + "上线了！");
                new LiaoTianThread(accept).start();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
