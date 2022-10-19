package IO;

import java.io.*;

public class Writer {

    public static void write() {
        //1、创建File类对象
        File file1 = new File("E:\\code\\IO\\hello.txt");
        //字节输出流
        OutputStream out = null;
        //设置字节输出流编码，并返回字节输出流
        OutputStreamWriter writer = null;

        //字符输出流
        BufferedWriter bw = null;

        try {
            out = new FileOutputStream(file1,true);
            writer = new OutputStreamWriter(out, "UTF-8");
            bw = new BufferedWriter(writer);
            bw.write("123");//写入内容到输出流
            bw.newLine();//换行
            bw.write("aaaaa");
            bw.flush();//刷新输出流，推送到文件
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }


        }
    }

    public static void main(String[] args) {
        write();
    }
}