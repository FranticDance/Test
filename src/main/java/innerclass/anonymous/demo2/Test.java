package innerclass.anonymous.demo2;

public class Test {
    //内部类中引用的外部类成员变量，没有final的限制
    private String fatoryName = "省港澳交通工具制造厂";
    private void say(){
        System.out.println("Test...");
    }

    public Vehicle getVehicle(Test a){
        //fatoryName = "大西部交通工具制造厂";
        String date = "2018年夏天，";
        int price = 1000;
        //date = "2018年秋天，";//内部类中引用的外部局部变量，必须是final，Java8中可以不显示声明为final，但是依然不能更改其值，否则编译不通过
        //匿名内部类的语句。其实质是创建了一个继承了Vehicle的类，并new出了实例并返回。 由于这个类没有名字，故而称为匿名
        return new Vehicle(){
            private String name = "汽车";
            @Override
            public void run() {
                System.out.println(date + fatoryName + "制造出" + name + "正在运行" + ",价格" + price);
                //内部类之所以可以调用外部类的方法，是因为内部类中会隐式持有一个指向外部类的指针
                say();
            }
        };
    }

    public static void main(String[] args) {
        Test test = new Test();
        Vehicle vehicle = test.getVehicle(test);
        vehicle.run();
    }
}
