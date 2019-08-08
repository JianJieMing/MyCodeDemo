package three;

import java.io.*;

/**
 * @Classname Main36
 * @Date 2019/7/25 15:22
 * @Created by jianjieming
 */
public class Main36 {
    public static void main(String[] args) {
        String oldFile = "C:\\Users\\jianjieming\\Desktop\\imgs\\dog.jpg";
        String newFile = "C:\\Users\\jianjieming\\Desktop\\dog.jpg";

        FileInputStream is = null;
        FileOutputStream os = null;
        try {
            is = new FileInputStream(oldFile);
            os = new FileOutputStream(newFile);

//          FileReader
//          FileWriter
//          FileInputStream: 文件字节输入流,is.read(bytes),一次读一个字节.
//          FileOutputStream: 文件字节输出流,os.write(bytes, 0, length),一个字符一个字符的写.
//          BufferedReader: 好处是读文本文件的时候可以一次读一行.
//          BufferedWriter 字符输出流,相比下面这种写法,一个字符一个字符的写,对磁盘消耗比较大.
//          使用BufferedWriter,会把字符暂存起来,一起写入,减少对磁盘的写入操作,提高了性能.
//          重点: 流用完需要关流, 后开的流先关
            byte[] bytes = new byte[1024 * 1024];
            int length = -1;
            while ((length = is.read(bytes)) != -1) {
                os.write(bytes, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}