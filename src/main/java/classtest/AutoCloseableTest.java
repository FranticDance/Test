package classtest;

/**
 * @author lee
 * @version 1.0
 * @date 2019/12/24 16:48
 */
public class AutoCloseableTest {
    public static void main(String[] args) throws InterruptedException {
        new Thread(() ->{
            Runtime.getRuntime().addShutdownHook(new Thread(()->{
                System.out.println("执行钩子2");
            }));
        }).start();
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("执行钩子");
        }));
        Thread.sleep(2222);
        try( MyResource myResource = new MyResource()) {
            myResource.readResource();
        } catch (Exception e) {

        }
    }



}

class MyResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("close resource");
    }

    public void readResource() {
        System.out.println("read resource");
    }

}

class MyResource2 implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("close resource2");
    }

    public void readResource() {
        System.out.println("read resource2");
    }

}
