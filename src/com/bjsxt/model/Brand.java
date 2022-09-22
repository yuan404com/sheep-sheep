package com.bjsxt.model;


/*
    对于游戏当中  牌 的抽象。  比如 胡萝卜，玉米， 青草，


 */


import com.bjsxt.util.ImageUtil;

import java.awt.*;

public class Brand {

    private  String  name;          // 对当前的图案进行命名  可以用来定位  图片的文件
    private  Integer  type;

    private  Integer  width=50;
    private  Integer  heigth=50;

    private Image   image;

    private Image   grayImage;


    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
        this.image = ImageUtil.get(name+".png");
        this.grayImage = ImageUtil.get(name+"_gray.png");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeigth() {
        return heigth;
    }

    public void setHeigth(Integer heigth) {
        this.heigth = heigth;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Image getGrayImage() {
        return grayImage;
    }

    public void setGrayImage(Image grayImage) {
        this.grayImage = grayImage;
    }
}
