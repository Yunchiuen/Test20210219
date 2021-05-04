
package com.ocp.day19;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        //排隊打針
        //Queue佇列
        Queue<String> names=new  LinkedList<>();
        names.offer("John");//將指定的元素添加為此列表的尾部（最後一個元素）。
        names.offer("Mary");
        names.offer("Yun");
        System.out.println("排隊打針"+names);
        while(!names.isEmpty()){
            String name=names.poll();//檢索並刪除此列表的頭（第一個元素）。
            System.out.println(name+"排隊打針"+names);
        }
    }
}
