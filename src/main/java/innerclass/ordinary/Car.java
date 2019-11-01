package innerclass.ordinary;

/**
 * 一般的非静态内部类
 */
public class Car {
    private String fatoryName = "省港澳交通工具制造厂";
    private String name = "大奔";
    private String date = "2019-9-9";
    public class Tyre{
        private String producer = "泰国";
        public String getProducer(){
            //和匿名内部类一样，内部类中也可以随意使用外部类的成员，因为外部类的this被传入到了内部类的构造函数中。
            return this.producer + "(校对时间" + date + ")";
        }
    }

    private class Engine{
        private String producer = "德国";

        public String getProducer(){
            return producer + "(校对时间" + date + ")";
        }

    }

    public void carInfo(){
        Tyre tyre = new Tyre();
        Engine engine = new Engine();
        System.out.println("品牌:" + name +",制造厂：" + fatoryName + ",轮胎产地：" + tyre.getProducer() + ",发动机产地:" + engine.getProducer());
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.carInfo();
    }

}
