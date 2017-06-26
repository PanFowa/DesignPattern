package cn.pan.mediator.sales;

/**
 * @desc:采购管理
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/24
 * @todo:
 */
public class Purchase {
    /**
     * 采购电脑
     * @param number
     */
    public void buyIBMcomputer(int number){
        //访问库存
        Stock stock=new Stock();
        //访问销售
        Sale sale=new Sale();
        //电脑销售情况
        int saleStatus=sale.getSaleStatus();
        //销售好，则进行采购
        if(saleStatus>80){
            //采购后进行入库
            stock.increase(number);
        }else{
            //销售不好，则折半采购
            int buyNumber=number/2;
            System.out.println("采购IBM电脑"+buyNumber+"台");
        }
    }

    public void refuseBuyIBM(){
        System.out.println("不再采购电脑...");
    }
}
