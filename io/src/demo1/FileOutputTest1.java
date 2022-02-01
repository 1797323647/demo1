package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputTest1 {
    public static void main(String[] args) throws Exception {
        /**
         * 创建一个输出流管道，此路径可以不存在,需要追加内容需要在参数后添加true
         */
        OutputStream outputStream = new FileOutputStream("io/src/DateOut.txt");
        //写一个数据
//        outputStream.write(97);
        //写多个数据
//        byte[] bytes = {97,98,99};
//        outputStream.write(bytes);
        //写中文需要先转码
        byte[] bytes = "你好世界".getBytes();
        outputStream.write(bytes);


        //强制清空数据管道，以免内存中遗留数据
        outputStream.flush();
        //刷新后关闭通道
        outputStream.close();
    }
}
