package thread;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lee
 * @version 1.0
 * @date 2019/12/26 11:49
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> strings = new ArrayList<>();
       /* new Thread(() -> {
            strings.add("1");
            System.out.println(Thread.currentThread().getName() + ":" + strings);
        }, "A").start();

        new Thread(() -> {
            strings.add("2");
            System.out.println(Thread.currentThread().getName() + ":" + strings);
        }, "B").start();

        Thread.sleep(2000);*/
        System.out.println("LocalDate.now() = " + LocalDate.now());
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());

        HashMap<String, String> map = new HashMap<>();
        map.put("a", "b");
        map.put("a1", "b2");
        map.put("a2", "b4");
        map.put("a3", "b3");
        map.forEach((s, s2) -> {
            try {
                if(s == "a2"){
                    throw new RuntimeException("自定义异常");
                }
            }catch (Exception e){
                System.out.println("抓到异常" + e.getMessage());
            }
            System.out.println(s + "," + s2);

        });


        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        FixedSchedule fixedSchedule = new FixedSchedule();
        scheduledThreadPoolExecutor.scheduleAtFixedRate(fixedSchedule, 1, 1, TimeUnit.SECONDS);
        Thread.sleep(5000);
        scheduledThreadPoolExecutor.shutdown();
       /* for (int i = 0; i < 1000; i++) {
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new FixedSchedule(), 1, 1, TimeUnit.SECONDS);
        }*/
        /*for (int i = 0; i < 1000; i++) {
            scheduledThreadPoolExecutor.submit(new FixedSchedule());
        }*/

    }
}

class FixedSchedule implements Runnable {
    private int i = 0;
    @Override
    public void run(){
        //try {
            i ++;
            System.out.println("当前线程："+Thread.currentThread().getName()+"  当前时间："+new Date(System.currentTimeMillis()));
            System.out.println("i=" + i);
            if(i == 2){
                throw new RuntimeException("测试抛出异常");
            }
        /*}catch (Exception e){
            System.out.println("子线程发生异常:" + e.getMessage());
        }*/
    }
}
