package com.bjsxt.model;


/*
    对于游戏当中  牌 的抽象。  比如 胡萝卜，玉米， 青草，


 */


import com.bjsxt.util.ImageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Brand extends JComponent{

    private  String  name;          // 对当前的图案进行命名  可以用来定位  图片的文件
    private  Integer  type;

    private Image   image;

    private Image   grayImage;


    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
        this.image = ImageUtil.get(name+".png");
        this.grayImage = ImageUtil.get(name+"_gray.png");


        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Brand  brand = (Brand) e.getSource();
                System.out.println(brand.getName()+"被点击啦.....");

            }
        });


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(this.getImage(),this.getX(),this.getY(),null);

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
