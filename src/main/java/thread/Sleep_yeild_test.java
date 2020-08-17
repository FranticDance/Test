package thread;

/**
 * @author lee
 * @version 1.0
 * @date 2020/8/6 22:52
 */
public class Sleep_yeild_test {
    public static void main(String[] args) {
        testSleep();

        Thread.State aNew = Thread.State.NEW;
        Thread.State runnable = Thread.State.RUNNABLE;
        Thread.State terminated = Thread.State.TERMINATED;
        Thread.State blocked = Thread.State.BLOCKED;
        Thread.State waiting = Thread.State.WAITING;
        Thread.State timedWaiting = Thread.State.TIMED_WAITING;
    }

    public static void testSleep(){
        Thread thread = new Thread(() -> {
            try {
                System.out.println("sleep...");
                Thread.sleep(30000);
                System.out.println("run run run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        int i = 0;
        while (true){
            System.out.println(thread.getState().toString());
            i++;
            if(i > 20){
                break;
            }
        }

    }

}
