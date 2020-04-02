package innerclass.anonymous.demo5;

/**
 * @author lee
 * @version 1.0
 * @date 2020/3/20 11:26
 */
public class Client implements InterfaceA {
    @Override
    public void compute() {
        MethodB methodB = new MethodB();
        methodB.compute();
        MethodC methodC = new MethodC();
        methodC.compute();
        System.out.println("+");
    }

    private class MethodB implements InterfaceA{

        @Override
        public void compute() {
            System.out.println("-");
        }
    }
    class MethodC implements InterfaceA{

        @Override
        public void compute() {
            System.out.println("*");
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.compute();
    }
}
