package demo3.LiaoTianShiDuoFa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class LiaoTianThread extends Thread {
    private Socket socket;

    public LiaoTianThread(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        //获取字节转字符输入流
        try {
            BufferedReader brd = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String length;
            while ((length = brd.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress() + ":" + length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
