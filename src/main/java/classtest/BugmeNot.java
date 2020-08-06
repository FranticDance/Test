package classtest;

/**
 * 判断是用户自定义类型，还是Java自身类型
 * @author lee
 * @version 1.0
 * @date 2019/11/28 9:38
 */
public class BugmeNot {
    public static boolean isJavaClass(Class<?> clz) {
        return clz != null && clz.getClassLoader() == null;
    }

    public static void main(String... args) {
        System.out.println(isJavaClass(Integer.class)); // true
        System.out.println(isJavaClass(BugmeNot.class)); // false

        ClassLoader classLoader = Integer.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = BugmeNot.class.getClassLoader();
        System.out.println(classLoader1);
    }
}
