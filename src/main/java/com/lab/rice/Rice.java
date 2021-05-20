package com.lab.rice;

public class Rice {

    private String 品名;
    private String 廠商名稱;
    private String 檢驗結果;
    private String 不合格原因;

    public void set品名(String 品名) {
        this.品名 = 品名;
    }

    public void set廠商名稱(String 廠商名稱) {
        this.廠商名稱 = 廠商名稱;
    }

    public void set檢驗結果(String 檢驗結果) {
        this.檢驗結果 = 檢驗結果;
    }

    public void set不合格原因(String 不合格原因) {
        this.不合格原因 = 不合格原因;
    }

    public String get品名() {
        return 品名;
    }

    public String get廠商名稱() {
        return 廠商名稱;
    }

    public String get檢驗結果() {
        return 檢驗結果;
    }

    public String get不合格原因() {
        return 不合格原因;
    }

    @Override
    public String toString() {
        return "Rice{" + "\u54c1\u540d=" + 品名 + ", \u5ee0\u5546\u540d\u7a31=" + 廠商名稱 + ", \u6aa2\u9a57\u7d50\u679c=" + 檢驗結果 + ", \u4e0d\u5408\u683c\u539f\u56e0=" + 不合格原因 + '}';
    }
    
    
}
