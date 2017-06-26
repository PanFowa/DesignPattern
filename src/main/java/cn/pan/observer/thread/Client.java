package cn.pan.observer.thread;

/**
 * @desc:使用线程实现间谍的坏处。while（true）导致cpu 100%
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/19
 * @todo:
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        //定义出韩非子和李斯
        LiSi liSi=new LiSi();
        HanFeiZi hanFeiZi=new HanFeiZi();

        //观察早餐
        Spy spyBreakfast = new Spy(hanFeiZi,liSi,"breakfast");
        //开始开启线程，监控
        spyBreakfast.start();

        //观察娱乐情况
        Spy spyFun = new Spy(hanFeiZi,liSi,"fun");
        //开始开启线程，监控
        spyFun.start();

        //间谍已派出并开始监控
        //1秒后韩非子的活动情况
        Thread.sleep(1000);
        //韩非子开始有活动了
        //韩非子开始吃饭
        hanFeiZi.haveBreakfast();

        //过了一秒，韩非子开始娱乐
        Thread.sleep(1000);
        hanFeiZi.haveFun();
    }
}
