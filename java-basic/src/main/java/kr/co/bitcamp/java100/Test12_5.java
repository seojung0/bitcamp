package kr.co.bitcamp.java100;

public class Test12_5 {
      public static void main(String[] ags) {
        byte b1;
        b1= 100;//100은 4byte정수값 b1은 1byte메모리이다.
                //1byte에 4byte값을 저장할수 없지만
                //예외적으로 메모리의 크기를 넘어서지 않을 때는 허락한다.
        //b1= -129; 컴파일오류
        // b1= 128; 컴파일오류
        short s1;
       // s1 = -32769;
       // s1 =  32768;

       int i1;
      // i1 = -2147483649L;
      // i1 = 2147483648L;
      // b1=100L;
      //  s1=100L;
      // i1=100L; 8byte 정수값에 대해서는 예외를 허락하지 않는다.
      long l1;
      l1 = -9223372036854775808l;
      l1 =9223372036854775807l;
      }
    }
 