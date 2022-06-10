/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Lenny.mathutil.main;

import com.Lenny.mathutil.core.MathUtil;

/**
 *
 * @author Phi Long
 */
public class Main {
    public static void main(String[] args) {
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết hay không
        //ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        // ví dụ: -5 coi tính được không
        //          0 tính ra mấy
        //          20 ra nhiêu
        //          21 coi tính ra mấy
        // test case: một tình huống hàm/app/ màn hình// tính năng được vào sử dụng 
        //giả lập hành vi xài của ai đó!!!!
        
        //TEST CASE: là 1 tình huống sử dụng, cài app (hàm ) mà nó bao hàm
        //INPUT: DATA đầu vào cụ thể nào đó
        //OUTPUT: đầu ra ứng với xử lý của hàm/chức năng của app, dĩ nhiên dùng đầu vào để xử lý
        //kì vọng: mong hàm sẽ trả về value nào đó ứng với input ở trên
        //so sánh để xem kết quẩ có như kỳ vọng hay không
        
        long expected =120; // kì vọng hàm trả về 120 nếu tính 5!
        int n = 5;          //input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected+ " (expected)");
        System.out.println("5! = "+ actual+ " (actual)");
    }
}
