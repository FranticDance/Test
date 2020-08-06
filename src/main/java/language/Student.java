package language;

/**
 * @author lee
 * @version 1.0
 * @date 2020/4/2 9:19
 */
public enum Student implements IHello{
    /**
     * 枚举类深入理解使用：枚举类，类的对象只有有限个，是确定的。其实枚举类，就是一个小型的数据库，比如可以理解为
     * MySQL中的一张表。那么第一点，既然枚举类是一张表，那么里面的值或者数据就是固定的；第二点，
     * 每一个枚举值，比如下面的张三李四王五，就代表表中的每一行数据，在使用枚举类是，就可以拿出
     * 需要的枚举值，来获取其中的字段。第三点，枚举类中的每个枚举值，其实就是枚举类的实例
     *
     * 另外：枚举类是jdk1.5引入，在引入之前，如果想要使用类似的特性，是需要自定义枚举类的。具体
     * 代码可以参见本包中的 Student1。对比两者，就可以看到，枚举类是怎么产生的，和枚举类为什么
     * 会这么写。其中，每个枚举值，就相当于之前自定义枚举类时自己new出来的内部私有实例，也因为这
     * 个原因，每个枚举值括号里面的值，也就对应传给了构造方法。并且由于
     * 值是固定不变的，所以属性被声明为了final，禁止更改，构造方法也是私有的，禁止new。
     *
     * 自定义枚举类到enum，写法上的变化是，首先声明的class，变成了enum关键字，
     * 然后自定义枚举类中的若干静态final实例，由于大家都是public static final xxxx 类型的 ,因此省略，
     * 同时也都是new xxxx，也省略，然后Java规定必须放在枚举类的开头，因此就成了下面张三李四王五这样的声明方式。
     * 其他的，构造函数，同样是默认私有的，private可写可不写，但是不能声明为其他比如public。Java规定，枚举类
     * 没有public构造函数
     */

    /**
     * 张三
     */
    ZHANGSAN("111", "zhangsan", 22){
        @Override
        public void sayHello() {
            System.out.println(this.getName() + " say hello");
        }
    },
    /**
     * 李四
     */
    LISI("112", "lisi", 33){
        @Override
        public void sayHello() {
            System.out.println(this.getName() + " say hi");
        }
    },
    /**
     * 王五
     */
    WANGWU("113", "wangwu", 23){
        @Override
        public void sayHello() {
            System.out.println(this.getName() + " say ohoh");
        }
    };

    private Student(String id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    private final String id;
    private final String name;
    private final int age;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

interface IHello{
    void sayHello();
}
