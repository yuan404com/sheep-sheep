package com.bjsxt.model;


/*
    cell  单元格  是图层的基本单元.
    一个单元格 有两个基本的状态     1   空   没有牌     2  有牌
    当前单元格 有牌的状态下  如果被上层盖住啦,就显示  灰色的 图片, 否则 显示正常的图片.

    单元格 可以是最基本的单元。
    宽度， 高度，
    左上角 坐标x，y


 */

import java.awt.*;

public class Cell {


    private Integer state;    //     1   空   没有牌     2  有牌

    private Boolean isGray;    //  是否置灰

    private Brand brand;       // 图案


    public Cell() {


    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Boolean getGray() {
        return isGray;
    }

    public void setGray(Boolean gray) {
        isGray = gray;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}