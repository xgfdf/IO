package IO;



import java.io.*;

public class IO_Input {


    //字节输入流 --读数据
    public static void inputData() throws IOException {
        //1、创建File，加载文件物理路径
        //通过File文件类 加载到物理地址下的这个文件
        //拿到这个文件就可以读数据
         File file = new File("E:\\code\\IO\\hello.txt");

         //2、创建一个字节输入流
        //多态 父类引用指向子类对象
        //子类对象的构造方法加载file对象
        //file 读到了这个文件，字节输入流就加载这个file对象，拿到里面文件流
        InputStream in  = new FileInputStream(file);

        //3、返回输入流的可读字节长度
        //available()方法是:返回输入流可读的字节长度
        int size = in.available();
        System.out.println(size);


        //4
        //read()方法是int类型数字，返回ASCII码的十进制数或者一个字节码
        //可以用char类型去接受
        //char取值范围正好对应ASCII码
        for (int i = 0; i < size; i++) {
            char c = (char)in.read();
            System.out.print(c);
        }
        //上面的遍历方式打印出来：sdgsdf
        //å«è¯´è¯æ¶å»å
        //不能打印中文，ASCII码没有对中文的编码

        //读取中文
      /*  byte[] bytes = new byte[size];
        for (int i = 0; i < bytes.length; i++) {
            //把读取到的一个个字节码存储到字节数组中
            bytes[i] = (byte) in.read();
            
        }
        //String字符串 将 byte类型的数组转换成对应的字符
        System.out.println(new String(bytes));*/



    }

    public static void main(String[] args) {
        try {
            inputData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
