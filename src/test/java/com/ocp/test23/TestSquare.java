package com.ocp.test23;

import com.ocp.day23.square;
import org.junit.Assert;
import org.junit.Test;

public class TestSquare {

    @Test
    public void test() {
        //測試要符合3A
        //Arrange - 安排(目標物件)
        //Act - 目標方法
        //Assert -驗證是否符合預期
        //-ea啟用Assert 功能

        //Arrange - 安排(目標物件)
        square square = new square();
        int h = 10;
        int w = 100;

        //期望結果
        int exp = 1000;
        
        //Act - 目標方法
        int Act=square.getArea(h, w);

        // Assert - 驗證是否符合預期
        Assert.assertEquals(exp, Act);
    }
}
