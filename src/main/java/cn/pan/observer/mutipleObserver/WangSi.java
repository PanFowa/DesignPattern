package cn.pan.observer.mutipleObserver;

/**
 * @desc:
 * 观察者
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/19
 * @todo:
 */
public class WangSi implements Observer {
    //王斯是观察者，一旦韩非子有活动，王斯知道自己要向秦始皇报告
    public void update(String context) {
        System.out.println("王斯：观察到韩非子活动了....");
        this.cry(context);
        System.out.println("王斯：哭死了");
    }

    private void cry(String context) {
        System.out.println("因为 "+context+"，悲伤啊");
    }
}
