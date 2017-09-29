package kr.co.bitcamp.java100;
// 도서명, 저자, 출판사,페이지,가격($)
public class Test14_2 {
      public static void main(String[] ags) {
            class Score{
                  String book;
                  String author;
                  String pubis;
                  int page;
                  float dall;
            }
            Score r1;
            r1 = new Score();
            r1.book="java이론";
            r1.author="서정혁";
            r1.pubis="비트캠프";
            r1.page=300;
            r1.dall=30.2f;
            System.out.printf("%s %s %s %d %f"
            ,r1.book,r1.author,r1.pubis,r1.page,r1.dall);


      }

      }
    
 