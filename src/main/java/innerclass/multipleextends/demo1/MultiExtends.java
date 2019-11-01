package innerclass.multipleextends.demo1;

/**
 * 内部类实现多重继承方式1:
 *
 * 这种方式是外部类继承了一个，再用匿名内部类继承了一个(如果再用一个匿名类，那就又继承了一个，依次类推)
 *
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

class C extends A{
    @Override
    public void sayHello(){
        System.out.println("override hello class A " + super.str);
    }

    public void sayHi(){
        new B(){
            @Override
            public void sayHi() {
                System.out.println("override hi class B " + super.str);
            }
        }.sayHi();
    }
}


