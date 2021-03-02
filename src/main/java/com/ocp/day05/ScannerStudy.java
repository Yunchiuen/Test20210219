
package com.ocp.day05;

import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        Scanner sc=new Scanner("170.0 60 YUN你好 228放假");

        double h=sc.nextDouble();
        System.out.println(h);
        
        int w=sc.nextInt();
        System.out.println(w);
        
        String c=sc.nextLine();
        System.out.println(c);
        
        System.out.print("請輸入任意字串: ");
        //Scanner sc1=new Scanner(System.in);
        //String a=sc1.nextLine();
        //System.out.printf("你輸入的是: %s\n",a);
        System.out.printf("您所輸入的是: %s\n", new Scanner(System.in).nextLine());
    }
}
