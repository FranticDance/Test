package link;

public class ChainBuilder {
    public static Node buildChain(int number) {
        /*Node last = new Node() {
            String name = "last";
        };*/
        Node last = null;
        for (int i = number; i >= 0; i--) {
            final Node next = last;
            final int index = i;
            last = new Node() {
                String name = "name" + index;
                Node temp = next;
            };

        }
        return last;
    }
}
