package com.ocp.day23;
    //電力換算
    //w(瓦數),v(電壓),a(電流)
public class Power {
    //取得w
    public int getW(int v,int a){
        int w=v*a;
        return w;
    }
    
    //取得v
    public int getV(int w,int a){
        int v=w/a;
        return v;
    }
    
    //取得a
    public int getA(int w,int v){
        int a=w/v;
        return a;
    }
}
