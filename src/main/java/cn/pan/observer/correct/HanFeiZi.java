package cn.pan.observer.correct;

import cn.pan.observer.IHanFeiZi;
import cn.pan.observer.ILiSi;

/**
 * @desc:
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/19
 * @todo:
 */
public class HanFeiZi implements IHanFeiZi {
    //把李斯声明出来
    private ILiSi liSi = new LiSi();

    public void haveBreakfast() {
        System.out.println("韩非子开始吃饭了");
        //通知李斯
        this.liSi.update("韩非子在吃饭...");
    }

    public void haveFun() {
        System.out.println("韩非子开始娱乐了");
        //通知李斯
        this.liSi.update("韩非子在娱乐...");
    }

}
