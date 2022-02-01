package demo2;

import java.io.*;

/**
 * 字符缓冲流
 */
public class BufferReader {
    public static void main(String[] args) {
        //创建字符输入和输出缓冲流
        try (BufferedReader br = new BufferedReader(new FileReader("io/src/DateOut.txt")); Writer bw = new BufferedWriter(new FileWriter("io/src/BufferWriterTest.txt",true));) {

//            char[] chars = new char[1024];
//            int length;
//            while ((length = br.read(chars)) != -1) {
//                bw.write(new String(chars, 0, length));
//            }
            /**
             * 新增读取一行
             */
            String lengthString;
            while ((lengthString = br.readLine()) != null) {
                bw.write(lengthString);
                System.out.println(lengthString);
            }
            System.out.println("复制完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
