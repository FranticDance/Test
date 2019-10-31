package link;

import java.text.Normalizer;
import java.util.concurrent.ArrayBlockingQueue;

public class Client {
    public static void main(String[] args) {
        /*Client client = new Client() {

        };*/

      /*  Node node = ChainBuilder.buildChain(5);
        System.out.println(11);
        System.err.println("waqu");
        test(100, "bb");*/

        ArrayBlockingQueue<String> strings = new ArrayBlockingQueue<>(2);
        strings.offer("1");
        String peek = strings.poll();
        int i2 = strings.remainingCapacity();
        System.out.println(i2);
        boolean offer1 = strings.offer("2");
        System.out.println(offer1);
        int i = strings.remainingCapacity();
        System.out.println(i);
        boolean offer = strings.offer("3");
        System.out.println(offer);

        String filePath = "C:\\Users\\lee\\Desktop\\hosts.bak";
        String normalize = Normalizer.normalize(filePath, Normalizer.Form.NFKC);
        System.out.println(normalize);

    }
    private static void test(int a ,String b){
        System.out.println(a);
        System.out.println(b);
    }
}
