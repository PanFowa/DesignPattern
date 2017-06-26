package cn.pan.observer.observJava;

import cn.pan.observer.ILiSi;

import java.util.Observable;
import java.util.Observer;

/**
 * @desc:
 * 观察者
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/19
 * @todo:
 */
public class LiSi implements Observer {
    private void reportToQinShiHuang(String context) {
        System.out.println("李斯：韩非子有活动-->"+context);
    }
    public void update(Observable o, Object arg) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了....");
        this.reportToQinShiHuang(arg.toString());
        System.out.println("李斯：汇报完毕");
    }
}
