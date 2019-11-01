package innerclass.multipleextends.demo2;


/**
 * 实现多重继承的第二种形式
 * 使用一般的非静态内部类
 */
public class MultiExtends {
    public static void main(String[] args) {
        C c = new C();
        c.sayHello();
        c.sayHi();
    }

}

class A{
    protected String str = "我是A的成员";

    public String getStr() {
        return str;
    }

    public void sayHello(){
        System.out.println("hello class A " + str);
    }
}
class B{
    protected String str = "我是B的成员";
    public void sayHi(){
        System.out.println("hi class B " + str);
    }

}

class C {
    private class A1 extends A{
        @Override
        public void sayHello() {
            System.out.println("hello A1 " + super.str);
        }
    }
    private class B1 extends B{
        @Override
        public void sayHi() {
            System.out.println("hello B1 " + super.str);
        }
    }

    public void sayHello(){
        new A1().sayHello();
    }

    public void sayHi(){
        new B1().sayHi();
    }
}

