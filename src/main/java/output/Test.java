package output;

import java.io.File;

/**
 * System.out.println   能重定向到别的输出流，比如输出到txt文本中；
 * 而System.err.println只能在屏幕上实现打印，即便重定向也一样。
 *
 *
 * System.out.println有可能在缓存中，由OS和JVM决定是否输出，而System.err.println它将每一次操作的结果都输出来，这样就很好理解区别了吧。
 * 在eclipse控制台输出时，System.err.println输出的内容是红色的。
 *
 *
 * 对于我们而言在调试程序的时候尽量使用err来输出，这样可以很清晰的定位到任何一个步骤，而out输出的位置顺序很可能和你期望的不一样。
 */
public class Test {
    public static void main(String[] args) {
        String path=System.getProperty("user.dir") + File.separator  + "webroot";
        System.out.println(path);
        String str="hello";
        StringBuffer strBuf=new StringBuffer(str);
        System.out.println("aaaaaaaaaaaaaa");
        System.err.println("bbbbbbbbbbbbbb");
    }
}
