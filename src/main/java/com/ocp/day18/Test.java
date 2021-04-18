
package com.ocp.day18;

import static com.ocp.day18.LottoService.r;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        get539();
    }
    public static Set<Integer> get539() {
        Set<Integer> set=new LinkedHashSet<>();
        while(set.size()<5){
            int next=r.nextInt(39)+1;
            
            set.add(next);
        }
        
        return set;
    }
}
