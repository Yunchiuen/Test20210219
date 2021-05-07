
package com.ocp.day22;

public class Test1 {
    public static void main(String[] args) {
        String a="abcde";
        String b="";
        for(int i=a.length()-1;i>=0;i--){
           b+=a.charAt(i); 
        }
        System.out.println(b);
    }
}
