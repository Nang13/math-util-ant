/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.nang.mathutil.main;

import com.nang.mathutil.core.MathUtil;

/**
 *
 * @author VO MINH MAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World main() method");
        tryTDDFirst();
    }
    
   public static void tryTDDFirst(){
    long expected =1 ;
    //tình huống xài app #1:
    // n=0 hy vọng hàm trả về expected =1;
    //3 thứ này tổ hợp nên  1 thứ gọi là 
    
    long actual = MathUtil.getFactorial(0);//xài hàm vừa viết
            //so sánh 2 giá trị để hàm viết đúng hay không 
            //3 thứ này tổ hợp nên test case -tình huống xài app/xài hàm 
            System.out.println("Actual " +"0! Status|Expected "+expected+actual);
            //viet sub 0 giai thừa có bằng 1 hay không 
   
            //Test case số 2 :n=1 hy vọng trả về 1 luôn ,thực tế là mấy ,chạy hàm mới biết 
           //expected
            //test case 3 n=2 hy vọng trả về 2 thực tế là mấy ,chạy hàm mới biết 
            System.out.println("0|Status |Expected =2"+"|Actual"+MathUtil.getFactorial(0));
            System.out.println("1|Status |Expected =2"+"|Actual"+MathUtil.getFactorial(1));
            System.out.println("2|Status |Expected =2"+"|Actual"+MathUtil.getFactorial(2));
           
   
   
   }
   
    
}
