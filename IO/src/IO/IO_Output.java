package IO;

import java.io.*;

public class IO_Output {

    public static void outputData() throws IOException {
     //1、创建File类对象
        File file1 = new File("E:\\code\\IO\\hello.txt");

        //2、定义输出内容
         String str = "数风流人物，还看今朝！";

        //3、创建输出流File0utputStream(file,boolean append)
        ////append==true追加写入，输出的内容会写入到原内容的后面;
         OutputStream out = new FileOutputStream(file1,true);

        //4、写入内容的字节数组到输出流
        out.write(str.getBytes());

        //刷新输出流，将输出流内容写到文件中
        out.flush();

        //关闭输出流，不让它占内存
        out.close();

    }
}
