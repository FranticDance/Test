package language;

/**
 * @author lee
 * @version 1.0
 * @date 2020/4/2 9:26
 */
public class Client {
    public static void main(String[] args) {
        testEnum();
        //testDefineEnum();
    }

    private static void testDefineEnum() {
        Student1 lisi = Student1.LISI;
        System.out.println(lisi);
        System.out.println(lisi.toString());
        System.out.println(lisi.getName());
        System.out.println(lisi.getAge());
    }

    private static void testEnum() {
        Student lisi = Student.LISI;
        System.out.println(lisi);
        lisi.sayHello();
        //如果枚举类没有重写toString，那么调用toString，打印出来的是枚举值的名字。
        //不是地址值，因为枚举类的基类不是Object。
        System.out.println(lisi.toString());
        System.out.println(lisi.name());
        System.out.println(lisi.getName());
        System.out.println(lisi.getAge());
        Student[] values = Student.values();
    }
}
