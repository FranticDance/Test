package bibao;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/17 16:06
 */
public class Test2 {
    public int a = 1;
    public int compute(int a) {
        a = 2;
        System.out.println("result:" + a);
        return a;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.compute(test2.a);
        System.out.println(test2.a);
    }
}
