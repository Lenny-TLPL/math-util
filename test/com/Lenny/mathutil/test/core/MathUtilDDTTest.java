/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.Lenny.mathutil.test.core;

import com.Lenny.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Phi Long
 */
//câu lệnh này chỉ chơi với junit báo hiệu rằng sễ cần loop qua tập data để lấy cặp data input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

                                //ta sẽ trả về mảng 2 chiều gồm nhiều cặp Expected|input
    @Parameterized.Parameters  //JUnit sẽ ngầm chạy loop qua từng dòng của mảng để lấy ra được cặp data iput/expected
                              // tên hàm không quan trọng, quan trọng là @
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
        };
    }
    //giả sử loop qua từng dòng của mangrk, ta vẫn cần gắn từng value của cột vào biến tương ứng input, expected để lát hồi test cho hàm
    
    @Parameterized.Parameter(value = 0) //value bằng 0 là map với mảng data
    public int n;
    @Parameterized.Parameter(value = 1) //value bằng 1 là map với mảng data
    public long expected; // kiểu long vì giá trị trả về của hàm getF() là long
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected,MathUtil.getFactorial(n));
    }


}
