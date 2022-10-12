/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nang.mathutil.core;

/**
 *
 * @author VO MINH MAN
 */
// Ta sẽ cole bộ thư viện công cụ của Math/util của JDK
// giả lập các hàm của class Math của JDk
// Những gì mà làm công cụ dùng cho hàm khác ,class khác thì thường sẽ đc 
//thiết kế là static 
//static là chấm trực tiếp qua tên class ,éo có new
public class MathUtil {

    public static final double PI = 3.14;

    //Hàm tính n giai thừa 
    //Quy ước 
    //ko có giai thừa cho số âm
    //0! =1!
    //21! giai thừa vượt 18 số không là vượt 18 số 0
    // hàm của chúng ta design là chỉ chấp nhấn tính giai thừa của n tử 0 cho tới 20
    //<0 || >20 chửi, mày đưa N cà chớn 
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid number n,n must be between 0..20");
        }

        if (n == 0 && n == 1) {
            return 1;
        }
        
        long product =1;
        //biến con heo đất ,nhân tích lũy
        //acc=accumalation ,góp dần
        for (int i = 1; i < n; i++) 
            product +=i;
        

        return product;

    }

//ky thuat lap trình kieu mới 
// vẫn giữ nguyên kiêns thức lập trình đã có 
// plugin mới cho trình độ của dev 
// chất lượng không nói bằng miệng ,chất lượng nói bằng code 
    //kỹ thuật TDD =Test Driven Development 
    //Viết code để test code song song với nó 
    //mỗi hàm bạn viết ra phải viết ngay cái test case 
    //phải viết cái hành động kiểm thử hàm để viết rằng hàm vừa viết chạy sai gì 
    //đây là tư duy chứ không phải ngôn ngữ lập trình 
    //không thể mô phỏng tính huống của người dùng
}
