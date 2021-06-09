package wang.icopy.strategy.impl;

import wang.icopy.strategy.ValidationStrategy;

public class IsAllLowerCaseStrategy implements ValidationStrategy {

    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }

}
