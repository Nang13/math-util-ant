/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nang.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author VO MINH MAN
 */
public class MathUtilTest {
    // class này viết code như bình thường để test 
    // viết code để test code như chính bên utils 
    //viết code này đuọc gọi là test scripts 
    // là những đoạn code đc viết ra để test code khác 
    //những đoạn code này sẽ gọi những hàm khác  bên trong code chính ,so sánh giá trị 
    //trả về của hàm chính cần text với giá trị kì vọng
    // bên trong
    // test scripts chữa  các test case khác 
    // trong test/scripts này sẽ có test case

    @Test
    public void tryUnitFirst() {
    
    Assert.assertEquals( 79, 79);
   
    }

    // với code kiểm thử viết rõ ra nội dung không cần phải viết như tên hàm bình thường 
    //
    @Test
   public void testFactorialGiveRightArgumentReturnsWell(){
    long expected =2 ;
    long actual = MathUtil.getFactorial(2);
    
    
    
    Assert.assertEquals(expected, actual);
    //Test cáe 
   //so sách 2 giá trị coi tương  đông k so sánh bằng sout() và bằng mắt để luận kết quả 
   Assert.assertEquals(4, MathUtil.getFactorial(3));
    //n = 0 ,hy vọng hàm trả về 1 còn actual hàm chạy thực tế bằng mấy 
   //@Test đc gọi là ANNOOOTATION ,kí hiệu ,flag để đánh  dấu đoạn code
   //mang ý nghĩa nào đó Và khi biên dịch /compiple code thì 
   //thư viện đi kèm nó  sẽ tự động generate thêm code cho mình tùy theo 
   //@
   //ví dụ @Test thì thư viện JUnit này import nó sẽ ngắm tự generate 
   //hàm này thành public static void main() và gửi main() này cho JVM
   // kĩ  thuật dùng thư viện ,bị ép phải theo cú pháp của nó qua những 
   //@ ,thư viện này gọi là  framework
   //Framework là thư viện là những file chấm jar chấm dll bắt ta phải xài theo cách của nó 
   // còn Library là thuư viện chứa đống class ta thoải mái dùng hàm của nó theo cách của  ta 
   //ở trên dàn khung ,template , là điểm nối code vào chỗ trống 
   //@ Test thì coi như làm hàm main
   //nên nó không chạy được
   
    //
    
    }
    
   @Test
     public void testFactorialGiveRightArgumentReturnsWell2(){
    long expected =2 ;
    long actual = MathUtil.getFactorial(2);
    //Test case 
//    Assert.assertEquals(1200, MathUtil.getFactorial(5));
    //Test case 
    //Test case 6
//    Assert.assertEquals(120, MathUtil.getFactorial(5));
    //Test case 
//    Assert.assertEquals(720, MathUtil.getFactorial(6));
    
    
    Assert.assertEquals(expected, actual);
    //Test cáe 
   //so sách 2 giá trị coi tương  đông k so sánh bằng sout() và bằng mắt để luận kết quả 
   Assert.assertEquals(4, MathUtil.getFactorial(3));
    //n = 0 ,hy vọng hàm trả về 1 còn actual hàm chạy thực tế bằng mấy 
   //@Test đc gọi là ANNOOOTATION ,kí hiệu ,flag để đánh  dấu đoạn code
   //mang ý nghĩa nào đó Và khi biên dịch /compiple code thì 
   //thư viện đi kèm nó  sẽ tự động generate thêm code cho mình tùy theo 
   //@
   //ví dụ @Test thì thư viện JUnit này import nó sẽ ngắm tự generate 
   //hàm này thành public static void main() và gửi main() này cho JVM
   // kĩ  thuật dùng thư viện ,bị ép phải theo cú pháp của nó qua những 
   //@ ,thư viện này gọi là  framework
   //Framework là thư viện là những file chấm jar chấm dll bắt ta phải xài theo cách của nó 
   // còn Library là thuư viện chứa đống class ta thoải mái dùng hàm của nó theo cách của  ta 
   //ở trên dàn khung ,template , là điểm nối code vào chỗ trống 
   //@ Test thì coi như làm hàm main
   //nên nó không chạy được
   //màu đỏ xảy ra khi có 1 tk có lỗi 
   //ghi chú cuộc chơi xanh đỏ 
   //Quy tắc chơi xanh đỏ 
   //thì tất cả các test case màu xanh 
   //phải bằng actual không có ngoại lệ 
   //đỏ chỉ cần có 1 test case màu đỏ xem như hàm toang tạch lun
   //có 1 expected không bằng actual xem như các test case vứt hêts 1 thằng gây sai cho cả đám 
   //hàm đúng thì phải đúng hết với test case đã được test nch có  1 lỗi là hàm không ổn định về kq trả về 
   //không thể test hết test case đã test case nào phải ngon xanh case đó 
   //nói thêm về màu đỏ 
   //màu đỏ xảy ra khi có sự không bằng nhau của expected và actual 
   // có2  lý do 
   // lý do1 : 
   //expected đúng và actual sai
   //tình huồng này hàm cùi bắp (bug)
   //lý do 2 :
   //expected sai vứt bỏ test case
   //kỳ vọng mà sai thì hy vọng gì ở actual 
   // khi gặp màu đỏ là bug hay do chính ta chọn expected bị sai 
   //
    //
    
    }
     //hàm thiết kế trả về long nếu  n đưa vào 0..20
     //hàm getF() đc thiết kế Ném Ra Exception nếu ta đưa vào N <0 || N>20
     //tức gọi là getF(-5) thì chỗ gọi sẽ nhận về exception tên là
     //IllegalArgurment
     //đưa cả cà chớn, nhận ngoại lệ
     //
     
     //khi chạy hàm này có 1 ngoại lệ thuộc nhóm IllegalArgumentException có xh hay không
     //nó xh bằng cách newIllegal ở đâu  đó
  // đúng như thiết kế,Màu Xanh
     // t kì vọng m xh và trả về màu xanh
  //DDT(Data -Driven Testing )
     @Test(expected =Exception.class )
     public void testFactorialthrowsExpected(){
     MathUtil.getFactorial(-5);
     }
     
     
     ///DDT -Data-driven testing 
     //tách bộ dâta kiểm thử ra 1 chỗ
      //lát hồi nhồi /nạp / fill / điền /feed date này tuần tự vào chỗ kiểm thử 
     //Ví dụ tách data
     //thay viết cho từng case trở thành tổng quát không điền data cụ thể mak viết ở đâu đó
      // ? sẽ lấy ở tập data ở trên kiểm soát đc đủ thiếu các case 
     //Tách ra khỏi data của nó fill lại sau
     //được gọi là viết test case theo kiêut tham số hóa
     // hoặc gọi là DDT
     //Parameterried
     
}

// TODO add test methods here.
// The methods must be annotated with annotation @Test. For example:
//
// @Test
// public void hello() {}

