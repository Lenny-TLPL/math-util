/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.Lenny.mathutil.test.core;

import com.Lenny.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Phi Long
 */
public class MathUtilTest {
    
    public MathUtilTest() {
    }
        //đây là class sẽ sử dụng các hàm của thư viện/ framework JUnit
        //để kiểm thử/ kiểm tra code chính - hàm tinhGiaiThua() bên class cỏe.MathUtil
        //viết code để test code chính bên kìa!!!
        //có nhiều quy tắc đặt tên cho hàm kiểm thử
        //nhưng thường sẽ là nói lên mục đích cảu các case/ tình huống kiểm thửu
        //hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
        //ta sẽ xài hàm kiểu well - đưa 40, 21 không chơi đưa -29, -40
        //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
        //@Test phía hậu trường chính là public static void main()
        //Có nhiều @Test ứng với nhiều case khác nhau để kiểm thửu hàm tính giai thừa
        @Test
        public void testGetFactorialGivenRightArgumentWell(){
            int n = 0;// test thử tình huống tử tế đầu vào, phải chạy đúng
            long expected =1;
            long actual = MathUtil.getFactorial(n);
            // so sánh expected vs actual dùng xanh xanh đỏ đỏ, framework
            Assert.assertEquals(expected, actual);
            
            Assert.assertEquals(1,MathUtil.getFactorial(1));
            Assert.assertEquals(2,MathUtil.getFactorial(2));
            Assert.assertEquals(6,MathUtil.getFactorial(3));
            Assert.assertEquals(24,MathUtil.getFactorial(4));
            Assert.assertEquals(120,MathUtil.getFactorial(5));
            Assert.assertEquals(720,MathUtil.getFactorial(6));

        }//hàm giúp so sánh hai giả trị nào đố có giống nhau hay không
        //nếu giống nhau -> thấy màu xanh của đèn đường--> đường thông code ngon
                            //tí nhất cho case đang test
        //nếu không thấy giống nhau thì sẽ thấy màu đỏ đèn đường
        //hàm ý expected và actual không giống nhau
        //gộp thêm cài case thành công/ đưa đầu vào ngon!!! hàm phải tính ngon
        //cách luận xanh đỏ/ quy ước xanh đỏ của unit test nói chung, JUNIT nói riêng
        //Bạn liệt kê ra các case cần test - hàm cần test có những tình huống nào để xài-các đầu vào là gì!!!!
        //                                 - liệt kê các đầu vào cần test cho hàm, tính trước các expected
        //-viết code để test code cho các case - gọi hàm với các đầu vào đã liệt kê!!!!
        //RUN
        //- nếu tất cả các case đều ngon - EXPECTED ==ACTUAL, 1 màu xanh cho tất cả
        //- nếu có ít nhất 1 case tạch - expected != actual cho ít nhất 1 case - 1 màu đỏ cho tất cả!!!!
        //Nghệ thuật đảm bào chất lượng code của dân dev, đân QC/tester
        //Cố gắng tưởng tượng, liệt kê ra các case sử dụng app, sử dụng hàm 1 cách bao quát, bao sân tốt nhất
        //-Liệt kê thiếu xót casse, chuyện lớn kiểu khác
        //-Đã đưa các Case, chúng phải xanh hết!!!!
        
        //ĐỎ gồm 2 nguyên nhân(đỏ: actaul khác expected)
        //1.Mình code sai giá trị trả về!!!!chiếm số nhiều
        //2.Mình kì vọng sai-tính = tay khi chưa có hàm/app bị sai!!! 
        
        
        //hàm getF() ta thiết kế có 2 tình huống xử lí
        //1.đưa data tử tế trong [0...20] -> tính đúng được n! = done
        //2.đưa data vào cà chớn, âm, ->20; THIẾT KẾ CẢU HÀM LÀ NÉM RA NGOẠI LỆ
        //TAO KÌ VỌNG NGOẠI LỆ XUẤT HIỆN KHI N<0||N>20
        //rất mong ngoại lệ xuất hiện với n cà chớn này
       
        //nếu hàm nhận vào n<0 hoặc n>20 và hàm ném ra ngoại lệ 
        //HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ-> XANH PHẢI XUẤT HIỆN
        
        //nếu hàm nhận vào n<0 hoặc n>20 và hàm không ném ra ngoại lệ 
        //sure, HÀM CHẠY SAI THIẾT KẾ, SAI KÌ VỌNG, MÀU ĐỎ
        
        //Test case 
        // input -5
        //expacted: IllegalArgumentException xuất hiện
        //tình huống bất thường, ngoại lệ, ngoài dự kiến, dữ liệu
        //là những thứ không thế đo lường so sánh theo kiểu value
        //mà chỉ có thể đo lường = cách chúng có xuất hiện hay không
        //assertEquals() không dùng để so sánh 2 ngoại lệ
        //      equals() là bằng nhau hay không trên value!!!!
        
        
        //MÀU ĐỎ ĐÓ EM, ĐO HÀM ĐÚNG LÀ CÓ NÉM NGOẠI LỆ THẬT SỰ
        //NHƯNG KHÔNG PHẢI LÀ NGOẠI LỆ NHƯ KÌ VỌNG = THỰC SỰ KÌ VỌNG SAI
        // KHÔNG PHẢI HÀM NÉM SAI
//        @Test(expected = NumberFormatException.class)
//        public void testGetFactorialGivenWrongArgumentThrowsException(){
//            MathUtil.getFactorial(-5);//hàm @Test chạy, hàm getF() chạy
//                                      //sẽ ném về ngoại lệ NumberFormat
//        }
        @Test(expected = IllegalArgumentException.class)
        public void testGetFactorialGivenWrongArgumentThrowsException(){
            MathUtil.getFactorial(-5);//hàm @Test chạy, hàm getF() chạy
                                      //sẽ ném về ngoại lệ NumberFormat
        }
        
        //cách khác để bắt ngoại lệ xuất hiện,viết tự nhiên hơn
        //xài lambda
        //hàm sẽ ném về ngoại lệ nếu nhận vào 21
        //cần thấy màu xanh khi chơi với 21!
        
        @Test
        public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion(){ 
//            Assert.assertThrows(tham số 1: loại ngoại lệ muốn so sánh, runnable, tham số 2: đoạn code chạy văng ra ngoại runnable);
            Assert.assertThrows(IllegalArgumentException.class,() -> MathUtil.getFactorial(-5));
//            MathUtil.getFactorial(-5);//hàm @Test chạy, hàm getF() chạy
                                      //sẽ ném về ngoại lệ NumberFormat
        }
        
        //Bắt ngoại lệ, xem hàm có ném về ngoại lệ hay không khi n cà chớn
        //có ném, tức là hàm chạy đúng thiết kế --> xanh
        @Test
        public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){ 
            try {
                MathUtil.getFactorial(-5);
            } catch (Exception e) {
                //bắt try-catch là JUnit sẽ ra màu xanh do đã chủ động bắt ngoại lệ nhưng không chắc ngoại lệ mình cần có xuất hiện hay không
                //đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException
                Assert.assertEquals("Invalid argument. N must be between 0 -->20", e.getMessage());
            }
            
        }
        
}
