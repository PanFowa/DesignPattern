package cn.pan.mediator.mediator;

/**
 * @desc:同事类
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/25
 * @todo:
 */
public abstract class AbstactColleague {
    protected AbstractMediator mediator;
    public AbstactColleague(AbstractMediator mediator){
        this.mediator=mediator;
    }
}
