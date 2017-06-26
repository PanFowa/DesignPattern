package cn.pan.observer;

/**
 * @desc:观察者模式（使用线程实现）
 * 观察者的接口
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/19
 * @todo:
 */
public interface ILiSi {
    //被观察者状态改变，自己也要行动起来
    public void update(String context);
}
