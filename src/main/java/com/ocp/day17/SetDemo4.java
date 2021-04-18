
package com.ocp.day17;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
        //集合轉乘array
        Set<String> phones=new LinkedHashSet<>();
        phones.add("Pixel");
        phones.add("Apple");
        phones.add("mi");
        //先準備一個空字串陣列
        String s1[]=new String[phones.size()];
        System.out.println(Arrays.toString(s1));
        phones.toArray(s1);//將phones資料複製給s1
        System.out.println(Arrays.toString(s1));
        //java8
         String[] s2=phones.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(s2));
        
        String[] s3=phones.stream().toArray(size ->new String[size]);
        System.out.println(Arrays.toString(s3));
    
        
    }
}
