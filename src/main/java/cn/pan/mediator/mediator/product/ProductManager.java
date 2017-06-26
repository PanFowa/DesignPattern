package cn.pan.mediator.mediator.product;

/**
 * @desc:工厂类
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/25
 * @todo:
 */
public class ProductManager {
    //是否可以创建一个产品
    private boolean permittedCreate=false;
    //建立一个产品
    public Product createProduct(String name){
        permittedCreate=true;
        Product p=new Product(this,name);
        //产生一个创建事件
        new ProductEvent(p,ProductEventType.NEW_PRODUCT);
        return p;
    }

    //废弃一个产品
    public void abandonProduct(Product p){
        //销毁一个产品，例如删除数据库记录
        //产生一个删除事件
        new ProductEvent(p,ProductEventType.DEL_PRODUCT);
        p=null;
    }
    //修改一个产品
    public void editProduct(Product p,String name){
        //修改后的产品
        p.setName(name);
        //产生一个编辑事件
        new ProductEvent(p,ProductEventType.EDIT_PRODUCT);
    }

    public Product clone(Product p){
        //产生一个克隆事件
        new ProductEvent(p,ProductEventType.CLONE_PRODUCT);
        return p.clone();
    }

    //获得是否可以创建一个产品
    public boolean isCreateProduct() {
         return permittedCreate;
    }
}
