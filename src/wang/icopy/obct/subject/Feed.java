
package wang.icopy.obct.subject;

import java.util.List;
import java.util.ArrayList;
import wang.icopy.obct.observer.Observer;

/**
 * 观察者实现类
 */
public class Feed implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    /**
     * 调用订阅者发布通知
     */
    @Override
    public void notifyObServers(String s) {
        observers.forEach(ob -> ob.notify(s));
    }

    /**
     * 注册订阅者
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

}
