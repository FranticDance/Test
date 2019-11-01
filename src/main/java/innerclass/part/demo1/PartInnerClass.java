package innerclass.part.demo1;

/**
 * 局部类
 */
public class PartInnerClass {
    private String name = "汽车";
    public void run(){
        //定义了一个局部内部类
        class Car implements Vehicle{

            @Override
            public void run() {
                //局部内部类中依然可以访问外部类的任何成员。这一点和匿名内部类，普通内部类原理相同
                System.out.println(name + "正在运行");
            }
        }
        Car car = new Car();
        car.run();

    }

    public static void main(String[] args) {
        PartInnerClass partInnerClass = new PartInnerClass();
        partInnerClass.run();
    }
}
