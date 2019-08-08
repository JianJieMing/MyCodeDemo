package test;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 * @Classname test.Test2
 * @Date 2019/8/6 11:49
 * @Created by jianjieming
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
            OkHttp 发送Http请求的框架

            发送Http请求步骤:
            1. 请求的地址.
            2. 指定请求方法(GET/POST).
                2.1 GET: 一般用来向服务器请求数据.
                2.2 POST: 一般用来发送数据.
            3. 设置请求头 简单的请求可以省略.
            4. 设置请求体 GET请求没有.
            5. 发送请求.
            6. 处理响应.
         */

        String url = "https://cs.sankakucomplex.com/data/94/1f/941f5cd4a7ef999de3101310878bd521.jpg?e=1565150579&m=dJneYsIqMqGuOqfwNSbBqw";

        OkHttpClient client = new OkHttpClient.Builder().build();
        Request request = new Request.Builder()
                .url(url) // 1.请求地址
                .get() // 2.可以不写,默认的就是get
//                .headers() // 3.
                .build();
//        5.发送请求,获取响应
        Response resp = client.newCall(request).execute();
//        6.处理响应
        assert resp.body() != null;
        InputStream in = resp.body().byteStream();
//        文件总大小
        long size = resp.body().contentLength();
        System.out.println("文件大小: " + size / 1024 + "KB");
        byte[] bytes = new byte[1024 * 2];
        double currentSize = 0;
        FileOutputStream fos = new FileOutputStream("super.jpg");
        int length = -1;
        while ((length = in.read(bytes)) != -1) {
            fos.write(bytes, 0, length);
            currentSize += length;
            System.out.println("进度: " + String.format("%.2f", (currentSize / size * 100)) + "%");
        }
        fos.close();
        in.close();
    }
}
