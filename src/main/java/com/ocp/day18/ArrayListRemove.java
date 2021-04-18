package com.ocp.day18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemove {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);//0
        list.add(1);//1
        list.add(4);//2
        list.add(3);//3
        list.add(4);//4
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove(Integer.valueOf(4));//只會移除一個4
        System.out.println(list);
    }
            
}
