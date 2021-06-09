package wang.icopy.obct;

import wang.icopy.obct.observer.impl.NYTimes;
import wang.icopy.obct.observer.impl.LeMonde;
import wang.icopy.obct.observer.impl.Gurdian;
import wang.icopy.obct.subject.Feed;

/**
 * 观察者模式测试类
 */
public class ObServerTest {
    public static void main(String[] args) {
        Feed feed = new Feed();
        feed.registerObserver(new Gurdian());
        feed.registerObserver(new LeMonde());
        feed.registerObserver(new NYTimes());

        feed.notifyObServers("Hello queen");
        feed.notifyObServers("Hello wine");
        feed.notifyObServers("Hello wine");
    }
}
