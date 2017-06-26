package cn.pan.observer.thread;

import java.util.List;

/**
 * @desc:间谍
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/19
 * @todo:
 */
public class Spy extends Thread{
    private HanFeiZi hanFeiZi;
    private LiSi liSi;
    private String type;

    //通过构造函数传递参数，我要监控的是谁，谁来监控，要监控什么
    public Spy(HanFeiZi hanFeiZi,LiSi liSi,String type){
        this.hanFeiZi=hanFeiZi;
        this.liSi=liSi;
        this.type=type;
    }
    @Override
    public void run() {
        while (true){
            if ("breakfast".equals(this.type)) {//监控是否在吃早餐
                if (this.hanFeiZi.isHavingBreakfast()) {
                    this.liSi.update("韩非子在吃饭");
                    //重置状态，继续监控
                    this.hanFeiZi.setHavingBreakfast(false);
                }

            } else {
                if (this.hanFeiZi.isHavingFun()) {
                    this.liSi.update("韩非子在娱乐");
                    //重置状态，继续监控
                    this.hanFeiZi.setHavingFun(false);
                }
            }
        }

    }
}
