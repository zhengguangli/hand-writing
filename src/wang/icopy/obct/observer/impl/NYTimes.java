package wang.icopy.obct.observer.impl;

import wang.icopy.obct.observer.Observer;

/**
 * 被观察者实现3
 */
public class NYTimes implements Observer {

    @Override
    public void notify(String s) {

        if (s != null && s.contains("money")) {
            System.out.println("Breaking news in NY! " + s);
        }

    }

}
