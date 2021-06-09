package wang.icopy.strategy;

import wang.icopy.strategy.impl.IsAllLowerCaseStrategy;
import wang.icopy.strategy.impl.IsNumericCaseStrategy;

public class StrategyTest {
    public static void main(String[] args) {

        test2();

    }

    public static void test1() {
        Validator isAllLowerValidator = new Validator(new IsAllLowerCaseStrategy());
        boolean b1 = isAllLowerValidator.validate("ssss");
        System.out.println(b1);

        Validator isNumericValidator = new Validator(new IsNumericCaseStrategy());
        boolean b2 = isNumericValidator.validate("12312312s");
        System.out.println(b2);
    }

    public static void test2() {
        Validator isAllLowerValidator = new Validator(s -> s.matches("[a-z]+"));

        boolean b1 = isAllLowerValidator.validate("ssSss");
        System.out.println(b1);

        Validator isNumericValidator = new Validator(s -> s.matches("\\d+"));
        boolean b2 = isNumericValidator.validate("12312312s");
        System.out.println(b2);
    }
}
