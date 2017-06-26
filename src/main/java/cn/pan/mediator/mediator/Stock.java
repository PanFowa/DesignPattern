package cn.pan.mediator.mediator;

/**
 * @desc:库存
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/24
 * @todo:
 */
public class Stock extends AbstactColleague{
    //刚开始有100台电脑
    private static int COMPUTER_NUMBER=100;
    public Stock(AbstractMediator mediator){
        super(mediator);
    };
    //库存增加
    public void increase(int number) {
        COMPUTER_NUMBER+=number;
        System.out.println("库存数量为:"+COMPUTER_NUMBER);
    }
    //库存降低
    public void decrease(int number){
        COMPUTER_NUMBER-=number;
        System.out.println("库存数量为:"+COMPUTER_NUMBER);
    }

    //库存压力大，则通知采购不要采购，通知销售尽快销售
    public void clearStock(){
        System.out.println("清理存货数量为:"+COMPUTER_NUMBER);
        super.mediator.excute("stock.clear");
    }

    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }
}
