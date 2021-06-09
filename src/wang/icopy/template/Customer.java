package wang.icopy.template;

/**
 * 测试类
 */
public class Customer {

    private int age;
    private String name;

    public Customer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int age() {
        return this.age;
    }

    public String name() {
        return this.name;
    }

}
