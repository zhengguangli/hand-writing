package wang.icopy.template;

import java.util.function.Consumer;

public class OnlineBanking {

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
