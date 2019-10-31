package innerclass.part.demo1;

public class PartInnerClass {
    private String name = "汽车";
    public void run(){
        //定义了一个局部内部类
        class Car implements Vehicle{

            @Override
            public void run() {
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
