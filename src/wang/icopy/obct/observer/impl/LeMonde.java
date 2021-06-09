package wang.icopy.obct.observer.impl;

import java.util.Objects;
import wang.icopy.obct.observer.Observer;

/**
 * 被观察者实现2
 */
public class LeMonde implements Observer {

    @Override
    public void notify(String s) {
        if (Objects.nonNull(s) && s.contains("wine")) {
            System.out.println("Today Cheese, wine and news. " + s);
        }
    }
}
