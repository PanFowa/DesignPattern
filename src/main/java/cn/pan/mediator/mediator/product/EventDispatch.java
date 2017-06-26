package cn.pan.mediator.mediator.product;


import java.util.Observable;
import java.util.Observer;

/**
 * @desc:观察者
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/25
 * @todo:
 */
public class EventDispatch implements Observer {
    private final static EventDispatch dispatch=new EventDispatch();
    //不允许生成新的实例
    private EventDispatch(){}
    //获得单例对象
    public static EventDispatch getDispatch(){
        return dispatch;
    }
    public void update(Observable o, Object arg) {

    }
}
