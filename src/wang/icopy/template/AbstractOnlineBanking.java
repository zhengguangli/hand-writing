package wang.icopy.template;

import java.util.function.Consumer;

/**
 * 定义抽象类实现模板方法
 */
public abstract class AbstractOnlineBanking {

    abstract void makeCustomerHappy(Customer customer);

    /**
     * 使用抽象方法定义模板方法
     * 
     * @param id 用户id
     */
    public void processCustomer(int id) {
        Customer customer = Database.getCustomer(id);
        makeCustomerHappy(customer);
    }

    /**
     * 使用Lambda定义模板方法
     * 
     * @param id                用户id
     * @param makeCustomerHappy Consumer Function
     */
    public void processCustomer(int id, Consumer<Customer> makeCustomerHappy) {
        Customer customer = Database.getCustomer(id);
        makeCustomerHappy.accept(customer);
    }
}