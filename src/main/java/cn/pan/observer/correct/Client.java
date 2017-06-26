package cn.pan.observer.correct;



/**
 * @desc:对线程类的修正（目前只能有一个观察者，但实际情况没这么简单，在多观察者中进行了修正）
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/19
 * @todo:
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        HanFeiZi hanFeiZi=new HanFeiZi();
        //韩非子开始有活动了
        //韩非子开始吃饭
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
