package object;

import org.openjdk.jol.info.ClassLayout;

/**
 * -XX:-UseCompressedOops
 * @author lee
 * @version 1.0
 * @date 2020/8/18 0:27
 */
public class ObjectSizeTest {
    private Object  a = new Object();
    //int b = 4;
    public static void main(String[] args) {
        System.out.println(ClassLayout.parseInstance(new Object()).toPrintable());
        System.out.println(ClassLayout.parseInstance(new ObjectSizeTest()).toPrintable());
        System.out.println(ClassLayout.parseInstance(new T()).toPrintable());
        System.out.println(ClassLayout.parseInstance(new T1()).toPrintable());

    }
}

class T{
    //关闭指针压缩，即可验证，引用类型（普通对象指针）也是要占用内存空间的
    private Object o;
}

class T1{

}
