package wang.icopy.function;

/**
 * 函数测试类
 * 
 * @author lizhengguang
 * @date 20210617
 */
public class FunctionTest {

    public static void main(String[] args) {

        functionUseTest();

    }

    private static void boom() {
        int fnum = 10_000;
        Function<Integer, Integer> g = x -> x;
        Function<Integer, Integer> f = x -> x + 1;

        for (int i = 0; i < fnum; i++) {
            g = FunctionTest.compose(f, g);
        }

        System.out.println(g.apply(0));
    }

    public static void functionUseTest() {
        Function<Integer, Integer> triple = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer arg) {
                return arg * 3;
            }
        };

        // 12
        System.out.println(triple.apply(4));

        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer arg) {
                return arg * arg;
            }
        };

        // 16
        System.out.println(square.apply(4));

        // 48
        System.out.println(compose(triple, square).apply(4));
    }

    /**
     * compose复合函数
     * 
     * @param f1
     * @param f2
     * @return
     */
    static Function<Integer, Integer> compose(Function<Integer, Integer> f1, Function<Integer, Integer> f2) {
        return new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer arg) {
                return f1.apply(f2.apply(arg));
            }
        };

    }

    /**
     * Lambda版本compose复合函数
     * 
     * @param f1
     * @param f2
     * @return
     */
    static Function<Integer, Integer> compose2(Function<Integer, Integer> f1, Function<Integer, Integer> f2) {
        return arg -> f1.apply(f2.apply(arg));
    }
}
