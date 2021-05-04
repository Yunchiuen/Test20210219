package com.ocp.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 符合@FunctionalInterface要件 
 * 1.自定義的物件方法 
 * 2.static方法不算在內 
 * 3.default方法不算在內
 * 4.object方法不算在內
 *
 * @author NO NAME
 */
public class SortedDemo1 {

    public static void main(String[] args) {
        //List<Integer> list1=new ArrayList<>();//可編輯的集合  
        List<Integer> list = Arrays.asList(100, 80, 90);//不可編輯的集合    好處速度快只需進行分析可用
        System.out.println(list);
        //list.add(70);
        //System.out.println(list);
        //排序(自然排序:小->大)
        Collections.sort(list);
        System.out.println(list);
        //排序(大->小)
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;//後-前由大到小
            }
        });
        System.out.println(list);
        //排序(自然排序:小->大)
        Collections.sort(list, (o1,o2)->o1-o2);
        System.out.println(list);
    }
}
