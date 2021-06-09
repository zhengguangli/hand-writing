package wang.icopy.template;

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

}