package kr.co.bitcamp.java100;

public class Test12_7 {
      public static void main(String[] ags) {
     float f1;
     f1 = 9876567f;
     System.out.println(f1);
     f1 = 9876543456789L; 
     //double 값을 float 변수에 저장한다.
     System.out.println(f1);
     //f1 = 9876543.4567; 컴파일 오류
     f1 = 9876543.4567f;
     //f1 이라는 변수에 값을 넣기 전에 이미 9876543.4567 값이 4바이트
     //부동소수점으로 변환되면서 값이 짤린 상태이다 출력하면 짤린 값이 출력된다.

      }
    }
 