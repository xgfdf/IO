package IO;

import java.io.*;

public class CopyFile_换行 {

    public static void main(String[] args) {
        try {
            CopyFile111();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
 /*   已知from. txt文件中有这样的一- 个字符串:“abcd1234”
    请编写程序读取数据内容，分两行(每四个字符换- -行) 写入到to. txt中。*/
    public static void CopyFile111() throws IOException {
        //字节输入流
        InputStream in = new FileInputStream(new File("E:\\from.txt"));
       //字节输出流
        OutputStream out = new FileOutputStream(new File("E:\\to.txt"));
            //
        int len = in.available();
        for (int i = 0; i < len; i++) {
            if (i == 4) {
                //out.write("\n".getBytes());
                out.write(10);//或者写入换行符的ASCII码
                out.write(in.read());
            }
            out.flush();
            out.close();
            in.close();
        }
    }


}