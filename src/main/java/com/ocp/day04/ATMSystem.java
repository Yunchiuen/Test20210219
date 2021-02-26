package com.ocp.day04;

import java.util.Scanner;

public class ATMSystem {

    Account acc = new Account();

    public void menu() {
        System.out.println("---------");
        System.out.println("1.提款");
        System.out.println("2.存款");
        System.out.println("3.查詢");
        System.out.println("0.退出");
        System.out.println("---------");
        Scanner sc = new Scanner(System.in);
        System.out.print("請選擇: ");

        int n = sc.nextInt();
        service(n);

    }

    public void service(int n) {
        Scanner sc = new Scanner(System.in);
        switch (n) {
            case 1:

                System.out.print("請輸入提款金額: ");
                int a = sc.nextInt();
                acc.withdrawal(a);
                break;
            case 2:
                System.out.print("請輸入存款金額: ");
                int b = sc.nextInt();
                acc.deposit(b);
                break;
            case 3:
                acc.printMoney();
                break;
            case 0:
                System.exit(0);
                break;

        }
    }

    public static void main(String[] args) {
        ATMSystem ats = new ATMSystem();
        while (true) {
            ats.menu();
            System.out.println("按下 Enter 後繼續");
            new Scanner(System.in).nextLine();
        }

    }
}
