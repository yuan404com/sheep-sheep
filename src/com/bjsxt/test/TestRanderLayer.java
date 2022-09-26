package com.bjsxt.test;

import com.bjsxt.model.Brand;
import com.bjsxt.model.Cell;
import com.bjsxt.model.Layer;

import javax.swing.*;
import java.awt.*;

public class TestRanderLayer extends JFrame {

    private Integer  width = 450;
    private Integer  height =800;


    private Layer layer = TestLayer.buildLayer(6,6);


    public TestRanderLayer() throws HeadlessException {

        this.setVisible(true);
        this.setSize(width,height);
        this.setLocationRelativeTo(null);
        this.setTitle("羊了个羊");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(null);
        this.setBounds(0,0,450,800);


//        brand1.setBounds(100,100,50,50);
//        this.getContentPane().add(brand1);
        Cell[][] cells=layer.getCells();

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Cell cell =cells[i][j];

                if(cell.getState()==2){
                    Brand brand = cell.getBrand();
                    int brandx=i*50+layer.getOffset();
                    int brandy=j*50+layer.getOffset();

                    brand.setBounds(brandx,brandy,50,50);
                    this.getContentPane().add(brand);
                }
            }
        }


        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TestRanderLayer();
    }
}
