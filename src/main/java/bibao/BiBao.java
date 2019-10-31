package bibao;

public class BiBao {
    private int b = 30;
    private static int x = 20;
    private Inner2 inner2 = new Inner2();

    interface cc{

    }

    public Inner2 getInner2() {
        return inner2;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void method4(){
        Inner2 inner2 = new Inner2();
        System.out.println(inner2.mm);
    }
    private static void method1(){
        System.out.println("method 1...");
    }
    public static void method2(){
        Inner2.add2();
        System.out.println("method 2...");
    }
    public void method3(){
        Inner2.add2();
    }

    public int getB() {
        return b;
    }

    class Inner{
        private int a = 10;
        public int add(){
            return a + b;
        }
    }



      private static class Inner2 implements InterfaceA{
        interface a{

        }
        {

        }
        public static int hh = 2;
        private int mm = 3;
        public int add(){
            //return x + b; //静态内部类，不能访问外部类的非静态成员变量
            method2();
            method1();
            return x;
        }
        public static void add2(){
            System.out.println(x);
            System.out.println("Inner2 add2 ...");
        }

          @Override
          public void sayHello() {
              System.out.println("hello Inner2");
          }
      }



}
