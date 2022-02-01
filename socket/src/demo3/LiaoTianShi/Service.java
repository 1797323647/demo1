package demo3.LiaoTianShi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端 ，接受消息
 */
public class Service {
    public static void main(String[] args) {
        //创建socket管道
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket accept = serverSocket.accept();
            //获取管道字节输入流
            InputStream is = accept.getInputStream();
            //转换为字符流
            BufferedReader brd = new BufferedReader(new InputStreamReader(is));
            while (true){
                String length;
                while ((length = brd.readLine()) != null){
                    System.out.println(length);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
