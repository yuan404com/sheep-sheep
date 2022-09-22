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

public class Map {

    private  Integer  x;  //绘制地图的左上角  x坐标
    private  Integer  y;  //绘制地图的左上角  y坐标

    private  Integer  floorHeight;   // 层高



    private  Layer[]   layers ;      //  layers 的数组长度  和 层高是一致的。


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

    public Layer[] getLayers() {
        return layers;
    }

    public void setLayers(Layer[] layers) {
        this.layers = layers;
    }
}
