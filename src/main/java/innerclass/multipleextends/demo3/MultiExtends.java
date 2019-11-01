package innerclass.multipleextends.demo3;

/**
 * 使用内部类实现多重继承的第三种形式
 * 通过匿名内部类
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

class C{
    public void sayHi(){
        new B(){
            @Override
            public void sayHi() {
                System.out.println("override hi class B " + super.str);
            }
        }.sayHi();
    }

    public void sayHello(){
        new A(){
            @Override
            public void sayHello() {
                System.out.println("override hello class A " + super.str);
            }
        }.sayHello();
    }
}
