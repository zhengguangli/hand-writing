package wang.icopy.template;

/**
 * 测试类
 */
public class Database {

    /**
     * 获取Customer实列
     * @param id 用户id
     * @return 用户实列
     */
    public static Customer getCustomer(int id) {
        return new Customer();
    }

}
