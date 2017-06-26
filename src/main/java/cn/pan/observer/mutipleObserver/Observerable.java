package cn.pan.observer.mutipleObserver;

/**
 * @desc:
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/19
 * @todo:
 */
public interface Observerable {
    void addObserver(Observer observer);
    void delObserver(Observer observer);

    void notify(String context);
}
