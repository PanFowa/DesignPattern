package cn.pan.observer.mutipleObserver;



/**
 * @desc:多个观察者
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/19
 * @todo:
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        //三个观察者
        Observer liSi=new LiSi();
        Observer wangSi=new WangSi();
        Observer liuSi=new LiuSi();

        HanFeiZi hanFeiZi=new HanFeiZi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);
        //韩非子开始有活动了
        //韩非子开始吃饭
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
