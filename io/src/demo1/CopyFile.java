package demo1;

import java.io.*;

/**
 * 拷贝文件
 */
public class CopyFile {
    public static void main(String[] args) {
        try {
            //输入流管道
            InputStream is = new FileInputStream("D:\\相册\\襄汽毕业照\\BY9A3098.jpg");
            //输出流管道
            OutputStream os = new FileOutputStream("io\\src\\newPhoto");
            //创建装载容器
            byte[] bytes = new byte[1024];
            //每次装载的长度
            int length;
            //循环读取文件
            while ((length = is.read(bytes)) != -1) {
                //写入数据流
                os.write(bytes, 0, length);
            }
            System.out.println("复制完成！");
            //关闭流
            os.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
