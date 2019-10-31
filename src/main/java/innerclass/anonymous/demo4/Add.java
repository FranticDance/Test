package innerclass.anonymous.demo4;

/**
 * Add的实例对add()方法形成了闭包
 */
public class Add {
    private int a = 1;
    public void add(){
        int b = 2;
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Add add = new Add();
        add.add();
    }
}
