package demo2;

import java.io.*;

/**
 * 使用字节缓冲流读写数据
 */
public class BufferInputTest {
    public static void main(String[] args) throws Exception {
        //创建字节缓冲流输入与输出管道
        InputStream bis = new BufferedInputStream(new FileInputStream("D:\\相册\\襄汽毕业照\\BY9A3097.jpg"));
        OutputStream bos = new BufferedOutputStream(new FileOutputStream("io/src/newPhoto2"));

        byte[] bytes = new byte[1024];
        int length;
        while ((length = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, length);
        }
        System.out.println("复制完成！");
        bos.close();
        bis.close();
    }
}
