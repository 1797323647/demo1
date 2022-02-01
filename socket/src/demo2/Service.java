package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */
public class Service {
    public static void main(String[] args) throws Exception {
//        创建socket管道
        ServerSocket socket = new ServerSocket(7777);
            //获取socket字节输入流
        Socket accept = socket.accept();
        InputStream inputStream = accept.getInputStream();
        BufferedReader brd = new BufferedReader(new InputStreamReader(inputStream));
        String length;
        while ((length = brd.readLine()) != null){
            System.out.println(length);
        }

    }
}
