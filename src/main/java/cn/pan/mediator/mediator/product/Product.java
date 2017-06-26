package cn.pan.mediator.mediator.product;

/**
 * @desc:
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/25
 * @todo:
 */
public class Product implements Cloneable{
    //产品名称
    private String name;
    //是否可以属性变更
    private boolean canChanged=false;

    public Product(ProductManager manager,String name){
        if(manager.isCreateProduct()){
            canChanged=true;
            this.name=name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Product clone()  {
        Product p=null;
        try {
            p= (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
