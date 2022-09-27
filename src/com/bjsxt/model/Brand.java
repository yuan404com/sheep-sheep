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
import java.util.UUID;

public class Brand extends Component   {

    private  String  name;          // 对当前的图案进行命名  可以用来定位  图片的文件
    private  String  id;

    private  Integer x=0;
    private  Integer y=0;
    private  int width=50;
    private  int height=50;

    private Image   image;

    private Image   grayImage;


    private Boolean isGray=false;    //  是否置灰


    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
        this.image = ImageUtil.get(name+".png");
        this.grayImage = ImageUtil.get(name+"_gray.png");

        this.id= UUID.randomUUID().toString();

        Brand  self=this;

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Brand  brand = (Brand) e.getSource();
                if(brand.getGray()){

                    return;
                }else{

                   System.out.println(brand.id+brand.getName()+"被点击啦.....");
//                   brand.setGray(true);

                }

            }
        });


    }

    @Override
    public void paint(Graphics g) {
//        super.paint(g);

        if(isGray){
            g.drawImage(this.getGrayImage(),x,y,null);
        }else{
            g.drawImage(this.getImage(),x,y,null);
        }


    }





    public Boolean getGray() {
        return isGray;
    }

    public void setGray(Boolean gray) {
        isGray = gray;
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
