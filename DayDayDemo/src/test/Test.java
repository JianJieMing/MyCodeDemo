package test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Classname test.Test
 * @Date 2019/8/6 10:57
 * @Created by jianjieming
 */
public class Test {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://files.yande.re/image/cb71b20319879894356b4277afa9834b/yande.re%20419514%20aoi_ogata%20armor%20blood%20fate_grand_order%20saber%20sword.jpg");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("GET");
        InputStream inputStream = urlConnection.getInputStream();

        System.out.println(urlConnection.getContentLength());

        File file = new File("C:\\Users\\jianjieming\\Desktop\\demo.jpg");

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(inputStream);
            bos = new BufferedOutputStream(new FileOutputStream(file));

            byte[] bytes = new byte[1024];
            int length = 0;

            while ((length = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, length);
            }
            bos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
