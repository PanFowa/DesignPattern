package cn.pan.mediator.mediator;



/**
 * @desc:
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/24
 * @todo:
 */
public class Mediator extends AbstractMediator{
    public void excute(String str, Object... objects) {
        if ("purchase.buy".equals(str)) {//采购电脑
            this.buyComputer((Integer)objects[0]);
        }else  if ("sale.sell".equals(str)) {//销售电脑
            this.sellComputer((Integer)objects[0]);
        }else  if ("sale.offsell".equals(str)) {//折价销售
            this.offSell();
        }else  if ("stock.clear".equals(str)) {//清仓处理
            this.clearStock();
        }
    }

    private void clearStock() {
        //要求折价销售
        super.sale.offSale();
        //要求不要采购
        super.purchase.refuseBuyIBM();
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑"+super.stock.getStockNumber()+"台");
    }

    private void sellComputer(Integer number) {
        //库存是否足够
        if(stock.getStockNumber()<number){
            super.purchase.buyIBMcomputer(number);
            System.out.println("销售IBM电脑"+number+"台");
        }
        super.stock.decrease(number);
    }

    private void buyComputer(int number) {
        int saleStatus=super.sale.getSaleStatus();
        //销售好，则进行采购
        if(saleStatus>80){
            //采购后进行入库
            super.stock.increase(number);
        }else{
            //销售不好，则折半采购
            int buyNumber=number/2;
            super.stock.increase(buyNumber);
            System.out.println("采购IBM电脑"+buyNumber+"台");
        }
    }
}
