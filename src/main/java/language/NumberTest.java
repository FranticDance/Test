package language;

import java.math.BigDecimal;

/**
 * @author lee
 * @version 1.0
 * @date 2020/5/27 16:58
 */
public class NumberTest {
    public static void main(String[] args) {
        double a = 41.01275016;
        double d = 41.01275016;
        /*String s = String.valueOf(a);
        String substring = s.substring(0, s.length() - 2);
        System.out.println(substring);*/

        BigDecimal b = new BigDecimal(d);
        d = b.setScale(3, BigDecimal.ROUND_DOWN).doubleValue();
        System.out.println(d);
    }
}
