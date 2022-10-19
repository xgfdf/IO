package IO;

import java.io.*;



public class Reader {
    public static void read() throws IOException {
        //1、创建File类对象
        File file1 = new File("E:\\code\\IO\\hello.txt");

        //2、创建字节输入流
        InputStream in = new FileInputStream(file1);

        //3、对字节输入流进行编码，
        InputStreamReader reader = new InputStreamReader(in,"UTF-8");

        //4、创建字符流对象
        BufferedReader br = new BufferedReader(reader);

        //readLine读取文件中一行数据，从第一个字符开始读到换行符为止
        String str = br.readLine();
        while (str != null){
            System.out.println(str);
            str = br.readLine();
        }

    }

    public static void main(String[] args) {
        try {
            read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
