package cn.pan.mediator.mediator;

import cn.pan.mediator.sales.*;

/**
 * @desc:场景类
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/25
 * @todo:
 */
public class Client {
   public static void main(String[] args){
       AbstractMediator mediator=new Mediator();
       //采购人员采购电脑
       System.out.println("---采购人员采购电脑");
       Purchase purchase = new Purchase(mediator);
       purchase.buyIBMcomputer(100);
       //销售人员销售电脑
       Sale sale = new Sale(mediator);
       System.out.println("---销售人员销售电脑");
       sale.sellIBMComputer(1);
       //库房管理人员管理库存
       System.out.println("---库房管理人员清库处理");
       Stock stock = new Stock(mediator);
       stock.clearStock();
   }
}
