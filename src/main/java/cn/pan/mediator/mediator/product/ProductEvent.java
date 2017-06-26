package cn.pan.mediator.mediator.product;

import java.util.Observable;

/**
 * @desc:产品事件（被观察者）
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/25
 * @todo:
 */
public class ProductEvent extends Observable{
    //事件起源
    private Product source;
    //事件类型
    private ProductEventType type;
    //传入事件的源头，默认为新建类型
    public ProductEvent(Product p){
        this(p,ProductEventType.NEW_PRODUCT);
    }

    public ProductEvent(Product p,ProductEventType type){
        this.source=p;
        this.type=type;
        //触发事件
        notifyEventDispatch();
    }

    //通知事件处理中心
    private void notifyEventDispatch() {
        super.addObserver(EventDispatch.getDispatch());
        super.setChanged();
        super.notifyObservers(source);
    }

    public Product getSource() {
        return source;
    }

    public ProductEventType getType() {
        return type;
    }
}
