package com.ocp.day26;
//帳戶資源

public class Accout {

    //帳戶餘額
    private int balance;

    public Accout(int balance) {
        this.balance = balance;
    }

    //查詢帳戶餘額 
    public int getBlance() {
        return balance;
    }

    //提款方法,amount表示提款金額
    public synchronized void withdraw(int amount) {
        String tname = Thread.currentThread().getName();
        System.out.printf("%s 準備提款$ %d\n", tname, amount);
        //檢查帳戶餘額
        //1.先取得目前的帳戶餘額
        int currentBlance = getBlance();
        //2.目前帳戶餘額示否足夠提款
        if (currentBlance >= amount) {
            //開始提款
            //模擬提款所花時間
            for (int i = 0; i < Integer.MAX_VALUE; i++);
            //變更帳戶餘額
            //帳戶餘額=目前帳戶餘額-提款金額
            balance = currentBlance - amount;

            //印出交易成攻清單
            System.out.printf("%s 提款 $%d成功,帳戶餘額$%d\n", tname, amount, getBlance());
        } else {
            //印出交易失敗清單
            System.out.printf("%s 提款 $%d失敗,帳戶餘額$%d\n", tname, amount, getBlance());
        }

    }
}
