/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Lenny.mathutil.core;

/**
 *
 * @author Phi Long
 */
public class MathUtil {
    //trong class này cung cấp cho ai đó nhiều hàm xử lý toán học
    //clone class Math của JDK
    //hàm thư việc xài chung cho ai đó, không cần lưu lại trạng thái/ giá trị
    //chọn thiết kế là hám static
    
    //hàm tính giai thừa!!!!
    //n! = 1.2.3.4...n
    //không có giai thừa cho số âm
    //0!=1!=1 quy ước
    // giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị 
    //20 giai thừa là 18 con số 0, vừa đủ cho kiểu long của Java
    //21 giai thừa tràn kiểu long
    //bài này quy ước tính n! tron khoảng từ 0...20
//    public static long getFactorial(int n){
//        if(n<0||n>20){
//            throw new IllegalArgumentException("Invalid argument. N must be between 0 -->20");         
//        }
//        if (n ==0||n==1){
//            return 1;//kết thúc cuộc chơi sớm nếu nhận những đầu vào đặc biệt
//        }
//        long product =1;//tích nhân dồn, thuật toán con heo đất, thuật toán ốc bưu nhồi thịt
//        
//        for (int i = 2; i <= n; i++) {
//            product*=i;
//        }
//        return product;    
//    }
    //HỌC VỀ ĐỆ QUY TRONG VÒNG 30S
    //Hiện tượng gọi lại chính mình với 1 quy mô khác
    //ví dụ: con búp bê Nga, giống nhau và lồng trong nhau
    //búp bê to, nhỏ hơn, nhỏ hơn nữa, nhỏ hơn nữa, ... đến điểm dừng
    
    public static long getFactorial(int n){
        if(n<0||n>20){
            throw new IllegalArgumentException("Invalid argument. N must be between 0 -->20");         
        }
        if (n ==0||n==1){
            return 1;//kết thúc cuộc chơi sớm nếu nhận những đầu vào đặc biệt
        }       
        return n*getFactorial(n-1);    
    }
}
