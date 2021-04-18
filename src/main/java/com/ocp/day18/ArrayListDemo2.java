package com.ocp.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ArrayListDemo2 {

    //1~5取3個,取後不放回
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        ListIterator<Integer> iter = list.listIterator();
        while (iter.hasNext()) {
            int key = iter.nextIndex();//索引值
            int value = iter.next();
            System.out.printf("%d : %d\n", key, value);
        }

        //取出 key=2
        int value1 = list.get(2);
        //移除 key=2的元素
        list.remove(2);
        System.out.println(list);
        //-----------------------------
        //取出 key=2
        int value2 = list.get(2);
        //移除 key=2的元素
        list.remove(2);
        System.out.println(list);
        //-----------------------------
        //取出 key=1
        int value3 = list.get(1);
        //移除 key=1的元素
        list.remove(1);
        System.out.println(list);
        System.out.printf("取出的資料%d %d %d\n", value1, value2, value3);

//        List<Integer> list2 = new ArrayList();
//
//        for (int i = 0; i < 3; i++) {
//            int value1 = list.get(0);
//
//            list.remove(0);
//            list2.add(value1);
//        }
//        System.out.println("取出的資料" + list2);
    }
}
