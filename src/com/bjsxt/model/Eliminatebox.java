package com.bjsxt.model;

import java.awt.event.MouseListener;
import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 消除区域
 */
public class Eliminatebox  {


    private Integer step = 5;
    private Level level;


    private  static final List<Brand> slot = new ArrayList<>();


    public void deleteByBrandName(String name){
       Iterator<Brand> iterator= slot.iterator();
        while(iterator.hasNext()){
            Brand  brand=iterator.next();
          if(brand.getName().equals(name)){
              brand.getParent().remove(brand);
              iterator.remove();
          }
        }
    }



    public void addSlot(Brand brand){


            slot.add(brand);



            MouseListener[] mouseListeners = brand.getMouseListeners();
            //消除区域框里图形无法点击
            if (mouseListeners!=null){
                for (MouseListener mouseListener : mouseListeners) {
                    brand.removeMouseListener(mouseListener);
                }
            }

            //消除区域图形排序
            slot.sort(Comparator.comparing(Brand::getName));
            //消除
            Map<String, List<Brand>> map = slot.stream().collect(Collectors.groupingBy(Brand::getName));
            Set<String> keys = map.keySet();

            for (String key : keys) {
                List<Brand> brands = map.get(key);
                System.out.println(brands.size()+"key");
                if (brands.size() == 3) {
                    deleteByBrandName(key);
                    break;
                }
            }
            paint();
            if (slot.size()>=7){
                System.out.println("over");
            }


    }

    //绘制到消除区域
    public void paint(){

        System.out.println("Eliminatebox.paint");


        for (int i =0;i<slot.size();i++){

            Brand brand = slot.get(i);
//            System.out.println(brand.getName()+"----"+slot.size()+"-------列表的长度");
            int x = step+i*brand.getWidth()+5/2+10;
            brand.setBounds(x,600,50,50);

        }

    }



}
