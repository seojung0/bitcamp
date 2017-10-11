//package kr.co.bitcamp.java100;

public class Test15_12_1 {
      public static void main(String[] ags) {
          // 문제  int 메모리에 들어있는 값을 1 바이트씩 출력하라!
          int v = 1234567890;
          
          System.out.println(Integer.toHexString(v >> 24));
          System.out.println(Integer.toHexString((v >> 16) & 0*ff));
          System.out.println(Integer.toHexString(v >> 8 ));
          System.out.println(Integer.toHexString(v >> 4 ));
          System.out.println(Integer.toHexString(v));
          
          

      }

      }
    
 