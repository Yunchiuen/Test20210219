
package com.ocp.day09;
// 工具類別
public class Util {
    public static int add(int x, int y) {
        if(x>25000){
            return x+2*y;
        }else{
            return x+y;
        }
    }
}
