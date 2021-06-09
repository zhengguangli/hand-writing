package wang.icopy.template;

/**
 * lambda实现模板方法测试类
 */
public class OnlineBankingTest {
    public static void main(String[] args) {
        new OnlineBanking().processCustomer(1, c -> System.out.print(c.age() + " : " + c.name()));
    }
}
