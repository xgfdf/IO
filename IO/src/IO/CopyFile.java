package IO;

import java.io.*;

public class CopyFile {

    //*********复制大文件*********
    public static void copyFile1() throws IOException {
        //字节输入流
        InputStream in = new FileInputStream(new File("E:\\demo.mp4"));
         //字节输出流
        OutputStream out = new FileOutputStream(new File("E:\\copy.mp4"));

        //1、第一种方式
       //获取字节输入流的字节长度
       /* int size = in.available();
        System.out.println(size);

        for (int i = 0; i < size; i++) {
            out.write(in.read());
        }*/

        //2、第二种方式
        byte[] bt = new byte [1024] ;
        /*int len = in.read(bt);//每次读指定数组长的字节数，并将读到的字节传入大数组中，返回读到的字节长度
        while (len != -1 ) {
            out.write(bt);//将字节数组中的字节写入到输出流中
            len = in.read(bt);
        }*/

        //3、第三种方式
        int len = -1;
        while((len = in.read(bt)) != -1) {
                    out. write(bt);
        }
        out.close();
        in.close();

    }
}