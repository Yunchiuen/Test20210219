
package com.ocp.day18;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoService {
    static Random r=new Random();
    public static Set<Object> get539() {
        Set<Object> set=new LinkedHashSet<>();
        while(set.size()<5){
            int next=r.nextInt(39)+1;
            
            if(next <10){
                String a="0";
                String n=a+next;
                set.add(n);
            }else{
                set.add(next);
            }
            
            System.out.println(set);
        }
        
        
        return set;
    }
    public static List<Integer> get4stars() {
        List<Integer> list=new ArrayList();
        for(int i=0;i<4;i++){
            int n=r.nextInt(10);
            list.add(n);
        }
        return list;
    }
}
