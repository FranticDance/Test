package thread;

import java.io.UnsupportedEncodingException;

/**
 * @author lee
 * @version 1.0
 * @date 2020/5/18 10:35
 */
public class ScheduledExecutorServiceTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("task finish time: " + LocalDateTime.now().toString());
        }, 3000L, 1000L, TimeUnit.MILLISECONDS);

        while (true){

        }*/

        String a= "\\x80\\x13";
        String gbk = new String(a.getBytes(), "GBK");
        System.out.println(gbk);
        System.out.println(unicode2String(a));
    }

    /**
     * 16进制转换成为string类型字符串
     * @param s
     * @return
     */
    public static String hexStringToString(String s) {
        if (s == null || s.equals("")) {
            return null;
        }
        s = s.replace(" ", "");
        byte[] baKeyword = new byte[s.length() / 2];
        for (int i = 0; i < baKeyword.length; i++) {
            try {
                baKeyword[i] = (byte) (0xff & Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            s = new String(baKeyword, "UTF-8");
            new String();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return s;
    }

    /**
     * unicode 转字符串
     */
    public static String unicode2String(String unicode) {
        StringBuffer string = new StringBuffer();
        String[] hex = unicode.split("\\\\u");
        for (int i = 1; i < hex.length; i++) {
            // 转换出每一个代码点
            int data = Integer.parseInt(hex[i], 16);
            // 追加成string
            string.append((char) data);
        }
        return string.toString();
    }
}
