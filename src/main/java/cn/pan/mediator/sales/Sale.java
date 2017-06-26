package cn.pan.mediator.sales;

import java.util.Random;

/**
 * @desc:销售
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/24
 * @todo:
 */
public class Sale {
    private int saleStatus;
    public void sellIBMComputer(int number){
        //访问库存
        Stock stock=new Stock();
        //访问采购
        Purchase purchase=new Purchase();

        //库存是否足够
        if(stock.getStockNumber()<number){
            purchase.buyIBMcomputer(number);
        }

        System.out.println("销售IBM电脑"+number+"台");
        stock.decrease(number);
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
        Stock stock=new Stock();
        System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
    }
}
