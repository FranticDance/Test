package language;

/**
 * 自定义枚举类。主要是用于JDK1.5之前没有枚举类的时候。
 * @author lee
 * @version 1.0
 * @date 2020/4/2 9:48
 */
class Student1{
    /**
     * 1.私有化成员变量，使得获取的Student1实例，不能更改其属性值。因为枚举类的使用场景就是值是固定的场景。
     */
    private final String id;
    private final String name;
    private final int age;

    /**
     * 2.私有化构造函数。并为属性赋值
     * @param id
     * @param name
     * @param age
     */
    private Student1(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * 3.提供若干静态final实例，public static final使之可以 Student1类名直接访问，并且不能被更改引用，配合
     * 上面成员变量是private final，使之也不能通过引用改里面的属性值
     */
    public static final Student1 ZHANGSAN = new Student1("111", "zhangsan", 22);
    public static final Student1 LISI = new Student1("112", "lisi", 33);
    public static final Student1 WANGWU = new Student1("113", "wangwu", 55);

    /**
     * 4.提供get方法，使之可以通过实例获取其属性值
     * @return
     */
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /**
     * 5.还可以重写toString，不然实例调用toString，打印的是地址值
     */
    @Override
    public String toString() {
        return "Student1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
