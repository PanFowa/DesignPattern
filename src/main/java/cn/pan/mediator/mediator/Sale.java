package cn.pan.mediator.mediator;

import java.util.Random;

/**
 * @desc:销售
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/24
 * @todo:
 */
public class Sale extends AbstactColleague{
    private int saleStatus;
    public Sale(AbstractMediator mediator){
        super(mediator);
    }
    public void sellIBMComputer(int number){
        super.mediator.excute("sale.sell",number);
    }
    //反馈销售情况 0-100之间变化。0代表没有销售，100代表销售非常好
    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int status=random.nextInt(100);
        System.out.println("IBM电脑的销售情况为："+status);
        return saleStatus;
    }

    //折价销售。
    public void offSale() {
        //库存有多少卖多少
        super.mediator.excute("sale.offsell");
    }
}
