package cn.pan.mediator.sales;

/**
 * @desc:场景模拟
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/24
 * @todo:
 */
public class Client {
    public static void main(String[] args){
        //采购人员采购电脑
        System.out.println("采购人员采购电脑...");
        Purchase purchase=new Purchase();
        purchase.buyIBMcomputer(100);
        //销售人员销售电脑
        System.out.println("销售人员销售电脑...");
        Sale sale=new Sale();
        sale.sellIBMComputer(50);

        //库存人员管理库存
        Stock stock=new Stock();
        stock.clearStock();

    }

}
