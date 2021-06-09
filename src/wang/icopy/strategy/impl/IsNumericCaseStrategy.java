package wang.icopy.strategy.impl;

import wang.icopy.strategy.ValidationStrategy;

public class IsNumericCaseStrategy implements ValidationStrategy {

    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }

}
