package cn.pan.observer.observJava;

import cn.pan.observer.IHanFeiZi;
import cn.pan.observer.ILiSi;
import cn.pan.observer.correct.LiSi;

import java.util.Observable;

/**
 * @desc:
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/19
 * @todo:
 */
public class HanFeiZi extends Observable implements IHanFeiZi {


    public void haveBreakfast() {
        System.out.println("韩非子开始吃饭了");
        //通知所有的观察者
        super.setChanged();
        //通知观察者
        super.notifyObservers("韩非子在吃饭...");
    }

    public void haveFun() {
        System.out.println("韩非子开始娱乐了");
        //通知所有的观察者
        super.setChanged();
        //通知观察者
        super.notifyObservers("韩非子在娱乐...");
    }

}
