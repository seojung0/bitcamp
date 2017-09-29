package kr.co.bitcamp.java100;

public class Test14_5 {
      public static void main(String[] ags) {
            class Score{
                  String name;
                  int kor;
                  int eng;
                  int math;
                  int sum;
                  float aver;

                 void compute(){
                       sum = kor+eng+math;
                       aver = sum /3.0f;
                 }
            }
            Score r1;
            r1 = new Score();
            r1.name = "홍길동";
            r1.kor = 100;
            r1.eng = 98;
            r1.math = 95;
            r1.compute();

            System.out.printf("%s %d %d %d %d %f \n",
            r1.name,r1.kor,r1.eng,r1.math,r1.sum,r1.aver);

            Score r2 = r1;

            r1 = new Score();
           
            r1.name = "임꺽정";
            r1.kor = 99;
            r1.eng = 95;
            r1.math = 100;
            r1.compute();
            System.out.printf("%s %d %d %d %d %f \n",
            r1.name,r1.kor,r1.eng,r1.math,r1.sum,r1.aver);
            System.out.printf("%s %d %d %d %d %f \n",
            r2.name,r2.kor,r2.eng,r2.math,r2.sum,r2.aver);



      }

      }
    
 