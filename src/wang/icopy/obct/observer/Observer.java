package wang.icopy.obct.observer;

/**
 * 观察者接口
 * 用于将不同的观察者聚集在一起，定义notify方法
 */
public interface Observer {
    /**
     * 通知方法
     * 
     * @param s
     */
    void notify(String s);
}
