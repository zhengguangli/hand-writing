package wang.icopy.obct.subject;

import wang.icopy.obct.observer.Observer;

/**
 * 观察者
 */
public interface Subject {

    void registerObserver(Observer observer);
    
    void notifyObServers(String s);

}
