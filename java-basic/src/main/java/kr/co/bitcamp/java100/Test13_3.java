package kr.co.bitcamp.java100;

public class Test13_3 {
      public static void main(String[] ags) {
        //레퍼런스 선언
        int[] arr1;
        //배열 생성
        arr1 = new int[3];
        //모든 배열 레퍼런스는 'length'라는 특별한 내부 변수를 갖고있다.
        
        System.out.println(arr1.length);
        //레퍼런스 변수를 통해 사용하는 내부변수를 "property"
          arr1[0]=100;
          arr1[1]=90;
          arr1[2]=80;
          //arr1[-1]=200;
          //arr1[3]=300;

        }

      }
    
 