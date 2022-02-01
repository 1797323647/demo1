package demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 测试字节流读取文件
 */
public class FileInputTest1 {
    public static void main(String[] args) throws Exception {
        /**
         *创建输入流管道
         */
        InputStream inputStream = new FileInputStream("io\\src\\Date.txt");
        /**
         * 每次读取一个字节，毫无效率
         */
//        int b ;
//        b = inputStream.read();
//        System.out.println((char) b);
        /**
         * 使用循环一次读取所有字节，遇到中文会乱码
         */
//        int b;
//        while ((b = inputStream.read()) != -1) {
//            System.out.print((char) b);
//        }
        /**
         * 使用循环读取所有字节
         */
        byte[] bytes = new byte[1024];
        int b;
        while ((b = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, bytes.length));
        }

        /**
         * 彻底解决中文乱码问题，一次性读取所有字节 jdk9新增
         */
        byte[] bytes1 = inputStream.readAllBytes();
        System.out.println(new String(bytes));

    }
}
