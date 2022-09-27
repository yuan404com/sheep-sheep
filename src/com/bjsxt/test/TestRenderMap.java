package com.bjsxt.test;

import com.bjsxt.model.Brand;
import com.bjsxt.model.Cell;
import com.bjsxt.model.Layer;
import com.bjsxt.model.Map;

import javax.swing.*;
import java.awt.*;

public class TestRenderMap extends JFrame {


    private Integer  width = 450;
    private Integer  height =800;

    private Map map = TestMap.buildMap();


    public TestRenderMap() throws HeadlessException {


        this.setVisible(true);
        this.setSize(width,height);
        this.setTitle("羊了个羊");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(null);
        this.setBounds(0,0,450,800);
        this.setLocationRelativeTo(null);


        for (int i = 0; i < map.getLayers().size(); i++) {
            renderLayer(this.getContentPane(),map.getLayers().get(i));
        }


        new Thread(new Runnable() {
            @Override
            public void run() {

                while (true){
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    repaint();
                }

            }
        }).start();




    }

    private void  renderLayer(Container container, Layer layer){
        Cell[][] cells=layer.getCells();
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Cell cell =cells[i][j];

                if(cell.getState()==2){
                    Brand brand = cell.getBrand();
                    int brandx=j*50+layer.getOffset();
                    int brandy=i*50+layer.getOffset();

                    brand.setBounds(brandx,brandy,50,50);
                    this.getContentPane().add(brand);
                }
            }
        }
    }




    public static void main(String[] args) {
        new TestRenderMap();
    }
}
