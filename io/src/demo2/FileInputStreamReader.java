package demo2;

import java.io.*;
import java.nio.charset.Charset;

/**
 * 字符输入输出转换流
 */
public class FileInputStreamReader {
    public static void main(String[] args) throws Exception {
        //先创建一个文件字节流
        InputStream is = new FileInputStream("io/src/ZhuanHuan.txt");
        //创建指定字符集编码的字节流转换字符流通道
        BufferedReader brd = new BufferedReader(new InputStreamReader(is, "GBK"));
        String length;
        while ((length = brd.readLine()) != null) {
            System.out.println(length);
        }
        //创建’一个字节输出流 并创建指定字符编码的字符输出流
        BufferedWriter bwr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("io/src/ZhuanHuan2.txt"), "GBK"));
        bwr.write("                   +++++++++++++++++++++ 指定字符编码输出流测试");
        bwr.close();
        brd.close();
        is.close();


    }
}
