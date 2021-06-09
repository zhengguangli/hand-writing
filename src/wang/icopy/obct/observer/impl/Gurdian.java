package wang.icopy.obct.observer.impl;

import wang.icopy.obct.observer.Observer;
import java.util.Objects;

/**
 * 被观察者实现1
 */
public class Gurdian implements Observer {

    @Override
    public void notify(String s) {
        if (Objects.nonNull(s) && s.contains("queen")) {
            System.out.println("You another news in London ... " + s);
        }
    }

}
