package com.bjsxt.test;

import com.bjsxt.model.Level;
import com.bjsxt.model.Map;

public class TestMap {

    public static void main(String[] args) {

        //  第一关
        Level  firstLevel =new Level();
            firstLevel.setCount(1);  // 第一关
            firstLevel.setDifficulty(1);  //简单难度
            firstLevel.setEliminateboxSize(7);  // 消除栏长度

        //  构建Map

        Map  map =new Map();
            map.setFloorHeight(2);   // 层高为 两层
            map.setX(100);
            map.setY(200);           // 100，200 作为 map 绘制的左上角坐标。

        firstLevel.setMap(map);

        //  构建图层






    }


}
