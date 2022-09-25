package com.bjsxt.test;


import com.bjsxt.model.Brand;
import com.bjsxt.model.Cell;
import com.bjsxt.model.Layer;

import java.util.Random;

public class TestLayer {


    public static void main(String[] args) {

        Layer layer =new Layer(9,9);
//
        Cell[][]  cells = layer.getCells();

        //  下一步  要把 9个 brand 牌  放入到  cells 数组中。
        Brand[]   brands =new Brand[layer.getCapacity()];

        //  1  从牌的种类当中随机取一个 牌名
        String[]   brandNames= {"玉米","胡萝卜","青草","剪刀","手套","刷子","毛线","奶瓶"};

        //  2  根据 随机去到的 牌名 创建3个 相同的牌对象


        //  3  根据 把对象存入 容量为9 的
        for (int i = 0; i < brands.length; i=i+3) {
            int  rand =new  Random().nextInt(brandNames.length);
            String brandName=brandNames[rand];
            System.out.println(brandName);
            Brand  brand1=new Brand(brandName);
            Brand  brand2=new Brand(brandName);
            Brand  brand3=new Brand(brandName);

            brands[i]=brand1;
            brands[i+1]=brand1;
            brands[i+2]=brand1;
        }
        System.out.println("存入一维数组的牌：");
        for (Brand brand : brands) {
            System.out.print(brand.getName()+"  ");
        }
        System.out.println();

        //   4   把一位数组当中的牌  打乱顺序
        for (int i = 0; i < brands.length; i++) {
            Brand  brand = brands[i];

            int  rand =new  Random().nextInt(brands.length);
            brands[i]= brands[rand];
            brands[rand]=brand;

        }
        //  5   输出 打乱顺序后的 一维数组
        System.out.println("--------------------");
        System.out.println(" 输出 打乱顺序后的 一维数组的牌：");
        for (Brand brand : brands) {
            System.out.print(brand.getName()+"  ");
        }
        System.out.println();

        //   6  把一维数组当中的数据 ， 存入 二维数组 cells当中。
        int count =0;

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j]=new Cell(brands[count++]);
            }
        }

        //   7  遍历 当前图层的 二维数据
        layer.show();



    }


}
