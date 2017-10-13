
//package kr.co.bitcamp.java100;

public class Test17_1 {
   static class Score{
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;
        
    }
    public static void main(String[] ags) {
        //: 성적 정보를 담을 메모리 설꼐

       
        Score s1= new Score();
        s1.name = "홍길동";
        s1.kor = 80;
        s1.eng = 60;
        s1.math = 100;
        s1.sum = s1.kor +s1.eng + s1.math;
        s1.aver = s1.sum/ 3f;
  
        
        Score s2= new Score();
        s2.name = "임꺽정";
        s2.kor = 20;
        s2.eng = 50;
        s2.math = 90;
        s2.sum = s2.kor +s2.eng + s2.math;
        s2.aver = s2.sum/ 3f;
        
        Score s3= new Score();
        s3.name = "유관순";
        s3.kor = 60;
        s3.eng = 10;
        s3.math = 100;
        s3.sum = s3.kor +s3.eng + s3.math;
        s3.aver = s3.sum/ 3f;
        
        Score s3 = createScore("유관순",100,100,100);
        Score s4 = createScore("안중근",50,40,60);
        Score s5 = createScore("윤봉길",50,20,40);
    }
    static Score createScore(String name,int kor,int eng,int math) {
        Score s= new Score();
        s.name = name;
        s.kor = kor;
        s.eng = eng;
        s.math = math;
        s.sum = s.kor +s.eng + s.math;
        s.aver = s.sum/ 3f;
        return s;
    }
}



