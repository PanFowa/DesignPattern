package cn.pan.observer.mutipleObserver;

import cn.pan.observer.IHanFeiZi;
import cn.pan.observer.ILiSi;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc:
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/19
 * @todo:
 */
public class HanFeiZi implements IHanFeiZi,Observerable {
    //对韩非子活动感兴趣的不止李斯，所以可以有多个观察者
    private List<Observer> observers = new ArrayList<Observer>();

    public void haveBreakfast() {
        System.out.println("韩非子开始吃饭了");
        //通知观察者
        this.notify("韩非子在吃饭...");
    }

    public void haveFun() {
        System.out.println("韩非子开始娱乐了");
        //通知观察者
        this.notify("韩非子在娱乐...");
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void delObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notify(String context) {
        for (Observer observer:this.observers){
            observer.update(context);
        }
    }
}
