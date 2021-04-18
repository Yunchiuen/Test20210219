package com.ocp.day18;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ArrayListDemo3 {

    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> list = new ArrayList<>();
        list.add(1);//0
        list.add(2);//1
        list.add(3);//2
        list.add(4);//3
        list.add(5);//4

        // 存放所選取的號碼
        Set<Integer> ans=new LinkedHashSet<>();
        
        for(int i=0;i<3;i++){
            int key=r.nextInt(list.size());
            int value=list.get(key);
            ans.add(value);
            list.remove(key);
        }
        System.out.println(ans);
    }
}
