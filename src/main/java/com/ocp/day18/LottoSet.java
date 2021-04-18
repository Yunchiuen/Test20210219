
package com.ocp.day18;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class LottoSet {
    public static void main(String[] args) {
        // 0~9 取出 5 個不重複的數字, 並放入到 LinkedHashSet 集合中存放
        Random r=new Random();
        Set<Integer> set=new LinkedHashSet<>();//有時候沒有取5個是因為set不能放重複的
         for(int i=0;i<5;i++){
            int n=r.nextInt(10);//0~9 隨機取
            //System.out.printf("%d\n",n);
            set.add(n);//加入到集合
        }
        System.out.println(set);
        System.out.println(set.size());
   
        //使用while
        Set<Integer> lotto=new LinkedHashSet<>();
        while(lotto.size()<5){
            int n=r.nextInt(10);
            lotto.add(n);
        }
        System.out.println(lotto);
        
    }
}
