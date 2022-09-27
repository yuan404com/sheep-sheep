package com.bjsxt.model;

/*
 *   游戏的地图数据结构    三维的数据
 *   1   因为有多层的图层
 *
 *
 *   属性1：  层高 floorHeight    比如  简单的第一关  层高是2  也就是2层 。
 *
 *
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Map {



    private  Integer  x;  //绘制地图的左上角  x坐标
    private  Integer  y;  //绘制地图的左上角  y坐标

    private  Integer  floorHeight;   // 层高

    private List<Layer> layers=new ArrayList<>();      //  layers 的数组长度  和 层高是一致的。


    public Map() {
    }


    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getFloorHeight() {
        return floorHeight;
    }

    public void setFloorHeight(Integer floorHeight) {
        this.floorHeight = floorHeight;
    }

    public List<Layer> getLayers() {
        return layers;
    }

    public void setLayers(List<Layer> layers) {
        this.layers = layers;
    }


    //  在map当中提供一个方法， 用来判定当前的 所有图案的 是否置灰
    //  这个方法的调用时机    1  第一次 map 构建的时候     2   某一张牌移动的时候
    public  void  grayDecide(){
        // 最上层  索引为0   不用判定 牌是否被遮盖。

        List<Layer> list=this.getLayers();
        // 第2层  索引为1  的层开始判定
        for (int i = 1; i <list.size(); i++) {
            Layer  layer =list.get(i);

            for (int j = 0; j < layer.getCapacity(); j++) {
                Cell  cell= layer.getIndex(j);


                if(cell.getState()==2){
                    // 单元格当中有牌 才进行置灰判定
                    Brand  brand = cell.getBrand();

                    // 和上层的所有牌进行 交集判定
                   boolean flag= this.brand2layer(brand,layer.getParentLayer());

                    brand.setGray(flag);



                }

            }

        }
    }

    private boolean  brand2layer(Brand brand , Layer layer){

        for (int j = 0; j < layer.getCapacity(); j++) {

            Cell  cell = layer.getIndex(j);
            if(cell.getState()==2){
                Brand temp =cell.getBrand();
                boolean  flag=brand.getBounds().intersects(temp.getBounds());

                if (flag){
                    // 说明被遮盖了。  只要有一个元素相交就是被遮盖啦。
                    return flag;
                }
            }


        }

        // 当整个for循环都结束。 说明 当前的牌和 上层的图层没有相交
        //  应该和 上层图层的 上层图层继续 比较
        if(layer.getParentLayer()==null){
            // 说明没有上层图层啦， 都比较完毕啦。  没有被遮盖

            return false;
        }else{
            return brand2layer(brand, layer.getParentLayer());
        }

    }



}
