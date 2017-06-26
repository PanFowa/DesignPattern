package cn.pan.observer.correct;

import cn.pan.observer.ILiSi;

/**
 * @desc:
 * 观察者
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/19
 * @todo:
 */
public class LiSi implements ILiSi {
    //李斯是观察者，一旦韩非子有活动，李斯知道自己要向秦始皇报告
    public void update(String context) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了....");
        this.reportToQinShiHunang(context);
        System.out.println("李斯：汇报完毕");
    }

    private void reportToQinShiHunang(String context) {
        System.out.println("李斯：韩非子有活动-->"+context);
    }
}
