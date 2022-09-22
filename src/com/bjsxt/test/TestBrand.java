package com.bjsxt.test;

import com.bjsxt.model.Brand;

import javax.swing.*;
import java.awt.*;

public class TestBrand extends JFrame{

    private Integer  width = 450;
    private Integer  height =800;

    private Brand  brand1 =new Brand("胡萝卜");
    private Brand  brand2 =new Brand("玉米");
    private Brand  brand3 =new Brand("青草");

    public TestBrand() throws HeadlessException {

        this.setVisible(true);
        this.setSize(width,height);
        this.setLocationRelativeTo(null);
        this.setTitle("羊了个羊");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void paint(Graphics g) {


        g.drawImage(brand1.getImage(),0,100,null);
        g.drawImage(brand2.getImage(),50,100,null);
        g.drawImage(brand3.getImage(),100,100,null);
    }


    public static void main(String[] args) {
        new TestBrand();
    }

}
