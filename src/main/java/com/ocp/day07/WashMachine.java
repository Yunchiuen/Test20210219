package com.ocp.day07;

public class WashMachine {

    private boolean isOpen; // false    開/關
    private boolean haveWater; // false 注水
    private int mode; // 預設:0 模式

    public WashMachine(int mode) {
        this.mode = mode;
    }

    //開門
    public void open() {
        System.out.println("開門");
        isOpen = true;
    }

    //放衣服
    public void putClothes() {
        if (isOpen) {
            System.out.println("放衣服");
        } else {
            System.out.println("請先開門");
        }
    }

    //關門
    public void close() {
        System.out.println("關門");
        isOpen = false;
    }

    //放水
    public void water() {
        if (!isOpen) {
            System.out.println("放水");
            haveWater = true;
        } else {
            System.out.println("嗶嗶嗶~門沒關");
        }
    }

    //開始洗衣
    public void play() {
        if (!haveWater) {
            System.out.println("請先注水");
            return;
        }

        System.out.printf("請選擇模式: %d\n", mode);

        String m = "";
        switch (mode) {
            case 0:
                m = "柔洗模式";
                break;
            case 1:
                m = "強洗模式";
                break;
            case 2:
                m = "靜置模式";
                break;
            default:
                System.out.println("選擇模式/模式錯誤");
                ;
                return;
        }
        System.out.println(m);
        System.out.println("開始洗衣服");
    }

}
