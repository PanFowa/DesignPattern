package cn.pan.mediator.mediator;

/**
 * @desc:采购管理
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/24
 * @todo:
 */
public class Purchase extends AbstactColleague{

    public Purchase(AbstractMediator mediator){
        super(mediator);
    }
    /**
     * 采购电脑
     * @param number
     */
    public void buyIBMcomputer(int number){
        super.mediator.excute("purchase.buy", number);
    }

    public void refuseBuyIBM(){
        System.out.println("不再采购电脑...");
    }
}
