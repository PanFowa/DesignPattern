package cn.pan.mediator.mediator;

/**
 * @desc:中介者
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/24
 * @todo:
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;
    public AbstractMediator(){
        purchase=new Purchase(this);
        sale=new Sale(this);
        stock=new Stock(this);
    }
    public abstract void excute(String str, Object...objects);
}
