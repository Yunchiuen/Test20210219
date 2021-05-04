package com.ocp.day19;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        //Vector<Integer> v = new Vector<>();//預設空間10
        //Vector<Integer> v = new Vector<>(641);//預設空間641
        Vector<Integer> v = new Vector<>(100, 10);//限定空間每次+10
        for (int i = 0; i < 100; i++) {
            v.add(i);
        }
        v.add(100);
        System.out.println("長度:" + v.size());
        System.out.println("空間預設10: " + v.capacity());//預設空間10   空間滿了原長度*2
        //刪除偶數資料
        Iterator<Integer> iter = v.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) {
                iter.remove();
            }
        }
        System.out.println("長度:" + v.size());
        System.out.println("空間預設10: " + v.capacity());//預設空間10   空間滿了原長度*2
    }
}
