package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lee
 * @version 1.0
 * @date 2019/12/23 14:25
 */
public class Test {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new Thread21());
        exec.execute(new Thread22());
        exec.shutdown();
    }

}

class Thread21 extends Thread{
    public void run(){
        System.out.println("thread21");
        synchronized (SyncObject2.a) {
            int a = SyncObject2.a;
            System.out.println("thread21:" + a);
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            a++;
            SyncObject2.a = a;
            System.out.println("thread21   "+SyncObject2.a);
        }

    }
}
class Thread22 extends Thread{
    public void run(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("thread22");
        SyncObject2.a = 12;
        System.out.println("thread22   "+SyncObject2.a);
    }
}
class SyncObject2{
    public  static  Integer a = 0;
}
