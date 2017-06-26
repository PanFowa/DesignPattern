package cn.pan.observer.thread;

import cn.pan.observer.IHanFeiZi;

/**
 * @desc:
 * @auth panfuhua(pfh@gfire.cn)
 * @date 2017/5/19
 * @todo:
 */
public class HanFeiZi implements IHanFeiZi {
    //是否在吃饭
    private boolean isHavingBreakfast=false;
    //是否在娱乐
    private boolean isHavingFun=false;
    public void haveBreakfast() {
        System.out.println("韩非子在吃饭");
        isHavingBreakfast=true;
    }

    public void haveFun() {
        System.out.println("韩非子在娱乐");
        isHavingFun=true;
    }

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }
}
