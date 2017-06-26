package cn.pan.observer.common;

import cn.pan.observer.mutipleObserver.Observer;

import java.util.Vector;

/**
 * @desc:被观察者
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/19
 * @todo:
 */
public abstract class Subject {
    private Vector<Observer> observers = new Vector<Observer>();
    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void delObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(String context){
        for(Observer o:observers){
            o.update(context);
        }
    }
}
