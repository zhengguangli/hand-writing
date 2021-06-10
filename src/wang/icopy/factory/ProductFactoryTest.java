package wang.icopy.factory;

import java.util.Map;
import java.util.HashMap;
import java.util.function.Supplier;

public class ProductFactoryTest {
    final static Map<String, Supplier<Product>> map = new HashMap<>();

    static {
        map.put("bond", Bond::new);
        map.put("loan", Loan::new);
        map.put("stock", Stock::new);
    }

    public static void main(String[] args) {

        test();

    }

    public static void test() {
        Product product = ProductFactory.createProduct("bond");
        System.out.println(product.toString());
    }

    public static void test1() {
        Supplier<Product> bond = map.get("bond");
        Product p = bond.get();
        System.out.println(p.toString());
    }
}
