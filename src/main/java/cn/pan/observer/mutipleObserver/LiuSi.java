package cn.pan.observer.mutipleObserver;

/**
 * @desc:
 * 观察者
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/19
 * @todo:
 */
public class LiuSi implements Observer {
    //刘斯是观察者，一旦韩非子有活动，刘斯知道自己要向秦始皇报告
    public void update(String context) {
        System.out.println("刘斯：观察到韩非子活动了....");
        this.happy(context);
        System.out.println("刘斯：高兴啊");
    }

    private void happy(String context) {
        System.out.println("因为 "+context+"，高兴得不得了");
    }

}
