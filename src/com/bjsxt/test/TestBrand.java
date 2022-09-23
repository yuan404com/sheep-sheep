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

//        GridLayout gl = new GridLayout(3, 3);
        this.setLayout(null);
        this.setBounds(0,0,450,800);

//        JLabel  label =new JLabel("这是一个label111");
//        JLabel  label2 =new JLabel("这是一个label222");
//        this.getContentPane().add(label);
//        this.getContentPane().add(label2);
//        panel.add(label);

        brand1.setBounds(100,100,50,50);
        this.getContentPane().add(brand1);

        brand2.setBounds(80,80,50,50);
        this.getContentPane().add(brand2);


        this.setVisible(true);
    }

//    @Override
//    public void paint(Graphics g) {
//
//
//        g.drawImage(brand1.getImage(),0,100,null);
//        g.drawImage(brand2.getImage(),50,100,null);
//        g.drawImage(brand3.getGrayImage(),100,100,null);
//
//
//    }


    public static void main(String[] args) {
        new TestBrand();
    }

}
