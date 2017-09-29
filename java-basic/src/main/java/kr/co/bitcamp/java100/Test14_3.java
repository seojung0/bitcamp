package kr.co.bitcamp.java100;
// 비트캠프 수강생정보
public class Test14_3 {
      public static void main(String[] ags) {
            class Bitcamp{
                  String name;
                  String gender;
                  int age;
                  int birth;
                  String major;
                  String pubi;
                 
            }
            Bitcamp r1;
            r1 = new Bitcamp();
            r1.name="서정혁";
            r1.gender="남성";
            r1.age=26;
            r1.birth=19920224;
            r1.major="디자인";
           
            System.out.printf("%s %s %d %d %s"
            ,r1.name,r1.gender,r1.age,r1.birth,r1.major);


      }

      }
    
 