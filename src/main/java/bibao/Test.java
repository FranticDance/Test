package bibao;

public class Test {
    public static void main(String[] args) {
    /*    BiBao.Inner2 inner2 = new BiBao.Inner2();//静态内部类，可以通过外部类直接new出对象。
        System.out.println(inner2.add());
        BiBao.Inner2.add2();
        BiBao biBao1 = new BiBao();
        biBao1.method3();*/
        //BiBao.method2();
        BiBao biBao1 = new BiBao();
        InterfaceA obj = biBao1.getInner2();
        obj.sayHello();

        //BiBao.Inner inner = new BiBao.Inner();//非静态内部类，不能直接new,必须像下面这样先new 外部类的对象，然后通过外类对象实例去new 内部类对象
        BiBao biBao = new BiBao();
        BiBao.Inner inner = biBao.new Inner();


    }
}
