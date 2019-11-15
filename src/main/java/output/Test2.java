package output;

import java.io.FileReader;
import java.io.PrintStream;


public class Test2 {
    public static void main(String[] args) throws Exception{
        System.setErr(new PrintStream("error.txt"));
        //文件并不存在，所以一定会报错。但是控制台并没有打印出来错误信息。原因是因为System.setErr重新定义了输出路径
        //同时也可以知道，错误信息，是通过System.err.print打印的。log4j中的基础，也是System.error
        FileReader fileReader = new FileReader("hh.txt");
    }
}
