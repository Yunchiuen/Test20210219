package com.ocp.test23;

import com.ocp.day23.Power;
import org.junit.Assert;
import org.junit.Test;

public class TestPower {
    @Test
    public void testW(){
        //Arrange - 安排(目標物件)
        Power power=new Power();
        
        int v = 10;
        int a = 100;
        //期望結果
        int exp = 1000;
        // Act - 目標方法
        int act = power.getW(v, a);
        // Assert - 驗證是否符合預期
        Assert.assertEquals(exp, act);
    }
}
