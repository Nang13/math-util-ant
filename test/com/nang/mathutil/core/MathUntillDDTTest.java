/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.nang.mathutil.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author VO MINH MAN
 */
@RunWith(value = Parameterized.class)
public class MathUntillDDTTest {
  
    @Parameterized.Parameters
   public static Object[][] initData(){
   
       int b[][]={{1,0},{1,1},{2,2},{6,3},{120,5},{720,6},{24,4}};
       int v[][]={{1,0},
                  {1,1},
                  {2,2},
                  {6,3},
                  {120,5},
                  {720,6},
                  {24,4}};
       Integer n[][] = new Integer[][]{{1,0},
                  {1,1},
                  {2,2},
                  {6,3},
                  {120,5},
                  {720,6},
                  {24,4}};
       
  return new Integer[][]{{1,0},
                  {1,1},
                  {2,2},
                  {6,3},
                  {120,5},
                  {720,6},
                  {24,4}};
   }

   
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
   
   
   //ta phải map 2 cột của từng dòng vào 2 hàm so sánh
   //map value từ bảng vào 2 biến nhời 2 biến này vào 2 hàm so sánh là xong
   //DDT
   
   //map vào cột không 
   @Parameterized.Parameter(value = 0)
   public long expected;
   
   //map vào cột một 
   @Parameterized.Parameter(value = 1)
   public int n;
   
   @Test //fill dâta va gọi hàm so sánh
   public void test(){
       assertEquals(expected, MathUtil.getFactorial(n));}



}
