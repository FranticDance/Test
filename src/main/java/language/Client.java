package language;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author lee
 * @version 1.0
 * @date 2020/4/2 9:26
 */
public class Client {
    public static String getRunPath(){
        /**
         * 方法一：获取当前可执行jar包所在目录
         */
        String filePath = System.getProperty("java.class.path");
        String pathSplit = System.getProperty("path.separator");//得到当前操作系统的分隔符，windows下是";",linux下是":"
        /**
         * 若没有其他依赖，则filePath的结果应当是该可运行jar包的绝对路径，
         * 此时我们只需要经过字符串解析，便可得到jar所在目录
         */
        if(filePath.contains(pathSplit)){
            filePath = filePath.substring(0,filePath.indexOf(pathSplit));
        }else if (filePath.endsWith(".jar")) {//截取路径中的jar包名,可执行jar包运行的结果里包含".jar"
            filePath = filePath.substring(0, filePath.lastIndexOf(File.separator) + 1);
        }
        return filePath;
    }
    public static String getJarPath(){
        /**
         * 方法二：获取当前可执行jar包所在目录
         */
        String filePath = "";
        URL url = Client.class.getProtectionDomain().getCodeSource().getLocation();
        try {
            filePath = URLDecoder.decode(url.getPath(), "utf-8");// 转化为utf-8编码，支持中文
        } catch (Exception e) {
            e.printStackTrace();
        }
        String pathSplit = System.getProperty("path.separator");
        if(filePath.contains(pathSplit)){
            filePath = filePath.substring(0,filePath.indexOf(pathSplit));
        }else if (filePath.endsWith(".jar")) {//截取路径中的jar包名,可执行jar包运行的结果里包含".jar"
            filePath = filePath.substring(0, filePath.lastIndexOf(File.separator) + 1);
        }
        /*if (filePath.endsWith(".jar")) {// 可执行jar包运行的结果里包含".jar"
            // 获取jar包所在目录
            filePath = filePath.substring(0, filePath.lastIndexOf("/") + 1);
        }*/

        File file = new File(filePath);
        filePath = file.getAbsolutePath();//得到windows下的正确路径
        return filePath;
    }
    public static String getRealPath() {

        String realPath = Client.class.getClassLoader().getResource("").getFile();

        java.io.File file = new java.io.File(realPath);

        realPath = file.getAbsolutePath();

        try {

            realPath = java.net.URLDecoder.decode(realPath, "utf-8");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return realPath;

    }

    public static void main(String[] args)throws Exception {
        //获取当前jar 的执行路径
        System.out.println(File.separator);
        System.out.println(System.getProperty("path.separator"));
        System.out.println(getJarPath());

        long l = System.currentTimeMillis();
        System.out.println(l);
        int sure = 0;
        sure = sure& 0;
        System.out.println(sure);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        concurrentLinkedQueue.add("1");
        concurrentLinkedQueue.add("2");
        concurrentLinkedQueue.add("3");
        System.out.println(concurrentLinkedQueue.size());
        concurrentLinkedQueue.poll();
        System.out.println(concurrentLinkedQueue.size());

        String dd = "2019-12-05T09:50:20.160";
        LocalDateTime parse1 = LocalDateTime.parse(dd);
        System.out.println(parse1);
        int hour = parse1.getHour();
        System.out.println(hour);
        int minute = parse1.getMinute();
        System.out.println(minute);
        LocalDate parse3 = LocalDate.ofYearDay(parse1.getYear(), parse1.getDayOfYear());
        System.out.println(parse3.toString());
        //testEnum();
        LocalTime start = LocalTime.now();
        Thread.sleep(3000);
        LocalTime end = LocalTime.now();
        long i = end.toNanoOfDay() - start.toNanoOfDay();
        System.out.println(i);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate now1 = LocalDate.now();

        LocalDate parse2 = LocalDate.parse(now1.toString(), dtf2);
        System.out.println(parse2);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate now = LocalDate.now();
        System.out.println(LocalTime.now());
        System.out.println(now);
        Date date = new Date();
        String time = now.toString();
        LocalDate parse = LocalDate.parse(time, dtf);
        System.out.println(parse);
        LocalDate plus = parse.plus(3, ChronoUnit.DAYS);
        System.out.println(plus);
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
